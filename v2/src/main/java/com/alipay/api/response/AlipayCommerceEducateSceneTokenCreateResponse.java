package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 17:41:41
 */
public class AlipayCommerceEducateSceneTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1667176267542339173L;

	/** 
	 * 请求生成场景token
	 */
	@ApiField("token")
	private String token;

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
