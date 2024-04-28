package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.trade.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 11:46:16
 */
public class MybankCreditSupplychainTradeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2792627741639217794L;

	/** 
	 * 业务事件受理的流水号，建议调用方保持此流水号，以方便后续业务处理
	 */
	@ApiField("ev_seq_no")
	private String evSeqNo;

	public void setEvSeqNo(String evSeqNo) {
		this.evSeqNo = evSeqNo;
	}
	public String getEvSeqNo( ) {
		return this.evSeqNo;
	}

}
