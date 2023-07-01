package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiSkillGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.groupquerybygroupid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:56:54
 */
public class AlipayIserviceIsresourceGroupquerybygroupidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7668882777536616496L;

	/** 
	 * 技能组信息
	 */
	@ApiField("biz_data")
	private OpenApiSkillGroupInfo bizData;

	public void setBizData(OpenApiSkillGroupInfo bizData) {
		this.bizData = bizData;
	}
	public OpenApiSkillGroupInfo getBizData( ) {
		return this.bizData;
	}

}
