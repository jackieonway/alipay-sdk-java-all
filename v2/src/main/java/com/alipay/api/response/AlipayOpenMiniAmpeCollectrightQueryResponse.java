package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.collectright.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 21:21:10
 */
public class AlipayOpenMiniAmpeCollectrightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4673541391267356418L;

	/** 
	 * true为有上报权限
	 */
	@ApiField("can_collect")
	private Boolean canCollect;

	public void setCanCollect(Boolean canCollect) {
		this.canCollect = canCollect;
	}
	public Boolean getCanCollect( ) {
		return this.canCollect;
	}

}
