package com.han_lang.compiler.ast;

public class VisitResult {
    public Status status = Status.Ok;
    public Object content = null;
    public VisitResult(Status status){
        this.status = status;
    }

    public boolean Ok(){
        return status == Status.Ok;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj instanceof VisitResult){
            VisitResult v = ((VisitResult) obj);
            if(this.status == v.status){
                if(this.content == null || v.content == null){
                    return this.content == null && v.content == null;
                }else {
                    return this.content.equals(v.content);
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    private static final VisitResult _Ok = new VisitResult(Status.Ok);
    public static VisitResult defaultOk(){
        return _Ok;
    }
    public static VisitResult newErr(){
        return new VisitResult(Status.Err);
    }
}
enum Status{
    Ok, Err
}
