package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskDetailListResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.task.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 12:46:42
 */
public class AlipayCommerceWaterTaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1763681271319184814L;

	/** 
	 * 任务列表
	 */
	@ApiListField("task_detail_list_response")
	@ApiField("task_detail_list_response")
	private List<TaskDetailListResponse> taskDetailListResponse;

	public void setTaskDetailListResponse(List<TaskDetailListResponse> taskDetailListResponse) {
		this.taskDetailListResponse = taskDetailListResponse;
	}
	public List<TaskDetailListResponse> getTaskDetailListResponse( ) {
		return this.taskDetailListResponse;
	}

}
