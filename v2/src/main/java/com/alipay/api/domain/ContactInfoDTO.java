package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2023-05-10 22:27:33
 */
public class ContactInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4461688749188953627L;

	/**
	 * 联系人姓名
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
