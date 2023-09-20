package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序发放引导
 *
 * @author auto create
 * @since 1.0, 2023-09-19 11:51:52
 */
public class VoucherMiniAppSendGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 8731934113954633216L;

	/**
	 * 小程序发券链接
	 */
	@ApiField("mini_app_url")
	private String miniAppUrl;

	public String getMiniAppUrl() {
		return this.miniAppUrl;
	}
	public void setMiniAppUrl(String miniAppUrl) {
		this.miniAppUrl = miniAppUrl;
	}

}
