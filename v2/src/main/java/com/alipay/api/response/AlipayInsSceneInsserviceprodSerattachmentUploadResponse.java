package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serattachment.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:33:03
 */
public class AlipayInsSceneInsserviceprodSerattachmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3749821254192212912L;

	/** 
	 * 附件编号(业务主键)
	 */
	@ApiField("attachment_no")
	private String attachmentNo;

	public void setAttachmentNo(String attachmentNo) {
		this.attachmentNo = attachmentNo;
	}
	public String getAttachmentNo( ) {
		return this.attachmentNo;
	}

}
