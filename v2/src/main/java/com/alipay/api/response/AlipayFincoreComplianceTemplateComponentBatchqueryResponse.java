package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateComponentListResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.component.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-13 15:02:37
 */
public class AlipayFincoreComplianceTemplateComponentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5811677328137596157L;

	/** 
	 * 模板组件列表
	 */
	@ApiListField("template_component_list_response_list")
	@ApiField("template_component_list_response")
	private List<TemplateComponentListResponse> templateComponentListResponseList;

	public void setTemplateComponentListResponseList(List<TemplateComponentListResponse> templateComponentListResponseList) {
		this.templateComponentListResponseList = templateComponentListResponseList;
	}
	public List<TemplateComponentListResponse> getTemplateComponentListResponseList( ) {
		return this.templateComponentListResponseList;
	}

}
