/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AgentRefundTransferSeqCommitV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentRefundTransferSeqCommitV2Request;
import com.bytedance.ads.model.AgentRefundTransferSeqCommitV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/refund/transfer_seq/commit/ POST
public class AgentRefundTransferSeqCommitV2ApiExample {

    private static final AgentRefundTransferSeqCommitV2Api api = new AgentRefundTransferSeqCommitV2Api();

    public static void main(String[] args) throws ApiException {
        AgentRefundTransferSeqCommitV2Request agentRefundTransferSeqCommitV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentRefundTransferSeqCommitV2Response response = api.openApi2AgentRefundTransferSeqCommitPost(agentRefundTransferSeqCommitV2Request);
        System.out.println(response);
    }

}