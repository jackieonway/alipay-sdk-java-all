package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.template.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:24:07
 */
public class AlipayMobilePublicTemplateMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1343964798621173248L;

	/** 
	 * 结果值
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
