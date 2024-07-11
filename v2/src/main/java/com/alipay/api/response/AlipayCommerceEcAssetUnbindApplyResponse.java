package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.asset.unbind.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:09
 */
public class AlipayCommerceEcAssetUnbindApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7855355548438571641L;

	/** 
	 * 取消授权链接
	 */
	@ApiField("cancel_authorize_link")
	private String cancelAuthorizeLink;

	public void setCancelAuthorizeLink(String cancelAuthorizeLink) {
		this.cancelAuthorizeLink = cancelAuthorizeLink;
	}
	public String getCancelAuthorizeLink( ) {
		return this.cancelAuthorizeLink;
	}

}
