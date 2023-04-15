package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityCopyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.activity.copy response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-06 19:17:06
 */
public class AntMerchantExpandIndirectActivityCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535922946468634318L;

	/** 
	 * 活动权益复制结果
	 */
	@ApiListField("copy_result")
	@ApiField("activity_copy_result")
	private List<ActivityCopyResult> copyResult;

	public void setCopyResult(List<ActivityCopyResult> copyResult) {
		this.copyResult = copyResult;
	}
	public List<ActivityCopyResult> getCopyResult( ) {
		return this.copyResult;
	}

}
