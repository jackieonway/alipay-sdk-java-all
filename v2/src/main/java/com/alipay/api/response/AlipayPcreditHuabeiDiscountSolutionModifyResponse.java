package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.solution.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:49:55
 */
public class AlipayPcreditHuabeiDiscountSolutionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4788143814929889965L;

	/** 
	 * success，是否更新成功，true成功，false失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
