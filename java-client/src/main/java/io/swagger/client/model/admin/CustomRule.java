/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: 0.11.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.admin;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-25T13:00:40.590Z")
public class CustomRule extends ThrottlePolicy {
  @SerializedName("siddhiQuery")
  private String siddhiQuery = null;

  @SerializedName("keyTemplate")
  private String keyTemplate = null;

  public CustomRule siddhiQuery(String siddhiQuery) {
    this.siddhiQuery = siddhiQuery;
    return this;
  }

   /**
   * Get siddhiQuery
   * @return siddhiQuery
  **/
  @ApiModelProperty(value = "")
  public String getSiddhiQuery() {
    return siddhiQuery;
  }

  public void setSiddhiQuery(String siddhiQuery) {
    this.siddhiQuery = siddhiQuery;
  }

  public CustomRule keyTemplate(String keyTemplate) {
    this.keyTemplate = keyTemplate;
    return this;
  }

   /**
   * Get keyTemplate
   * @return keyTemplate
  **/
  @ApiModelProperty(value = "")
  public String getKeyTemplate() {
    return keyTemplate;
  }

  public void setKeyTemplate(String keyTemplate) {
    this.keyTemplate = keyTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRule customRule = (CustomRule) o;
    return Objects.equals(this.siddhiQuery, customRule.siddhiQuery) &&
        Objects.equals(this.keyTemplate, customRule.keyTemplate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siddhiQuery, keyTemplate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    siddhiQuery: ").append(toIndentedString(siddhiQuery)).append("\n");
    sb.append("    keyTemplate: ").append(toIndentedString(keyTemplate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

