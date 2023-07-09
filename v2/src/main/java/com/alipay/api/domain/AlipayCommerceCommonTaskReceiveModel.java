package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务领取
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:33:16
 */
public class AlipayCommerceCommonTaskReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 4767175583499728441L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员openId
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 代运营商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 任务模板id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

}
