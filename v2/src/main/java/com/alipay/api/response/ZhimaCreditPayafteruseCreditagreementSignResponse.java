package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditagreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-06 15:00:44
 */
public class ZhimaCreditPayafteruseCreditagreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1436865874893434871L;

	/** 
	 * 芝麻开通/授权协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}
	public String getCreditAgreementId( ) {
		return this.creditAgreementId;
	}

	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}
	public String getOutAgreementNo( ) {
		return this.outAgreementNo;
	}

}
