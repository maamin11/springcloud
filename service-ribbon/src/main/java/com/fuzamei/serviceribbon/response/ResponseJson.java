package com.fuzamei.serviceribbon.response;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-12-04 15:14
 **/
public class ResponseJson<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseJson(ReponseEnum reponseEnum) {
        this.code = reponseEnum.getCode();
        this.message = reponseEnum.getMessage();
    }

    public ResponseJson(ReponseEnum reponseEnum,T data) {
        this.code = reponseEnum.getCode();
        this.message = reponseEnum.getMessage();
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
