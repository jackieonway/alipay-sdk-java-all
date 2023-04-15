package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.mrchsurplmitem.cannotsell.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:14:37
 */
public class AlipayMerchantMrchsurplmitemCannotsellSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7576115448764872184L;

	/** 
	 * 将请求中的ID直接返回
	 */
	@ApiField("request_id")
	private String requestId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
