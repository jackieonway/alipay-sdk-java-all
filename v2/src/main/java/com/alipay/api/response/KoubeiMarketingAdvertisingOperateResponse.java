package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.advertising.operate response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 23:58:34
 */
public class KoubeiMarketingAdvertisingOperateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2171323932751384936L;

	/** 
	 * 正常操作返回当前操作的广告id。如果操作失败，返回的广告id为空
	 */
	@ApiField("ad_id")
	private String adId;

	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdId( ) {
		return this.adId;
	}

}
