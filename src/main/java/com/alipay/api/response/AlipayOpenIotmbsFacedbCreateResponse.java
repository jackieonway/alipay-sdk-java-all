package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facedb.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-11 17:01:01
 */
public class AlipayOpenIotmbsFacedbCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4181487421785896515L;

	/** 
	 * 成功true失败false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
