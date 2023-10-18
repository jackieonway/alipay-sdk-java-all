package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.tasktemplate.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-15 10:56:44
 */
public class AlipayCommerceCommonTasktemplateCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2616319921451168678L;

	/** 
	 * 任务模板id
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
