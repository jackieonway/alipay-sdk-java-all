package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取本地商品类目接口
 *
 * @author auto create
 * @since 1.0, 2024-07-02 11:59:16
 */
public class AlipayOpenAppLocalitemAllcategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4657923476432158955L;

	/**
	 * 返回筛选状态的类目
	 */
	@ApiField("cat_status")
	private String catStatus;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	public String getCatStatus() {
		return this.catStatus;
	}
	public void setCatStatus(String catStatus) {
		this.catStatus = catStatus;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
