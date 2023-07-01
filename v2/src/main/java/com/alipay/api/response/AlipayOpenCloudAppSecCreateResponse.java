package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.sec.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 20:26:58
 */
public class AlipayOpenCloudAppSecCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4494314963798145297L;

	/** 
	 * 支付宝公钥
	 */
	@ApiField("alipay_public_key")
	private String alipayPublicKey;

	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}
	public String getAlipayPublicKey( ) {
		return this.alipayPublicKey;
	}

}
