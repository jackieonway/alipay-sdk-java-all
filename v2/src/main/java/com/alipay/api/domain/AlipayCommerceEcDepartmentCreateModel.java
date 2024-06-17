package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业部门创建
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:37:51
 */
public class AlipayCommerceEcDepartmentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7539155174835463428L;

	/**
	 * 部门编码
	 */
	@ApiField("department_code")
	private String departmentCode;

	/**
	 * 部门名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 上级部门id
	 */
	@ApiField("parent_department_id")
	private String parentDepartmentId;

	public String getDepartmentCode() {
		return this.departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getParentDepartmentId() {
		return this.parentDepartmentId;
	}
	public void setParentDepartmentId(String parentDepartmentId) {
		this.parentDepartmentId = parentDepartmentId;
	}

}
