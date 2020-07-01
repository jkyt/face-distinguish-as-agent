package com.jsc.nativeapi.model;

import java.util.List;

/**
 * 2.1.2. 读取现场/体验教育人员信息接口  请求地址：https://xx.122.gov.cn/ws/m/drv/getxcjyxylist 
 * 接口标识：D021  功能说明：现场或体验教育教育前，第三方系统根据教育计划、发证机关获取已申请现场/体验教育的驾驶人信息。
 *
 * @author 郭恒辉
 */
public class D021Return extends NativeApiReturn {
	public D021Return() {
		super(NativeApiType.D021);
	}

	/**
	 * 计划列表。
	 */
	List<PlanStudentInfo> data;

	public List<PlanStudentInfo> getData() {
		return data;
	}

	public void setData(List<PlanStudentInfo> data) {
		this.data = data;
	}

}
