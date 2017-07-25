
# ApplicationKeyGenerateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyType** | [**KeyTypeEnum**](#KeyTypeEnum) |  | 
**validityTime** | **String** |  | 
**callbackUrl** | **String** | Callback URL |  [optional]
**accessAllowDomains** | **List&lt;String&gt;** | Allowed domains for the access token | 
**scopes** | **List&lt;String&gt;** | Allowed scopes for the access token |  [optional]


<a name="KeyTypeEnum"></a>
## Enum: KeyTypeEnum
Name | Value
---- | -----
PRODUCTION | &quot;PRODUCTION&quot;
SANDBOX | &quot;SANDBOX&quot;



