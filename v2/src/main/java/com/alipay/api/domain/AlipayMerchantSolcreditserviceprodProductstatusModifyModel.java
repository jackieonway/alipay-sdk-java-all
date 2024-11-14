package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品上下架
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:10:44
 */
public class AlipayMerchantSolcreditserviceprodProductstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5721267512293144943L;

	/**
	 * 系统生成的商品编号
	 */
	@ApiField("product_no")
	private String productNo;

	/**
	 * 上架: PRODUCT_UP;下架: PRODUCT_DOWN
	 */
	@ApiField("product_status")
	private String productStatus;

	public String getProductNo() {
		return this.productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getProductStatus() {
		return this.productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}
