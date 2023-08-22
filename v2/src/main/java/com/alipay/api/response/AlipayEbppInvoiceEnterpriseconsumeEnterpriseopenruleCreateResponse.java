package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.enterpriseopenrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:16:42
 */
public class AlipayEbppInvoiceEnterpriseconsumeEnterpriseopenruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1685267394948135387L;

	/** 
	 * 开票规则ID
	 */
	@ApiField("invoice_rule_id")
	private String invoiceRuleId;

	public void setInvoiceRuleId(String invoiceRuleId) {
		this.invoiceRuleId = invoiceRuleId;
	}
	public String getInvoiceRuleId( ) {
		return this.invoiceRuleId;
	}

}
