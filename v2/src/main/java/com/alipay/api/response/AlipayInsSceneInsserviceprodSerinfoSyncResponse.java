package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:32:54
 */
public class AlipayInsSceneInsserviceprodSerinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8586418135449865797L;

	/** 
	 * 支付宝的单据编号
(就是请求中的ser_biz_no原封不动返回)
	 */
	@ApiField("ser_biz_no")
	private String serBizNo;

	public void setSerBizNo(String serBizNo) {
		this.serBizNo = serBizNo;
	}
	public String getSerBizNo( ) {
		return this.serBizNo;
	}

}
