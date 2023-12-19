package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.entry.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-22 14:01:49
 */
public class AntProdpaasProductEntryCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 1125899844221142242L;

	/** 
	 * 状态码(success|failure)
	 */
	@ApiField("flag")
	private String flag;

	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

}
