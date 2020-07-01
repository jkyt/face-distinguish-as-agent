package com.jsc;

public class Return {

    int errorCode;
    String message;
    Object data;

    public Return() {
        this.errorCode = ErrorCode.NONE.getValue();
        this.message = "";
        this.data = "";
    }

    public Return(int errorCode) {
        this.setErrorCode(errorCode);
    }

    public Return(String message) {
        this.setErrorCode(ErrorCode.NONE.getValue());
        this.setMessage(message);
    }

    public Return(int errorCode, String message) {
        this.setErrorCode(errorCode);
        this.setMessage(message);
    }

    public Return(int errorCode, String message, Object data) {
        this.setErrorCode(errorCode);
        this.setMessage(message);
        this.setData(data);
    }

    public Return(Exception exception) {
        this.setException(exception);
    }

    public void setException(Exception exception) {
        if (exception.getClass().equals(BasicException.class)) {
            BasicException e = (BasicException) exception;

            this.setErrorCode(e.getErrorCode());
            this.setMessage(e.getMessage());
        } else {
            Exception e = exception;

            this.setErrorCode(ErrorCode.UNKNOWN.getValue());
            this.setMessage(e.getMessage());
        }
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
