package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DownloadUrlResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.objectstorage.downloadurl.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-21 14:36:44
 */
public class AlipayCloudCloudrunObjectstorageDownloadurlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4727819183556195195L;

	/** 
	 * 文件下载链接列表
	 */
	@ApiListField("file_list")
	@ApiField("download_url_response")
	private List<DownloadUrlResponse> fileList;

	public void setFileList(List<DownloadUrlResponse> fileList) {
		this.fileList = fileList;
	}
	public List<DownloadUrlResponse> getFileList( ) {
		return this.fileList;
	}

}
