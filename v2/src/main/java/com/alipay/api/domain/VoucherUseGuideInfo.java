package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销引导
 *
 * @author auto create
 * @since 1.0, 2023-10-26 20:36:05
 */
public class VoucherUseGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 7162285399921634211L;

	/**
	 * 小程序核销引导
	 */
	@ApiField("mini_app_use_guide_info")
	private VoucherMiniAppUseGuideInfo miniAppUseGuideInfo;

	/**
	 * 使用引导模式
	 */
	@ApiListField("use_guide_mode")
	@ApiField("string")
	private List<String> useGuideMode;

	public VoucherMiniAppUseGuideInfo getMiniAppUseGuideInfo() {
		return this.miniAppUseGuideInfo;
	}
	public void setMiniAppUseGuideInfo(VoucherMiniAppUseGuideInfo miniAppUseGuideInfo) {
		this.miniAppUseGuideInfo = miniAppUseGuideInfo;
	}

	public List<String> getUseGuideMode() {
		return this.useGuideMode;
	}
	public void setUseGuideMode(List<String> useGuideMode) {
		this.useGuideMode = useGuideMode;
	}

}
