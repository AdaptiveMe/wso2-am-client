# BlacklistApi

All URIs are relative to *https://apis.wso2.com/api/am/admin/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**throttlingBlacklistConditionIdDelete**](BlacklistApi.md#throttlingBlacklistConditionIdDelete) | **DELETE** /throttling/blacklist/{conditionId} | Delete a Blocking condition
[**throttlingBlacklistConditionIdGet**](BlacklistApi.md#throttlingBlacklistConditionIdGet) | **GET** /throttling/blacklist/{conditionId} | Retrieve a Blocking Condition
[**throttlingBlacklistGet**](BlacklistApi.md#throttlingBlacklistGet) | **GET** /throttling/blacklist | Get all blocking condtions
[**throttlingBlacklistPost**](BlacklistApi.md#throttlingBlacklistPost) | **POST** /throttling/blacklist | Add a Blocking condition


<a name="throttlingBlacklistConditionIdDelete"></a>
# **throttlingBlacklistConditionIdDelete**
> throttlingBlacklistConditionIdDelete(conditionId, ifMatch, ifUnmodifiedSince)

Delete a Blocking condition

Delete a Blocking condition 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlacklistApi;


BlacklistApi apiInstance = new BlacklistApi();
String conditionId = "conditionId_example"; // String | Blocking condition identifier  
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.throttlingBlacklistConditionIdDelete(conditionId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#throttlingBlacklistConditionIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conditionId** | **String**| Blocking condition identifier   |
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingBlacklistConditionIdGet"></a>
# **throttlingBlacklistConditionIdGet**
> BlockingCondition throttlingBlacklistConditionIdGet(conditionId, ifNoneMatch, ifModifiedSince)

Retrieve a Blocking Condition

Retrieve a Blocking Condition providing the condition Id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlacklistApi;


BlacklistApi apiInstance = new BlacklistApi();
String conditionId = "conditionId_example"; // String | Blocking condition identifier  
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    BlockingCondition result = apiInstance.throttlingBlacklistConditionIdGet(conditionId, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#throttlingBlacklistConditionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conditionId** | **String**| Blocking condition identifier   |
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**BlockingCondition**](BlockingCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingBlacklistGet"></a>
# **throttlingBlacklistGet**
> BlockingConditionList throttlingBlacklistGet(accept, ifNoneMatch, ifModifiedSince)

Get all blocking condtions

Get all blocking condtions 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlacklistApi;


BlacklistApi apiInstance = new BlacklistApi();
String accept = "JSON"; // String | Media types acceptable for the response. Default is JSON. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    BlockingConditionList result = apiInstance.throttlingBlacklistGet(accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#throttlingBlacklistGet");
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

[**BlockingConditionList**](BlockingConditionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="throttlingBlacklistPost"></a>
# **throttlingBlacklistPost**
> BlockingCondition throttlingBlacklistPost(body, contentType)

Add a Blocking condition

Add a Blocking condition 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlacklistApi;


BlacklistApi apiInstance = new BlacklistApi();
BlockingCondition body = new BlockingCondition(); // BlockingCondition | Blocking condition object that should to be added 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
try {
    BlockingCondition result = apiInstance.throttlingBlacklistPost(body, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlacklistApi#throttlingBlacklistPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockingCondition**](BlockingCondition.md)| Blocking condition object that should to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]

### Return type

[**BlockingCondition**](BlockingCondition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

