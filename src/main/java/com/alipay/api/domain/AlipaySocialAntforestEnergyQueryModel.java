package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询森林用户能量信息
 *
 * @author auto create
 * @since 1.0, 2022-10-09 11:11:42
 */
public class AlipaySocialAntforestEnergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4317775572766982631L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
