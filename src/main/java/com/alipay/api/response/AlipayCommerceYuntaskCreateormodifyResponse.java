package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-16 19:56:35
 */
public class AlipayCommerceYuntaskCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6233811874779792984L;

	/** 
	 * 调用成功返回任务模版id
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}
	public String getTaskTemplateId( ) {
		return this.taskTemplateId;
	}

}
