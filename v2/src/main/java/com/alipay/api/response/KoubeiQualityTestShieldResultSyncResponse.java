package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.shield.result.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:35:22
 */
public class KoubeiQualityTestShieldResultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8728775938256999419L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

}
