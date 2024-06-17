package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单分期金额
 *
 * @author auto create
 * @since 1.0, 2024-06-11 16:52:22
 */
public class BillTermAmountVO extends AlipayObject {

	private static final long serialVersionUID = 7374685341348721854L;

	/**
	 * 利息，元
	 */
	@ApiField("fee")
	private String fee;

	/**
	 * 本金，元
	 */
	@ApiField("prin")
	private String prin;

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getPrin() {
		return this.prin;
	}
	public void setPrin(String prin) {
		this.prin = prin;
	}

}
