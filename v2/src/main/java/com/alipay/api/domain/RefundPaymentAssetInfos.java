package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款明细
 *
 * @author auto create
 * @since 1.0, 2024-04-15 11:32:35
 */
public class RefundPaymentAssetInfos extends AlipayObject {

	private static final long serialVersionUID = 3513313195783773887L;

	/**
	 * 银行卡机构id
	 */
	@ApiField("bank_inst_id")
	private String bankInstId;

	/**
	 * 交易最后处理时间
	 */
	@ApiField("execute_time")
	private String executeTime;

	/**
	 * 原充值单号
	 */
	@ApiField("origin_order_id")
	private String originOrderId;

	/**
	 * 交易总金额，单位元
	 */
	@ApiField("receiver_asset_code")
	private String receiverAssetCode;

	/**
	 * 收款资产账号
	 */
	@ApiField("receiver_asset_no")
	private String receiverAssetNo;

	/**
	 * 登录账号
	 */
	@ApiField("receiver_logon_id")
	private String receiverLogonId;

	/**
	 * 单据退款金额，单位元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	public String getBankInstId() {
		return this.bankInstId;
	}
	public void setBankInstId(String bankInstId) {
		this.bankInstId = bankInstId;
	}

	public String getExecuteTime() {
		return this.executeTime;
	}
	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
	}

	public String getOriginOrderId() {
		return this.originOrderId;
	}
	public void setOriginOrderId(String originOrderId) {
		this.originOrderId = originOrderId;
	}

	public String getReceiverAssetCode() {
		return this.receiverAssetCode;
	}
	public void setReceiverAssetCode(String receiverAssetCode) {
		this.receiverAssetCode = receiverAssetCode;
	}

	public String getReceiverAssetNo() {
		return this.receiverAssetNo;
	}
	public void setReceiverAssetNo(String receiverAssetNo) {
		this.receiverAssetNo = receiverAssetNo;
	}

	public String getReceiverLogonId() {
		return this.receiverLogonId;
	}
	public void setReceiverLogonId(String receiverLogonId) {
		this.receiverLogonId = receiverLogonId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
