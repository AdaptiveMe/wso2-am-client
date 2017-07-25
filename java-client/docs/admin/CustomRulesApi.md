# CustomRulesApi

All URIs are relative to *https://apis.wso2.com/api/am/admin/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**throttlingPoliciesCustomGet**](CustomRulesApi.md#throttlingPoliciesCustomGet) | **GET** /throttling/policies/custom | Get all Custom Rules
[**throttlingPoliciesCustomPost**](CustomRulesApi.md#throttlingPoliciesCustomPost) | **POST** /throttling/policies/custom | Add a Custom Rule
[**throttlingPoliciesCustomRuleIdDelete**](CustomRulesApi.md#throttlingPoliciesCustomRuleIdDelete) | **DELETE** /throttling/policies/custom/{ruleId} | Delete a Custom Rule
[**throttlingPoliciesCustomRuleIdGet**](CustomRulesApi.md#throttlingPoliciesCustomRuleIdGet) | **GET** /throttling/policies/custom/{ruleId} | Retrieve a Custom Rule
[**throttlingPoliciesCustomRuleIdPut**](CustomRulesApi.md#throttlingPoliciesCustomRuleIdPut) | **PUT** /throttling/policies/custom/{ruleId} | Update a Custom Rule


<a name="throttlingPoliciesCustomGet"></a>
# **throttlingPoliciesCustomGet**
> CustomRuleList throttlingPoliciesCustomGet(accept, ifNoneMatch, ifModifiedSince)

Get all Custom Rules

Get all Custom Rules 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomRulesApi;


CustomRulesApi apiInstance = new CustomRulesApi();
String accept = "JSON"; // String | Media types acceptable for the response. Default is JSON. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    CustomRuleList result = apiInstance.throttlingPoliciesCustomGet(accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomRulesApi#throttlingPoliciesCustomGet");
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

[**CustomRuleList**](CustomRuleList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesCustomPost"></a>
# **throttlingPoliciesCustomPost**
> CustomRule throttlingPoliciesCustomPost(body, contentType)

Add a Custom Rule

Add a Custom Rule 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomRulesApi;


CustomRulesApi apiInstance = new CustomRulesApi();
CustomRule body = new CustomRule(); // CustomRule | Custom Rule object that should to be added 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
try {
    CustomRule result = apiInstance.throttlingPoliciesCustomPost(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomRulesApi#throttlingPoliciesCustomPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomRule**](CustomRule.md)| Custom Rule object that should to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]

### Return type

[**CustomRule**](CustomRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesCustomRuleIdDelete"></a>
# **throttlingPoliciesCustomRuleIdDelete**
> throttlingPoliciesCustomRuleIdDelete(ruleId, ifMatch, ifUnmodifiedSince)

Delete a Custom Rule

Delete a Custom Rule 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomRulesApi;


CustomRulesApi apiInstance = new CustomRulesApi();
String ruleId = "ruleId_example"; // String | Custom rule UUID 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.throttlingPoliciesCustomRuleIdDelete(ruleId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomRulesApi#throttlingPoliciesCustomRuleIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Custom rule UUID  |
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesCustomRuleIdGet"></a>
# **throttlingPoliciesCustomRuleIdGet**
> CustomRule throttlingPoliciesCustomRuleIdGet(ruleId, ifNoneMatch, ifModifiedSince)

Retrieve a Custom Rule

Retrieve a Custom Rule providing the policy name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomRulesApi;


CustomRulesApi apiInstance = new CustomRulesApi();
String ruleId = "ruleId_example"; // String | Custom rule UUID 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    CustomRule result = apiInstance.throttlingPoliciesCustomRuleIdGet(ruleId, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomRulesApi#throttlingPoliciesCustomRuleIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Custom rule UUID  |
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**CustomRule**](CustomRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingPoliciesCustomRuleIdPut"></a>
# **throttlingPoliciesCustomRuleIdPut**
> CustomRule throttlingPoliciesCustomRuleIdPut(ruleId, body, contentType, ifMatch, ifUnmodifiedSince)

Update a Custom Rule

Update a Custom Rule 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomRulesApi;


CustomRulesApi apiInstance = new CustomRulesApi();
String ruleId = "ruleId_example"; // String | Custom rule UUID 
CustomRule body = new CustomRule(); // CustomRule | Policy object that needs to be modified 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    CustomRule result = apiInstance.throttlingPoliciesCustomRuleIdPut(ruleId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomRulesApi#throttlingPoliciesCustomRuleIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **String**| Custom rule UUID  |
 **body** | [**CustomRule**](CustomRule.md)| Policy object that needs to be modified  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**CustomRule**](CustomRule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

