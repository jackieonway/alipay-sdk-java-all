package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-30 13:27:03
 */
public class AlipayOpenMiniOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8767834635212628777L;

	/** 
	 * 建议对客展示文案。当接口返回异常时，建议将当前字段对客进行展示。
	 */
	@ApiField("customer_display_text")
	private String customerDisplayText;

	/** 
	 * 交易组件订单号。可以把获取到的order_id作为<a href="https://opendocs.alipay.com/mini/05x9kv?scene=de4d6a1e0c6e423b9eefa7c3a6dcb7a5&pathHash=779dc517">alipay.trade.create（统一收单交易创建接口）</a>extend_params.trade_component_order_id的入参进行关联。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 创单扩展信息
	 */
	@ApiField("pay_info_response")
	private PayInfoResponse payInfoResponse;

	public void setCustomerDisplayText(String customerDisplayText) {
		this.customerDisplayText = customerDisplayText;
	}
	public String getCustomerDisplayText( ) {
		return this.customerDisplayText;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setPayInfoResponse(PayInfoResponse payInfoResponse) {
		this.payInfoResponse = payInfoResponse;
	}
	public PayInfoResponse getPayInfoResponse( ) {
		return this.payInfoResponse;
	}

}
