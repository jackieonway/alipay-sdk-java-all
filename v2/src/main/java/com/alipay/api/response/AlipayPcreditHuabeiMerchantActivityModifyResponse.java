package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.activity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:49:45
 */
public class AlipayPcreditHuabeiMerchantActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5643849913634639952L;

	/** 
	 * 商户活动ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}
	public String getAggrId( ) {
		return this.aggrId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
