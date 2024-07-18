/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarInfoV2DataInfoListStatus;
import com.bytedance.ads.model.StarInfoV2ResponseDataInfoListInnerFirstInfo;
import com.bytedance.ads.model.StarInfoV2ResponseDataInfoListInnerSecondInfo;
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
 * StarInfoV2ResponseDataInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class StarInfoV2ResponseDataInfoListInner {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Long categoryId = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_FIRST_INFO = "first_info";
  @SerializedName(SERIALIZED_NAME_FIRST_INFO)
  private StarInfoV2ResponseDataInfoListInnerFirstInfo firstInfo = null;

  public static final String SERIALIZED_NAME_SECOND_INFO = "second_info";
  @SerializedName(SERIALIZED_NAME_SECOND_INFO)
  private StarInfoV2ResponseDataInfoListInnerSecondInfo secondInfo = null;

  public static final String SERIALIZED_NAME_START_ID = "start_id";
  @SerializedName(SERIALIZED_NAME_START_ID)
  private Long startId = null;

  public static final String SERIALIZED_NAME_START_NAME = "start_name";
  @SerializedName(SERIALIZED_NAME_START_NAME)
  private String startName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StarInfoV2DataInfoListStatus status = null;

  public StarInfoV2ResponseDataInfoListInner() {
  }

  public StarInfoV2ResponseDataInfoListInner categoryId(Long categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public Long getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  public StarInfoV2ResponseDataInfoListInner companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public StarInfoV2ResponseDataInfoListInner companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public StarInfoV2ResponseDataInfoListInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarInfoV2ResponseDataInfoListInner firstInfo(StarInfoV2ResponseDataInfoListInnerFirstInfo firstInfo) {
    
    this.firstInfo = firstInfo;
    return this;
  }

   /**
   * Get firstInfo
   * @return firstInfo
  **/
  @javax.annotation.Nullable
  public StarInfoV2ResponseDataInfoListInnerFirstInfo getFirstInfo() {
    return firstInfo;
  }


  public void setFirstInfo(StarInfoV2ResponseDataInfoListInnerFirstInfo firstInfo) {
    this.firstInfo = firstInfo;
  }


  public StarInfoV2ResponseDataInfoListInner secondInfo(StarInfoV2ResponseDataInfoListInnerSecondInfo secondInfo) {
    
    this.secondInfo = secondInfo;
    return this;
  }

   /**
   * Get secondInfo
   * @return secondInfo
  **/
  @javax.annotation.Nullable
  public StarInfoV2ResponseDataInfoListInnerSecondInfo getSecondInfo() {
    return secondInfo;
  }


  public void setSecondInfo(StarInfoV2ResponseDataInfoListInnerSecondInfo secondInfo) {
    this.secondInfo = secondInfo;
  }


  public StarInfoV2ResponseDataInfoListInner startId(Long startId) {
    
    this.startId = startId;
    return this;
  }

   /**
   * 
   * @return startId
  **/
  @javax.annotation.Nullable
  public Long getStartId() {
    return startId;
  }


  public void setStartId(Long startId) {
    this.startId = startId;
  }


  public StarInfoV2ResponseDataInfoListInner startName(String startName) {
    
    this.startName = startName;
    return this;
  }

   /**
   * 
   * @return startName
  **/
  @javax.annotation.Nullable
  public String getStartName() {
    return startName;
  }


  public void setStartName(String startName) {
    this.startName = startName;
  }


  public StarInfoV2ResponseDataInfoListInner status(StarInfoV2DataInfoListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StarInfoV2DataInfoListStatus getStatus() {
    return status;
  }


  public void setStatus(StarInfoV2DataInfoListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarInfoV2ResponseDataInfoListInner starInfoV2ResponseDataInfoListInner = (StarInfoV2ResponseDataInfoListInner) o;
    return Objects.equals(this.categoryId, starInfoV2ResponseDataInfoListInner.categoryId) &&
        Objects.equals(this.companyId, starInfoV2ResponseDataInfoListInner.companyId) &&
        Objects.equals(this.companyName, starInfoV2ResponseDataInfoListInner.companyName) &&
        Objects.equals(this.createTime, starInfoV2ResponseDataInfoListInner.createTime) &&
        Objects.equals(this.firstInfo, starInfoV2ResponseDataInfoListInner.firstInfo) &&
        Objects.equals(this.secondInfo, starInfoV2ResponseDataInfoListInner.secondInfo) &&
        Objects.equals(this.startId, starInfoV2ResponseDataInfoListInner.startId) &&
        Objects.equals(this.startName, starInfoV2ResponseDataInfoListInner.startName) &&
        Objects.equals(this.status, starInfoV2ResponseDataInfoListInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, companyId, companyName, createTime, firstInfo, secondInfo, startId, startName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarInfoV2ResponseDataInfoListInner {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    firstInfo: ").append(toIndentedString(firstInfo)).append("\n");
    sb.append("    secondInfo: ").append(toIndentedString(secondInfo)).append("\n");
    sb.append("    startId: ").append(toIndentedString(startId)).append("\n");
    sb.append("    startName: ").append(toIndentedString(startName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("company_id");
    openapiFields.add("company_name");
    openapiFields.add("create_time");
    openapiFields.add("first_info");
    openapiFields.add("second_info");
    openapiFields.add("start_id");
    openapiFields.add("start_name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("category_id");
    openapiRequiredFields.add("company_id");
    openapiRequiredFields.add("company_name");
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("first_info");
    openapiRequiredFields.add("second_info");
    openapiRequiredFields.add("start_id");
    openapiRequiredFields.add("start_name");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarInfoV2ResponseDataInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarInfoV2ResponseDataInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarInfoV2ResponseDataInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarInfoV2ResponseDataInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarInfoV2ResponseDataInfoListInner>() {
           @Override
           public void write(JsonWriter out, StarInfoV2ResponseDataInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarInfoV2ResponseDataInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarInfoV2ResponseDataInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarInfoV2ResponseDataInfoListInner
  * @throws IOException if the JSON string is invalid with respect to StarInfoV2ResponseDataInfoListInner
  */
  public static StarInfoV2ResponseDataInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarInfoV2ResponseDataInfoListInner.class);
  }

 /**
  * Convert an instance of StarInfoV2ResponseDataInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

