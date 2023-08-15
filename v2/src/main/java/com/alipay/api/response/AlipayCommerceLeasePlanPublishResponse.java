package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lease.plan.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-11 11:07:41
 */
public class AlipayCommerceLeasePlanPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 2594563113766416356L;

	/** 
	 * 租赁计划id
	 */
	@ApiField("plan_id")
	private String planId;

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

}
