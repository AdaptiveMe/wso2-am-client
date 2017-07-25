# APIIndividualApi

All URIs are relative to *https://apis.wso2.com/api/am/publisher/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apisApiIdDelete**](APIIndividualApi.md#apisApiIdDelete) | **DELETE** /apis/{apiId} | Delete an API
[**apisApiIdGet**](APIIndividualApi.md#apisApiIdGet) | **GET** /apis/{apiId} | Get details of an API
[**apisApiIdPoliciesMediationGet**](APIIndividualApi.md#apisApiIdPoliciesMediationGet) | **GET** /apis/{apiId}/policies/mediation | Retrieve/Search APIs 
[**apisApiIdPoliciesMediationMediationPolicyIdDelete**](APIIndividualApi.md#apisApiIdPoliciesMediationMediationPolicyIdDelete) | **DELETE** /apis/{apiId}/policies/mediation/{mediationPolicyId} | Delete an API
[**apisApiIdPoliciesMediationMediationPolicyIdGet**](APIIndividualApi.md#apisApiIdPoliciesMediationMediationPolicyIdGet) | **GET** /apis/{apiId}/policies/mediation/{mediationPolicyId} | Get a global mediation squence
[**apisApiIdPoliciesMediationMediationPolicyIdPut**](APIIndividualApi.md#apisApiIdPoliciesMediationMediationPolicyIdPut) | **PUT** /apis/{apiId}/policies/mediation/{mediationPolicyId} | Update an mediation policy
[**apisApiIdPoliciesMediationPost**](APIIndividualApi.md#apisApiIdPoliciesMediationPost) | **POST** /apis/{apiId}/policies/mediation | Upload a global mediation policy
[**apisApiIdPut**](APIIndividualApi.md#apisApiIdPut) | **PUT** /apis/{apiId} | Update an API
[**apisApiIdSwaggerGet**](APIIndividualApi.md#apisApiIdSwaggerGet) | **GET** /apis/{apiId}/swagger | Get swagger definition
[**apisApiIdSwaggerPut**](APIIndividualApi.md#apisApiIdSwaggerPut) | **PUT** /apis/{apiId}/swagger | Update swagger definition
[**apisApiIdThumbnailGet**](APIIndividualApi.md#apisApiIdThumbnailGet) | **GET** /apis/{apiId}/thumbnail | Get thumbnail image
[**apisApiIdThumbnailPost**](APIIndividualApi.md#apisApiIdThumbnailPost) | **POST** /apis/{apiId}/thumbnail | Upload a thumbnail image
[**apisChangeLifecyclePost**](APIIndividualApi.md#apisChangeLifecyclePost) | **POST** /apis/change-lifecycle | Change API Status
[**apisCopyApiPost**](APIIndividualApi.md#apisCopyApiPost) | **POST** /apis/copy-api | Create a new API version


<a name="apisApiIdDelete"></a>
# **apisApiIdDelete**
> apisApiIdDelete(apiId, ifMatch, ifUnmodifiedSince)

Delete an API

This operation can be used to delete an existing API proving the Id of the API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.apisApiIdDelete(apiId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdGet"></a>
# **apisApiIdGet**
> API apisApiIdGet(apiId, accept, ifNoneMatch, ifModifiedSince)

Get details of an API

Using this operation, you can retrieve complete details of a single API. You need to provide the Id of the API to retrive it. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    API result = apiInstance.apisApiIdGet(apiId, accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdGet");
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

[**API**](API.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdPoliciesMediationGet"></a>
# **apisApiIdPoliciesMediationGet**
> MediationList apisApiIdPoliciesMediationGet(apiId, limit, offset, query, accept, ifNoneMatch)

Retrieve/Search APIs 

This operation provides you a list of available APIs qualifying under a given search condition.  Each retrieved API is represented with a minimal amount of attributes. If you want to get complete details of an API, you need to use **Get details of an API** operation. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
Integer limit = 25; // Integer | Maximum size of resource array to return. 
Integer offset = 0; // Integer | Starting point within the complete list of items qualified. 
String query = "query_example"; // String | **Search condition**.  You can search in attributes by using an **\"<attribute>:\"** modifier.  Eg. \"provider:wso2\" will match an API if the provider of the API is exactly \"wso2\".  Additionally you can use wildcards.  Eg. \"provider:wso2*\" will match an API if the provider of the API starts with \"wso2\".  Supported attribute modifiers are [**version, context, status, description, subcontext, doc, provider**]  If no advanced attribute modifier has been specified, search will match the given query string against API Name. 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
try {
    MediationList result = apiInstance.apisApiIdPoliciesMediationGet(apiId, limit, offset, query, accept, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdPoliciesMediationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **limit** | **Integer**| Maximum size of resource array to return.  | [optional] [default to 25]
 **offset** | **Integer**| Starting point within the complete list of items qualified.  | [optional] [default to 0]
 **query** | **String**| **Search condition**.  You can search in attributes by using an **\&quot;&lt;attribute&gt;:\&quot;** modifier.  Eg. \&quot;provider:wso2\&quot; will match an API if the provider of the API is exactly \&quot;wso2\&quot;.  Additionally you can use wildcards.  Eg. \&quot;provider:wso2*\&quot; will match an API if the provider of the API starts with \&quot;wso2\&quot;.  Supported attribute modifiers are [**version, context, status, description, subcontext, doc, provider**]  If no advanced attribute modifier has been specified, search will match the given query string against API Name.  | [optional]
 **accept** | **String**| Media types acceptable for the response. Default is application/json.  | [optional] [default to application/json]
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]

### Return type

[**MediationList**](MediationList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdPoliciesMediationMediationPolicyIdDelete"></a>
# **apisApiIdPoliciesMediationMediationPolicyIdDelete**
> apisApiIdPoliciesMediationMediationPolicyIdDelete(apiId, mediationPolicyId, ifMatch, ifUnmodifiedSince)

Delete an API

This operation can be used to delete an existing API proving the Id of the API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String mediationPolicyId = "mediationPolicyId_example"; // String | Mediation policy Id 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.apisApiIdPoliciesMediationMediationPolicyIdDelete(apiId, mediationPolicyId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdPoliciesMediationMediationPolicyIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
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

<a name="apisApiIdPoliciesMediationMediationPolicyIdGet"></a>
# **apisApiIdPoliciesMediationMediationPolicyIdGet**
> Mediation apisApiIdPoliciesMediationMediationPolicyIdGet(apiId, mediationPolicyId, accept, ifNoneMatch, ifModifiedSince)

Get a global mediation squence

This operation can be used to retrieve a particular global mediation policy. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String mediationPolicyId = "mediationPolicyId_example"; // String | Mediation policy Id 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    Mediation result = apiInstance.apisApiIdPoliciesMediationMediationPolicyIdGet(apiId, mediationPolicyId, accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdPoliciesMediationMediationPolicyIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **mediationPolicyId** | **String**| Mediation policy Id  |
 **accept** | **String**| Media types acceptable for the response. Default is application/json.  | [optional] [default to application/json]
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**Mediation**](Mediation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdPoliciesMediationMediationPolicyIdPut"></a>
# **apisApiIdPoliciesMediationMediationPolicyIdPut**
> Mediation apisApiIdPoliciesMediationMediationPolicyIdPut(apiId, mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince)

Update an mediation policy

This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String mediationPolicyId = "mediationPolicyId_example"; // String | Mediation policy Id 
Mediation body = new Mediation(); // Mediation | Mediation policy object that needs to be added 
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    Mediation result = apiInstance.apisApiIdPoliciesMediationMediationPolicyIdPut(apiId, mediationPolicyId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdPoliciesMediationMediationPolicyIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **mediationPolicyId** | **String**| Mediation policy Id  |
 **body** | [**Mediation**](Mediation.md)| Mediation policy object that needs to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**Mediation**](Mediation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdPoliciesMediationPost"></a>
# **apisApiIdPoliciesMediationPost**
> Mediation apisApiIdPoliciesMediationPost(body, apiId, contentType, ifMatch, ifUnmodifiedSince)

Upload a global mediation policy

This operation can be used to upload a global mediatoin policy to the registry. The file to be uploaded should be given as a form data parameter &#x60;file&#x60;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
Mediation body = new Mediation(); // Mediation | mediation policy to upload
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    Mediation result = apiInstance.apisApiIdPoliciesMediationPost(body, apiId, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdPoliciesMediationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Mediation**](Mediation.md)| mediation policy to upload |
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**Mediation**](Mediation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdPut"></a>
# **apisApiIdPut**
> API apisApiIdPut(apiId, body, contentType, ifMatch, ifUnmodifiedSince)

Update an API

This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
API body = new API(); // API | API object that needs to be added 
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    API result = apiInstance.apisApiIdPut(apiId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **body** | [**API**](API.md)| API object that needs to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**API**](API.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdSwaggerGet"></a>
# **apisApiIdSwaggerGet**
> apisApiIdSwaggerGet(apiId, accept, ifNoneMatch, ifModifiedSince)

Get swagger definition

This operation can be used to retrieve the swagger definition of an API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    apiInstance.apisApiIdSwaggerGet(apiId, accept, ifNoneMatch, ifModifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdSwaggerGet");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdSwaggerPut"></a>
# **apisApiIdSwaggerPut**
> apisApiIdSwaggerPut(apiId, apiDefinition, contentType, ifMatch, ifUnmodifiedSince)

Update swagger definition

This operation can be used to update the swagger definition of an existing API. Swagger definition to be updated is passed as a form data parameter &#x60;apiDefinition&#x60;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String apiDefinition = "apiDefinition_example"; // String | Swagger definition of the API
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.apisApiIdSwaggerPut(apiId, apiDefinition, contentType, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdSwaggerPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **apiDefinition** | **String**| Swagger definition of the API |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="apisApiIdThumbnailGet"></a>
# **apisApiIdThumbnailGet**
> apisApiIdThumbnailGet(apiId, accept, ifNoneMatch, ifModifiedSince)

Get thumbnail image

This operation can be used to download a thumbnail image of an API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    apiInstance.apisApiIdThumbnailGet(apiId, accept, ifNoneMatch, ifModifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdThumbnailGet");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdThumbnailPost"></a>
# **apisApiIdThumbnailPost**
> FileInfo apisApiIdThumbnailPost(apiId, file, contentType, ifMatch, ifUnmodifiedSince)

Upload a thumbnail image

This operation can be used to upload a thumbnail image of an API. The thumbnail to be uploaded should be given as a form data parameter &#x60;file&#x60;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
File file = new File("/path/to/file.txt"); // File | Image to upload
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    FileInfo result = apiInstance.apisApiIdThumbnailPost(apiId, file, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisApiIdThumbnailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **file** | **File**| Image to upload |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**FileInfo**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="apisChangeLifecyclePost"></a>
# **apisChangeLifecyclePost**
> apisChangeLifecyclePost(action, apiId, lifecycleChecklist, ifMatch, ifUnmodifiedSince)

Change API Status

This operation is used to change the lifecycle of an API. Eg: Publish an API which is in &#x60;CREATED&#x60; state. In order to change the lifecycle, we need to provide the lifecycle &#x60;action&#x60; as a query parameter.  For example, to Publish an API, &#x60;action&#x60; should be &#x60;Publish&#x60;.  Some actions supports providing additional paramters which should be provided as &#x60;lifecycleChecklist&#x60; parameter. Please see parameters table for more information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String action = "action_example"; // String | The action to demote or promote the state of the API.  Supported actions are [ **Publish, Deploy as a Prototype, Demote to Created, Demote to Prototyped, Block, Deprecate, Re-Publish, Retire **] 
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API I. Should be formatted as **provider-name-version**. 
String lifecycleChecklist = "lifecycleChecklist_example"; // String |  You can specify additional checklist items by using an **\"attribute:\"** modifier.  Eg: \"Deprecate Old Versions:true\" will deprecate older versions of a particular API when it is promoted to Published state from Created state. Multiple checklist items can be given in \"attribute1:true, attribute2:false\" format.  Supported checklist items are as follows. 1. **Deprecate Old Versions**: Setting this to true will deprecate older versions of a particular API when it is promoted to Published state from Created state. 2. **Require Re-Subscription**: If you set this to true, users need to re subscribe to the API although they may have subscribed to an older version. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.apisChangeLifecyclePost(action, apiId, lifecycleChecklist, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisChangeLifecyclePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| The action to demote or promote the state of the API.  Supported actions are [ **Publish, Deploy as a Prototype, Demote to Created, Demote to Prototyped, Block, Deprecate, Re-Publish, Retire **]  | [enum: Publish, Deploy as a Prototype, Demote to Created, Demote to Prototyped, Block, Deprecate, Re-Publish, Retire]
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API I. Should be formatted as **provider-name-version**.  |
 **lifecycleChecklist** | **String**|  You can specify additional checklist items by using an **\&quot;attribute:\&quot;** modifier.  Eg: \&quot;Deprecate Old Versions:true\&quot; will deprecate older versions of a particular API when it is promoted to Published state from Created state. Multiple checklist items can be given in \&quot;attribute1:true, attribute2:false\&quot; format.  Supported checklist items are as follows. 1. **Deprecate Old Versions**: Setting this to true will deprecate older versions of a particular API when it is promoted to Published state from Created state. 2. **Require Re-Subscription**: If you set this to true, users need to re subscribe to the API although they may have subscribed to an older version.  | [optional]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisCopyApiPost"></a>
# **apisCopyApiPost**
> apisCopyApiPost(newVersion, apiId)

Create a new API version

This operation can be used to create a new version of an existing API. The new version is specified as &#x60;newVersion&#x60; query parameter. New API will be in &#x60;CREATED&#x60; state. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.APIIndividualApi;


APIIndividualApi apiInstance = new APIIndividualApi();
String newVersion = "newVersion_example"; // String | Version of the new API.
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API I. Should be formatted as **provider-name-version**. 
try {
    apiInstance.apisCopyApiPost(newVersion, apiId);
} catch (ApiException e) {
    System.err.println("Exception when calling APIIndividualApi#apisCopyApiPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newVersion** | **String**| Version of the new API. |
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API I. Should be formatted as **provider-name-version**.  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

