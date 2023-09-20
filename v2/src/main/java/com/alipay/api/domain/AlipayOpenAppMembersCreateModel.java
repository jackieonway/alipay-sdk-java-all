package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加小程序开发者或体验者
 *
 * @author auto create
 * @since 1.0, 2023-06-20 09:51:57
 */
public class AlipayOpenAppMembersCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3871834862138363299L;

	/**
	 * 支付宝登录账号。
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 为成员添加的角色类型，支持：
DEVELOPER-开发者；
EXPERIENCER-体验者。
	 */
	@ApiField("role")
	private String role;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
