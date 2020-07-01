package com.jsc.nativeapi.model;

/**
 * 平台原生API返回基础类。
 * 
 * @author 郭恒辉
 */
public class NativeReturn {

	/**
	 * code String 错误码，此字段文档中并未说明，是从返回结果中截取的，
	 * 
	 */
	String code;

	/**
	 * message String 错误消息，此字段文档中并未说明，是从返回结果中截取的，
	 */
	String message;

	public NativeReturn() {
	}

	public NativeReturn(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	/**
	 * 常规成功测试。
	 * 
	 * @return true: code != null && code.equals("1"); false: 其他状况。
	 */
	public Boolean isSuccess() {
		return code != null && code.equals("1");
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
