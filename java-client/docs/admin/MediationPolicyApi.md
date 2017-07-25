# MediationPolicyApi

All URIs are relative to *https://apis.wso2.com/api/am/admin/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**policiesMediationPost**](MediationPolicyApi.md#policiesMediationPost) | **POST** /policies/mediation | Upload a global mediation policy


<a name="policiesMediationPost"></a>
# **policiesMediationPost**
> Mediation policiesMediationPost(body, contentType, ifMatch, ifUnmodifiedSince)

Upload a global mediation policy

This operation can be used to upload a global mediatoin policy to the registry. The file to be uploaded should be given as a form data parameter &#x60;file&#x60;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MediationPolicyApi;


MediationPolicyApi apiInstance = new MediationPolicyApi();
Mediation body = new Mediation(); // Mediation | mediation policy to upload
String contentType = "JSON"; // String | Media type of the entity in the body. Default is JSON. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    Mediation result = apiInstance.policiesMediationPost(body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediationPolicyApi#policiesMediationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Mediation**](Mediation.md)| mediation policy to upload |
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

