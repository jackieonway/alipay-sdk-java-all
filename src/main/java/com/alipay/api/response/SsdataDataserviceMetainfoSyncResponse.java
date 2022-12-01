package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.metainfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-31 13:50:44
 */
public class SsdataDataserviceMetainfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8795538498387815655L;

	/** 
	 * 是否同步成功
	 */
	@ApiField("is_sync_success")
	private Boolean isSyncSuccess;

	/** 
	 * 返回同步成功或者失败的信息
	 */
	@ApiField("sync_result")
	private String syncResult;

	public void setIsSyncSuccess(Boolean isSyncSuccess) {
		this.isSyncSuccess = isSyncSuccess;
	}
	public Boolean getIsSyncSuccess( ) {
		return this.isSyncSuccess;
	}

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}
	public String getSyncResult( ) {
		return this.syncResult;
	}

}
