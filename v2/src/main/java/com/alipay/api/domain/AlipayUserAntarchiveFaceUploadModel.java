package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加身份证影印件信息
 *
 * @author auto create
 * @since 1.0, 2022-09-22 16:09:29
 */
public class AlipayUserAntarchiveFaceUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6665814321364255237L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 证件名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 蚂蚁档案证件类型

个人类型取值范围：
100 居民身份证
102 护照
105 港澳居民往来内地通行证
106 台湾居民往来内地通行证

企业和组织类型取值范围：
200 统一社会信用代码
201 全国法人营业执照
204 民办非企业登记证书
206 社会团体法人登记证书
218 事业单位法人证书
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 档案人脸扩展信息
	 */
	@ApiField("ext_info")
	private ArchiveFaceExtInfo extInfo;

	/**
	 * 身份证反面url，pg格式，大小限制为几百K以内
	 */
	@ApiField("other_portrait_url")
	private String otherPortraitUrl;

	/**
	 * 请求人像url，jpg格式，大小限制为几百K以内
	 */
	@ApiField("portrait_url")
	private String portraitUrl;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public ArchiveFaceExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ArchiveFaceExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getOtherPortraitUrl() {
		return this.otherPortraitUrl;
	}
	public void setOtherPortraitUrl(String otherPortraitUrl) {
		this.otherPortraitUrl = otherPortraitUrl;
	}

	public String getPortraitUrl() {
		return this.portraitUrl;
	}
	public void setPortraitUrl(String portraitUrl) {
		this.portraitUrl = portraitUrl;
	}

}
