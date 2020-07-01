package com.jsc.result;


import com.jsc.nativeapi.model.NativeErrorCode;

public class QdjResult2 {

    String status;
    String message;

    public static QdjResult2 build(String status, String message) {
        QdjResult2 result = new QdjResult2();
        result.status = status;
        result.message = message;
        return result;
    }

    public static QdjResult2 build(NativeErrorCode err) {
        QdjResult2 result = new QdjResult2();
        result.status = err.getCode();
        result.message = err.getMessage();
        return result;
    }

    public static QdjResult2 build(NativeErrorCode err, String message) {
        QdjResult2 result = new QdjResult2();
        result.status = err.getCode();
        result.message = message;
        return result;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
