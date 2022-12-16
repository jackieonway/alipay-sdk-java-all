package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收检测结果提交
 *
 * @author auto create
 * @since 1.0, 2022-12-07 11:01:56
 */
public class KoubeiQualityTestCloudacptCheckresultSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1488238256485648688L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 付款码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 批次ID
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * partenter id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * user id
	 */
	@ApiField("uid")
	private String uid;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
