package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单回流接口
 *
 * @author auto create
 * @since 1.0, 2022-12-27 11:01:27
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7749353617551839632L;

	/**
	 * 支付宝开放id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 医生所属科室
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生执业医院
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 图文问诊/电话问诊/视频问诊
IMAGE_INQUIRY/PHONE_INQUIRY/VIDEO_INQUIRY
	 */
	@ApiField("inquiry_mode")
	private String inquiryMode;

	/**
	 * 问诊类型
	 */
	@ApiField("inquiry_type")
	private String inquiryType;

	/**
	 * 外部平台医生id
	 */
	@ApiField("merchant_doctor_id")
	private String merchantDoctorId;

	/**
	 * 订单详情页链接
	 */
	@ApiField("merchant_order_link_page")
	private String merchantOrderLinkPage;

	/**
	 * 待支付/待接诊 / 待问诊 / 问诊中 / 已完成 / 已取消 / 已退款：WAIT_PAY/WAIT_RECEPTION/WAIT_INQUIRY/IN_INQUIRY/FINISHED/CANCELED/REFUNDED
	 */
	@ApiField("merchant_order_status")
	private String merchantOrderStatus;

	/**
	 * 外部平台自身用户id，无特殊校验
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单修改时间
	 */
	@ApiField("order_modified_time")
	private String orderModifiedTime;

	/**
	 * 固定值：INQUIRY_ORDER
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * out_biz_no，唯一，外部商户自有订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 固定值：INQUIRY_ORDER
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 外部平台编号，支付宝给出
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 预约问诊时间
	 */
	@ApiField("scheduled_time")
	private String scheduledTime;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getInquiryMode() {
		return this.inquiryMode;
	}
	public void setInquiryMode(String inquiryMode) {
		this.inquiryMode = inquiryMode;
	}

	public String getInquiryType() {
		return this.inquiryType;
	}
	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}

	public String getMerchantDoctorId() {
		return this.merchantDoctorId;
	}
	public void setMerchantDoctorId(String merchantDoctorId) {
		this.merchantDoctorId = merchantDoctorId;
	}

	public String getMerchantOrderLinkPage() {
		return this.merchantOrderLinkPage;
	}
	public void setMerchantOrderLinkPage(String merchantOrderLinkPage) {
		this.merchantOrderLinkPage = merchantOrderLinkPage;
	}

	public String getMerchantOrderStatus() {
		return this.merchantOrderStatus;
	}
	public void setMerchantOrderStatus(String merchantOrderStatus) {
		this.merchantOrderStatus = merchantOrderStatus;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderModifiedTime() {
		return this.orderModifiedTime;
	}
	public void setOrderModifiedTime(String orderModifiedTime) {
		this.orderModifiedTime = orderModifiedTime;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getScheduledTime() {
		return this.scheduledTime;
	}
	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

}
