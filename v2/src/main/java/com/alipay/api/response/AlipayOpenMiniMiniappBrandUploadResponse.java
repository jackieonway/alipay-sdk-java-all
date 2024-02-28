package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.brand.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-19 15:30:45
 */
public class AlipayOpenMiniMiniappBrandUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4172859772935978963L;

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
