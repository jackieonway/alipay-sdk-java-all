package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReceiptEnergyInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.receipt.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:00:29
 */
public class AlipayCommerceReceiptBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2529821164478443229L;

	/** 
	 * 小票查询总结果
	 */
	@ApiListField("receipt_energy_infos")
	@ApiField("receipt_energy_info_d_t_o")
	private List<ReceiptEnergyInfoDTO> receiptEnergyInfos;

	public void setReceiptEnergyInfos(List<ReceiptEnergyInfoDTO> receiptEnergyInfos) {
		this.receiptEnergyInfos = receiptEnergyInfos;
	}
	public List<ReceiptEnergyInfoDTO> getReceiptEnergyInfos( ) {
		return this.receiptEnergyInfos;
	}

}
