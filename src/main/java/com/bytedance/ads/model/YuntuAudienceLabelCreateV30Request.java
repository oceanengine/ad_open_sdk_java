/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30DataSource;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30RequestCalculateRule;
import com.bytedance.ads.model.YuntuAudienceLabelCreateV30ValidDay;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * YuntuAudienceLabelCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class YuntuAudienceLabelCreateV30Request {
  public static final String SERIALIZED_NAME_CALCULATE_RULE = "calculate_rule";
  @SerializedName(SERIALIZED_NAME_CALCULATE_RULE)
  private YuntuAudienceLabelCreateV30RequestCalculateRule calculateRule = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "data_source";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private YuntuAudienceLabelCreateV30DataSource dataSource = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_INDUSTRY_ID = "industry_id";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_ID)
  private Long industryId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_ID = "service_provider_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_ID)
  private Long serviceProviderId = null;

  public static final String SERIALIZED_NAME_USER_DISPLAY_NAME = "user_display_name";
  @SerializedName(SERIALIZED_NAME_USER_DISPLAY_NAME)
  private String userDisplayName = null;

  public static final String SERIALIZED_NAME_VALID_DAY = "valid_day";
  @SerializedName(SERIALIZED_NAME_VALID_DAY)
  private YuntuAudienceLabelCreateV30ValidDay validDay = null;

  public static final String SERIALIZED_NAME_YUNTU_BRAND_ID = "yuntu_brand_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_BRAND_ID)
  private Long yuntuBrandId = null;

  public YuntuAudienceLabelCreateV30Request() {
  }

  public YuntuAudienceLabelCreateV30Request calculateRule(YuntuAudienceLabelCreateV30RequestCalculateRule calculateRule) {
    
    this.calculateRule = calculateRule;
    return this;
  }

   /**
   * Get calculateRule
   * @return calculateRule
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30RequestCalculateRule getCalculateRule() {
    return calculateRule;
  }


  public void setCalculateRule(YuntuAudienceLabelCreateV30RequestCalculateRule calculateRule) {
    this.calculateRule = calculateRule;
  }


  public YuntuAudienceLabelCreateV30Request dataSource(YuntuAudienceLabelCreateV30DataSource dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30DataSource getDataSource() {
    return dataSource;
  }


  public void setDataSource(YuntuAudienceLabelCreateV30DataSource dataSource) {
    this.dataSource = dataSource;
  }


  public YuntuAudienceLabelCreateV30Request description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 标签描述。非必填，若选择传入，则字符数上限为100。
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public YuntuAudienceLabelCreateV30Request industryId(Long industryId) {
    
    this.industryId = industryId;
    return this;
  }

   /**
   * 行业ID，需传入当前用户在当前品牌下拥有权限的、数值最小的行业ID。行业信息及行业ID可通过“品牌元信息”接口获取。
   * @return industryId
  **/
  @javax.annotation.Nonnull
  public Long getIndustryId() {
    return industryId;
  }


  public void setIndustryId(Long industryId) {
    this.industryId = industryId;
  }


  public YuntuAudienceLabelCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 标签名称，需要创建的人群标签名称。标签名称不能为纯数字，字符长度上限为20，名称前后不能存在空格。
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public YuntuAudienceLabelCreateV30Request serviceProviderId(Long serviceProviderId) {
    
    this.serviceProviderId = serviceProviderId;
    return this;
  }

   /**
   * 服务商id
   * @return serviceProviderId
  **/
  @javax.annotation.Nonnull
  public Long getServiceProviderId() {
    return serviceProviderId;
  }


  public void setServiceProviderId(Long serviceProviderId) {
    this.serviceProviderId = serviceProviderId;
  }


  public YuntuAudienceLabelCreateV30Request userDisplayName(String userDisplayName) {
    
    this.userDisplayName = userDisplayName;
    return this;
  }

   /**
   * 当前用户名称，可通过“品牌元信息”接口获取。
   * @return userDisplayName
  **/
  @javax.annotation.Nonnull
  public String getUserDisplayName() {
    return userDisplayName;
  }


  public void setUserDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
  }


  public YuntuAudienceLabelCreateV30Request validDay(YuntuAudienceLabelCreateV30ValidDay validDay) {
    
    this.validDay = validDay;
    return this;
  }

   /**
   * Get validDay
   * @return validDay
  **/
  @javax.annotation.Nonnull
  public YuntuAudienceLabelCreateV30ValidDay getValidDay() {
    return validDay;
  }


  public void setValidDay(YuntuAudienceLabelCreateV30ValidDay validDay) {
    this.validDay = validDay;
  }


  public YuntuAudienceLabelCreateV30Request yuntuBrandId(Long yuntuBrandId) {
    
    this.yuntuBrandId = yuntuBrandId;
    return this;
  }

   /**
   * 品牌id
   * @return yuntuBrandId
  **/
  @javax.annotation.Nonnull
  public Long getYuntuBrandId() {
    return yuntuBrandId;
  }


  public void setYuntuBrandId(Long yuntuBrandId) {
    this.yuntuBrandId = yuntuBrandId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceLabelCreateV30Request yuntuAudienceLabelCreateV30Request = (YuntuAudienceLabelCreateV30Request) o;
    return Objects.equals(this.calculateRule, yuntuAudienceLabelCreateV30Request.calculateRule) &&
        Objects.equals(this.dataSource, yuntuAudienceLabelCreateV30Request.dataSource) &&
        Objects.equals(this.description, yuntuAudienceLabelCreateV30Request.description) &&
        Objects.equals(this.industryId, yuntuAudienceLabelCreateV30Request.industryId) &&
        Objects.equals(this.name, yuntuAudienceLabelCreateV30Request.name) &&
        Objects.equals(this.serviceProviderId, yuntuAudienceLabelCreateV30Request.serviceProviderId) &&
        Objects.equals(this.userDisplayName, yuntuAudienceLabelCreateV30Request.userDisplayName) &&
        Objects.equals(this.validDay, yuntuAudienceLabelCreateV30Request.validDay) &&
        Objects.equals(this.yuntuBrandId, yuntuAudienceLabelCreateV30Request.yuntuBrandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculateRule, dataSource, description, industryId, name, serviceProviderId, userDisplayName, validDay, yuntuBrandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceLabelCreateV30Request {\n");
    sb.append("    calculateRule: ").append(toIndentedString(calculateRule)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    industryId: ").append(toIndentedString(industryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceProviderId: ").append(toIndentedString(serviceProviderId)).append("\n");
    sb.append("    userDisplayName: ").append(toIndentedString(userDisplayName)).append("\n");
    sb.append("    validDay: ").append(toIndentedString(validDay)).append("\n");
    sb.append("    yuntuBrandId: ").append(toIndentedString(yuntuBrandId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("calculate_rule");
    openapiFields.add("data_source");
    openapiFields.add("description");
    openapiFields.add("industry_id");
    openapiFields.add("name");
    openapiFields.add("service_provider_id");
    openapiFields.add("user_display_name");
    openapiFields.add("valid_day");
    openapiFields.add("yuntu_brand_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("calculate_rule");
    openapiRequiredFields.add("data_source");
    openapiRequiredFields.add("industry_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("service_provider_id");
    openapiRequiredFields.add("user_display_name");
    openapiRequiredFields.add("valid_day");
    openapiRequiredFields.add("yuntu_brand_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceLabelCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceLabelCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceLabelCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceLabelCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceLabelCreateV30Request>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceLabelCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceLabelCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceLabelCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceLabelCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceLabelCreateV30Request
  */
  public static YuntuAudienceLabelCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceLabelCreateV30Request.class);
  }

 /**
  * Convert an instance of YuntuAudienceLabelCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

