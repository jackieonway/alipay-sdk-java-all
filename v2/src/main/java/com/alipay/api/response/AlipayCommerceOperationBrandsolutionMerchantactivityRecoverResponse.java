package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnrolledMerchantResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.brandsolution.merchantactivity.recover response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:40:54
 */
public class AlipayCommerceOperationBrandsolutionMerchantactivityRecoverResponse extends AlipayResponse {

	private static final long serialVersionUID = 8363421733893253443L;

	/** 
	 * 批量修改结果
	 */
	@ApiListField("data")
	@ApiField("enrolled_merchant_result")
	private List<EnrolledMerchantResult> data;

	public void setData(List<EnrolledMerchantResult> data) {
		this.data = data;
	}
	public List<EnrolledMerchantResult> getData( ) {
		return this.data;
	}

}
