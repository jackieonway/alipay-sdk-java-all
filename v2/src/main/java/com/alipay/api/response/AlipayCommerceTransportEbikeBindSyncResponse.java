package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ebike.bind.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:08:52
 */
public class AlipayCommerceTransportEbikeBindSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6286676141633887689L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
