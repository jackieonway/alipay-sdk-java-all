package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.upgrade response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-11 22:26:49
 */
public class AntMerchantExpandIndirectZftUpgradeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1499284259161994934L;

	/** 
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
