package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.page.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 07:41:56
 */
public class KoubeiShopMallPageModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2776298434768427893L;

	/** 
	 * 工单id（用以查询创建，修改操作的审核状态）
	 */
	@ApiField("order_flow_id")
	private String orderFlowId;

	public void setOrderFlowId(String orderFlowId) {
		this.orderFlowId = orderFlowId;
	}
	public String getOrderFlowId( ) {
		return this.orderFlowId;
	}

}
