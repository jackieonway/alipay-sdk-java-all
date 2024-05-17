package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版状态变更
 *
 * @author auto create
 * @since 1.0, 2024-04-18 18:03:58
 */
public class AlipayCommerceMerchantcardTemplatestatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2617988761227931678L;

	/**
	 * 商品ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 操作类型，发布或下架
	 */
	@ApiField("operate_status")
	private String operateStatus;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getOperateStatus() {
		return this.operateStatus;
	}
	public void setOperateStatus(String operateStatus) {
		this.operateStatus = operateStatus;
	}

}
