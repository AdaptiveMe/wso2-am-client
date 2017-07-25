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
import io.swagger.client.model.publisher.TierPermission;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ThrottlingTierIndividualApi
 */
@Ignore
public class ThrottlingTierIndividualApiTest {

    private final ThrottlingTierIndividualApi api = new ThrottlingTierIndividualApi();

    
    /**
     * Delete a Tier
     *
     * This operation can be used to delete an existing tier. The only supported tier level is &#x60;api&#x60; tiers. &#x60;DELETE https://127.0.0.1:9443/api/am/publisher/v0.11/tiers/api/Low&#x60;  **IMPORTANT:** * This is only effective when Advanced Throttling is disabled in the Server. If enabled, we need to use Admin REST API for throttling tiers modification related operations. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiersTierLevelTierNameDeleteTest() throws ApiException {
        String tierName = null;
        String tierLevel = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        api.tiersTierLevelTierNameDelete(tierName, tierLevel, ifMatch, ifUnmodifiedSince);

        // TODO: test validations
    }
    
    /**
     * Get details of a tier
     *
     * This operation can be used to retrieve details of a single tier by specifying the tier level and tier name. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiersTierLevelTierNameGetTest() throws ApiException {
        String tierName = null;
        String tierLevel = null;
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        Tier response = api.tiersTierLevelTierNameGet(tierName, tierLevel, accept, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * Update a Tier
     *
     * This operation can be used to update an existing tier. The only supported tier level is &#x60;api&#x60; tiers. &#x60;PUT https://127.0.0.1:9443/api/am/publisher/v0.11/tiers/api/Low&#x60;  **IMPORTANT:** * This is only effective when Advanced Throttling is disabled in the Server. If enabled, we need to use Admin REST API for throttling tiers modification related operations. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiersTierLevelTierNamePutTest() throws ApiException {
        String tierName = null;
        Tier body = null;
        String tierLevel = null;
        String contentType = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        Tier response = api.tiersTierLevelTierNamePut(tierName, body, tierLevel, contentType, ifMatch, ifUnmodifiedSince);

        // TODO: test validations
    }
    
    /**
     * Update tier permission
     *
     * This operation can be used to update tier permissions which controls access for the particular tier based on the subscribers&#39; roles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiersUpdatePermissionPostTest() throws ApiException {
        String tierName = null;
        String tierLevel = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        TierPermission permissions = null;
        List<Tier> response = api.tiersUpdatePermissionPost(tierName, tierLevel, ifMatch, ifUnmodifiedSince, permissions);

        // TODO: test validations
    }
    
}
