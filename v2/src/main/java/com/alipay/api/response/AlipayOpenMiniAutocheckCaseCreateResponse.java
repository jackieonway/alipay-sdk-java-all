package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.case.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:56:49
 */
public class AlipayOpenMiniAutocheckCaseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3686595573799334486L;

	/** 
	 * 用例ID
	 */
	@ApiField("case_id")
	private String caseId;

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getCaseId( ) {
		return this.caseId;
	}

}
