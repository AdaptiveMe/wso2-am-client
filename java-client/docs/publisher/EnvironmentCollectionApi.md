# EnvironmentCollectionApi

All URIs are relative to *https://apis.wso2.com/api/am/publisher/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**environmentsGet**](EnvironmentCollectionApi.md#environmentsGet) | **GET** /environments | Get all gateway environments


<a name="environmentsGet"></a>
# **environmentsGet**
> EnvironmentList environmentsGet(apiId)

Get all gateway environments

This operation can be used to retrieve the list of gateway environments available. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EnvironmentCollectionApi;


EnvironmentCollectionApi apiInstance = new EnvironmentCollectionApi();
String apiId = "apiId_example"; // String | Will return environment list for the provided API. 
try {
    EnvironmentList result = apiInstance.environmentsGet(apiId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentCollectionApi#environmentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| Will return environment list for the provided API.  | [optional]

### Return type

[**EnvironmentList**](EnvironmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

