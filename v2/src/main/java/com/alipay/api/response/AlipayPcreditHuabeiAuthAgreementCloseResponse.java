package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.agreement.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:51:41
 */
public class AlipayPcreditHuabeiAuthAgreementCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1882781818635221347L;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
