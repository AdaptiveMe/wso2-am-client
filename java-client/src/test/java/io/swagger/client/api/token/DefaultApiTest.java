/*
 * WSO API Manager Token API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.10.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.token;

import io.swagger.client.ApiException;
import io.swagger.client.model.token.Tokengrant;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Client Credentials, Password &amp; Refresh Grant
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGrantTest() throws ApiException {
        String grantType = null;
        String username = null;
        String password = null;
        Tokengrant response = api.getGrant(grantType, username, password);

        // TODO: test validations
    }
    
}
