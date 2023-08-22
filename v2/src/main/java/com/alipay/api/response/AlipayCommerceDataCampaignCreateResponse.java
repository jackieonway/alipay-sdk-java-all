package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.campaign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:15:49
 */
public class AlipayCommerceDataCampaignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2287963757778475117L;

	/** 
	 * 集点活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

}
