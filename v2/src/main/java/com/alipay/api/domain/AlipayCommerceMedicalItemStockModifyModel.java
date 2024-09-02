package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改商品库存
 *
 * @author auto create
 * @since 1.0, 2024-08-29 14:18:05
 */
public class AlipayCommerceMedicalItemStockModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3754992442764617677L;

	/**
	 * 商品库存
	 */
	@ApiListField("skus_data")
	@ApiField("sku_stock_detail")
	private List<SkuStockDetail> skusData;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<SkuStockDetail> getSkusData() {
		return this.skusData;
	}
	public void setSkusData(List<SkuStockDetail> skusData) {
		this.skusData = skusData;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
