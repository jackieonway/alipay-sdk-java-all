package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ScheduleTimeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.schedualtasktime.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 18:31:10
 */
public class AlipayDataAiserviceCloudbusSchedualtasktimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5723672984377273625L;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private ScheduleTimeResult result;

	public void setResult(ScheduleTimeResult result) {
		this.result = result;
	}
	public ScheduleTimeResult getResult( ) {
		return this.result;
	}

}
