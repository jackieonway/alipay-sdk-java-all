package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.issuerule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:02:53
 */
public class AlipayEbppInvoiceIssueruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1414353937476831723L;

	/** 
	 * 创建的发放规则ID
	 */
	@ApiField("issue_rule_id")
	private String issueRuleId;

	public void setIssueRuleId(String issueRuleId) {
		this.issueRuleId = issueRuleId;
	}
	public String getIssueRuleId( ) {
		return this.issueRuleId;
	}

}
