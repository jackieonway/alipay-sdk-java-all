package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用报告查询接口
 *
 * @author auto create
 * @since 1.0, 2024-11-05 10:27:53
 */
public class ZhimaCreditEpReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7655565943696533282L;

	/**
	 * 企信生成的报告订单号，用于唯一查询
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
