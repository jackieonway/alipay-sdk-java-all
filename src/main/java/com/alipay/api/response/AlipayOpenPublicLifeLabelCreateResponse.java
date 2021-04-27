package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-11 21:00:18
 */
public class AlipayOpenPublicLifeLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8739477314872362896L;

	/** 
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}
	public String getLabelId( ) {
		return this.labelId;
	}

}
