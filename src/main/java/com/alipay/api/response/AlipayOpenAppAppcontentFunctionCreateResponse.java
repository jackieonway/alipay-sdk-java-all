package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.appcontent.function.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:57:09
 */
public class AlipayOpenAppAppcontentFunctionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7515819377599167184L;

	/** 
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
