package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.logo.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 08:21:03
 */
public class ZhimaMerchantLogoImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7373426572394982477L;

	/** 
	 * 上传图片后生成的图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

}
