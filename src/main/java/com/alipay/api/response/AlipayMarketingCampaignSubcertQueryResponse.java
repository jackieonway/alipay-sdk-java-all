package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubCertDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.subcert.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 20:52:43
 */
public class AlipayMarketingCampaignSubcertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6221178247916693312L;

	/** 
	 * 子凭证详细信息
	 */
	@ApiListField("subcert_list")
	@ApiField("sub_cert_detail")
	private List<SubCertDetail> subcertList;

	/** 
	 * 有效子凭证条数
	 */
	@ApiField("total_num")
	private String totalNum;

	public void setSubcertList(List<SubCertDetail> subcertList) {
		this.subcertList = subcertList;
	}
	public List<SubCertDetail> getSubcertList( ) {
		return this.subcertList;
	}

	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}
	public String getTotalNum( ) {
		return this.totalNum;
	}

}
