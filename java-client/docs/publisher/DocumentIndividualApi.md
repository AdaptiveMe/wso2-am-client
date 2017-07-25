# DocumentIndividualApi

All URIs are relative to *https://apis.wso2.com/api/am/publisher/v0.11*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apisApiIdDocumentsDocumentIdContentGet**](DocumentIndividualApi.md#apisApiIdDocumentsDocumentIdContentGet) | **GET** /apis/{apiId}/documents/{documentId}/content | Get the content of an API document
[**apisApiIdDocumentsDocumentIdContentPost**](DocumentIndividualApi.md#apisApiIdDocumentsDocumentIdContentPost) | **POST** /apis/{apiId}/documents/{documentId}/content | Upload the content of an API document
[**apisApiIdDocumentsDocumentIdDelete**](DocumentIndividualApi.md#apisApiIdDocumentsDocumentIdDelete) | **DELETE** /apis/{apiId}/documents/{documentId} | Delete a document of an API
[**apisApiIdDocumentsDocumentIdGet**](DocumentIndividualApi.md#apisApiIdDocumentsDocumentIdGet) | **GET** /apis/{apiId}/documents/{documentId} | Get a document of an API
[**apisApiIdDocumentsDocumentIdPut**](DocumentIndividualApi.md#apisApiIdDocumentsDocumentIdPut) | **PUT** /apis/{apiId}/documents/{documentId} | Update a document of an API


<a name="apisApiIdDocumentsDocumentIdContentGet"></a>
# **apisApiIdDocumentsDocumentIdContentGet**
> apisApiIdDocumentsDocumentIdContentGet(apiId, documentId, accept, ifNoneMatch, ifModifiedSince)

Get the content of an API document

This operation can be used to retrive the content of an API&#39;s document.  The document can be of 3 types. In each cases responses are different.  1. **Inline type**:    The content of the document will be retrieved in &#x60;text/plain&#x60; content type 2. **FILE type**:     The file will be downloaded with the related content type (eg. &#x60;application/pdf&#x60;) 3. **URL type**:     The client will recieve the URL of the document as the Location header with the response with - &#x60;303 See Other&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentIndividualApi;


DocumentIndividualApi apiInstance = new DocumentIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String documentId = "documentId_example"; // String | Document Identifier 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    apiInstance.apisApiIdDocumentsDocumentIdContentGet(apiId, documentId, accept, ifNoneMatch, ifModifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentIndividualApi#apisApiIdDocumentsDocumentIdContentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **documentId** | **String**| Document Identifier  |
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

<a name="apisApiIdDocumentsDocumentIdContentPost"></a>
# **apisApiIdDocumentsDocumentIdContentPost**
> Document apisApiIdDocumentsDocumentIdContentPost(apiId, documentId, contentType, file, inlineContent, ifMatch, ifUnmodifiedSince)

Upload the content of an API document

Thid operation can be used to upload a file or add inline content to an API document.  **IMPORTANT:** * Either **file** or **inlineContent** form data parameters should be specified at one time. * Document&#39;s source type should be **FILE** in order to upload a file to the document using **file** parameter. * Document&#39;s source type should be **INLINE** in order to add inline content to the document using **inlineContent** parameter. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentIndividualApi;


DocumentIndividualApi apiInstance = new DocumentIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String documentId = "documentId_example"; // String | Document Identifier 
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
File file = new File("/path/to/file.txt"); // File | Document to upload
String inlineContent = "inlineContent_example"; // String | Inline content of the document
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    Document result = apiInstance.apisApiIdDocumentsDocumentIdContentPost(apiId, documentId, contentType, file, inlineContent, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentIndividualApi#apisApiIdDocumentsDocumentIdContentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **documentId** | **String**| Document Identifier  |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **file** | **File**| Document to upload | [optional]
 **inlineContent** | **String**| Inline content of the document | [optional]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="apisApiIdDocumentsDocumentIdDelete"></a>
# **apisApiIdDocumentsDocumentIdDelete**
> apisApiIdDocumentsDocumentIdDelete(apiId, documentId, ifMatch, ifUnmodifiedSince)

Delete a document of an API

This operation can be used to delete a document associated with an API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentIndividualApi;


DocumentIndividualApi apiInstance = new DocumentIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String documentId = "documentId_example"; // String | Document Identifier 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    apiInstance.apisApiIdDocumentsDocumentIdDelete(apiId, documentId, ifMatch, ifUnmodifiedSince);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentIndividualApi#apisApiIdDocumentsDocumentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **documentId** | **String**| Document Identifier  |
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdDocumentsDocumentIdGet"></a>
# **apisApiIdDocumentsDocumentIdGet**
> Document apisApiIdDocumentsDocumentIdGet(apiId, documentId, accept, ifNoneMatch, ifModifiedSince)

Get a document of an API

This operation can be used to retrieve a particular document&#39;s metadata associated with an API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentIndividualApi;


DocumentIndividualApi apiInstance = new DocumentIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String documentId = "documentId_example"; // String | Document Identifier 
String accept = "application/json"; // String | Media types acceptable for the response. Default is application/json. 
String ifNoneMatch = "ifNoneMatch_example"; // String | Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec. 
String ifModifiedSince = "ifModifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource. 
try {
    Document result = apiInstance.apisApiIdDocumentsDocumentIdGet(apiId, documentId, accept, ifNoneMatch, ifModifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentIndividualApi#apisApiIdDocumentsDocumentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **documentId** | **String**| Document Identifier  |
 **accept** | **String**| Media types acceptable for the response. Default is application/json.  | [optional] [default to application/json]
 **ifNoneMatch** | **String**| Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  | [optional]
 **ifModifiedSince** | **String**| Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  | [optional]

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apisApiIdDocumentsDocumentIdPut"></a>
# **apisApiIdDocumentsDocumentIdPut**
> Document apisApiIdDocumentsDocumentIdPut(apiId, documentId, body, contentType, ifMatch, ifUnmodifiedSince)

Update a document of an API

This operation can be used to update metadata of an API&#39;s document. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentIndividualApi;


DocumentIndividualApi apiInstance = new DocumentIndividualApi();
String apiId = "apiId_example"; // String | **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**. 
String documentId = "documentId_example"; // String | Document Identifier 
Document body = new Document(); // Document | Document object that needs to be added 
String contentType = "application/json"; // String | Media type of the entity in the body. Default is application/json. 
String ifMatch = "ifMatch_example"; // String | Validator for conditional requests; based on ETag. 
String ifUnmodifiedSince = "ifUnmodifiedSince_example"; // String | Validator for conditional requests; based on Last Modified header. 
try {
    Document result = apiInstance.apisApiIdDocumentsDocumentIdPut(apiId, documentId, body, contentType, ifMatch, ifUnmodifiedSince);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentIndividualApi#apisApiIdDocumentsDocumentIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiId** | **String**| **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  |
 **documentId** | **String**| Document Identifier  |
 **body** | [**Document**](Document.md)| Document object that needs to be added  |
 **contentType** | **String**| Media type of the entity in the body. Default is application/json.  | [default to application/json]
 **ifMatch** | **String**| Validator for conditional requests; based on ETag.  | [optional]
 **ifUnmodifiedSince** | **String**| Validator for conditional requests; based on Last Modified header.  | [optional]

### Return type

[**Document**](Document.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

