package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.plan.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:26:46
 */
public class AlipayCommerceTransportAdPlanGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5319364239545471496L;

	/** 
	 * 计划详情
	 */
	@ApiField("plan_result")
	private AdPlan planResult;

	public void setPlanResult(AdPlan planResult) {
		this.planResult = planResult;
	}
	public AdPlan getPlanResult( ) {
		return this.planResult;
	}

}
