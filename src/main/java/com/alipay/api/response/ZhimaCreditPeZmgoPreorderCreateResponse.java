package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.preorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 17:57:15
 */
public class ZhimaCreditPeZmgoPreorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1767463774825122212L;

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
