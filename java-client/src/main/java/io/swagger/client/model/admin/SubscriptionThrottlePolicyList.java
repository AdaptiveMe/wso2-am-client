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

import java.util.ArrayList;
import java.util.List;

/**
 * SubscriptionThrottlePolicyList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-25T13:00:40.590Z")
public class SubscriptionThrottlePolicyList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("list")
  private List<SubscriptionThrottlePolicy> list = null;

  public SubscriptionThrottlePolicyList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Subscription throttle policies returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of Subscription throttle policies returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SubscriptionThrottlePolicyList list(List<SubscriptionThrottlePolicy> list) {
    this.list = list;
    return this;
  }

  public SubscriptionThrottlePolicyList addListItem(SubscriptionThrottlePolicy listItem) {
    if (this.list == null) {
      this.list = new ArrayList<SubscriptionThrottlePolicy>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<SubscriptionThrottlePolicy> getList() {
    return list;
  }

  public void setList(List<SubscriptionThrottlePolicy> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionThrottlePolicyList subscriptionThrottlePolicyList = (SubscriptionThrottlePolicyList) o;
    return Objects.equals(this.count, subscriptionThrottlePolicyList.count) &&
        Objects.equals(this.list, subscriptionThrottlePolicyList.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionThrottlePolicyList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
