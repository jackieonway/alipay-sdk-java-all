package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.crowd.logical.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:47:00
 */
public class DatadigitalFincloudFinsaasCrowdLogicalCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3493264972119764799L;

	/** 
	 * 人群ID+唯一
	 */
	@ApiField("crowd_id")
	private String crowdId;

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

}
