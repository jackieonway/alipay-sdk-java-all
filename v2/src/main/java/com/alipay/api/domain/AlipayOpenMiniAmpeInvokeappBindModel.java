package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 绑定调用应用
 *
 * @author auto create
 * @since 1.0, 2024-04-03 11:58:09
 */
public class AlipayOpenMiniAmpeInvokeappBindModel extends AlipayObject {

	private static final long serialVersionUID = 3418882236295218756L;

	/**
	 * 产品ID列表
	 */
	@ApiListField("product_id_list")
	@ApiField("number")
	private List<Long> productIdList;

	/**
	 * 场景码，申请后平台分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<Long> getProductIdList() {
		return this.productIdList;
	}
	public void setProductIdList(List<Long> productIdList) {
		this.productIdList = productIdList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
