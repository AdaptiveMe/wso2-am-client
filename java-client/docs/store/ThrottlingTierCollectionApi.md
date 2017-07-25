# ThrottlingTierCollectionApi

All URIs are relative to *https://apis.wso2.com/api/am/store/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tiersTierLevelGet**](ThrottlingTierCollectionApi.md#tiersTierLevelGet) | **GET** /tiers/{tierLevel} | Get available tiers 


<a name="tiersTierLevelGet"></a>
# **tiersTierLevelGet**
> List&lt;TierList&gt; tiersTierLevelGet(tierLevel, limit, offset, xWSO2Tenant, accept, ifNoneMatch)

Get available tiers 

This operation can be used to retrieve all the tiers available for the provided tier level. Tier level should be specified as a path parameter and should be one of &#x60;api&#x60; and &#x60;application&#x60;.  **NOTE**: * API tiers are the ones that is available during subscription of an application to an API. Hence they are also called subscription tiers and are same as the subscription policies in Admin REST API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ThrottlingTierCollectionApi;


ThrottlingTierCollectionApi apiInstance = new ThrottlingTierCollectionApi();
String tierLevel = "tierLevel_example"; // String | List API or Application type tiers. 
Integer limit = 25; // Integer | Maximum size of resource array to return. 
Integer offset = 0; // Integer | Starting point within the complete list of items qualified. 
String xWSO2Tenant = "xWSO2Tenant_example"; // String | For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from. 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
try {
    List<TierList> result = apiInstance.tiersTierLevelGet(tierLevel, limit, offset, xWSO2Tenant, accept, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThrottlingTierCollectionApi#tiersTierLevelGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tierLevel** | **String**| List API or Application type tiers.  | [enum: api, application]
 **limit** | **Integer**| Maximum size of resource array to return.  | [optional] [default to 25]
 **offset** | **Integer**| Starting point within the complete list of items qualified.  | [optional] [default to 0]
 **xWSO2Tenant** | **String**| For cross-tenant invocations, this is used to specify the tenant domain, where the resource need to be   retirieved from.  | [optional]
 **accept** | **String**| Media types acceptable for the response. Default is application/json.  | [optional] [default to application/json]
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]

### Return type

[**List&lt;TierList&gt;**](TierList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

