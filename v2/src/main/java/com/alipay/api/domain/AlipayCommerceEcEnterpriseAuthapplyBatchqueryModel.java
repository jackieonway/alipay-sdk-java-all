package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询企业认证记录
 *
 * @author auto create
 * @since 1.0, 2023-08-11 11:19:00
 */
public class AlipayCommerceEcEnterpriseAuthapplyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7595418877191389593L;

	/**
	 * 企业认证申请记录ID
	 */
	@ApiField("auth_apply_id")
	private String authApplyId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getAuthApplyId() {
		return this.authApplyId;
	}
	public void setAuthApplyId(String authApplyId) {
		this.authApplyId = authApplyId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
