package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoanApplyBudgetVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.loan.unclear.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:31:24
 */
public class AlipayPcreditLoanLoanUnclearQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3567494149373899835L;

	/** 
	 * 贷款申请预算信息列表
	 */
	@ApiListField("loan_apply_budget_list")
	@ApiField("loan_apply_budget_v_o")
	private List<LoanApplyBudgetVO> loanApplyBudgetList;

	/** 
	 * 结果总数
	 */
	@ApiField("total")
	private Long total;

	public void setLoanApplyBudgetList(List<LoanApplyBudgetVO> loanApplyBudgetList) {
		this.loanApplyBudgetList = loanApplyBudgetList;
	}
	public List<LoanApplyBudgetVO> getLoanApplyBudgetList( ) {
		return this.loanApplyBudgetList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
