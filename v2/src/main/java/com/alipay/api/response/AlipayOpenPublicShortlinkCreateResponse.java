package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:11:17
 */
public class AlipayOpenPublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7133745245538554427L;

	/** 
	 * 生成的带参推广短链接
	 */
	@ApiField("shortlink")
	private String shortlink;

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	public String getShortlink( ) {
		return this.shortlink;
	}

}
