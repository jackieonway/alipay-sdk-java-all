package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.addtesttag.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 04:29:47
 */
public class AlipayUserAntpaasAddtesttagModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5518588932531347153L;

	/** 
	 * 返回是否有标记或者是否达标成功，success，msg
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
