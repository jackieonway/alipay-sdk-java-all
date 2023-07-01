package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LocalCategoryAndParentVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.localitem.allcategory.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-28 21:15:52
 */
public class AlipayOpenAppLocalitemAllcategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5757763692983118733L;

	/** 
	 * 类目信息
	 */
	@ApiListField("cats")
	@ApiField("local_category_and_parent_v_o")
	private List<LocalCategoryAndParentVO> cats;

	public void setCats(List<LocalCategoryAndParentVO> cats) {
		this.cats = cats;
	}
	public List<LocalCategoryAndParentVO> getCats( ) {
		return this.cats;
	}

}
