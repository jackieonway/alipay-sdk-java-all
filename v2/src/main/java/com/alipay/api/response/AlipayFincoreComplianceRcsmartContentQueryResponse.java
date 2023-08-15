package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContentRiskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcsmart.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:02:04
 */
public class AlipayFincoreComplianceRcsmartContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4899435922145488878L;

	/** 
	 * 服务执行结果数据：
风险结果信息,当接口调用返回result_code为"SUCCESS"时，返回具体的执行结果对象。如果data为null，则标识任务未执行完毕，可稍后再尝试查询结果。建议通过监听alipay.fincore.compliance.rcsmart.content.notify收到消息后尝试查询结果。
	 */
	@ApiField("data")
	private ContentRiskResult data;

	public void setData(ContentRiskResult data) {
		this.data = data;
	}
	public ContentRiskResult getData( ) {
		return this.data;
	}

}
