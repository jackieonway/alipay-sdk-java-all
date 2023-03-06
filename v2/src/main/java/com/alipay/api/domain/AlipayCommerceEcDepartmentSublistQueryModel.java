package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询子部门id列表
 *
 * @author auto create
 * @since 1.0, 2023-01-10 14:17:30
 */
public class AlipayCommerceEcDepartmentSublistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4694782518796151422L;

	/**
	 * 部门id，特殊值 -1 表示查询根部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
