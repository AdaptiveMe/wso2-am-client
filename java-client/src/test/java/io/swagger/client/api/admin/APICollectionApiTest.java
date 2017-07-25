/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.admin;

import io.swagger.client.ApiException;
import io.swagger.client.api.admin.APICollectionApi;
import io.swagger.client.model.admin.MediationList;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for APICollectionApi
 */
@Ignore
public class APICollectionApiTest {

    private final APICollectionApi api = new APICollectionApi();

    
    /**
     * Retrieve/Search APIs 
     *
     * This operation provides you a list of available APIs qualifying under a given search condition.  Each retrieved API is represented with a minimal amount of attributes. If you want to get complete details of an API, you need to use **Get details of an API** operation. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void policiesMediationGetTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String query = null;
        String accept = null;
        String ifNoneMatch = null;
        MediationList response = api.policiesMediationGet(limit, offset, query, accept, ifNoneMatch);

        // TODO: test validations
    }
    
}