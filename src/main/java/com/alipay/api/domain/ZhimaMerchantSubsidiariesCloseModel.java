package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭子商户信息工单
 *
 * @author auto create
 * @since 1.0, 2022-12-15 16:13:49
 */
public class ZhimaMerchantSubsidiariesCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3347624883657228415L;

	/**
	 * 工单标识
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
