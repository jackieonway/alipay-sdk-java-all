package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.ka.baseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:05:01
 */
public class AlipayEcoRenthouseKaBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4496344337344564821L;

	/** 
	 * 返回kaCode唯一标识
	 */
	@ApiField("ka_code")
	private String kaCode;

	/** 
	 * ka名称
	 */
	@ApiField("ka_name")
	private String kaName;

	/** 
	 * 是否生效 1:生效 0:没有生效
	 */
	@ApiField("valid")
	private String valid;

	public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}
	public String getKaCode( ) {
		return this.kaCode;
	}

	public void setKaName(String kaName) {
		this.kaName = kaName;
	}
	public String getKaName( ) {
		return this.kaName;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getValid( ) {
		return this.valid;
	}

}
