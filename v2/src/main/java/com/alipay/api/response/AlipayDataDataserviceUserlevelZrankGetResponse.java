package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayHighValueCustomerResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.userlevel.zrank.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:01:18
 */
public class AlipayDataDataserviceUserlevelZrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5154597776329785619L;

	/** 
	 * 活跃高价值用户返回
	 */
	@ApiField("result")
	private AlipayHighValueCustomerResult result;

	public void setResult(AlipayHighValueCustomerResult result) {
		this.result = result;
	}
	public AlipayHighValueCustomerResult getResult( ) {
		return this.result;
	}

}
