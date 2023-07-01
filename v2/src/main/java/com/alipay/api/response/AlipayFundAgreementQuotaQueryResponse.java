package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuotaQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.agreement.quota.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:06:56
 */
public class AlipayFundAgreementQuotaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2214272377735394745L;

	/** 
	 * 单个协议的额度查询结果
	 */
	@ApiListField("quota_query_response_list")
	@ApiField("quota_query_response")
	private List<QuotaQueryResponse> quotaQueryResponseList;

	public void setQuotaQueryResponseList(List<QuotaQueryResponse> quotaQueryResponseList) {
		this.quotaQueryResponseList = quotaQueryResponseList;
	}
	public List<QuotaQueryResponse> getQuotaQueryResponseList( ) {
		return this.quotaQueryResponseList;
	}

}
