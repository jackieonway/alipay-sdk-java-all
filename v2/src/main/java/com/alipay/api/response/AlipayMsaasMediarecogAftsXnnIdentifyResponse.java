package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.afts.xnn.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:09:56
 */
public class AlipayMsaasMediarecogAftsXnnIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4691239116695961368L;

	/** 
	 * 算法返回结果，json字符串
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
