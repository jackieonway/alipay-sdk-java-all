package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 顶部运营位详情查询
 *
 * @author auto create
 * @since 1.0, 2024-09-13 10:52:17
 */
public class AlipayMerchantGroupActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5445865182693179936L;

	/**
	 * 商家群活动id
	 */
	@ApiField("group_activity_id")
	private String groupActivityId;

	public String getGroupActivityId() {
		return this.groupActivityId;
	}
	public void setGroupActivityId(String groupActivityId) {
		this.groupActivityId = groupActivityId;
	}

}
