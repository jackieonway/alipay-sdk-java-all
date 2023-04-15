package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.promoter.relation.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:11:44
 */
public class AlipayCommercePromoterRelationDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8483191814277231359L;

	/** 
	 * 结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
