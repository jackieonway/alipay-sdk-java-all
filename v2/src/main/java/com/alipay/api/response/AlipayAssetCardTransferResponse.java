package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:06:57
 */
public class AlipayAssetCardTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 6755825112511931427L;

	/** 
	 * 支付宝订单id
	 */
	@ApiField("asset_order_id")
	private String assetOrderId;

	public void setAssetOrderId(String assetOrderId) {
		this.assetOrderId = assetOrderId;
	}
	public String getAssetOrderId( ) {
		return this.assetOrderId;
	}

}
