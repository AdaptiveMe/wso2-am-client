# AdvancedPoliciesApi

All URIs are relative to *https://apis.wso2.com/api/am/admin/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**throttlingPoliciesAdvancedGet**](AdvancedPoliciesApi.md#throttlingPoliciesAdvancedGet) | **GET** /throttling/policies/advanced | Get all Advanced level throttle policies
[**throttlingPoliciesAdvancedPolicyIdDelete**](AdvancedPoliciesApi.md#throttlingPoliciesAdvancedPolicyIdDelete) | **DELETE** /throttling/policies/advanced/{policyId} | Delete an Advanced level throttle policy
[**throttlingPoliciesAdvancedPolicyIdGet**](AdvancedPoliciesApi.md#throttlingPoliciesAdvancedPolicyIdGet) | **GET** /throttling/policies/advanced/{policyId} | Retrieve an Advanced Policy
[**throttlingPoliciesAdvancedPolicyIdPut**](AdvancedPoliciesApi.md#throttlingPoliciesAdvancedPolicyIdPut) | **PUT** /throttling/policies/advanced/{policyId} | Update an Advanced level throttle policy
[**throttlingPoliciesAdvancedPost**](AdvancedPoliciesApi.md#throttlingPoliciesAdvancedPost) | **POST** /throttling/policies/advanced | Add an Advanced level throttle policy


<a name="throttlingPoliciesAdvancedGet"></a>
# **throttlingPoliciesAdvancedGet**
> AdvancedThrottlePolicyList throttlingPoliciesAdvancedGet(accept, ifNoneMatch, ifModifiedSince)

Get all Advanced level throttle policies

Get all Advanced level throttle policies 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdvancedPoliciesApi;


AdvancedPoliciesApi apiInstance = new AdvancedPoliciesApi();
String accept = "JSON"; // String | Media types acceptable for the response. Default is JSON. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    AdvancedThrottlePolicyList result = apiInstance.throttlingPoliciesAdvancedGet(accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedPoliciesApi#throttlingPoliciesAdvancedGet");
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

[**AdvancedThrottlePolicyList**](AdvancedThrottlePolicyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesAdvancedPolicyIdDelete"></a>
# **throttlingPoliciesAdvancedPolicyIdDelete**
> throttlingPoliciesAdvancedPolicyIdDelete(policyId, ifMatch, ifUnmodifiedSince)

Delete an Advanced level throttle policy

Delete an Advanced level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
io.swagger.client.api.admin.AdvancedPoliciesApi


AdvancedPoliciesApi apiInstance = new AdvancedPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.throttlingPoliciesAdvancedPolicyIdDelete(policyId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedPoliciesApi#throttlingPoliciesAdvancedPolicyIdDelete");
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

<a name="throttlingPoliciesAdvancedPolicyIdGet"></a>
# **throttlingPoliciesAdvancedPolicyIdGet**
> AdvancedThrottlePolicy throttlingPoliciesAdvancedPolicyIdGet(policyId, ifNoneMatch, ifModifiedSince)

Retrieve an Advanced Policy

Retrieve a Advanced Policy providing the policy name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdvancedPoliciesApi;


AdvancedPoliciesApi apiInstance = new AdvancedPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    AdvancedThrottlePolicy result = apiInstance.throttlingPoliciesAdvancedPolicyIdGet(policyId, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedPoliciesApi#throttlingPoliciesAdvancedPolicyIdGet");
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

[**AdvancedThrottlePolicy**](AdvancedThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesAdvancedPolicyIdPut"></a>
# **throttlingPoliciesAdvancedPolicyIdPut**
> AdvancedThrottlePolicy throttlingPoliciesAdvancedPolicyIdPut(policyId, body, contentType, ifMatch, ifUnmodifiedSince)

Update an Advanced level throttle policy

Update an Advanced level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdvancedPoliciesApi;


AdvancedPoliciesApi apiInstance = new AdvancedPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
AdvancedThrottlePolicy body = new AdvancedThrottlePolicy(); // AdvancedThrottlePolicy | Policy object that needs to be modified 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    AdvancedThrottlePolicy result = apiInstance.throttlingPoliciesAdvancedPolicyIdPut(policyId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedPoliciesApi#throttlingPoliciesAdvancedPolicyIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Thorttle policy UUID  |
 **body** | [**AdvancedThrottlePolicy**](AdvancedThrottlePolicy.md)| Policy object that needs to be modified  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**AdvancedThrottlePolicy**](AdvancedThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesAdvancedPost"></a>
# **throttlingPoliciesAdvancedPost**
> AdvancedThrottlePolicy throttlingPoliciesAdvancedPost(body, contentType)

Add an Advanced level throttle policy

Add an Advanced level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdvancedPoliciesApi;


AdvancedPoliciesApi apiInstance = new AdvancedPoliciesApi();
AdvancedThrottlePolicy body = new AdvancedThrottlePolicy(); // AdvancedThrottlePolicy | Advanced level policy object that should to be added 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
try {
    AdvancedThrottlePolicy result = apiInstance.throttlingPoliciesAdvancedPost(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedPoliciesApi#throttlingPoliciesAdvancedPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvancedThrottlePolicy**](AdvancedThrottlePolicy.md)| Advanced level policy object that should to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]

### Return type

[**AdvancedThrottlePolicy**](AdvancedThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

