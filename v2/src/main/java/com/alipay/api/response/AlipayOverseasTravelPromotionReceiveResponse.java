package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.promotion.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:46:42
 */
public class AlipayOverseasTravelPromotionReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4339927547856542915L;

	/** 
	 * 券平台领券成功的券id
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}
	public String getOutPrizeId( ) {
		return this.outPrizeId;
	}

}
