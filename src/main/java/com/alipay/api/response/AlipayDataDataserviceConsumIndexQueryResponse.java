package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndexDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.consum.index.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:14:54
 */
public class AlipayDataDataserviceConsumIndexQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4894595688695542718L;

	/** 
	 * 指数结果详情
	 */
	@ApiListField("index_detail")
	@ApiField("index_detail")
	private List<IndexDetail> indexDetail;

	public void setIndexDetail(List<IndexDetail> indexDetail) {
		this.indexDetail = indexDetail;
	}
	public List<IndexDetail> getIndexDetail( ) {
		return this.indexDetail;
	}

}
