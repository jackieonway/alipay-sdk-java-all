package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.tagcrowd.count.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:10:38
 */
public class DatadigitalFincloudFinsaasTagcrowdCountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8885984994999359183L;

	/** 
	 * 人群数量+不唯一
	 */
	@ApiField("crowd_count")
	private String crowdCount;

	public void setCrowdCount(String crowdCount) {
		this.crowdCount = crowdCount;
	}
	public String getCrowdCount( ) {
		return this.crowdCount;
	}

}
