package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.advancepay.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 12:07:19
 */
public class AlipayCommerceMedicalInsuranceAdvancepaySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5796319173446212461L;

	/** 
	 * 同步返回值
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
