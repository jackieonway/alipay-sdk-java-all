package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.text.voice.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 05:33:40
 */
public class AlipayEcoTextVoiceTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8868774247414541752L;

	/** 
	 * 阿里云语音编号
	 */
	@ApiField("call_id")
	private String callId;

	/** 
	 * 调用结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 调用结果描述
	 */
	@ApiField("message")
	private String message;

	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCallId( ) {
		return this.callId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
