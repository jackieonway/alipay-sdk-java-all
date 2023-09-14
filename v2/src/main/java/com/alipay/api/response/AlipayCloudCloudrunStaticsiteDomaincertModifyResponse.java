package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.domaincert.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:02:01
 */
public class AlipayCloudCloudrunStaticsiteDomaincertModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5381792479415225464L;

	/** 
	 * 证书，PEM格式。
	 */
	@ApiField("certificate")
	private String certificate;

	/** 
	 * 是否开启https。
	 */
	@ApiField("enable_https")
	private Boolean enableHttps;

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public String getCertificate( ) {
		return this.certificate;
	}

	public void setEnableHttps(Boolean enableHttps) {
		this.enableHttps = enableHttps;
	}
	public Boolean getEnableHttps( ) {
		return this.enableHttps;
	}

}
