package com.output;

/**
 * Created by yuting on 2017/3/3.
 */
public class Response<T> {

    public Boolean success;

    public T result;

    public Response(){}

    public Response(T result){
        this.success = true;
        this.result = result;
    }
}
