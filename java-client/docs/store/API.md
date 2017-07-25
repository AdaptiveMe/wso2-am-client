
# API

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID of the api registry artifact  |  [optional]
**name** | **String** |  | 
**description** | **String** |  |  [optional]
**context** | **String** |  | 
**version** | **String** |  | 
**provider** | **String** | If the provider value is not given user invoking the api will be used as the provider.  | 
**apiDefinition** | **String** | Swagger definition of the API which contains details about URI templates and scopes  | 
**wsdlUri** | **String** | WSDL URL if the API is based on a WSDL endpoint  |  [optional]
**status** | **String** |  | 
**isDefaultVersion** | **Boolean** |  |  [optional]
**transport** | **List&lt;String&gt;** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**tiers** | **List&lt;String&gt;** |  |  [optional]
**thumbnailUrl** | **String** |  |  [optional]
**endpointURLs** | [**List&lt;APIEndpointURLs&gt;**](APIEndpointURLs.md) |  |  [optional]
**businessInformation** | [**APIBusinessInformation**](APIBusinessInformation.md) |  |  [optional]



