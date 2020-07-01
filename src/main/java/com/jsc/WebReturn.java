package com.jsc;

public class WebReturn extends Return {

    public WebReturn() {
    }

    public WebReturn(int errorCode) {
        super(errorCode);
    }

    public WebReturn(String message) {
        super(message);
    }

    public WebReturn(int errorCode, String message) {
        super(errorCode, message);
    }

    public WebReturn(int errorCode, String message, Object data) {
        super(errorCode, message, data);
    }
}
