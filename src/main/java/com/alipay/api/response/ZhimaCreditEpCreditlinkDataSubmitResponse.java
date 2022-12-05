package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlink.data.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-24 15:21:42
 */
public class ZhimaCreditEpCreditlinkDataSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 8728712168323154235L;

	/** 
	 * 征信数据提交结果。结构视data_type的不同而定
	 */
	@ApiField("result_content")
	private String resultContent;

	public void setResultContent(String resultContent) {
		this.resultContent = resultContent;
	}
	public String getResultContent( ) {
		return this.resultContent;
	}

}
