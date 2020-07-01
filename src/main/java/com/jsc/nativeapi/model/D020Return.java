package com.jsc.nativeapi.model;

import java.util.List;

/**
 * 2.1. 满分审验现场教育对外接口 2.1.1. 读取现场/体验教育信息接口 
 * 请求地址：https://xx.122.gov.cn/ws/m/drv/geteduplanlist  接口标识：D020 
 * 功能说明：现场或体验教育教育前，根据教育地点代码、教育日期、发证机关查询现场或体验教育计划信息。
 *
 * 返回示例： { "message": "成功", "data": [{ "jhxh": "320818091700005057", "ywlx":
 * "F", "kcfl": "2", "kcflmc": "满分现场教育", "jyddmc": "江苏省淮安市驾驶人安全教育学校", "jhrs":
 * 60, "sqrs": 44, "ccbj": "1", "skkssj": "09:00", "skjssj": "12:00", "skkssj2":
 * "", "skjssj2": "", "skks": "180", "qdqtbj": "00", "dmcs": 0, "jgsj": 0 }, {
 * "jhxh": "320818091700005058", "ywlx": "F", "kcfl": "2", "kcflmc": "满分体验教育",
 * "jyddmc": "江苏省淮安市驾驶人安全教育学校", "jhrs": 60, "sqrs": 13, "ccbj": "1", "skkssj":
 * "07:30", "skjssj": "10:30", "skkssj2": "", "skjssj2": "", "skks": "180",
 * "qdqtbj": "00", "dmcs": 0, "jgsj": 0 }, { "jhxh": "320818091700005097",
 * "ywlx": "V", "kcfl": "2", "kcflmc": "审验现场教育", "jyddmc": "江苏省淮安市驾驶人安全教育学校",
 * "jhrs": 80, "sqrs": 22, "ccbj": "1", "skkssj": "13:30", "skjssj": "16:30",
 * "skkssj2": "", "skjssj2": "", "skks": "180", "qdqtbj": "00", "dmcs": 0,
 * "jgsj": 0 }], "code": "1" }
 * 
 * @author 郭恒辉
 */
public class D020Return extends NativeApiReturn {
	public D020Return() {
		super(NativeApiType.D020);
	}

	/**
	 * 计划列表。
	 */
	List<EduPlanInfo> data;

	public List<EduPlanInfo> getData() {
		return data;
	}

	public void setData(List<EduPlanInfo> data) {
		this.data = data;
	}

}
