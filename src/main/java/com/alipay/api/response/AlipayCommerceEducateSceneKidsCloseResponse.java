package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.kids.close response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-22 16:44:44
 */
public class AlipayCommerceEducateSceneKidsCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6517194125946337416L;

	/** 
	 * 关闭业务是否成功
	 */
	@ApiField("close_success")
	private String closeSuccess;

	public void setCloseSuccess(String closeSuccess) {
		this.closeSuccess = closeSuccess;
	}
	public String getCloseSuccess( ) {
		return this.closeSuccess;
	}

}
