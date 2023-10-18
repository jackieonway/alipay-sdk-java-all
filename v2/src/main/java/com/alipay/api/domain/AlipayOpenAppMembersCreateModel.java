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

	private static final long serialVersionUID = 1656434221249322721L;

	/**
	 * 支付宝登录账号。
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 为成员添加的角色类型
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
