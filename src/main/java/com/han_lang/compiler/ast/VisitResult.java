package com.han_lang.compiler.ast;

public class VisitResult<T> {
    public Status status = Status.Ok;
    public T content = null;
    public VisitResult(Status status){
        this.status = status;
    }

    public boolean Ok(){
        return status == Status.Ok;
    }

    public T content() {
        return content;
    }

    public VisitResult<T> content(T content) {
        this.content = content;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj instanceof VisitResult){
            VisitResult<?> v = ((VisitResult<?>) obj);
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

    private static final VisitResult<Void> _Ok = new VisitResult<>(Status.Ok);
    public static VisitResult<Void> defaultOk(){
        return _Ok;
    }
    public static VisitResult<Void> newErr(){
        return new VisitResult<>(Status.Err);
    }
}
enum Status{
    Ok, Err
}
