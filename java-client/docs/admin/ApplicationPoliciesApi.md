# ApplicationPoliciesApi

All URIs are relative to *https://apis.wso2.com/api/am/admin/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**throttlingPoliciesApplicationGet**](ApplicationPoliciesApi.md#throttlingPoliciesApplicationGet) | **GET** /throttling/policies/application | Get all Application level throttle policies
[**throttlingPoliciesApplicationPolicyIdDelete**](ApplicationPoliciesApi.md#throttlingPoliciesApplicationPolicyIdDelete) | **DELETE** /throttling/policies/application/{policyId} | Delete an Application level throttle policy
[**throttlingPoliciesApplicationPolicyIdGet**](ApplicationPoliciesApi.md#throttlingPoliciesApplicationPolicyIdGet) | **GET** /throttling/policies/application/{policyId} | Retrieve an Application Policy
[**throttlingPoliciesApplicationPolicyIdPut**](ApplicationPoliciesApi.md#throttlingPoliciesApplicationPolicyIdPut) | **PUT** /throttling/policies/application/{policyId} | Update an Application level throttle policy
[**throttlingPoliciesApplicationPost**](ApplicationPoliciesApi.md#throttlingPoliciesApplicationPost) | **POST** /throttling/policies/application | Add an Application level throttle policy


<a name="throttlingPoliciesApplicationGet"></a>
# **throttlingPoliciesApplicationGet**
> ApplicationThrottlePolicyList throttlingPoliciesApplicationGet(accept, ifNoneMatch, ifModifiedSince)

Get all Application level throttle policies

Get all Application level throttle policies 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.admin.ApplicationPoliciesApi;


ApplicationPoliciesApi apiInstance = new ApplicationPoliciesApi();
String accept = "JSON"; // String | Media types acceptable for the response. Default is JSON. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    ApplicationThrottlePolicyList result = apiInstance.throttlingPoliciesApplicationGet(accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPoliciesApi#throttlingPoliciesApplicationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accept** | **String**| Media types acceptable for the response. Default is JSON.  | [optional] [default to JSON]
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**ApplicationThrottlePolicyList**](ApplicationThrottlePolicyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesApplicationPolicyIdDelete"></a>
# **throttlingPoliciesApplicationPolicyIdDelete**
> throttlingPoliciesApplicationPolicyIdDelete(policyId, ifMatch, ifUnmodifiedSince)

Delete an Application level throttle policy

Delete an Application level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.admin.ApplicationPoliciesApi;


ApplicationPoliciesApi apiInstance = new ApplicationPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.throttlingPoliciesApplicationPolicyIdDelete(policyId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPoliciesApi#throttlingPoliciesApplicationPolicyIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Thorttle policy UUID  |
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesApplicationPolicyIdGet"></a>
# **throttlingPoliciesApplicationPolicyIdGet**
> ApplicationThrottlePolicy throttlingPoliciesApplicationPolicyIdGet(policyId, ifNoneMatch, ifModifiedSince)

Retrieve an Application Policy

Retrieve an Application Policy providing the policy name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.admin.ApplicationPoliciesApi;


ApplicationPoliciesApi apiInstance = new ApplicationPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    ApplicationThrottlePolicy result = apiInstance.throttlingPoliciesApplicationPolicyIdGet(policyId, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPoliciesApi#throttlingPoliciesApplicationPolicyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Thorttle policy UUID  |
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**ApplicationThrottlePolicy**](ApplicationThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesApplicationPolicyIdPut"></a>
# **throttlingPoliciesApplicationPolicyIdPut**
> ApplicationThrottlePolicy throttlingPoliciesApplicationPolicyIdPut(policyId, body, contentType, ifMatch, ifUnmodifiedSince)

Update an Application level throttle policy

Update an Application level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.admin.ApplicationPoliciesApi;


ApplicationPoliciesApi apiInstance = new ApplicationPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
ApplicationThrottlePolicy body = new ApplicationThrottlePolicy(); // ApplicationThrottlePolicy | Policy object that needs to be modified 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    ApplicationThrottlePolicy result = apiInstance.throttlingPoliciesApplicationPolicyIdPut(policyId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPoliciesApi#throttlingPoliciesApplicationPolicyIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Thorttle policy UUID  |
 **body** | [**ApplicationThrottlePolicy**](ApplicationThrottlePolicy.md)| Policy object that needs to be modified  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**ApplicationThrottlePolicy**](ApplicationThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesApplicationPost"></a>
# **throttlingPoliciesApplicationPost**
> ApplicationThrottlePolicy throttlingPoliciesApplicationPost(body, contentType)

Add an Application level throttle policy

Add an Application level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.admin.ApplicationPoliciesApi;


ApplicationPoliciesApi apiInstance = new ApplicationPoliciesApi();
ApplicationThrottlePolicy body = new ApplicationThrottlePolicy(); // ApplicationThrottlePolicy | Application level policy object that should to be added 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
try {
    ApplicationThrottlePolicy result = apiInstance.throttlingPoliciesApplicationPost(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationPoliciesApi#throttlingPoliciesApplicationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationThrottlePolicy**](ApplicationThrottlePolicy.md)| Application level policy object that should to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]

### Return type

[**ApplicationThrottlePolicy**](ApplicationThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

