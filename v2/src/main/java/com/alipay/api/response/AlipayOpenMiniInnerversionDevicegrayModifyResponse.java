package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.devicegray.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 21:36:39
 */
public class AlipayOpenMiniInnerversionDevicegrayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8144429653814523142L;

	/** 
	 * 灰度code
	 */
	@ApiField("gray_code")
	private String grayCode;

	public void setGrayCode(String grayCode) {
		this.grayCode = grayCode;
	}
	public String getGrayCode( ) {
		return this.grayCode;
	}

}
