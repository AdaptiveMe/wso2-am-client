# WsdlIndividualApi

All URIs are relative to *https://apis.wso2.com/api/am/publisher/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apisApiIdWsdlGet**](WsdlIndividualApi.md#apisApiIdWsdlGet) | **GET** /apis/{apiId}/wsdl | Get a wsdl correspond to a API
[**apisApiIdWsdlPost**](WsdlIndividualApi.md#apisApiIdWsdlPost) | **POST** /apis/{apiId}/wsdl | Add wsdl


<a name="apisApiIdWsdlGet"></a>
# **apisApiIdWsdlGet**
> Wsdl apisApiIdWsdlGet(apiId, accept, ifNoneMatch, ifModifiedSince)

Get a wsdl correspond to a API

This operation can be used to retrieve a particular global mediation policy. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WsdlIndividualApi;


WsdlIndividualApi apiInstance = new WsdlIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    Wsdl result = apiInstance.apisApiIdWsdlGet(apiId, accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WsdlIndividualApi#apisApiIdWsdlGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **accept** | **String**| Media types acceptable for the response. Default is application/json.  | [optional] [default to application/json]
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**Wsdl**](Wsdl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdWsdlPost"></a>
# **apisApiIdWsdlPost**
> apisApiIdWsdlPost(apiId, body, contentType, ifMatch, ifUnmodifiedSince)

Add wsdl

This operation can be used to add a wsdl to an existing API. wsdl definition to be updated is passed as a form data parameter &#x60;wsdlDefinition&#x60;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WsdlIndividualApi;


WsdlIndividualApi apiInstance = new WsdlIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
Wsdl body = new Wsdl(); // Wsdl | DTO including WSDL definition that needs to be added 
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.apisApiIdWsdlPost(apiId, body, contentType, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling WsdlIndividualApi#apisApiIdWsdlPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **body** | [**Wsdl**](Wsdl.md)| DTO including WSDL definition that needs to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

