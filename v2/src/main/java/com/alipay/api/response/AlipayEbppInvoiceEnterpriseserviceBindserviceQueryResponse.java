package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ServiceProductInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseservice.bindservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 20:01:56
 */
public class AlipayEbppInvoiceEnterpriseserviceBindserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5637417652477463373L;

	/** 
	 * 服务产品列表
	 */
	@ApiListField("service_product_list")
	@ApiField("service_product_info")
	private List<ServiceProductInfo> serviceProductList;

	public void setServiceProductList(List<ServiceProductInfo> serviceProductList) {
		this.serviceProductList = serviceProductList;
	}
	public List<ServiceProductInfo> getServiceProductList( ) {
		return this.serviceProductList;
	}

}
