package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-14 16:01:50
 */
public class AlipayCommerceEcEmployeeInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1396243548638229757L;

	/** 
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeId( ) {
		return this.employeeId;
	}

}
