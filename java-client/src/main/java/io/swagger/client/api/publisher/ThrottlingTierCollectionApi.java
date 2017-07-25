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


import io.swagger.client.model.publisher.Tier;
import io.swagger.client.model.publisher.TierList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThrottlingTierCollectionApi {
    private ApiClient apiClient;

    public ThrottlingTierCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ThrottlingTierCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for tiersTierLevelGet
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tiersTierLevelGetCall(String tierLevel, Integer limit, Integer offset, String accept, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tiers/{tierLevel}"
            .replaceAll("\\{" + "tierLevel" + "\\}", apiClient.escapeString(tierLevel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

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
    private com.squareup.okhttp.Call tiersTierLevelGetValidateBeforeCall(String tierLevel, Integer limit, Integer offset, String accept, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tierLevel' is set
        if (tierLevel == null) {
            throw new ApiException("Missing the required parameter 'tierLevel' when calling tiersTierLevelGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = tiersTierLevelGetCall(tierLevel, limit, offset, accept, ifNoneMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all tiers
     * This operation can be used to list the available tiers for a given tier level. Tier level should be specified as a path parameter and should be one of &#x60;api&#x60;, &#x60;application&#x60; and &#x60;resource&#x60;. 
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return TierList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TierList tiersTierLevelGet(String tierLevel, Integer limit, Integer offset, String accept, String ifNoneMatch) throws ApiException {
        ApiResponse<TierList> resp = tiersTierLevelGetWithHttpInfo(tierLevel, limit, offset, accept, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get all tiers
     * This operation can be used to list the available tiers for a given tier level. Tier level should be specified as a path parameter and should be one of &#x60;api&#x60;, &#x60;application&#x60; and &#x60;resource&#x60;. 
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ApiResponse&lt;TierList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TierList> tiersTierLevelGetWithHttpInfo(String tierLevel, Integer limit, Integer offset, String accept, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = tiersTierLevelGetValidateBeforeCall(tierLevel, limit, offset, accept, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<TierList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all tiers (asynchronously)
     * This operation can be used to list the available tiers for a given tier level. Tier level should be specified as a path parameter and should be one of &#x60;api&#x60;, &#x60;application&#x60; and &#x60;resource&#x60;. 
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param limit Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tiersTierLevelGetAsync(String tierLevel, Integer limit, Integer offset, String accept, String ifNoneMatch, final ApiCallback<TierList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tiersTierLevelGetValidateBeforeCall(tierLevel, limit, offset, accept, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TierList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tiersTierLevelPost
     * @param body Tier object that should to be added  (required)
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tiersTierLevelPostCall(Tier body, String tierLevel, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/tiers/{tierLevel}"
            .replaceAll("\\{" + "tierLevel" + "\\}", apiClient.escapeString(tierLevel.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tiersTierLevelPostValidateBeforeCall(Tier body, String tierLevel, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tiersTierLevelPost(Async)");
        }
        
        // verify the required parameter 'tierLevel' is set
        if (tierLevel == null) {
            throw new ApiException("Missing the required parameter 'tierLevel' when calling tiersTierLevelPost(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling tiersTierLevelPost(Async)");
        }
        
        
        com.squareup.okhttp.Call call = tiersTierLevelPostCall(body, tierLevel, contentType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Tier
     * This operation can be used to create a new throttling tier. The only supported tier level is &#x60;api&#x60; tiers. &#x60;POST https://127.0.0.1:9443/api/am/publisher/v0.11/tiers/api&#x60;  **IMPORTANT:** * This is only effective when Advanced Throttling is disabled in the Server. If enabled, we need to use Admin REST API for throttling tiers modification related operations. 
     * @param body Tier object that should to be added  (required)
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return Tier
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tier tiersTierLevelPost(Tier body, String tierLevel, String contentType) throws ApiException {
        ApiResponse<Tier> resp = tiersTierLevelPostWithHttpInfo(body, tierLevel, contentType);
        return resp.getData();
    }

    /**
     * Create a Tier
     * This operation can be used to create a new throttling tier. The only supported tier level is &#x60;api&#x60; tiers. &#x60;POST https://127.0.0.1:9443/api/am/publisher/v0.11/tiers/api&#x60;  **IMPORTANT:** * This is only effective when Advanced Throttling is disabled in the Server. If enabled, we need to use Admin REST API for throttling tiers modification related operations. 
     * @param body Tier object that should to be added  (required)
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return ApiResponse&lt;Tier&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tier> tiersTierLevelPostWithHttpInfo(Tier body, String tierLevel, String contentType) throws ApiException {
        com.squareup.okhttp.Call call = tiersTierLevelPostValidateBeforeCall(body, tierLevel, contentType, null, null);
        Type localVarReturnType = new TypeToken<Tier>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Tier (asynchronously)
     * This operation can be used to create a new throttling tier. The only supported tier level is &#x60;api&#x60; tiers. &#x60;POST https://127.0.0.1:9443/api/am/publisher/v0.11/tiers/api&#x60;  **IMPORTANT:** * This is only effective when Advanced Throttling is disabled in the Server. If enabled, we need to use Admin REST API for throttling tiers modification related operations. 
     * @param body Tier object that should to be added  (required)
     * @param tierLevel List API or Application or Resource type tiers.  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tiersTierLevelPostAsync(Tier body, String tierLevel, String contentType, final ApiCallback<Tier> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tiersTierLevelPostValidateBeforeCall(body, tierLevel, contentType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tier>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
