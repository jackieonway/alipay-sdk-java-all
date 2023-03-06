package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.morpho.app.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:47:20
 */
public class AlipayOpenMiniMorphoAppCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5415535279282493514L;

	/** 
	 * 闪蝶应用ID
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
