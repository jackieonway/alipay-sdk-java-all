package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.apidefaultparam.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:01:58
 */
public class AlipayOpenApidefaultparamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1541828517698492554L;

	/** 
	 * 某个接口的默认入参
	 */
	@ApiField("param")
	private String param;

	public void setParam(String param) {
		this.param = param;
	}
	public String getParam( ) {
		return this.param;
	}

}
