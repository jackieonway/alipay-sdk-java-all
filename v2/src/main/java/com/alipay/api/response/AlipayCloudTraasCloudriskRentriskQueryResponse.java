package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentRiskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.traas.cloudrisk.rentrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-15 09:22:24
 */
public class AlipayCloudTraasCloudriskRentriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6414269375183117442L;

	/** 
	 * 风险查询结果
	 */
	@ApiField("risk_result")
	private RentRiskResult riskResult;

	public void setRiskResult(RentRiskResult riskResult) {
		this.riskResult = riskResult;
	}
	public RentRiskResult getRiskResult( ) {
		return this.riskResult;
	}

}
