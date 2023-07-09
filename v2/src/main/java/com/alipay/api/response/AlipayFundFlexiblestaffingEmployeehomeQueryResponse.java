package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentAgreementInfoDTO;
import com.alipay.api.domain.RentServiceInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.employeehome.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:41:48
 */
public class AlipayFundFlexiblestaffingEmployeehomeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2529741758391172978L;

	/** 
	 * 授权状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 商户端为以订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 租赁账户信息
	 */
	@ApiField("rent_agreement_info")
	private RentAgreementInfoDTO rentAgreementInfo;

	/** 
	 * 接待专户信息
	 */
	@ApiField("rent_service_info")
	private RentServiceInfoDTO rentServiceInfo;

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setRentAgreementInfo(RentAgreementInfoDTO rentAgreementInfo) {
		this.rentAgreementInfo = rentAgreementInfo;
	}
	public RentAgreementInfoDTO getRentAgreementInfo( ) {
		return this.rentAgreementInfo;
	}

	public void setRentServiceInfo(RentServiceInfoDTO rentServiceInfo) {
		this.rentServiceInfo = rentServiceInfo;
	}
	public RentServiceInfoDTO getRentServiceInfo( ) {
		return this.rentServiceInfo;
	}

}
