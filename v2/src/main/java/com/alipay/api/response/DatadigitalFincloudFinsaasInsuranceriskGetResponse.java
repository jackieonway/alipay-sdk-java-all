package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurancerisk.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:44
 */
public class DatadigitalFincloudFinsaasInsuranceriskGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8629945218444237573L;

	/** 
	 * 风控信息
不唯一
模型预测、硬规则等场景返回的风险信息
	 */
	@ApiField("risk_content")
	private String riskContent;

	public void setRiskContent(String riskContent) {
		this.riskContent = riskContent;
	}
	public String getRiskContent( ) {
		return this.riskContent;
	}

}
