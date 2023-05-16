package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceElementModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.financial.blockchain.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:09:45
 */
public class AlipayEbppInvoiceFinancialBlockchainBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6895827431828937229L;

	/** 
	 * 发票列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_model")
	private List<InvoiceElementModel> invoiceElementList;

	public void setInvoiceElementList(List<InvoiceElementModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
	}
	public List<InvoiceElementModel> getInvoiceElementList( ) {
		return this.invoiceElementList;
	}

}
