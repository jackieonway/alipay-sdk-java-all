package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆更新数据对象，主要更新 status 和 price 字段
 *
 * @author auto create
 * @since 1.0, 2024-08-19 14:21:52
 */
public class TransferCarUpdateData extends AlipayObject {

	private static final long serialVersionUID = 7235136347576194778L;

	/**
	 * 商户数据修改的时间，商户数据发生变化，该值必须更新，单位时间戳
	 */
	@ApiField("isv_update_date")
	private Date isvUpdateDate;

	/**
	 * 车源 id值，第三方车源 id 数据，第三方商户传递的 id 值
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 车价格；单位分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 状态，1 上架， 2 下架
	 */
	@ApiField("status")
	private Long status;

	public Date getIsvUpdateDate() {
		return this.isvUpdateDate;
	}
	public void setIsvUpdateDate(Date isvUpdateDate) {
		this.isvUpdateDate = isvUpdateDate;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
