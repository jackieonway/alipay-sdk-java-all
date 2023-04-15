package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GrmProjectInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.grmcore.program.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 15:33:31
 */
public class AntProdpaasGrmcoreProgramQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4457632886339798918L;

	/** 
	 * 业管平台立项信息
	 */
	@ApiField("result_data")
	private GrmProjectInfoDTO resultData;

	public void setResultData(GrmProjectInfoDTO resultData) {
		this.resultData = resultData;
	}
	public GrmProjectInfoDTO getResultData( ) {
		return this.resultData;
	}

}
