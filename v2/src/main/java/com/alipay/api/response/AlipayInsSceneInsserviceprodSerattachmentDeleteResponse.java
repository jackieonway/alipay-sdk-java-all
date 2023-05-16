package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serattachment.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:44:57
 */
public class AlipayInsSceneInsserviceprodSerattachmentDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2415461589881947466L;

	/** 
	 * 文件编号
(原封不动地把请求中的附件编号返回给你)
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
