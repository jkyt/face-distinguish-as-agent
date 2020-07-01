package com.jsc;

import org.apache.commons.lang3.EnumUtils;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCode {
    NONE(0, "无错误"),
    UNKNOWN(1, "未知错误"),
    NULL_ARG(2, "参数为空"),
    INV_ARG(3, "错误参数"),
    INV_OPERATION(4, "非法操作"),

    USER_EXISTS(100, "用户已存在"),
    USER_NOT_EXISTS(101, "用户不存在"),
    BAD_USER_NAME(102, "用户名为空或不符合要求"),
    INV_PASSWORD(103, "密码验证失败"),
    BAD_PASSWORD(104, "密码为空或不符合要求"),
    NOT_LOGIN(105, "未登录"),
    NOT_AUTHED(106, "未授权"),

    STATION_EXISTS(200, "地点已存在"),
    STATION_NOT_EXISTS(201, "地点不存在"),
    DEVICE_EXISTS(202, "设备已存在"),
    DEVICE_NOT_EXISTS(203, "设备不存在"),
    CAPTURE_EXISTS(204, "抓拍记录已存在"),
    CAPTURE_NOT_EXISTS(205, "抓拍记录不存在"),

    PERSON_EXISTS(300, "人员已存在"),
    PERSON_NOT_EXISTS(301, "人员不存在"),
    BAD_PERSON_NAME(302, "人员姓名为空或不符合要求"),
    
    AUTH_SERVER_CNN_FAILED(1001, "授权平台连接失败"),
    SERVER_CNN_FAILED(1002, "平台连接失败"),
    GET_TOKEN_FAILED(1003, "平台登录失败"),
    DECRYPT_ERROR(1004, "平台加密验证失败"),
    ;

    int value;
    String message;

    public static Map<Integer, ErrorCode> errorMap;

    static {
        errorMap = new HashMap<Integer, ErrorCode>();

        for (ErrorCode err : EnumUtils.getEnumList(ErrorCode.class)) {
            errorMap.put(err.getValue(), err);
        }
    }


    private ErrorCode(int value, String message) {
        this.value = value;
        this.message = message;
    }


    public int getValue() {
        return value;
    }


    public void setValue(int value) {
        this.value = value;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public static String getMessage(int errorCode) {
        ErrorCode msg = errorMap.get(errorCode);
        if (msg == null) msg = errorMap.get(UNKNOWN);

        return msg.getMessage();
    }
}
