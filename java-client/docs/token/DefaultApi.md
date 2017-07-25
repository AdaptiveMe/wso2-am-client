# DefaultApi

All URIs are relative to *http://localhost:8243*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGrant**](DefaultApi.md#getGrant) | **GET** /token | Client Credentials, Password &amp; Refresh Grant


<a name="getGrant"></a>
# **getGrant**
> Tokengrant getGrant(grantType, username, password)

Client Credentials, Password &amp; Refresh Grant

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
io.swaggeio.swagger.client.api.token.DefaultApipiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: userKeySecret
HttpBasicAuth userKeySecret = (HttpBasicAuth) defaultClient.getAuthentication("userKeySecret");
userKeySecret.setUsername("YOUR USERNAME");
userKeySecret.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String grantType = "grantType_example"; // String | 
String username = "username_example"; // String | 
String password = "password_example"; // String | 
try {
    Tokengrant result = apiInstance.getGrant(grantType, username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getGrant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  | [enum: password, client_credentials, refresh_token]
 **username** | **String**|  |
 **password** | **String**|  |

### Return type

[**Tokengrant**](Tokengrant.md)

### Authorization

[userKeySecret](../../README.md#userKeySecret)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

