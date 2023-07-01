package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.printmodel.print.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:45:59
 */
public class AlipayCommerceIotPrintmodelPrintSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1446756447292959136L;

	/** 
	 * 调用任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
