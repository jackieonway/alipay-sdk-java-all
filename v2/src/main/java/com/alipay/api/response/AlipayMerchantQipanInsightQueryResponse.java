package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PortraitDataVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.qipan.insight.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-13 22:23:33
 */
public class AlipayMerchantQipanInsightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5284912894993244588L;

	/** 
	 * 人群洞察分析数据
	 */
	@ApiListField("portrait_data_list")
	@ApiField("portrait_data_v_o")
	private List<PortraitDataVO> portraitDataList;

	public void setPortraitDataList(List<PortraitDataVO> portraitDataList) {
		this.portraitDataList = portraitDataList;
	}
	public List<PortraitDataVO> getPortraitDataList( ) {
		return this.portraitDataList;
	}

}
