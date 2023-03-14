package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntentQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.iot.intent.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 20:17:02
 */
public class AlipayIserviceIotIntentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5353497838442989584L;

	/** 
	 * iot的响应类
	 */
	@ApiField("iot_response")
	private IntentQueryResponse iotResponse;

	public void setIotResponse(IntentQueryResponse iotResponse) {
		this.iotResponse = iotResponse;
	}
	public IntentQueryResponse getIotResponse( ) {
		return this.iotResponse;
	}

}
