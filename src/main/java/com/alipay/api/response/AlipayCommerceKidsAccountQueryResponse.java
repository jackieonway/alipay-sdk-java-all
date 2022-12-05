package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-05 14:25:37
 */
public class AlipayCommerceKidsAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6477233118731784623L;

	/** 
	 * 登陆名
	 */
	@ApiField("login_name")
	private String loginName;

	/** 
	 * 会员id
	 */
	@ApiField("user_id")
	private String userId;

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName( ) {
		return this.loginName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
