package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ctid.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:36
 */
public class AlipaySecurityProdCtidVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1164626952616514229L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果码描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}
