package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.docusignmulti.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 16:34:29
 */
public class AlipayBossProdAntlescenterDocusignmultiCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4195886772719566351L;

	/** 
	 * 签署任务流水号id，唯一流水id
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	public void setSignTaskId(String signTaskId) {
		this.signTaskId = signTaskId;
	}
	public String getSignTaskId( ) {
		return this.signTaskId;
	}

}
