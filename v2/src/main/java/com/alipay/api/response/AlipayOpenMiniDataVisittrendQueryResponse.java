package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppVisitTrendDataResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.data.visittrend.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:21:45
 */
public class AlipayOpenMiniDataVisittrendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3264964228799374571L;

	/** 
	 * 小程序实时访问趋势结果
	 */
	@ApiListField("app_visit_trend_data_list_response")
	@ApiField("app_visit_trend_data_response")
	private List<AppVisitTrendDataResponse> appVisitTrendDataListResponse;

	public void setAppVisitTrendDataListResponse(List<AppVisitTrendDataResponse> appVisitTrendDataListResponse) {
		this.appVisitTrendDataListResponse = appVisitTrendDataListResponse;
	}
	public List<AppVisitTrendDataResponse> getAppVisitTrendDataListResponse( ) {
		return this.appVisitTrendDataListResponse;
	}

}
