package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员工所属部门信息
 *
 * @author auto create
 * @since 1.0, 2023-10-17 15:50:39
 */
public class EmployeeDepartmentDTO extends AlipayObject {

	private static final long serialVersionUID = 8329789798134482232L;

	/**
	 * 部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 部门名称
	 */
	@ApiField("department_name")
	private String departmentName;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
