package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserTaskSimpleDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.taskcenter.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 20:16:58
 */
public class AlipayCommerceSportsTaskcenterBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1431832864519884593L;

	/** 
	 * 用户任务简单对象列表
	 */
	@ApiListField("user_task_list")
	@ApiField("user_task_simple_dto")
	private List<UserTaskSimpleDto> userTaskList;

	public void setUserTaskList(List<UserTaskSimpleDto> userTaskList) {
		this.userTaskList = userTaskList;
	}
	public List<UserTaskSimpleDto> getUserTaskList( ) {
		return this.userTaskList;
	}

}
