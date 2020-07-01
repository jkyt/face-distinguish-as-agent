package com.jsc;

public class BasicException extends Exception {

    private static final long serialVersionUID = 1L;

    int errorCode;
    
    public BasicException(ErrorCode errorCode) {
        super(ErrorCode.getMessage(errorCode.getValue()));
        setErrorCode(errorCode.getValue());
    }

    public BasicException(int errorCode) {
    	super(ErrorCode.getMessage(errorCode));
        setErrorCode(errorCode);
    }

    public BasicException(String message) {
    	super(message);
        setErrorCode(ErrorCode.UNKNOWN.getValue());
    }

    public BasicException(int errorCode, String message) {
    	super(message);
        setErrorCode(errorCode);
    }

    public BasicException(ErrorCode errorCode, String message) {
    	super(message);
        setErrorCode(errorCode.getValue());
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
