package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiTicketOperateTraces;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.instance.operatetrace.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:58
 */
public class AlipayBossBaseInstanceOperatetraceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1798844914297317823L;

	/** 
	 * 操作记录
	 */
	@ApiField("operate_traces")
	private BPOpenApiTicketOperateTraces operateTraces;

	public void setOperateTraces(BPOpenApiTicketOperateTraces operateTraces) {
		this.operateTraces = operateTraces;
	}
	public BPOpenApiTicketOperateTraces getOperateTraces( ) {
		return this.operateTraces;
	}

}
