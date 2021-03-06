/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.publisher;

import io.swagger.client.ApiException;
import io.swagger.client.model.publisher.Tier;
import io.swagger.client.model.publisher.TierList;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for ThrottlingTierCollectionApi
 */
@Ignore
public class ThrottlingTierCollectionApiTest {

    private final ThrottlingTierCollectionApi api = new ThrottlingTierCollectionApi();

    
    /**
     * Get all tiers
     *
     * This operation can be used to list the available tiers for a given tier level. Tier level should be specified as a path parameter and should be one of &#x60;api&#x60;, &#x60;application&#x60; and &#x60;resource&#x60;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiersTierLevelGetTest() throws ApiException {
        String tierLevel = null;
        Integer limit = null;
        Integer offset = null;
        String accept = null;
        String ifNoneMatch = null;
        TierList response = api.tiersTierLevelGet(tierLevel, limit, offset, accept, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Create a Tier
     *
     * This operation can be used to create a new throttling tier. The only supported tier level is &#x60;api&#x60; tiers. &#x60;POST https://127.0.0.1:9443/api/am/publisher/v0.11/tiers/api&#x60;  **IMPORTANT:** * This is only effective when Advanced Throttling is disabled in the Server. If enabled, we need to use Admin REST API for throttling tiers modification related operations. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiersTierLevelPostTest() throws ApiException {
        Tier body = null;
        String tierLevel = null;
        String contentType = null;
        Tier response = api.tiersTierLevelPost(body, tierLevel, contentType);

        // TODO: test validations
    }
    
}
