package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.testauthtoken.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-13 14:46:40
 */
public class AlipayOpenOperationOpenbizmockTestauthtokenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4117831892259174941L;

	/** 
	 * 测试用户授权
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
