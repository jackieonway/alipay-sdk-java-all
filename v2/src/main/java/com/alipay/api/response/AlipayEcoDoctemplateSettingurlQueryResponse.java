package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.doctemplate.settingurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:39:36
 */
public class AlipayEcoDoctemplateSettingurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4247395395682969428L;

	/** 
	 * 模板设置地址
	 */
	@ApiField("setting_url")
	private String settingUrl;

	public void setSettingUrl(String settingUrl) {
		this.settingUrl = settingUrl;
	}
	public String getSettingUrl( ) {
		return this.settingUrl;
	}

}
