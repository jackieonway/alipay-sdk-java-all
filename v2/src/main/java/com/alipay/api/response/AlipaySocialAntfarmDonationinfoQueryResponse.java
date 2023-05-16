package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntfarmUserDonationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antfarm.donationinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:32:15
 */
public class AlipaySocialAntfarmDonationinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3695216277579414386L;

	/** 
	 * 当前用户捐赠爱心记录
	 */
	@ApiListField("donation_list")
	@ApiField("antfarm_user_donation_info")
	private List<AntfarmUserDonationInfo> donationList;

	public void setDonationList(List<AntfarmUserDonationInfo> donationList) {
		this.donationList = donationList;
	}
	public List<AntfarmUserDonationInfo> getDonationList( ) {
		return this.donationList;
	}

}
