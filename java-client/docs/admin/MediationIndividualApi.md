# MediationIndividualApi

All URIs are relative to *https://apis.wso2.com/api/am/admin/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**policiesMediationMediationPolicyIdDelete**](MediationIndividualApi.md#policiesMediationMediationPolicyIdDelete) | **DELETE** /policies/mediation/{mediationPolicyId} | Delete an API
[**policiesMediationMediationPolicyIdGet**](MediationIndividualApi.md#policiesMediationMediationPolicyIdGet) | **GET** /policies/mediation/{mediationPolicyId} | Get a global mediation squence
[**policiesMediationMediationPolicyIdPut**](MediationIndividualApi.md#policiesMediationMediationPolicyIdPut) | **PUT** /policies/mediation/{mediationPolicyId} | Update an mediation policy


<a name="policiesMediationMediationPolicyIdDelete"></a>
# **policiesMediationMediationPolicyIdDelete**
> policiesMediationMediationPolicyIdDelete(mediationPolicyId, ifMatch, ifUnmodifiedSince)

Delete an API

This operation can be used to delete an existing API proving the Id of the API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MediationIndividualApi;


MediationIndividualApi apiInstance = new MediationIndividualApi();
String mediationPolicyId = "mediationPolicyId_example"; // String | Mediation policy Id 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.policiesMediationMediationPolicyIdDelete(mediationPolicyId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling MediationIndividualApi#policiesMediationMediationPolicyIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediationPolicyId** | **String**| Mediation policy Id  |
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="policiesMediationMediationPolicyIdGet"></a>
# **policiesMediationMediationPolicyIdGet**
> Mediation policiesMediationMediationPolicyIdGet(mediationPolicyId, accept, ifNoneMatch, ifModifiedSince)

Get a global mediation squence

This operation can be used to retrieve a particular global mediation policy. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
io.swagger.client.api.admin.MediationIndividualApi


MediationIndividualApi apiInstance = new MediationIndividualApi();
String mediationPolicyId = "mediationPolicyId_example"; // String | Mediation policy Id 
String accept = "JSON"; // String | Media types acceptable for the response. Default is JSON. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    Mediation result = apiInstance.policiesMediationMediationPolicyIdGet(mediationPolicyId, accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediationIndividualApi#policiesMediationMediationPolicyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediationPolicyId** | **String**| Mediation policy Id  |
 **accept** | **String**| Media types acceptable for the response. Default is JSON.  | [optional] [default to JSON]
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**Mediation**](Mediation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="policiesMediationMediationPolicyIdPut"></a>
# **policiesMediationMediationPolicyIdPut**
> Mediation policiesMediationMediationPolicyIdPut(mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince)

Update an mediation policy

This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MediationIndividualApi;


MediationIndividualApi apiInstance = new MediationIndividualApi();
String mediationPolicyId = "mediationPolicyId_example"; // String | Mediation policy Id 
Mediation body = new Mediation(); // Mediation | Mediation policy object that needs to be added 
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    Mediation result = apiInstance.policiesMediationMediationPolicyIdPut(mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediationIndividualApi#policiesMediationMediationPolicyIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediationPolicyId** | **String**| Mediation policy Id  |
 **body** | [**Mediation**](Mediation.md)| Mediation policy object that needs to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is JSON.  | [default to JSON]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**Mediation**](Mediation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

