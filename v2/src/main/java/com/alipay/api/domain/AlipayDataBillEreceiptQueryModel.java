package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询电子回单状态
 *
 * @author auto create
 * @since 1.0, 2023-02-20 13:32:17
 */
public class AlipayDataBillEreceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5259227746715528428L;

	/**
	 * 根据申请id查询状态。通过 <a href="https://opendocs.alipay.com/apis/api_15/alipay.data.bill.ereceipt.apply">alipay.data.bill.ereceipt.apply(申请电子回单(incubating))</a> 接口同步响应获取。
	 */
	@ApiField("file_id")
	private String fileId;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
