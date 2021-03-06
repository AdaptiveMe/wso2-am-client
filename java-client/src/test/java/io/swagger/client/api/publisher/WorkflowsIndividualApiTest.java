/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api.publisher;

import io.swagger.client.ApiException;
import io.swagger.client.model.publisher.Workflow;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for WorkflowsIndividualApi
 */
@Ignore
public class WorkflowsIndividualApiTest {

    private final WorkflowsIndividualApi api = new WorkflowsIndividualApi();

    
    /**
     * Update workflow status
     *
     * This operation can be used to approve or reject a workflow task. . 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void workflowsUpdateWorkflowStatusPostTest() throws ApiException {
        String workflowReferenceId = null;
        Workflow body = null;
        Workflow response = api.workflowsUpdateWorkflowStatusPost(workflowReferenceId, body);

        // TODO: test validations
    }
    
}
