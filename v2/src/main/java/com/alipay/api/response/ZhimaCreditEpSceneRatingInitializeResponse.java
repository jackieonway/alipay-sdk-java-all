package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.rating.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:59:37
 */
public class ZhimaCreditEpSceneRatingInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5418568782692627241L;

	/** 
	 * 芝麻企业信用评估单号，商户应该妥善关联持久化保存该订单号用于后续的对账。
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
