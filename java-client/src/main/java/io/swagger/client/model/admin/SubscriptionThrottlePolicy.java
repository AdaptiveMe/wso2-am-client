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
 * SubscriptionThrottlePolicy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-25T13:00:40.590Z")
public class SubscriptionThrottlePolicy extends ThrottlePolicy {
  @SerializedName("defaultLimit")
  private ThrottleLimit defaultLimit = null;

  @SerializedName("rateLimitCount")
  private Integer rateLimitCount = null;

  @SerializedName("rateLimitTimeUnit")
  private String rateLimitTimeUnit = null;

  @SerializedName("customAttributes")
  private List<CustomAttribute> customAttributes = null;

  @SerializedName("stopOnQuotaReach")
  private Boolean stopOnQuotaReach = false;

  @SerializedName("billingPlan")
  private String billingPlan = null;

  public SubscriptionThrottlePolicy defaultLimit(ThrottleLimit defaultLimit) {
    this.defaultLimit = defaultLimit;
    return this;
  }

   /**
   * Get defaultLimit
   * @return defaultLimit
  **/
  @ApiModelProperty(value = "")
  public ThrottleLimit getDefaultLimit() {
    return defaultLimit;
  }

  public void setDefaultLimit(ThrottleLimit defaultLimit) {
    this.defaultLimit = defaultLimit;
  }

  public SubscriptionThrottlePolicy rateLimitCount(Integer rateLimitCount) {
    this.rateLimitCount = rateLimitCount;
    return this;
  }

   /**
   * Get rateLimitCount
   * @return rateLimitCount
  **/
  @ApiModelProperty(value = "")
  public Integer getRateLimitCount() {
    return rateLimitCount;
  }

  public void setRateLimitCount(Integer rateLimitCount) {
    this.rateLimitCount = rateLimitCount;
  }

  public SubscriptionThrottlePolicy rateLimitTimeUnit(String rateLimitTimeUnit) {
    this.rateLimitTimeUnit = rateLimitTimeUnit;
    return this;
  }

   /**
   * Get rateLimitTimeUnit
   * @return rateLimitTimeUnit
  **/
  @ApiModelProperty(value = "")
  public String getRateLimitTimeUnit() {
    return rateLimitTimeUnit;
  }

  public void setRateLimitTimeUnit(String rateLimitTimeUnit) {
    this.rateLimitTimeUnit = rateLimitTimeUnit;
  }

  public SubscriptionThrottlePolicy customAttributes(List<CustomAttribute> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public SubscriptionThrottlePolicy addCustomAttributesItem(CustomAttribute customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<CustomAttribute>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * Custom attributes added to the Subscription Throttle policy 
   * @return customAttributes
  **/
  @ApiModelProperty(example = "{}", value = "Custom attributes added to the Subscription Throttle policy ")
  public List<CustomAttribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<CustomAttribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public SubscriptionThrottlePolicy stopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
    return this;
  }

   /**
   * Get stopOnQuotaReach
   * @return stopOnQuotaReach
  **/
  @ApiModelProperty(value = "")
  public Boolean getStopOnQuotaReach() {
    return stopOnQuotaReach;
  }

  public void setStopOnQuotaReach(Boolean stopOnQuotaReach) {
    this.stopOnQuotaReach = stopOnQuotaReach;
  }

  public SubscriptionThrottlePolicy billingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

   /**
   * Get billingPlan
   * @return billingPlan
  **/
  @ApiModelProperty(value = "")
  public String getBillingPlan() {
    return billingPlan;
  }

  public void setBillingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionThrottlePolicy subscriptionThrottlePolicy = (SubscriptionThrottlePolicy) o;
    return Objects.equals(this.defaultLimit, subscriptionThrottlePolicy.defaultLimit) &&
        Objects.equals(this.rateLimitCount, subscriptionThrottlePolicy.rateLimitCount) &&
        Objects.equals(this.rateLimitTimeUnit, subscriptionThrottlePolicy.rateLimitTimeUnit) &&
        Objects.equals(this.customAttributes, subscriptionThrottlePolicy.customAttributes) &&
        Objects.equals(this.stopOnQuotaReach, subscriptionThrottlePolicy.stopOnQuotaReach) &&
        Objects.equals(this.billingPlan, subscriptionThrottlePolicy.billingPlan) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultLimit, rateLimitCount, rateLimitTimeUnit, customAttributes, stopOnQuotaReach, billingPlan, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionThrottlePolicy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultLimit: ").append(toIndentedString(defaultLimit)).append("\n");
    sb.append("    rateLimitCount: ").append(toIndentedString(rateLimitCount)).append("\n");
    sb.append("    rateLimitTimeUnit: ").append(toIndentedString(rateLimitTimeUnit)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    stopOnQuotaReach: ").append(toIndentedString(stopOnQuotaReach)).append("\n");
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
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

