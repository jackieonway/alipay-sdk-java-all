package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TestCaseDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.shield.testcase.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:19:53
 */
public class KoubeiQualityTestShieldTestcaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1459895985232978544L;

	/** 
	 * 测试用例列表
	 */
	@ApiListField("case_list")
	@ApiField("test_case_domain")
	private List<TestCaseDomain> caseList;

	/** 
	 * 拓展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	public void setCaseList(List<TestCaseDomain> caseList) {
		this.caseList = caseList;
	}
	public List<TestCaseDomain> getCaseList( ) {
		return this.caseList;
	}

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

}
