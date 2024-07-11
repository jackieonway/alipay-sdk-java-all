package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.torchreplayleftoffli.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-14 15:51:40
 */
public class AlipayDataMdaTorchreplayleftoffliQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5531319959143547652L;

	/** 
	 * 分享亚运精神用户数
	 */
	@ApiField("share_asian_games_spirit_cnt")
	private Long shareAsianGamesSpiritCnt;

	/** 
	 * 取火用户数
	 */
	@ApiField("take_flame_cnt")
	private Long takeFlameCnt;

	public void setShareAsianGamesSpiritCnt(Long shareAsianGamesSpiritCnt) {
		this.shareAsianGamesSpiritCnt = shareAsianGamesSpiritCnt;
	}
	public Long getShareAsianGamesSpiritCnt( ) {
		return this.shareAsianGamesSpiritCnt;
	}

	public void setTakeFlameCnt(Long takeFlameCnt) {
		this.takeFlameCnt = takeFlameCnt;
	}
	public Long getTakeFlameCnt( ) {
		return this.takeFlameCnt;
	}

}
