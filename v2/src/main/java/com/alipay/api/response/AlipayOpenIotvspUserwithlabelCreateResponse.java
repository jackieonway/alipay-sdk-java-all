package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userwithlabel.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-08 15:43:19
 */
public class AlipayOpenIotvspUserwithlabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7436291588597367797L;

	/** 
	 * 操作流水号，ISV需要记录，后续调用组件等操作需要用到
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
