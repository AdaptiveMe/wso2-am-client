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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.store.Tier;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThrottlingTierIndividualApi {
    private ApiClient apiClient;

    public ThrottlingTierIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ThrottlingTierIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for tiersTierLevelTierNameGet
     * @param tierName Tier name  (required)
     * @param tierLevel List API or Application type tiers.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tiersTierLevelTierNameGetCall(String tierName, String tierLevel, String xWSO2Tenant, String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tiers/{tierLevel}/{tierName}"
            .replaceAll("\\{" + "tierName" + "\\}", apiClient.escapeString(tierName.toString()))
            .replaceAll("\\{" + "tierLevel" + "\\}", apiClient.escapeString(tierLevel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xWSO2Tenant != null)
        localVarHeaderParams.put("X-WSO2-Tenant", apiClient.parameterToString(xWSO2Tenant));
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tiersTierLevelTierNameGetValidateBeforeCall(String tierName, String tierLevel, String xWSO2Tenant, String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tierName' is set
        if (tierName == null) {
            throw new ApiException("Missing the required parameter 'tierName' when calling tiersTierLevelTierNameGet(Async)");
        }
        
        // verify the required parameter 'tierLevel' is set
        if (tierLevel == null) {
            throw new ApiException("Missing the required parameter 'tierLevel' when calling tiersTierLevelTierNameGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = tiersTierLevelTierNameGetCall(tierName, tierLevel, xWSO2Tenant, accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get details of a tier 
     * This operation can be used to retrieve details of a single tier by specifying the tier level and tier name. 
     * @param tierName Tier name  (required)
     * @param tierLevel List API or Application type tiers.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return Tier
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tier tiersTierLevelTierNameGet(String tierName, String tierLevel, String xWSO2Tenant, String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<Tier> resp = tiersTierLevelTierNameGetWithHttpInfo(tierName, tierLevel, xWSO2Tenant, accept, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get details of a tier 
     * This operation can be used to retrieve details of a single tier by specifying the tier level and tier name. 
     * @param tierName Tier name  (required)
     * @param tierLevel List API or Application type tiers.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return ApiResponse&lt;Tier&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tier> tiersTierLevelTierNameGetWithHttpInfo(String tierName, String tierLevel, String xWSO2Tenant, String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = tiersTierLevelTierNameGetValidateBeforeCall(tierName, tierLevel, xWSO2Tenant, accept, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Tier>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get details of a tier  (asynchronously)
     * This operation can be used to retrieve details of a single tier by specifying the tier level and tier name. 
     * @param tierName Tier name  (required)
     * @param tierLevel List API or Application type tiers.  (required)
     * @param xWSO2Tenant For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  (optional)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tiersTierLevelTierNameGetAsync(String tierName, String tierLevel, String xWSO2Tenant, String accept, String ifNoneMatch, String ifModifiedSince, final ApiCallback<Tier> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tiersTierLevelTierNameGetValidateBeforeCall(tierName, tierLevel, xWSO2Tenant, accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tier>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}