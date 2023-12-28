package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpcpormoDataCheckInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 19:56:50
 */
public class TechriskInnovateMpcpromoDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1464341295861752159L;

	/** 
	 * 校验信息列表
	 */
	@ApiListField("check_info_list")
	@ApiField("mpcpormo_data_check_info")
	private List<MpcpormoDataCheckInfo> checkInfoList;

	public void setCheckInfoList(List<MpcpormoDataCheckInfo> checkInfoList) {
		this.checkInfoList = checkInfoList;
	}
	public List<MpcpormoDataCheckInfo> getCheckInfoList( ) {
		return this.checkInfoList;
	}

}
