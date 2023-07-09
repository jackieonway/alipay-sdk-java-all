package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.inst.auth.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:10:00
 */
public class MybankCreditSceneprodInstAuthConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6349852216464572734L;

	/** 
	 * 是否准入
	 */
	@ApiField("auth")
	private String auth;

	/** 
	 * 咨询内容返回的结果
	 */
	@ApiField("consult_result")
	private String consultResult;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getAuth( ) {
		return this.auth;
	}

	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}
	public String getConsultResult( ) {
		return this.consultResult;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
