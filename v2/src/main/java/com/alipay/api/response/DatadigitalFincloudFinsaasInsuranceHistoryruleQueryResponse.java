package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HistoryRuleVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.historyrule.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:51:42
 */
public class DatadigitalFincloudFinsaasInsuranceHistoryruleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6183592127293487863L;

	/** 
	 * 历史规则列表
	 */
	@ApiListField("history_rule_items")
	@ApiField("history_rule_v_o")
	private List<HistoryRuleVO> historyRuleItems;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setHistoryRuleItems(List<HistoryRuleVO> historyRuleItems) {
		this.historyRuleItems = historyRuleItems;
	}
	public List<HistoryRuleVO> getHistoryRuleItems( ) {
		return this.historyRuleItems;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
