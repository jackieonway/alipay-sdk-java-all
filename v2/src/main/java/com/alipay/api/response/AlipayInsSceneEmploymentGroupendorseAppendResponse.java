package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.groupendorse.append response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-25 16:36:22
 */
public class AlipayInsSceneEmploymentGroupendorseAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8685572945714431322L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 主批单号
	 */
	@ApiField("summary_endorse_order_no")
	private String summaryEndorseOrderNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setSummaryEndorseOrderNo(String summaryEndorseOrderNo) {
		this.summaryEndorseOrderNo = summaryEndorseOrderNo;
	}
	public String getSummaryEndorseOrderNo( ) {
		return this.summaryEndorseOrderNo;
	}

}
