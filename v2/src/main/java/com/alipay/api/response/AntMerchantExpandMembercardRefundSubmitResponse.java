package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.refund.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:21:44
 */
public class AntMerchantExpandMembercardRefundSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3861178967597539399L;

	/** 
	 * 退款金额（单位：元）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退款手续费（单位：元）
	 */
	@ApiField("refund_fee")
	private String refundFee;

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}
	public String getRefundFee( ) {
		return this.refundFee;
	}

}
