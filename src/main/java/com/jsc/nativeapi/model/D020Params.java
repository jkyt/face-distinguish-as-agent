package com.jsc.nativeapi.model;

/**
 * 2.1. 满分审验现场教育对外接口 2.1.1. 读取现场/体验教育信息接口 
 * 请求地址：https://xx.122.gov.cn/ws/m/drv/geteduplanlist  接口标识：D020 
 * 功能说明：现场或体验教育教育前，根据教育地点代码、教育日期、发证机关查询现场或体验教育计划信息。
 * 
 * @author 郭恒辉
 */
public class D020Params {

	/**
	 * jydddm True String 教育地点代码
	 */
	String jydddm;

	/**
	 * jyrq True String 教育日期，格式为：yyyy-mm-dd
	 */
	String jyrq;

	/**
	 * fl True String 分类：0全部计划1现场教育2体验教育
	 */
	String fl = "0";

	/**
	 * fzjg True String 发证机关
	 */
	String fzjg;

	/**
	 * @return the jydddm
	 */
	public String getJydddm() {
		return jydddm;
	}

	/**
	 * @param jydddm
	 *            the jydddm to set
	 */
	public void setJydddm(String jydddm) {
		this.jydddm = jydddm;
	}

	/**
	 * @return the jyrq
	 */
	public String getJyrq() {
		return jyrq;
	}

	/**
	 * @param jyrq
	 *            the jyrq to set
	 */
	public void setJyrq(String jyrq) {
		this.jyrq = jyrq;
	}

	/**
	 * @return the fl
	 */
	public String getFl() {
		return fl;
	}

	/**
	 * @param fl
	 *            the fl to set
	 */
	public void setFl(String fl) {
		this.fl = fl;
	}

	/**
	 * @return the fzjg
	 */
	public String getFzjg() {
		return fzjg;
	}

	/**
	 * @param fzjg
	 *            the fzjg to set
	 */
	public void setFzjg(String fzjg) {
		this.fzjg = fzjg;
	}

}
