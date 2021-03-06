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


import io.swagger.client.model.admin.Mediation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediationIndividualApi {
    private ApiClient apiClient;

    public MediationIndividualApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MediationIndividualApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for policiesMediationMediationPolicyIdDelete
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call policiesMediationMediationPolicyIdDeleteCall(String mediationPolicyId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/policies/mediation/{mediationPolicyId}"
            .replaceAll("\\{" + "mediationPolicyId" + "\\}", apiClient.escapeString(mediationPolicyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));
        if (ifUnmodifiedSince != null)
        localVarHeaderParams.put("If-Unmodified-Since", apiClient.parameterToString(ifUnmodifiedSince));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call policiesMediationMediationPolicyIdDeleteValidateBeforeCall(String mediationPolicyId, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'mediationPolicyId' is set
        if (mediationPolicyId == null) {
            throw new ApiException("Missing the required parameter 'mediationPolicyId' when calling policiesMediationMediationPolicyIdDelete(Async)");
        }
        
        
        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdDeleteCall(mediationPolicyId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an API
     * This operation can be used to delete an existing API proving the Id of the API. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void policiesMediationMediationPolicyIdDelete(String mediationPolicyId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        policiesMediationMediationPolicyIdDeleteWithHttpInfo(mediationPolicyId, ifMatch, ifUnmodifiedSince);
    }

    /**
     * Delete an API
     * This operation can be used to delete an existing API proving the Id of the API. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> policiesMediationMediationPolicyIdDeleteWithHttpInfo(String mediationPolicyId, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdDeleteValidateBeforeCall(mediationPolicyId, ifMatch, ifUnmodifiedSince, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an API (asynchronously)
     * This operation can be used to delete an existing API proving the Id of the API. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call policiesMediationMediationPolicyIdDeleteAsync(String mediationPolicyId, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdDeleteValidateBeforeCall(mediationPolicyId, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for policiesMediationMediationPolicyIdGet
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param accept Media types acceptable for the response. Default is JSON.  (optional, default to JSON)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call policiesMediationMediationPolicyIdGetCall(String mediationPolicyId, String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/policies/mediation/{mediationPolicyId}"
            .replaceAll("\\{" + "mediationPolicyId" + "\\}", apiClient.escapeString(mediationPolicyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
    private com.squareup.okhttp.Call policiesMediationMediationPolicyIdGetValidateBeforeCall(String mediationPolicyId, String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'mediationPolicyId' is set
        if (mediationPolicyId == null) {
            throw new ApiException("Missing the required parameter 'mediationPolicyId' when calling policiesMediationMediationPolicyIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdGetCall(mediationPolicyId, accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a global mediation squence
     * This operation can be used to retrieve a particular global mediation policy. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param accept Media types acceptable for the response. Default is JSON.  (optional, default to JSON)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return Mediation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Mediation policiesMediationMediationPolicyIdGet(String mediationPolicyId, String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<Mediation> resp = policiesMediationMediationPolicyIdGetWithHttpInfo(mediationPolicyId, accept, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get a global mediation squence
     * This operation can be used to retrieve a particular global mediation policy. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param accept Media types acceptable for the response. Default is JSON.  (optional, default to JSON)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return ApiResponse&lt;Mediation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Mediation> policiesMediationMediationPolicyIdGetWithHttpInfo(String mediationPolicyId, String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdGetValidateBeforeCall(mediationPolicyId, accept, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Mediation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a global mediation squence (asynchronously)
     * This operation can be used to retrieve a particular global mediation policy. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param accept Media types acceptable for the response. Default is JSON.  (optional, default to JSON)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call policiesMediationMediationPolicyIdGetAsync(String mediationPolicyId, String accept, String ifNoneMatch, String ifModifiedSince, final ApiCallback<Mediation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdGetValidateBeforeCall(mediationPolicyId, accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Mediation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for policiesMediationMediationPolicyIdPut
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param body Mediation policy object that needs to be added  (required)
     * @param contentType Media type of the entity in the body. Default is JSON.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call policiesMediationMediationPolicyIdPutCall(String mediationPolicyId, Mediation body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/policies/mediation/{mediationPolicyId}"
            .replaceAll("\\{" + "mediationPolicyId" + "\\}", apiClient.escapeString(mediationPolicyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
        if (ifMatch != null)
        localVarHeaderParams.put("If-Match", apiClient.parameterToString(ifMatch));
        if (ifUnmodifiedSince != null)
        localVarHeaderParams.put("If-Unmodified-Since", apiClient.parameterToString(ifUnmodifiedSince));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call policiesMediationMediationPolicyIdPutValidateBeforeCall(String mediationPolicyId, Mediation body, String contentType, String ifMatch, String ifUnmodifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'mediationPolicyId' is set
        if (mediationPolicyId == null) {
            throw new ApiException("Missing the required parameter 'mediationPolicyId' when calling policiesMediationMediationPolicyIdPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling policiesMediationMediationPolicyIdPut(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling policiesMediationMediationPolicyIdPut(Async)");
        }
        
        
        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdPutCall(mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update an mediation policy
     * This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param body Mediation policy object that needs to be added  (required)
     * @param contentType Media type of the entity in the body. Default is JSON.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @return Mediation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Mediation policiesMediationMediationPolicyIdPut(String mediationPolicyId, Mediation body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        ApiResponse<Mediation> resp = policiesMediationMediationPolicyIdPutWithHttpInfo(mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince);
        return resp.getData();
    }

    /**
     * Update an mediation policy
     * This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param body Mediation policy object that needs to be added  (required)
     * @param contentType Media type of the entity in the body. Default is JSON.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @return ApiResponse&lt;Mediation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Mediation> policiesMediationMediationPolicyIdPutWithHttpInfo(String mediationPolicyId, Mediation body, String contentType, String ifMatch, String ifUnmodifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdPutValidateBeforeCall(mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Mediation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an mediation policy (asynchronously)
     * This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation. 
     * @param mediationPolicyId Mediation policy Id  (required)
     * @param body Mediation policy object that needs to be added  (required)
     * @param contentType Media type of the entity in the body. Default is JSON.  (required)
     * @param ifMatch Validator for conditional requests; based on ETag.  (optional)
     * @param ifUnmodifiedSince Validator for conditional requests; based on Last Modified header.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call policiesMediationMediationPolicyIdPutAsync(String mediationPolicyId, Mediation body, String contentType, String ifMatch, String ifUnmodifiedSince, final ApiCallback<Mediation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = policiesMediationMediationPolicyIdPutValidateBeforeCall(mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Mediation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
