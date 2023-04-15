package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StockTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.stocktask.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:25:34
 */
public class AlipayCommerceTransportAdStocktaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7356784113269139691L;

	/** 
	 * 库存查询任务
	 */
	@ApiListField("stock_task")
	@ApiField("stock_task")
	private List<StockTask> stockTask;

	public void setStockTask(List<StockTask> stockTask) {
		this.stockTask = stockTask;
	}
	public List<StockTask> getStockTask( ) {
		return this.stockTask;
	}

}
