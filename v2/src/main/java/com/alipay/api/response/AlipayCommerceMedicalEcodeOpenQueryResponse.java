package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ecode.open.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-02 11:52:04
 */
public class AlipayCommerceMedicalEcodeOpenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3594165156311986971L;

	/** 
	 * 脱敏用户支付宝登录名
	 */
	@ApiField("login_name")
	private String loginName;

	/** 
	 * 用户是否开通一码付
	 */
	@ApiField("open")
	private Boolean open;

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName( ) {
		return this.loginName;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}
	public Boolean getOpen( ) {
		return this.open;
	}

}
