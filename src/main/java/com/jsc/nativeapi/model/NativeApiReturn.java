package com.jsc.nativeapi.model;

/**
 * 平台原生API返回基础类。
 * 
 * @author 郭恒辉
 */
public class NativeApiReturn extends NativeReturn {

	NativeApiType nativeApi;

	public NativeApiReturn(NativeApiType nativeApi) {
		this.nativeApi = nativeApi;
	}
	
	public NativeApiReturn(NativeApiType nativeApi, String code, String message) {
		super(code, message);
		this.nativeApi = nativeApi;
	}

	/**
	 * @return the nativeApiId
	 */
	public String getNativeApiId() {
		return nativeApi.getId();
	}

	/**
	 * @return the nativeApiUri
	 */
	public String getNativeApiUri() {
		return nativeApi.getUri();
	}

	/**
	 * @return the nativeApiDesc
	 */
	public String getNativeApiDesc() {
		return nativeApi.getDesc();
	}
}
