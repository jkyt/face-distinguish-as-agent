package com.jsc.nativeapi.model;

public enum NativeApiType {

	/**
	 * TOKEN 获取接口。
	 */
	GET_TOKEN("GET_TOKEN", "/ws/m/token/generate", "获取TOKEN接口"),

	/**
	 * 2.1.9. 现场/体验教育异常信息写入接口  请求地址：https://xx.122.gov.cn/ws/m/drv/saveqzqtinfo 
	 * 接口标识：D012 
	 * 功能说明：第三方音视频监控系统对现场教育情况进行扫描并自动识别人员是否正常在学，发现长时间未在现场，可以通过该接口将信息写入互联网平台，签退时，通过其他设备、二维条码等方式进行签退时提示“请通过人工进行签退”。需先人工对教育情况进行核实，符合要求的采用人工进行签退，签退时通过高拍仪采集现场照片。
	 * 
	 * @author 郭恒辉
	 */
	D012("D012", "/ws/m/drv/saveqzqtinfo", "现场/体验教育异常信息写入接口"),

	/**
	 * 2.1. 满分审验现场教育对外接口 2.1.1. 读取现场/体验教育信息接口 
	 * 请求地址：https://xx.122.gov.cn/ws/m/drv/geteduplanlist  接口标识：D020 
	 * 功能说明：现场或体验教育教育前，根据教育地点代码、教育日期、发证机关查询现场或体验教育计划信息。
	 * 
	 * @author 郭恒辉
	 */
	D020("D020", "/ws/m/drv/geteduplanlist", "读取现场/体验教育信息接口"),

	/**
	 * 2.1.2. 读取现场/体验教育人员信息接口  请求地址：https://xx.122.gov.cn/ws/m/drv/getxcjyxylist 
	 * 接口标识：D021  功能说明：现场或体验教育教育前，第三方系统根据教育计划、发证机关获取已申请现场/体验教育的驾驶人信息。
	 *
	 * @author 郭恒辉
	 */
	D021("D021", "/ws/m/drv/getxcjyxylist", "读取现场/体验教育人员信息接口"),

	/**
	 * 2.1.6. 体验教育写入接口  请求地址：https://xx.122.gov.cn/ws/m/drv/savetyjyinfo 
	 * 接口标识：D023  功能说明：采集体验教育信息。
	 *
	 * @author 郭恒辉
	 */
	D023("D023", "/ws/m/drv/savetyjyinfo", "体验教育写入接口"),

	/**
	 * 2.1.7. 现场/体验教育现场整体照片信息写入接口 
	 * 请求地址：https://xx.122.gov.cn/ws/m/drv/savexcjyphoto  接口标识：D024 
	 * 功能说明：在其他系统将采集的现场或审验教育时照片写入审验教育系统
	 *
	 * @author 郭恒辉
	 */
	D024("D024", "/ws/m/drv/savexcjyphoto", "现场/体验教育现场整体照片信息写入接口"),

	/**
	 * 2.1.8. 现场/体验教育现场整体视频信息写入接口 
	 * 请求地址：https://xx.122.gov.cn/ws/m/drv/savexcjyvideo  接口标识：D025 
	 * 功能说明：音视频服务系统采集现场音视频信息保存后，调用接口将教育现场相关音视频资源地址信息写入审验教育系统，审验教育系统通过地址调用音视频服务器资源。
	 *
	 * @author 郭恒辉
	 */
	D025("D025", "/ws/m/drv/savexcjyvideo", "现场/体验教育现场整体视频信息写入接口 "),

	/**
	 * 2.1.3. 签到点名签退前核查接口  请求地址：https://xx.122.gov.cn/ws/m/drv/comm/checksigned 
	 * 接口标识：D031  功能说明：
	 * 现场教育采用第三方设备进行签到、点名、签退操作时，应具备人脸识别功能。由设备采集驾驶人证件照片，拍摄驾驶人现场照片并完成人证比对，比对通过的，在写入签到、点名、签退前可以先调用该接口进行校验是否允许当前操作，校验成功的返回当前操作状态（包括签到、点名、签退），校验失败返回失败原因，通过校验可以过滤操作失败驾驶人现场照片的上传量，避免积压。
	 *
	 * @author 郭恒辉
	 */
	D031("D031", "/ws/m/drv/comm/checksigned", "签到点名签退前核查接口"),

	/**
	 * 2.1.4. 签到点名签退写入接口  请求地址：https://xx.122.gov.cn/ws/m/drv/comm/signed 
	 * 接口标识：D032  功能说明：
	 * 现场教育采用第三方设备调用2.1.3接口进行校验通过后，调用该接口写入签到、点名、签退信息，同时上传现场照。注意：由工作人员发出开始签到、点名、签退后，方可进行相应操作。
	 * 
	 * @author 郭恒辉
	 */
	D032("D032", "/ws/m/drv/comm/signed", "签到点名签退写入接口"),

	/**
	 * 2.1.5. 读取现场/体验现场签到照片接口  请求地址：https://xx.122.gov.cn/ws/m/drv/getxcjypic 
	 * 接口标识：D033  功能说明：签到结束后，第三方系统根据教育计划、身份证明号码、流水号获取驾驶人签到现场照片。
	 * 
	 * @author 郭恒辉
	 */
	D033("D033", "/ws/m/drv/getxcjypic", "读取现场/体验现场签到照片接口"),;

	String id;
	String uri;
	String desc;

	private NativeApiType(String id, String uri, String desc) {
		this.id = id;
		this.uri = uri;
		this.desc = desc;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

}
