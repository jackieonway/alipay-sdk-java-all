package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.brand.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenMiniMiniappBrandUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5415939383931228646L;

	/** 
	 * 图片上传成功后的图片存储键(可用于填写调用alipay.open.mini.miniapp.brand.submit时需要的图片类型的字段)
	 */
	@ApiField("file_key")
	private String fileKey;

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	public String getFileKey( ) {
		return this.fileKey;
	}

}
