package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询员工可用抬头信息
 *
 * @author auto create
 * @since 1.0, 2023-08-25 09:51:25
 */
public class AlipayCommerceEcEmployeeTitleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5124976188497926214L;

	/**
	 * 员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 抬头标识
	 */
	@ApiField("title_tag")
	private String titleTag;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getTitleTag() {
		return this.titleTag;
	}
	public void setTitleTag(String titleTag) {
		this.titleTag = titleTag;
	}

}
