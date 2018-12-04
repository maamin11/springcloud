package com.fuzamei.serviceribbon.response;

/**
 * @program: springcloud
 * @description:
 * @author: Andy
 * @create: 2018-12-04 15:13
 **/
public enum ReponseEnum implements EnumBase{
    SUCCESS(200,"操作成功"),
    FAIL(201,"操作失败");

    private Integer code;
    private String message;

    ReponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
