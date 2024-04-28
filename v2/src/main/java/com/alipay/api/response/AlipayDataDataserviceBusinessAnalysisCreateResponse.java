package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.business.analysis.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-03 10:02:43
 */
public class AlipayDataDataserviceBusinessAnalysisCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7393318924339839168L;

	/** 
	 * 商圈分析任务ID，唯一
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
