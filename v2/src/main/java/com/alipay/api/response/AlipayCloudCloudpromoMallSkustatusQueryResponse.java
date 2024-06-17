package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SkuSaleInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.skustatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 11:47:04
 */
public class AlipayCloudCloudpromoMallSkustatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8736636336641935265L;

	/** 
	 * sku售卖信息
	 */
	@ApiListField("sku_sale_infos")
	@ApiField("sku_sale_info_v_o")
	private List<SkuSaleInfoVO> skuSaleInfos;

	public void setSkuSaleInfos(List<SkuSaleInfoVO> skuSaleInfos) {
		this.skuSaleInfos = skuSaleInfos;
	}
	public List<SkuSaleInfoVO> getSkuSaleInfos( ) {
		return this.skuSaleInfos;
	}

}
