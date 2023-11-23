package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模版创建
 *
 * @author auto create
 * @since 1.0, 2023-11-21 09:49:51
 */
public class AlipayCommerceCardTemplateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2388681764537166212L;

	/**
	 * 卡模版信息
	 */
	@ApiField("card_template_info")
	private CardTemplateInfo cardTemplateInfo;

	public CardTemplateInfo getCardTemplateInfo() {
		return this.cardTemplateInfo;
	}
	public void setCardTemplateInfo(CardTemplateInfo cardTemplateInfo) {
		this.cardTemplateInfo = cardTemplateInfo;
	}

}
