package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SchoolCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.schoolcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-12 14:22:51
 */
public class AlipayCommerceEducateCampusSchoolcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4589141244883321947L;

	/** 
	 * 用户校园卡信息
	 */
	@ApiListField("school_card_list")
	@ApiField("school_card")
	private List<SchoolCard> schoolCardList;

	public void setSchoolCardList(List<SchoolCard> schoolCardList) {
		this.schoolCardList = schoolCardList;
	}
	public List<SchoolCard> getSchoolCardList( ) {
		return this.schoolCardList;
	}

}
