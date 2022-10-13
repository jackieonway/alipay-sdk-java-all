package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.verify.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-18 14:42:56
 */
public class AlipaySecurityProdFingerprintVerifyInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8887463321922666442L;

	/** 
	 * ifaf_message:校验阶段服务端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含服务端的校验数据。
	 */
	@ApiField("server_response")
	private String serverResponse;

	public void setServerResponse(String serverResponse) {
		this.serverResponse = serverResponse;
	}
	public String getServerResponse( ) {
		return this.serverResponse;
	}

}
