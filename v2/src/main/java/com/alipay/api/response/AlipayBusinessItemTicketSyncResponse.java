package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.item.ticket.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:24:57
 */
public class AlipayBusinessItemTicketSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5825355123433384124L;

	/** 
	 * 支付宝门票商品id
	 */
	@ApiField("object_id")
	private String objectId;

	/** 
	 * 支付宝门票商品状态
	 */
	@ApiField("status")
	private String status;

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectId( ) {
		return this.objectId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
