package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询缴费绑定户号
 *
 * @author auto create
 * @since 1.0, 2024-05-27 14:42:41
 */
public class AlipayEbppJfexportBillkeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4166434915977521834L;

	/**
	 * 一级业务
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝量化机构的标识
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 来源渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 二级业务
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
