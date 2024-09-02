package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.discount.phone.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-13 09:57:04
 */
public class AlipayCommerceAcommunicationDiscountPhoneRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7437375562828928791L;

	/** 
	 * 用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 询价返回的商品信息
	 */
	@ApiListField("recommend_item_info")
	@ApiField("recommend_item_info")
	private List<RecommendItemInfo> recommendItemInfo;

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setRecommendItemInfo(List<RecommendItemInfo> recommendItemInfo) {
		this.recommendItemInfo = recommendItemInfo;
	}
	public List<RecommendItemInfo> getRecommendItemInfo( ) {
		return this.recommendItemInfo;
	}

}
