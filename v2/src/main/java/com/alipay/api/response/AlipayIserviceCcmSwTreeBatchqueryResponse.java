package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TreeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.tree.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:23:25
 */
public class AlipayIserviceCcmSwTreeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5169821478255371511L;

	/** 
	 * 类目集合
	 */
	@ApiListField("trees")
	@ApiField("tree_info")
	private List<TreeInfo> trees;

	public void setTrees(List<TreeInfo> trees) {
		this.trees = trees;
	}
	public List<TreeInfo> getTrees( ) {
		return this.trees;
	}

}
