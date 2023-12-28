package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多轮问答信息
 *
 * @author auto create
 * @since 1.0, 2023-12-21 15:43:36
 */
public class DstDetail extends AlipayObject {

	private static final long serialVersionUID = 8194442188988369766L;

	/**
	 * 多轮答案内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 意图信息
	 */
	@ApiField("intent")
	private String intent;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getIntent() {
		return this.intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}

}
