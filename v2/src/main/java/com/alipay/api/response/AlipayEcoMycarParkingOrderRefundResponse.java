package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:43:31
 */
public class AlipayEcoMycarParkingOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3433827182679882118L;

	/** 
	 * 代扣时返回的支付宝支付交易流水号，系统唯一
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部申请退款请求流水，ISV唯一
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 本次退款金额，保留小数点后两位
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 支付宝退款流水
	 */
	@ApiField("refund_no")
	private String refundNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}
	public String getOutRefundNo( ) {
		return this.outRefundNo;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}
	public String getRefundFee( ) {
		return this.refundFee;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}
	public String getRefundNo( ) {
		return this.refundNo;
	}

}
