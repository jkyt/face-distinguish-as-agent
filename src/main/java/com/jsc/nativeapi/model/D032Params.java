package com.jsc.nativeapi.model;

/**
 * 2.1.4. 签到点名签退写入接口  请求地址：https://xx.122.gov.cn/ws/m/drv/comm/signed 
 * 接口标识：D032  功能说明：
 * 现场教育采用第三方设备调用2.1.3接口进行校验通过后，调用该接口写入签到、点名、签退信息，同时上传现场照。注意：由工作人员发出开始签到、点名、签退后，方可进行相应操作。
 *
 * @author 郭恒辉
 */
public class D032Params {
	/**
	 * @param sfzmhm
	 *            True String 身份证明号码
	 */
	String sfzmhm;

	/**
	 * @param xm
	 *            True String 姓名
	 */
	String xm;

	/**
	 * @param type
	 *            False String 1:签到2:签退3:点名 可空，为空时由系统自动判断
	 */
	String type;

	/**
	 * @param deviceId
	 *            True String 设备序列号，由厂家自行定义，需在教育点进行备案维护
	 */
	String deviceId;

	/**
	 * @param devName
	 *            True String 设备型号，由厂家自行定义，需在教育点进行备案维护
	 */
	String devName;

	/**
	 * @param zp
	 *            True Byte[] 现场拍摄人脸照片，base64格式，照片大小不能超过100ｋ
	 */
	String zp;

	/**
	 * @return the sfzmhm
	 */
	public String getSfzmhm() {
		return sfzmhm;
	}

	/**
	 * @param sfzmhm
	 *            the sfzmhm to set
	 */
	public void setSfzmhm(String sfzmhm) {
		this.sfzmhm = sfzmhm;
	}

	/**
	 * @return the xm
	 */
	public String getXm() {
		return xm;
	}

	/**
	 * @param xm
	 *            the xm to set
	 */
	public void setXm(String xm) {
		this.xm = xm;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId
	 *            the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the devName
	 */
	public String getDevName() {
		return devName;
	}

	/**
	 * @param devName
	 *            the devName to set
	 */
	public void setDevName(String devName) {
		this.devName = devName;
	}

	/**
	 * @return the zp
	 */
	public String getZp() {
		return zp;
	}

	/**
	 * @param zp
	 *            the zp to set
	 */
	public void setZp(String zp) {
		this.zp = zp;
	}

}
