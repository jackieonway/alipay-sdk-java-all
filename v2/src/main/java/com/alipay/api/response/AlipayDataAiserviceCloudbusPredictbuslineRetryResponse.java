package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CloudbusRetryPredictItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.cloudbus.predictbusline.retry response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:52:18
 */
public class AlipayDataAiserviceCloudbusPredictbuslineRetryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2289664339317476234L;

	/** 
	 * 预测任务提交返回
	 */
	@ApiField("result")
	private CloudbusRetryPredictItem result;

	public void setResult(CloudbusRetryPredictItem result) {
		this.result = result;
	}
	public CloudbusRetryPredictItem getResult( ) {
		return this.result;
	}

}
