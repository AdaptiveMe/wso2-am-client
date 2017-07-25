# SubscriptionPoliciesApi

All URIs are relative to *https://apis.wso2.com/api/am/admin/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**throttlingPoliciesSubscriptionGet**](SubscriptionPoliciesApi.md#throttlingPoliciesSubscriptionGet) | **GET** /throttling/policies/subscription | Get all Subscription level throttle policies
[**throttlingPoliciesSubscriptionPolicyIdDelete**](SubscriptionPoliciesApi.md#throttlingPoliciesSubscriptionPolicyIdDelete) | **DELETE** /throttling/policies/subscription/{policyId} | Delete a Subscription level throttle policy
[**throttlingPoliciesSubscriptionPolicyIdGet**](SubscriptionPoliciesApi.md#throttlingPoliciesSubscriptionPolicyIdGet) | **GET** /throttling/policies/subscription/{policyId} | Retrieve a Subscription Policy
[**throttlingPoliciesSubscriptionPolicyIdPut**](SubscriptionPoliciesApi.md#throttlingPoliciesSubscriptionPolicyIdPut) | **PUT** /throttling/policies/subscription/{policyId} | Update a Subscription level throttle policy
[**throttlingPoliciesSubscriptionPost**](SubscriptionPoliciesApi.md#throttlingPoliciesSubscriptionPost) | **POST** /throttling/policies/subscription | Add a Subscription level throttle policy


<a name="throttlingPoliciesSubscriptionGet"></a>
# **throttlingPoliciesSubscriptionGet**
> SubscriptionThrottlePolicyList throttlingPoliciesSubscriptionGet(accept, ifNoneMatch, ifModifiedSince)

Get all Subscription level throttle policies

Get all Subscription level throttle policies 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionPoliciesApi;


SubscriptionPoliciesApi apiInstance = new SubscriptionPoliciesApi();
String accept = "JSON"; // String | Media types acceptable for the response. Default is JSON. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    SubscriptionThrottlePolicyList result = apiInstance.throttlingPoliciesSubscriptionGet(accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionPoliciesApi#throttlingPoliciesSubscriptionGet");
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

[**SubscriptionThrottlePolicyList**](SubscriptionThrottlePolicyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesSubscriptionPolicyIdDelete"></a>
# **throttlingPoliciesSubscriptionPolicyIdDelete**
> throttlingPoliciesSubscriptionPolicyIdDelete(policyId, ifMatch, ifUnmodifiedSince)

Delete a Subscription level throttle policy

Delete a Subscription level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionPoliciesApi;


SubscriptionPoliciesApi apiInstance = new SubscriptionPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.throttlingPoliciesSubscriptionPolicyIdDelete(policyId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionPoliciesApi#throttlingPoliciesSubscriptionPolicyIdDelete");
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

<a name="throttlingPoliciesSubscriptionPolicyIdGet"></a>
# **throttlingPoliciesSubscriptionPolicyIdGet**
> SubscriptionThrottlePolicy throttlingPoliciesSubscriptionPolicyIdGet(policyId, ifNoneMatch, ifModifiedSince)

Retrieve a Subscription Policy

Retrieve a Subscription Policy providing the policy name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionPoliciesApi;


SubscriptionPoliciesApi apiInstance = new SubscriptionPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    SubscriptionThrottlePolicy result = apiInstance.throttlingPoliciesSubscriptionPolicyIdGet(policyId, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionPoliciesApi#throttlingPoliciesSubscriptionPolicyIdGet");
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

[**SubscriptionThrottlePolicy**](SubscriptionThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesSubscriptionPolicyIdPut"></a>
# **throttlingPoliciesSubscriptionPolicyIdPut**
> SubscriptionThrottlePolicy throttlingPoliciesSubscriptionPolicyIdPut(policyId, body, contentType, ifMatch, ifUnmodifiedSince)

Update a Subscription level throttle policy

Update a Subscription level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionPoliciesApi;


SubscriptionPoliciesApi apiInstance = new SubscriptionPoliciesApi();
String policyId = "policyId_example"; // String | Thorttle policy UUID 
SubscriptionThrottlePolicy body = new SubscriptionThrottlePolicy(); // SubscriptionThrottlePolicy | Policy object that needs to be modified 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    SubscriptionThrottlePolicy result = apiInstance.throttlingPoliciesSubscriptionPolicyIdPut(policyId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionPoliciesApi#throttlingPoliciesSubscriptionPolicyIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **String**| Thorttle policy UUID  |
 **body** | [**SubscriptionThrottlePolicy**](SubscriptionThrottlePolicy.md)| Policy object that needs to be modified  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**SubscriptionThrottlePolicy**](SubscriptionThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesSubscriptionPost"></a>
# **throttlingPoliciesSubscriptionPost**
> SubscriptionThrottlePolicy throttlingPoliciesSubscriptionPost(body, contentType)

Add a Subscription level throttle policy

Add a Subscription level throttle policy 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscriptionPoliciesApi;


SubscriptionPoliciesApi apiInstance = new SubscriptionPoliciesApi();
SubscriptionThrottlePolicy body = new SubscriptionThrottlePolicy(); // SubscriptionThrottlePolicy | Subscripion level policy object that should to be added 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
try {
    SubscriptionThrottlePolicy result = apiInstance.throttlingPoliciesSubscriptionPost(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionPoliciesApi#throttlingPoliciesSubscriptionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionThrottlePolicy**](SubscriptionThrottlePolicy.md)| Subscripion level policy object that should to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]

### Return type

[**SubscriptionThrottlePolicy**](SubscriptionThrottlePolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

