package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.test.gray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:51:44
 */
public class AlipayOpenAppTestGrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2369281921386575438L;

	/** 
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * zone
	 */
	@ApiField("zone_name")
	private String zoneName;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZoneName( ) {
		return this.zoneName;
	}

}
