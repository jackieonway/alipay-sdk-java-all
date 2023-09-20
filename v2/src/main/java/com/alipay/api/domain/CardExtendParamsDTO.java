package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-09-07 18:01:01
 */
public class CardExtendParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 6289459734796685743L;

	/**
	 * 是否需要开通钱包
	 */
	@ApiField("open_wallet")
	private String openWallet;

	public String getOpenWallet() {
		return this.openWallet;
	}
	public void setOpenWallet(String openWallet) {
		this.openWallet = openWallet;
	}

}
