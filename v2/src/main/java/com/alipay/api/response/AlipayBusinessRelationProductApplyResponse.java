package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.product.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:35:35
 */
public class AlipayBusinessRelationProductApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2365127979749213189L;

	/** 
	 * 业务流水编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

}
