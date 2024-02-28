package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserFeedbackResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.engineering.infrastructure.all.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-23 16:36:59
 */
public class AlipayEngineeringInfrastructureAllBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5137257232724652195L;

	/** 
	 * 反馈内容
	 */
	@ApiListField("user_feedback_list")
	@ApiField("user_feedback_result")
	private List<UserFeedbackResult> userFeedbackList;

	public void setUserFeedbackList(List<UserFeedbackResult> userFeedbackList) {
		this.userFeedbackList = userFeedbackList;
	}
	public List<UserFeedbackResult> getUserFeedbackList( ) {
		return this.userFeedbackList;
	}

}
