package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.antlogmng.activitypagespm.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:35:27
 */
public class AlipayMarketingDataAntlogmngActivitypagespmCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1825555677483219459L;

	/** 
	 * 申请是否成功
	 */
	@ApiField("issuc")
	private Boolean issuc;

	/** 
	 * 描述业务状态
	 */
	@ApiField("message")
	private String message;

	public void setIssuc(Boolean issuc) {
		this.issuc = issuc;
	}
	public Boolean getIssuc( ) {
		return this.issuc;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
