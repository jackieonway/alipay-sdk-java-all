package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:48:45
 */
public class AlipayPcreditHuabeiPcreditbenefitOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8294794244618629561L;

	/** 
	 * 操作结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
