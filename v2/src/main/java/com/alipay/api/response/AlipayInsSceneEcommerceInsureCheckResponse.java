package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsureAdmitDetailResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.insure.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:38:30
 */
public class AlipayInsSceneEcommerceInsureCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 7426572164854357941L;

	/** 
	 * 准入结果列表
	 */
	@ApiListField("admit_result")
	@ApiField("insure_admit_detail_result_d_t_o")
	private List<InsureAdmitDetailResultDTO> admitResult;

	public void setAdmitResult(List<InsureAdmitDetailResultDTO> admitResult) {
		this.admitResult = admitResult;
	}
	public List<InsureAdmitDetailResultDTO> getAdmitResult( ) {
		return this.admitResult;
	}

}
