package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.remit.withdraw.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:44:12
 */
public class AlipayOverseasRemitWithdrawNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8752615149685199817L;

	/** 
	 * JSON map
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

}
