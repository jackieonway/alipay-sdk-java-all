package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.attachment.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:38:54
 */
public class AntMerchantExpandIndirectAttachmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3273997621229157925L;

	/** 
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
