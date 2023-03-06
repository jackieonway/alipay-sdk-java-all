package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdataassets.easyservice response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 17:44:16
 */
public class AlipayZdataassetsEasyserviceResponse extends AlipayResponse {

	private static final long serialVersionUID = 6713529189989535235L;

	/** 
	 * 返回结果
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
