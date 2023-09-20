package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展状态信息
 *
 * @author auto create
 * @since 1.0, 2023-09-14 11:44:41
 */
public class ResourceStatus extends AlipayObject {

	private static final long serialVersionUID = 5552591845635535243L;

	/**
	 * 资源实例ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 资源类型
	 */
	@ApiField("resource_type")
	private String resourceType;

	/**
	 * 资源状态
 - OPENING
 - STARTED
 - STOPPED
 - RELEASE
 - OPENING_FAIL
	 */
	@ApiField("status")
	private String status;

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
