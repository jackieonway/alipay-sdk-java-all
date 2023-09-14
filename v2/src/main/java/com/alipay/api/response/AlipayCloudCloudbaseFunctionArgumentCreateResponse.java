package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.argument.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 20:51:41
 */
public class AlipayCloudCloudbaseFunctionArgumentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6392885575137315954L;

	/** 
	 * 创建参数配置结果
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
