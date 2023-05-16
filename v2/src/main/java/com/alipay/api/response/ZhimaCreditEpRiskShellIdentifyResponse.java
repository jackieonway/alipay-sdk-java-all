package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShellCompanyFeatureDetail;
import com.alipay.api.domain.ShellCompanyGsChangeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.risk.shell.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 22:56:35
 */
public class ZhimaCreditEpRiskShellIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5116652438529154595L;

	/** 
	 * 空壳企业特征集合
	 */
	@ApiListField("shell_company_features")
	@ApiField("shell_company_feature_detail")
	private List<ShellCompanyFeatureDetail> shellCompanyFeatures;

	/** 
	 * 空壳企业 工商变更 集合
	 */
	@ApiListField("shell_company_gs_changes")
	@ApiField("shell_company_gs_change_detail")
	private List<ShellCompanyGsChangeDetail> shellCompanyGsChanges;

	public void setShellCompanyFeatures(List<ShellCompanyFeatureDetail> shellCompanyFeatures) {
		this.shellCompanyFeatures = shellCompanyFeatures;
	}
	public List<ShellCompanyFeatureDetail> getShellCompanyFeatures( ) {
		return this.shellCompanyFeatures;
	}

	public void setShellCompanyGsChanges(List<ShellCompanyGsChangeDetail> shellCompanyGsChanges) {
		this.shellCompanyGsChanges = shellCompanyGsChanges;
	}
	public List<ShellCompanyGsChangeDetail> getShellCompanyGsChanges( ) {
		return this.shellCompanyGsChanges;
	}

}
