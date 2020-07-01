package com.jsc.nativeapi.model;

import org.apache.commons.lang3.EnumUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 平台调用返回错误码定义， 此处仅定义有限数量的系统常规错误码，目的是兼容和系统优化。
 * 此系统后续的方向是充当数据转接的角色。出于降低和调用方耦合度的目的，尽量不要干预系统错误码的处理。
 * 
 * @author 郭恒辉
 */
public enum NativeErrorCode {
	/**
	 * 1 成功
	 */
	Success("1", "成功"),

	/**
	 * 33 当前场次签到时间已过
	 */
	SignInTimeOut("33", "当前场次签到时间已过"),

	/**
	 * 34 当前场次签退时间已过
	 */
	SignOutTimeOut("34", "当前场次签退时间已过"),

	/**
	 * 35 当前场次点名时间已过
	 */
	SignCheckTimeOut("35", "当前场次点名时间已过"),

	/**
	 * 97 系统异常：数据异常
	 */
	InvalidData("97", "数据异常"),

	/**
	 * 98 系统异常：入参异常
	 */
	InvalidArg("98", "入参异常"),

	/**
	 * 99 系统异常：系统异常
	 */
	SystemError("99", "系统异常"),;

	String code;
	String message;

	public static Map<String, NativeErrorCode> errorMap;

	static {
		errorMap = new HashMap<String, NativeErrorCode>();

		for (NativeErrorCode err : EnumUtils.getEnumList(NativeErrorCode.class)) {
			errorMap.put(err.getCode(), err);
		}
	}

	private NativeErrorCode(String code, String message) {
		this.code = code;
		this.message = message;
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
