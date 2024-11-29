package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.isv.fastregister.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-14 11:18:59
 */
public class AlipayOpenMiniIsvFastregisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8413875566444517264L;

	/** 
	 * 授权确认跳转url
	 */
	@ApiField("authorize_url")
	private String authorizeUrl;

	/** 
	 * 代创建试用小程序单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setAuthorizeUrl(String authorizeUrl) {
		this.authorizeUrl = authorizeUrl;
	}
	public String getAuthorizeUrl( ) {
		return this.authorizeUrl;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
