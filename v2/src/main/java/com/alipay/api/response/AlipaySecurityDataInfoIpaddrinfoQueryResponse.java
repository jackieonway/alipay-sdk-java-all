package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IpAddrLbsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.info.ipaddrinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 05:55:00
 */
public class AlipaySecurityDataInfoIpaddrinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4525793268446675183L;

	/** 
	 * ip_addr_lbs_info:IP地址归属地对象。其中province为IP地址归属地的省，city为IP地址归属地的城市
	 */
	@ApiField("ip_addr_lbs_info")
	private IpAddrLbsInfo ipAddrLbsInfo;

	public void setIpAddrLbsInfo(IpAddrLbsInfo ipAddrLbsInfo) {
		this.ipAddrLbsInfo = ipAddrLbsInfo;
	}
	public IpAddrLbsInfo getIpAddrLbsInfo( ) {
		return this.ipAddrLbsInfo;
	}

}
