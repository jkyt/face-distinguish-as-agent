package com.jsc.nativeapi.model;

/**
 * 2.1. 满分审验现场教育对外接口 2.1.1. 读取现场/体验教育信息接口 
 * 请求地址：https://xx.122.gov.cn/ws/m/drv/geteduplanlist  接口标识：D020 
 * 功能说明：现场或体验教育教育前，根据教育地点代码、教育日期、发证机关查询现场或体验教育计划信息。
 *
 * @author 郭恒辉
 */
public class EduPlanInfo {

	/**
	 * 1 jhxh 计划序号
	 */
	String jhxh;

	/**
	 * 2 kcfl 分类 分类1是现场教育类 2是体验教育类
	 */
	String kcfl;

	/**
	 * 3 kcflmc 课程名称
	 */
	String kcflmc;

	/**
	 * 4 jyddmc 教育地点名称
	 */
	String jyddmc;

	/**
	 * 5 jhrs 计划人数
	 */
	String jhrs;

	/**
	 * 6 sqrs 申请人数
	 */
	String sqrs;

	/**
	 * 7 ccbj 标记 1是半日课程（上午或下午）2是整日课程（上午和下午）
	 */
	String ccbj;

	/**
	 * 8 skkssj 授课开始时间 半日课程开始时间；整日课程上午场开始时间
	 */
	String skkssj;

	/**
	 * 9 skjssj 授课结束时间 半日课程结束时间；整日课程上午场结束时间
	 */
	String skjssj;

	/**
	 * 10 skkssj2 授课开始时间2 半日课程为空整日课程下午场开始时间
	 */
	String skkssj2;

	/**
	 * 11 skjssj2 授课结束时间2 半日课程为空 整日课程下午场结束时间
	 */
	String skjssj2;

	/**
	 * 12 skks 授课课时
	 */
	String skks;

	/**
	 * 13 dmcs 点名次数 该场次需要中间点名次数
	 */
	String dmcs;

	/**
	 * 14 jgsj 点名间隔时间 点名次数超过1次的该值有效，单位：分钟
	 */
	String jgsj;

	/**
	 * @return the jhxh
	 */
	public String getJhxh() {
		return jhxh;
	}

	/**
	 * @param jhxh
	 *            the jhxh to set
	 */
	public void setJhxh(String jhxh) {
		this.jhxh = jhxh;
	}

	/**
	 * @return the kcfl
	 */
	public String getKcfl() {
		return kcfl;
	}

	/**
	 * @param kcfl
	 *            the kcfl to set
	 */
	public void setKcfl(String kcfl) {
		this.kcfl = kcfl;
	}

	/**
	 * @return the kcflmc
	 */
	public String getKcflmc() {
		return kcflmc;
	}

	/**
	 * @param kcflmc
	 *            the kcflmc to set
	 */
	public void setKcflmc(String kcflmc) {
		this.kcflmc = kcflmc;
	}

	/**
	 * @return the jyddmc
	 */
	public String getJyddmc() {
		return jyddmc;
	}

	/**
	 * @param jyddmc
	 *            the jyddmc to set
	 */
	public void setJyddmc(String jyddmc) {
		this.jyddmc = jyddmc;
	}

	/**
	 * @return the jhrs
	 */
	public String getJhrs() {
		return jhrs;
	}

	/**
	 * @param jhrs
	 *            the jhrs to set
	 */
	public void setJhrs(String jhrs) {
		this.jhrs = jhrs;
	}

	/**
	 * @return the sqrs
	 */
	public String getSqrs() {
		return sqrs;
	}

	/**
	 * @param sqrs
	 *            the sqrs to set
	 */
	public void setSqrs(String sqrs) {
		this.sqrs = sqrs;
	}

	/**
	 * @return the ccbj
	 */
	public String getCcbj() {
		return ccbj;
	}

	/**
	 * @param ccbj
	 *            the ccbj to set
	 */
	public void setCcbj(String ccbj) {
		this.ccbj = ccbj;
	}

	/**
	 * @return the skkssj
	 */
	public String getSkkssj() {
		return skkssj;
	}

	/**
	 * @param skkssj
	 *            the skkssj to set
	 */
	public void setSkkssj(String skkssj) {
		this.skkssj = skkssj;
	}

	/**
	 * @return the skjssj
	 */
	public String getSkjssj() {
		return skjssj;
	}

	/**
	 * @param skjssj
	 *            the skjssj to set
	 */
	public void setSkjssj(String skjssj) {
		this.skjssj = skjssj;
	}

	/**
	 * @return the skkssj2
	 */
	public String getSkkssj2() {
		return skkssj2;
	}

	/**
	 * @param skkssj2
	 *            the skkssj2 to set
	 */
	public void setSkkssj2(String skkssj2) {
		this.skkssj2 = skkssj2;
	}

	/**
	 * @return the skjssj2
	 */
	public String getSkjssj2() {
		return skjssj2;
	}

	/**
	 * @param skjssj2
	 *            the skjssj2 to set
	 */
	public void setSkjssj2(String skjssj2) {
		this.skjssj2 = skjssj2;
	}

	/**
	 * @return the skks
	 */
	public String getSkks() {
		return skks;
	}

	/**
	 * @param skks
	 *            the skks to set
	 */
	public void setSkks(String skks) {
		this.skks = skks;
	}

	/**
	 * @return the dmcs
	 */
	public String getDmcs() {
		return dmcs;
	}

	/**
	 * @param dmcs
	 *            the dmcs to set
	 */
	public void setDmcs(String dmcs) {
		this.dmcs = dmcs;
	}

	/**
	 * @return the jgsj
	 */
	public String getJgsj() {
		return jgsj;
	}

	/**
	 * @param jgsj
	 *            the jgsj to set
	 */
	public void setJgsj(String jgsj) {
		this.jgsj = jgsj;
	}
}
