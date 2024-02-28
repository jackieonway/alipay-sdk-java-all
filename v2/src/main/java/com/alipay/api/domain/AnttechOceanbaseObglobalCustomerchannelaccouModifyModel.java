package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新客户关联渠道账号接口
 *
 * @author auto create
 * @since 1.0, 2023-10-19 09:21:49
 */
public class AnttechOceanbaseObglobalCustomerchannelaccouModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1833812768399337999L;

	/**
	 * 更新客户关联渠道账号请求体
	 */
	@ApiField("update_customer_channel_account_request")
	private UpdateCustomerChannelAccountRequest updateCustomerChannelAccountRequest;

	public UpdateCustomerChannelAccountRequest getUpdateCustomerChannelAccountRequest() {
		return this.updateCustomerChannelAccountRequest;
	}
	public void setUpdateCustomerChannelAccountRequest(UpdateCustomerChannelAccountRequest updateCustomerChannelAccountRequest) {
		this.updateCustomerChannelAccountRequest = updateCustomerChannelAccountRequest;
	}

}
