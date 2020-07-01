package com.jsc.nativeapi.model;

/**
 * 2.1.2. 读取现场/体验教育人员信息接口  请求地址：https://xx.122.gov.cn/ws/m/drv/getxcjyxylist 
 * 接口标识：D021  功能说明：现场或体验教育教育前，第三方系统根据教育计划、发证机关获取已申请现场/体验教育的驾驶人信息。
 *
 * @author 郭恒辉
 */
public class PlanStudentInfo {

	/**
	 * 1 wwlsh 外网流水号
	 */
	String wwlsh;
	/**
	 * 2 sfzmhm 身份证明号码
	 */
	String sfzmhm;
	/**
	 * 3 xm 姓名
	 */
	String xm;
	/**
	 * 4 zt 状态 0申请1完成学习
	 */
	String zt;
	/**
	 * 5 qdsj 签到时间 未签到的返回空
	 */
	String qdsj;
	/**
	 * 6 qtsj 签退时间 未签退的返回空
	 */
	String qtsj;

	/**
	 * @return the wwlsh
	 */
	public String getWwlsh() {
		return wwlsh;
	}

	/**
	 * @param wwlsh
	 *            the wwlsh to set
	 */
	public void setWwlsh(String wwlsh) {
		this.wwlsh = wwlsh;
	}

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
	 * @return the zt
	 */
	public String getZt() {
		return zt;
	}

	/**
	 * @param zt
	 *            the zt to set
	 */
	public void setZt(String zt) {
		this.zt = zt;
	}

	/**
	 * @return the qdsj
	 */
	public String getQdsj() {
		return qdsj;
	}

	/**
	 * @param qdsj
	 *            the qdsj to set
	 */
	public void setQdsj(String qdsj) {
		this.qdsj = qdsj;
	}

	/**
	 * @return the qtsj
	 */
	public String getQtsj() {
		return qtsj;
	}

	/**
	 * @param qtsj
	 *            the qtsj to set
	 */
	public void setQtsj(String qtsj) {
		this.qtsj = qtsj;
	}

}
