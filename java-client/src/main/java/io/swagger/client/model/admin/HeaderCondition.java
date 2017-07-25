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
 * HeaderCondition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-25T13:00:40.590Z")
public class HeaderCondition extends ThrottleCondition {
  @SerializedName("headerName")
  private String headerName = null;

  @SerializedName("headerValue")
  private String headerValue = null;

  public HeaderCondition headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * Get headerName
   * @return headerName
  **/
  @ApiModelProperty(value = "")
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }

  public HeaderCondition headerValue(String headerValue) {
    this.headerValue = headerValue;
    return this;
  }

   /**
   * Get headerValue
   * @return headerValue
  **/
  @ApiModelProperty(value = "")
  public String getHeaderValue() {
    return headerValue;
  }

  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderCondition headerCondition = (HeaderCondition) o;
    return Objects.equals(this.headerName, headerCondition.headerName) &&
        Objects.equals(this.headerValue, headerCondition.headerValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerName, headerValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderCondition {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
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

