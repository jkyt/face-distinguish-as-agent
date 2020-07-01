package com.jsc.nativeapi.model;

@SuppressWarnings("serial")
public class NativeApiException extends Exception {

	NativeApiType nativeApi;
	String code;

	public NativeApiException(NativeApiType nativeApi, String code, String message) {
		super(message);
		this.nativeApi = nativeApi;
		this.code = code;
	}

	/**
	 * @return the nativeApi
	 */
	public NativeApiType getNativeApi() {
		return nativeApi;
	}

	/**
	 * @param nativeApi
	 *            the nativeApi to set
	 */
	public void setNativeApi(NativeApiType nativeApi) {
		this.nativeApi = nativeApi;
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
 
}
