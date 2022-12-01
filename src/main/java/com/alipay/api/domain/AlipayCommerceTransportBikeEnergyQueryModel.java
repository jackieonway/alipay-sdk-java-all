package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单车骑行能量开关状态
 *
 * @author auto create
 * @since 1.0, 2022-11-29 15:40:15
 */
public class AlipayCommerceTransportBikeEnergyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5567711134386839529L;

	/**
	 * 蚂蚁统一会员ID（对外）
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
