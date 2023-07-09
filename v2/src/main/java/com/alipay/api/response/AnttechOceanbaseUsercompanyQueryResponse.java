package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserCompanyDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.usercompany.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-20 10:27:14
 */
public class AnttechOceanbaseUsercompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5426495958167617452L;

	/** 
	 * 用户所属企业列表
	 */
	@ApiListField("user_company_list")
	@ApiField("user_company_d_t_o")
	private List<UserCompanyDTO> userCompanyList;

	public void setUserCompanyList(List<UserCompanyDTO> userCompanyList) {
		this.userCompanyList = userCompanyList;
	}
	public List<UserCompanyDTO> getUserCompanyList( ) {
		return this.userCompanyList;
	}

}
