package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 终止合作关系
 *
 * @author auto create
 * @since 1.0, 2023-11-27 10:24:48
 */
public class AlipayMarketingPartnershipsStopModel extends AlipayObject {

	private static final long serialVersionUID = 7482274279863192482L;

	/**
	 * 本次终止授权给合作方的营销资源。
	 */
	@ApiField("authorized_data")
	private MarketingAuthorizedData authorizedData;

	/**
	 * 合作方相关信息
	 */
	@ApiField("partner")
	private MarketingPartner partner;

	public MarketingAuthorizedData getAuthorizedData() {
		return this.authorizedData;
	}
	public void setAuthorizedData(MarketingAuthorizedData authorizedData) {
		this.authorizedData = authorizedData;
	}

	public MarketingPartner getPartner() {
		return this.partner;
	}
	public void setPartner(MarketingPartner partner) {
		this.partner = partner;
	}

}
