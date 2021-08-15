grammar HanCompiler;

program: (expr)* EOF;

operator1: OP_Not | OP_Plus | OP_Minus;
operator2_p1: OP_Equal | OP_NotEqual | OP_Greater | OP_GreaterEqual | OP_Lower | OP_LowerEqual;
operator2_p2: OP_Plus | OP_Minus;
operator2_p3: OP_Mutiply | OP_Devide;
operator2_p4: OP_Power;
operator2_p5: OP_And | OP_Or;
operator_all: operator1 | operator2_p1 | operator2_p2 | operator2_p3 | operator2_p4 | operator2_p5;
type_basic: Type_Boolean | Type_Byte | Type_Float
    | Type_Int | Type_LongFloat | Type_LongInt
    | Type_LongLongFloat | Type_LongLongInt
    | Type_ShortFloat | Type_ShortInt | Type_String
    | Type_Null
    ;
expr: (varExpr | constAndSetExpr | setExpr | calcExpr | newtypeExpr) OP_End | ifelseExpr | whileExpr | functionExpr;
varExpr: KEY_Var ID typeExpr;
constAndSetExpr: KEY_Const ID typeExpr OP_Set calcExpr;
newtypeExpr: KEY_Type ID typeExpr;
typeEntryPart: ID typeExpr OP_Split;
typeEntryEnd: ID typeExpr OP_Split?;
typeExpr: OP_BraketType_Left type_basic OP_BraketType_Right             #BasicTypeExpr
    | OP_BraketType_Left type_basic OP_Mutiply INT OP_BraketType_Right  #BasicArrayExpr
    | OP_BraketType_Left ID OP_BraketType_Right                         #CustomTypeExpr
    | OP_BraketType_Left ID OP_Mutiply INT OP_BraketType_Right          #CustomArrayExpr
    | OP_BraketType_Left typeEntryPart*
      typeEntryEnd OP_BraketType_Right                                  #StructExpr
    ;
setExpr: (ID | varExpr) OP_Set calcExpr;
templeEntryPart: ID OP_Set calcExpr OP_Split;
templeEntryEnd: ID OP_Set calcExpr OP_Split?;
templeArrayPart: calcExpr OP_Split;
templeArrayEnd: calcExpr OP_Split?;
templeExpr: OP_BraketMatch_Left templeEntryPart* templeEntryEnd OP_BraketMatch_Right
    | OP_BraketMatch_Left templeArrayPart* templeArrayEnd OP_BraketMatch_Right
    | OP_BraketMatch_Left OP_BraketMatch_Right
    ;
calcExpr: <assoc=right> operator1 calcExpr                              #C1Expr
    | OP_Braket_Left calcExpr operator_all
        calcExpr OP_Braket_Right                                        #C2ExprB
    | calcExpr OP_Call OP_Braket_Left
        calcExpr? (OP_Split calcExpr)* OP_Braket_Right                  #IExpr
    | calcExpr OP_Call
        OP_BraketCall_Left calcExpr OP_BraketCall_Right                 #GCExpr //get by calc
    | calcExpr OP_Call (INT | ID)                                       #GDExpr //get directly
    | calcExpr operator2_p5 calcExpr                                    #C2Expr5
    | calcExpr operator2_p4 calcExpr                                    #C2Expr4
    | <assoc=right> calcExpr operator2_p3 calcExpr                      #C2Expr3
    | calcExpr operator2_p2 calcExpr                                    #C2Expr2
    | calcExpr operator2_p1 calcExpr                                    #C2Expr1
    | (literal | ID | templeExpr)                                       #LExpr
    | OP_Braket_Left (literal | ID) OP_Braket_Right                     #LBExpr
    ;
argPartExpr: ID typeExpr OP_Split;
argEndExpr: ID typeExpr OP_Split?;
returnExpr: KEY_Return calcExpr? OP_End;
functionExpr: KEY_Function ID
        OP_BraketType_Left (type_basic ~Type_Null | ID) OP_BraketType_Right
        OP_Braket_Left argPartExpr* argEndExpr OP_Braket_Right
        OP_BraketMatch_Left (expr | returnExpr)* OP_BraketMatch_Right                       #FunRA
    | KEY_Function ID
        (OP_BraketType_Left Type_Null OP_BraketType_Right)?
        OP_Braket_Left argPartExpr* argEndExpr OP_Braket_Right
        OP_BraketMatch_Left (expr | returnExpr)* OP_BraketMatch_Right                       #FunA
    | KEY_Function ID
        OP_BraketType_Left (type_basic ~Type_Null | ID) OP_BraketType_Right
        (OP_Braket_Left OP_Braket_Right)?
        OP_BraketMatch_Left (expr | returnExpr)* OP_BraketMatch_Right                       #FunR
    | KEY_Function ID
        (OP_BraketType_Left Type_Null? OP_BraketType_Right)?
        (OP_Braket_Left OP_Braket_Right)?
        OP_BraketMatch_Left (expr | returnExpr)* OP_BraketMatch_Right                       #Fun
    ;
ifbodyExpr: OP_Braket_Left calcExpr OP_Braket_Right
      OP_BraketMatch_Left expr* OP_BraketMatch_Right;
ifbodyEndExpr: (OP_Braket_Left OP_Braket_Right)?
      OP_BraketMatch_Left expr* OP_BraketMatch_Right;
ifelseExpr: KEY_If ifbodyExpr
    (KEY_Elif ifbodyExpr)*
    (KEY_Else ifbodyEndExpr)?
    ;
continueExpr: KEY_Continue;
breakExpr: KEY_Break;
whileExpr: KEY_Loop OP_Braket_Left calcExpr OP_Braket_Right
      OP_BraketMatch_Left (expr | continueExpr | breakExpr)* OP_BraketMatch_Right;

/**
 * 无用字符丢弃
 */
THROWAWAY: (COMMENT|WS) -> skip;

COMMENT: ONELINE_COMMENT | MUTILINE_COMMENT;
ONELINE_COMMENT: '//' ~[\r\n]*? ('\n' | '\r\n' | EOF);
MUTILINE_COMMENT: '/*' .*? '*/';

WS: ' ' | '\r\n' | '\n';

/**
 * 非无效部分
 */

//操作符和关键字
OP_Power: '**';
OP_Plus: '+';
OP_Minus: '-';
OP_Mutiply: '*';
OP_Devide: '/';
OP_Greater: '>' | '大于';
OP_GreaterEqual: '>=' | '大于等于' | '大于或等于';
OP_Lower: '<' | '小于';
OP_LowerEqual: '<=' | '小于等于' | '小于或等于';
OP_NotEqual: '!=' | '不等于';
OP_Equal: '==' | '等于';
OP_Not: '不' | '非';
OP_And: '并且' | '并';
OP_Or: '或者' | '或' ;
OP_Call: '：' | ':';
OP_Split: '，' | ',';
OP_Set: '=';
OP_End: '。' | ';';

OP_Braket_Left: '（' | '(';
OP_Braket_Right: '）' | ')';
OP_BraketCall_Left: '【' | '[';
OP_BraketCall_Right: '】' | ']';
OP_BraketType_Left: '《' | '<';
OP_BraketType_Right: '》' | '>';
OP_BraketMatch_Left: '｛' | '{';
OP_BraketMatch_Right: '｝' | '}';

KEY_Var: '变量';
KEY_Const: '常量';
KEY_Type: '类型';
KEY_Function: '函数';
KEY_Return: '返回';
KEY_Break: '中断当前循环';
KEY_Continue: '略过当前循环';
KEY_Loop: '当';
KEY_If: '如果';
KEY_Elif: '否则如果';
KEY_Else: '否则';

Type_Null: '空';
Type_Byte: '字节';
Type_Int: '整数';
Type_LongInt: '长整数';
Type_ShortInt: '短整数';
Type_LongLongInt: '超长整数';
//没有无符号变量
//Type_UnsignedByte: '无符号字节';
//Type_UnsignedInt: '无符号整数';
//Type_UnsignedLongInt: '无符号长整数';
//Type_UnsignedShortInt: '无符号短整数';
//Type_UnsignedLongLongInt: '无符号超长整数';
Type_Boolean: '布尔';
Type_ShortFloat: '低精度小数'; //half
Type_Float: '小数'; //float
Type_LongFloat: '高精度小数'; //double
Type_LongLongFloat: '超高精度小数'; //fp128
Type_String: '字符串' | '文本';

//字面量
literal: INT | DEC
    | BOOL
    | STRING ;

//所有数字
INT: INT10 | INT8 | INT16 | INT2 ;
//整数
INT10: [1-9][0-9]+ | [0-9];
INT8: '0'[1-8][0-8]+ | '0'[0-8];
INT16: ('0x'|'0X')[0-9a-f]+;
INT2: ('0b'|'0B')[01]+;
//小数
DEC: INT10 '.' [0-9]+;

//布尔值
BOOL: '真' | '假';

//字符串
STRING: '“' (ESCAPE_CHARS | ~[\r\n@])*? '”'
    | '‘' (ESCAPE_CHARS | ~[\r\n@]) '’';
//转义特殊字符
ESCAPE_CHARS: '@@' | '@“' | '@”' | '@‘' | '@’' | '@a' | '@b' | '@f' | '@n' | '@r' | '@t' | '@v';

//ID标识符
// # $
ID: IDStart IDPart*;
IDStart: ~([0-9 @[\]\-+=()*&^%!~`?<>,.:;"'\\|！【】{}：。“”‘’/？《》，、·￥…（）；\r\n]);
IDPart: ~([ @[\]\-+=()*&^%!~`?<>,.:;"'\\|！【】{}：。“”‘’/？《》，、·￥…（）；\r\n]);

