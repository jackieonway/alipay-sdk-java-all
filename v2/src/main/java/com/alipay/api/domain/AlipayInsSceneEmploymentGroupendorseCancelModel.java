package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灵活用工团单批减单创建
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:36:04
 */
public class AlipayInsSceneEmploymentGroupendorseCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1896324888763843162L;

	/**
	 * 批改类型
	 */
	@ApiField("endorse_order_type")
	private String endorseOrderType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 渠道
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 批减子单列表
	 */
	@ApiListField("policy_list")
	@ApiField("string")
	private List<String> policyList;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 主单号
	 */
	@ApiField("summary_order_no")
	private String summaryOrderNo;

	public String getEndorseOrderType() {
		return this.endorseOrderType;
	}
	public void setEndorseOrderType(String endorseOrderType) {
		this.endorseOrderType = endorseOrderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public List<String> getPolicyList() {
		return this.policyList;
	}
	public void setPolicyList(List<String> policyList) {
		this.policyList = policyList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSummaryOrderNo() {
		return this.summaryOrderNo;
	}
	public void setSummaryOrderNo(String summaryOrderNo) {
		this.summaryOrderNo = summaryOrderNo;
	}

}
