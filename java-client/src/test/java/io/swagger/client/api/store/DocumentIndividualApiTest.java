/*
 * WSO2 API Manager - Store
 * This specifies a **RESTful API** for WSO2 **API Manager** - Store.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.store/src/main/resources/store-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.store;

import io.swagger.client.ApiException;
import io.swagger.client.api.store.DocumentIndividualApi;
import io.swagger.client.model.store.Document;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for DocumentIndividualApi
 */
@Ignore
public class DocumentIndividualApiTest {

    private final DocumentIndividualApi api = new DocumentIndividualApi();

    
    /**
     * Get the content of an API document 
     *
     * This operation can be used to retrive the content of an API&#39;s document.  The document can be of 3 types. In each cases responses are different.  1. **Inline type**:    The content of the document will be retrieved in &#x60;text/plain&#x60; content type 2. **FILE type**:     The file will be downloaded with the related content type (eg. &#x60;application/pdf&#x60;) 3. **URL type**:     The client will recieve the URL of the document as the Location header with the response with - &#x60;303 See Other&#x60;  &#x60;X-WSO2-Tenant&#x60; header can be used to retrive the content of a document of an API that belongs to a different tenant domain. If not specified super tenant will be used. If Authorization header is present in the request, the user&#39;s tenant associated with the access token will be used.  **NOTE:** * This operation does not require an Authorization header by default. But in order to see a restricted API&#39;s document content, you need to provide Authorization header.         
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdDocumentsDocumentIdContentGetTest() throws ApiException {
        String apiId = null;
        String documentId = null;
        String xWSO2Tenant = null;
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        api.apisApiIdDocumentsDocumentIdContentGet(apiId, documentId, xWSO2Tenant, accept, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }
    
    /**
     * Get a document of an API 
     *
     * This operation can be used to retrieve a particular document&#39;s metadata associated with an API.  &#x60;X-WSO2-Tenant&#x60; header can be used to retrive a document of an API that belongs to a different tenant domain. If not specified super tenant will be used. If Authorization header is present in the request, the user&#39;s tenant associated with the access token will be used.  **NOTE:** * This operation does not require an Authorization header by default. But in order to see a restricted API&#39;s document, you need to provide Authorization header.         
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apisApiIdDocumentsDocumentIdGetTest() throws ApiException {
        String apiId = null;
        String documentId = null;
        String xWSO2Tenant = null;
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        Document response = api.apisApiIdDocumentsDocumentIdGet(apiId, documentId, xWSO2Tenant, accept, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }
    
}
