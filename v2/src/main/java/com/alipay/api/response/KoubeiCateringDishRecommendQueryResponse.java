package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DishRecommend;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:37:22
 */
public class KoubeiCateringDishRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8435688636128375132L;

	/** 
	 * 推荐菜品列表
	 */
	@ApiListField("dish_list")
	@ApiField("dish_recommend")
	private List<DishRecommend> dishList;

	public void setDishList(List<DishRecommend> dishList) {
		this.dishList = dishList;
	}
	public List<DishRecommend> getDishList( ) {
		return this.dishList;
	}

}
