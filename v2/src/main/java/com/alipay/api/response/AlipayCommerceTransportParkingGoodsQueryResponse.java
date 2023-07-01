package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ParkingGoodsDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.goods.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:54:16
 */
public class AlipayCommerceTransportParkingGoodsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3444134374267239765L;

	/** 
	 * 商品列表
	 */
	@ApiField("parking_goods_detail")
	private ParkingGoodsDetail parkingGoodsDetail;

	public void setParkingGoodsDetail(ParkingGoodsDetail parkingGoodsDetail) {
		this.parkingGoodsDetail = parkingGoodsDetail;
	}
	public ParkingGoodsDetail getParkingGoodsDetail( ) {
		return this.parkingGoodsDetail;
	}

}
