package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.region.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:01
 */
public class AlipayInsCooperationRegionQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8844247256136265595L;

	/** 
	 * 快捷投保产品二维码图片链接URL
	 */
	@ApiField("code_url")
	private String codeUrl;

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}
	public String getCodeUrl( ) {
		return this.codeUrl;
	}

}
