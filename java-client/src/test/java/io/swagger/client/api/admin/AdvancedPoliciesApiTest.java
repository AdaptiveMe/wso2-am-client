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
import io.swagger.client.api.admin.AdvancedPoliciesApi;
import io.swagger.client.model.admin.AdvancedThrottlePolicy;
import io.swagger.client.model.admin.AdvancedThrottlePolicyList;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for AdvancedPoliciesApi
 */
@Ignore
public class AdvancedPoliciesApiTest {

    private final AdvancedPoliciesApi api = new AdvancedPoliciesApi();

    
    /**
     * Get all Advanced level throttle policies
     *
     * Get all Advanced level throttle policies 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void throttlingPoliciesAdvancedGetTest() throws ApiException {
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        AdvancedThrottlePolicyList response = api.throttlingPoliciesAdvancedGet(accept, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * Delete an Advanced level throttle policy
     *
     * Delete an Advanced level throttle policy 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void throttlingPoliciesAdvancedPolicyIdDeleteTest() throws ApiException {
        String policyId = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        api.throttlingPoliciesAdvancedPolicyIdDelete(policyId, ifMatch, ifUnmodifiedSince);

        // TODO: test validations
    }
    
    /**
     * Retrieve an Advanced Policy
     *
     * Retrieve a Advanced Policy providing the policy name. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void throttlingPoliciesAdvancedPolicyIdGetTest() throws ApiException {
        String policyId = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        AdvancedThrottlePolicy response = api.throttlingPoliciesAdvancedPolicyIdGet(policyId, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * Update an Advanced level throttle policy
     *
     * Update an Advanced level throttle policy 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void throttlingPoliciesAdvancedPolicyIdPutTest() throws ApiException {
        String policyId = null;
        AdvancedThrottlePolicy body = null;
        String contentType = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        AdvancedThrottlePolicy response = api.throttlingPoliciesAdvancedPolicyIdPut(policyId, body, contentType, ifMatch, ifUnmodifiedSince);

        // TODO: test validations
    }
    
    /**
     * Add an Advanced level throttle policy
     *
     * Add an Advanced level throttle policy 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void throttlingPoliciesAdvancedPostTest() throws ApiException {
        AdvancedThrottlePolicy body = null;
        String contentType = null;
        AdvancedThrottlePolicy response = api.throttlingPoliciesAdvancedPost(body, contentType);

        // TODO: test validations
    }
    
}
