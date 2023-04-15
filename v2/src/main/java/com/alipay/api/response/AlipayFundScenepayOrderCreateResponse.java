package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:51:45
 */
public class AlipayFundScenepayOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1176174427119125417L;

	/** 
	 * 场景支付业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
