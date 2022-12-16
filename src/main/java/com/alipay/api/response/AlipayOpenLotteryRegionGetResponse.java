package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.region.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 23:49:26
 */
public class AlipayOpenLotteryRegionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8544855188144282795L;

	/** 
	 * 入驻商家专区信息
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
