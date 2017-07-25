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
 * RequestCountLimit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-25T13:00:40.590Z")
public class RequestCountLimit extends ThrottleLimit {
  @SerializedName("requestCount")
  private Long requestCount = 0l;

  public RequestCountLimit requestCount(Long requestCount) {
    this.requestCount = requestCount;
    return this;
  }

   /**
   * Get requestCount
   * @return requestCount
  **/
  @ApiModelProperty(value = "")
  public Long getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Long requestCount) {
    this.requestCount = requestCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCountLimit requestCountLimit = (RequestCountLimit) o;
    return Objects.equals(this.requestCount, requestCountLimit.requestCount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestCount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCountLimit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
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

