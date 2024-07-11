package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.material.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-25 19:41:40
 */
public class AlipayDataDataserviceAdMaterialUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3689329267264371941L;

	/** 
	 * 广告投放平台生成的物料实例ID
	 */
	@ApiField("material_instance_id")
	private Long materialInstanceId;

	public void setMaterialInstanceId(Long materialInstanceId) {
		this.materialInstanceId = materialInstanceId;
	}
	public Long getMaterialInstanceId( ) {
		return this.materialInstanceId;
	}

}
