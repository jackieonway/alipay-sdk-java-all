package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.facedb.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 01:56:04
 */
public class AlipayOpenIotmbsFacedbDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8512496389371416163L;

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
