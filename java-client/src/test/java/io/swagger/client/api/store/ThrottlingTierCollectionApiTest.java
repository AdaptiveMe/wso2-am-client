/*
 * WSO2 API Manager - Store
 * This specifies a **RESTful API** for WSO2 **API Manager** - Store.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.store/src/main/resources/store-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.store;

import io.swagger.client.ApiException;
import io.swagger.client.api.store.ThrottlingTierCollectionApi;
import io.swagger.client.model.store.TierList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ThrottlingTierCollectionApi
 */
@Ignore
public class ThrottlingTierCollectionApiTest {

    private final ThrottlingTierCollectionApi api = new ThrottlingTierCollectionApi();

    
    /**
     * Get available tiers 
     *
     * This operation can be used to retrieve all the tiers available for the provided tier level. Tier level should be specified as a path parameter and should be one of &#x60;api&#x60; and &#x60;application&#x60;.  **NOTE**: * API tiers are the ones that is available during subscription of an application to an API. Hence they are also called subscription tiers and are same as the subscription policies in Admin REST API. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tiersTierLevelGetTest() throws ApiException {
        String tierLevel = null;
        Integer limit = null;
        Integer offset = null;
        String xWSO2Tenant = null;
        String accept = null;
        String ifNoneMatch = null;
        List<TierList> response = api.tiersTierLevelGet(tierLevel, limit, offset, xWSO2Tenant, accept, ifNoneMatch);

        // TODO: test validations
    }
    
}
