package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.zhima.preorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:57:00
 */
public class AlipayCommerceZhimaPreorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7153215116453294594L;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 芝麻GO预创建单号
	 */
	@ApiField("preorder_no")
	private String preorderNo;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPreorderNo(String preorderNo) {
		this.preorderNo = preorderNo;
	}
	public String getPreorderNo( ) {
		return this.preorderNo;
	}

}
