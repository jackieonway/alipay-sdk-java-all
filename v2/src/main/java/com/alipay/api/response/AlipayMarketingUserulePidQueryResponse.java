package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.userule.pid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:33:16
 */
public class AlipayMarketingUserulePidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7799351582788963268L;

	/** 
	 * 满足条件的所有pid，多个pid使用英文逗号隔开
	 */
	@ApiField("pids")
	private String pids;

	public void setPids(String pids) {
		this.pids = pids;
	}
	public String getPids( ) {
		return this.pids;
	}

}
