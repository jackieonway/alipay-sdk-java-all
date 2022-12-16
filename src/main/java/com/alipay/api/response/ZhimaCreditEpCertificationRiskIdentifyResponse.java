package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.certification.risk.identify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-13 14:39:39
 */
public class ZhimaCreditEpCertificationRiskIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1163571966777255241L;

	/** 
	 * 认证风险识别结果集合
	 */
	@ApiListField("risk_identify_result")
	@ApiField("string")
	private List<String> riskIdentifyResult;

	public void setRiskIdentifyResult(List<String> riskIdentifyResult) {
		this.riskIdentifyResult = riskIdentifyResult;
	}
	public List<String> getRiskIdentifyResult( ) {
		return this.riskIdentifyResult;
	}

}
