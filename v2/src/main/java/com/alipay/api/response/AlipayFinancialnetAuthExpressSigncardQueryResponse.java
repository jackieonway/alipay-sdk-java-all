package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.express.signcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:03
 */
public class AlipayFinancialnetAuthExpressSigncardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2674628388912327193L;

	/** 
	 * 服务成功时，且用户有相应的卡，该字段（列表类型）存在
	 */
	@ApiListField("sign_card_infos")
	@ApiField("sign_card_info")
	private List<SignCardInfo> signCardInfos;

	public void setSignCardInfos(List<SignCardInfo> signCardInfos) {
		this.signCardInfos = signCardInfos;
	}
	public List<SignCardInfo> getSignCardInfos( ) {
		return this.signCardInfos;
	}

}
