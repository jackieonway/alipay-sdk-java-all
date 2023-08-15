package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StaticDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.domain.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-03 16:11:59
 */
public class AlipayCloudCloudrunStaticsiteDomainBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1252355561691188338L;

	/** 
	 * 域名列表
	 */
	@ApiListField("domain_list")
	@ApiField("static_domain")
	private List<StaticDomain> domainList;

	/** 
	 * 分页游标
	 */
	@ApiField("next_token")
	private String nextToken;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setDomainList(List<StaticDomain> domainList) {
		this.domainList = domainList;
	}
	public List<StaticDomain> getDomainList( ) {
		return this.domainList;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public String getNextToken( ) {
		return this.nextToken;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

}
