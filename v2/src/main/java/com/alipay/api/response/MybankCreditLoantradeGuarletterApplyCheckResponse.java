package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.guarletter.apply.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:10:01
 */
public class MybankCreditLoantradeGuarletterApplyCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2198331967963399523L;

	/** 
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 出函机构
	 */
	@ApiField("inst_name")
	private String instName;

	/** 
	 * 验证结果
	 */
	@ApiField("verified")
	private Boolean verified;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public Boolean getVerified( ) {
		return this.verified;
	}

}
