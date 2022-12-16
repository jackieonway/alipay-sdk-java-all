package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.item.recommend.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:07:46
 */
public class AlipayOpenDataItemRecommendBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6213828152288329696L;

	/** 
	 * 推荐结果
	 */
	@ApiListField("result_obj")
	@ApiField("rec_result_info")
	private List<RecResultInfo> resultObj;

	public void setResultObj(List<RecResultInfo> resultObj) {
		this.resultObj = resultObj;
	}
	public List<RecResultInfo> getResultObj( ) {
		return this.resultObj;
	}

}
