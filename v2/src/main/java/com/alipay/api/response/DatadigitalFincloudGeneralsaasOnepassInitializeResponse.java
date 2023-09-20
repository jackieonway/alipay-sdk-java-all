package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.onepass.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-13 18:01:44
 */
public class DatadigitalFincloudGeneralsaasOnepassInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1751615772827156459L;

	/** 
	 * 本机校验流水ID，请保留方便排查问题
	 */
	@ApiField("certify_id")
	private String certifyId;

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}
	public String getCertifyId( ) {
		return this.certifyId;
	}

}
