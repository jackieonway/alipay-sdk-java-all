package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VulList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.vul.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 11:44:18
 */
public class AlipaySecurityProdAfsrcVulBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1151529322162233453L;

	/** 
	 * 漏洞信息列表
	 */
	@ApiListField("data")
	@ApiField("vul_list")
	private List<VulList> data;

	public void setData(List<VulList> data) {
		this.data = data;
	}
	public List<VulList> getData( ) {
		return this.data;
	}

}
