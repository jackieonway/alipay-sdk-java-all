package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财账单逆向受理
 *
 * @author auto create
 * @since 1.0, 2022-11-08 14:58:22
 */
public class AlipayBossFncGfacceptanceBillReverseModel extends AlipayObject {

	private static final long serialVersionUID = 8138956995457626514L;

	/**
	 * 16位。支付宝UID或者2088000000000XX0，倒数2、3位数字用来决策LDC ZoneUid和分库位
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 业财逆向账单受理
	 */
	@ApiField("reverse_bill_acceptance")
	private GFAOpenAPIReverseBillAcceptance reverseBillAcceptance;

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public GFAOpenAPIReverseBillAcceptance getReverseBillAcceptance() {
		return this.reverseBillAcceptance;
	}
	public void setReverseBillAcceptance(GFAOpenAPIReverseBillAcceptance reverseBillAcceptance) {
		this.reverseBillAcceptance = reverseBillAcceptance;
	}

}
