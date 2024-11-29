package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.release.publish.check response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 16:22:11
 */
public class AntfortuneStockReleasePublishCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4233533579378745467L;

	/** 
	 * 返回本次发布的校验结果
	 */
	@ApiField("publish_able")
	private Boolean publishAble;

	public void setPublishAble(Boolean publishAble) {
		this.publishAble = publishAble;
	}
	public Boolean getPublishAble( ) {
		return this.publishAble;
	}

}
