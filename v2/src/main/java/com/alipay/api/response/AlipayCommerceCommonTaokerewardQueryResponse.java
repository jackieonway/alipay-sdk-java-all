package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaoKeRewardRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.taokereward.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-09 10:21:55
 */
public class AlipayCommerceCommonTaokerewardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4295769369844677876L;

	/** 
	 * 激励记录信息
	 */
	@ApiListField("reward_record_list")
	@ApiField("tao_ke_reward_record_d_t_o")
	private List<TaoKeRewardRecordDTO> rewardRecordList;

	public void setRewardRecordList(List<TaoKeRewardRecordDTO> rewardRecordList) {
		this.rewardRecordList = rewardRecordList;
	}
	public List<TaoKeRewardRecordDTO> getRewardRecordList( ) {
		return this.rewardRecordList;
	}

}
