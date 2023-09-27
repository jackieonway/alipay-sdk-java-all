package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CertificateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.industrymsg.auth.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:03:19
 */
public class AlipayEcoCityserviceIndustrymsgAuthBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6263345814724723973L;

	/** 
	 * 筛选出来的在市民中心已订阅行业动帐消息的用户信息列表
	 */
	@ApiListField("certificate_info_list")
	@ApiField("certificate_info")
	private List<CertificateInfo> certificateInfoList;

	public void setCertificateInfoList(List<CertificateInfo> certificateInfoList) {
		this.certificateInfoList = certificateInfoList;
	}
	public List<CertificateInfo> getCertificateInfoList( ) {
		return this.certificateInfoList;
	}

}
