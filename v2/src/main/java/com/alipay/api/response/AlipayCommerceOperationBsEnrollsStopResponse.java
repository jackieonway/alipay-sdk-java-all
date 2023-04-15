package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BsParticipantResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.enrolls.stop response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:56:44
 */
public class AlipayCommerceOperationBsEnrollsStopResponse extends AlipayResponse {

	private static final long serialVersionUID = 8641857165521776886L;

	/** 
	 * 中止失败的参与者列表
	 */
	@ApiListField("failed_participants")
	@ApiField("bs_participant_response_d_t_o")
	private List<BsParticipantResponseDTO> failedParticipants;

	public void setFailedParticipants(List<BsParticipantResponseDTO> failedParticipants) {
		this.failedParticipants = failedParticipants;
	}
	public List<BsParticipantResponseDTO> getFailedParticipants( ) {
		return this.failedParticipants;
	}

}
