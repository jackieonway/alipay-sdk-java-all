package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsultChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.order.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-22 14:32:03
 */
public class AlipayCommerceAcommunicationCreditphoneOrderPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2358495765898217682L;

	/** 
	 * 渠道列表
	 */
	@ApiListField("channel_list")
	@ApiField("consult_channel_response")
	private List<ConsultChannelResponse> channelList;

	/** 
	 * 咨询是否通过
	 */
	@ApiField("pass")
	private Boolean pass;

	public void setChannelList(List<ConsultChannelResponse> channelList) {
		this.channelList = channelList;
	}
	public List<ConsultChannelResponse> getChannelList( ) {
		return this.channelList;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

}
