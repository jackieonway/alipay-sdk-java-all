package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.bidwin.notify response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-10 18:50:40
 */
public class MybankCreditLoantradeGuarletterBidwinNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2178822637842596818L;

	/** 
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

}
