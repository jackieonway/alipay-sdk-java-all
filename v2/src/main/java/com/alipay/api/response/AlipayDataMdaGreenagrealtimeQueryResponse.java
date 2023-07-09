package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.greenagrealtime.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:46:54
 */
public class AlipayDataMdaGreenagrealtimeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4351931958519873927L;

	/** 
	 * 今日完成公益任务人数
	 */
	@ApiField("completed")
	private Long completed;

	/** 
	 * 今日公益林参与人数
	 */
	@ApiField("dau")
	private Long dau;

	public void setCompleted(Long completed) {
		this.completed = completed;
	}
	public Long getCompleted( ) {
		return this.completed;
	}

	public void setDau(Long dau) {
		this.dau = dau;
	}
	public Long getDau( ) {
		return this.dau;
	}

}
