package com.han_lang.compiler.analysis;

public interface Scope {
    /**
     * 获取指定名称的值是否已经在此定义域中定义
     * @param valueName 值的名称
     * @return 是否已经定义
     */
    boolean valueAvailable(String valueName);

    /**
     * 值是否可以在此作用域定义
     * @param valueName 值的名称
     * @return 是否允许定义
     */
    boolean canDefineValue(String valueName);

    /**
     * 获取作用域中指定的值
     * @param valueName 值的名称
     * @return 值
     */
    Value getValue(String valueName);

    /**
     * 移除作用域中指定的值
     * @param valueName 值的名称
     */
    void removeValue(String valueName);

    /**
     * 移除作用域中指定的值
     * @param value 值
     */
    void removeValue(Value value);

    /**
     * 添加值到当前作用域
     * @param value 值
     */
    void addValue(Value value);

    /**
     * 获取当前作用域是否有指定的值
     * @param valueName 值的名称
     * @return 是否有指定的值
     */
    boolean hasValue(String valueName);

    /**
     * 添加子作用域
     * @param child 要添加的子作用域
     */
    void addChildScope(Scope child);

    /**
     * 获取父作用域
     * @return 父作用域
     */
    Scope getParentScope();

    /**
     * 设置父作用域
     */
    void setParentScope(Scope parent);

    /**
     * 获取该作用域的全局
     * @return 全局
     */
    Global getGlobal();
}
