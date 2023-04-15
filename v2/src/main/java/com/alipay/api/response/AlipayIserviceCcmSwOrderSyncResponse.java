package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 17:51:46
 */
public class AlipayIserviceCcmSwOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1126367838637864852L;

	/** 
	 * 订单id
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
