package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金绑卡进度查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-25 13:54:05
 */
public class AlipayCommerceFundBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1888677696752996669L;

	/**
	 * 绑卡流水号，此处需要绑卡接口指定的out_bind_no
	 */
	@ApiField("out_bind_no")
	private String outBindNo;

	public String getOutBindNo() {
		return this.outBindNo;
	}
	public void setOutBindNo(String outBindNo) {
		this.outBindNo = outBindNo;
	}

}
