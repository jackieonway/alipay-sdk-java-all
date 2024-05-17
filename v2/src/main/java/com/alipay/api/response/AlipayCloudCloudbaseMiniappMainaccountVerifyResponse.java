package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.miniapp.mainaccount.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-15 11:37:02
 */
public class AlipayCloudCloudbaseMiniappMainaccountVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8196514511456229537L;

	/** 
	 * 校验结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
