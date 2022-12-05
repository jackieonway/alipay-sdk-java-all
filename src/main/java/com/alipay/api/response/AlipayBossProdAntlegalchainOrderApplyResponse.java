package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlegalchain.order.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-19 14:43:28
 */
public class AlipayBossProdAntlegalchainOrderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5311413528853624867L;

	/** 
	 * 法链业务ID,用于查询上链状态
	 */
	@ApiField("bas_data_id")
	private String basDataId;

	public void setBasDataId(String basDataId) {
		this.basDataId = basDataId;
	}
	public String getBasDataId( ) {
		return this.basDataId;
	}

}
