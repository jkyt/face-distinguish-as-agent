package com.jsc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.jsc.nativeapi.model.D020Params;

/**
 * 2.1. 满分审验现场教育对外接口 2.1.1. 读取现场/体验教育信息接口 
 * 请求地址：https://xx.122.gov.cn/ws/m/drv/geteduplanlist  接口标识：D020 
 * 功能说明：现场或体验教育教育前，根据教育地点代码、教育日期、发证机关查询现场或体验教育计划信息。
 *
 * @author 郭恒辉
 */
public class GetEduPlanListParams extends D020Params {
	
	String requireRaw;

	/**
	 * @return the requireRaw
	 */
	@JSONField(serialize = false)
	public String getRequireRaw() {
		return requireRaw;
	}

	/**
	 * @param requireRaw
	 *            the requireRaw to set
	 */
	public void setRequireRaw(String requireRaw) {
		this.requireRaw = requireRaw;
	}

}
