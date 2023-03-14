package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.transport.cardinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:46:57
 */
public class AlipayPayAppTransportCardinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5696576572636553798L;

	/** 
	 * 卡信息密文
	 */
	@ApiField("card_data_cipher")
	private String cardDataCipher;

	public void setCardDataCipher(String cardDataCipher) {
		this.cardDataCipher = cardDataCipher;
	}
	public String getCardDataCipher( ) {
		return this.cardDataCipher;
	}

}
