package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VehicleInfoDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.vehicle.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 10:02:25
 */
public class AlipayEcoMycarVehicleInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3775552837359244325L;

	/** 
	 * 车辆信息列表
	 */
	@ApiListField("vehicle_list")
	@ApiField("vehicle_info_dto")
	private List<VehicleInfoDto> vehicleList;

	public void setVehicleList(List<VehicleInfoDto> vehicleList) {
		this.vehicleList = vehicleList;
	}
	public List<VehicleInfoDto> getVehicleList( ) {
		return this.vehicleList;
	}

}
