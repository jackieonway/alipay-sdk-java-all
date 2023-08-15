package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.pobo.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-29 16:27:04
 */
public class AlipayOverseasOpenPoboNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5685664612551515711L;

	/** 
	 * 结果返回
	 */
	@ApiField("result")
	private TuitionISVResult result;

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

}
