/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class YuntuAudienceInfoGetV30ResponseDataAudienceInfo {
  public static final String SERIALIZED_NAME_COVER_NUM = "cover_num";
  @SerializedName(SERIALIZED_NAME_COVER_NUM)
  private Long coverNum = null;

  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_ID = "custom_audience_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_ID)
  private Long customAudienceId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public YuntuAudienceInfoGetV30ResponseDataAudienceInfo() {
  }

  public YuntuAudienceInfoGetV30ResponseDataAudienceInfo coverNum(Long coverNum) {
    
    this.coverNum = coverNum;
    return this;
  }

   /**
   * 人群包覆盖人群数目
   * @return coverNum
  **/
  @javax.annotation.Nullable
  public Long getCoverNum() {
    return coverNum;
  }


  public void setCoverNum(Long coverNum) {
    this.coverNum = coverNum;
  }


  public YuntuAudienceInfoGetV30ResponseDataAudienceInfo customAudienceId(Long customAudienceId) {
    
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * 人群包id
   * @return customAudienceId
  **/
  @javax.annotation.Nullable
  public Long getCustomAudienceId() {
    return customAudienceId;
  }


  public void setCustomAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
  }


  public YuntuAudienceInfoGetV30ResponseDataAudienceInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 人群包名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public YuntuAudienceInfoGetV30ResponseDataAudienceInfo status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 人群包状态
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
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
    YuntuAudienceInfoGetV30ResponseDataAudienceInfo yuntuAudienceInfoGetV30ResponseDataAudienceInfo = (YuntuAudienceInfoGetV30ResponseDataAudienceInfo) o;
    return Objects.equals(this.coverNum, yuntuAudienceInfoGetV30ResponseDataAudienceInfo.coverNum) &&
        Objects.equals(this.customAudienceId, yuntuAudienceInfoGetV30ResponseDataAudienceInfo.customAudienceId) &&
        Objects.equals(this.name, yuntuAudienceInfoGetV30ResponseDataAudienceInfo.name) &&
        Objects.equals(this.status, yuntuAudienceInfoGetV30ResponseDataAudienceInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverNum, customAudienceId, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceInfoGetV30ResponseDataAudienceInfo {\n");
    sb.append("    coverNum: ").append(toIndentedString(coverNum)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("cover_num");
    openapiFields.add("custom_audience_id");
    openapiFields.add("name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cover_num");
    openapiRequiredFields.add("custom_audience_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceInfoGetV30ResponseDataAudienceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceInfoGetV30ResponseDataAudienceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceInfoGetV30ResponseDataAudienceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceInfoGetV30ResponseDataAudienceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceInfoGetV30ResponseDataAudienceInfo>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceInfoGetV30ResponseDataAudienceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceInfoGetV30ResponseDataAudienceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceInfoGetV30ResponseDataAudienceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceInfoGetV30ResponseDataAudienceInfo
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceInfoGetV30ResponseDataAudienceInfo
  */
  public static YuntuAudienceInfoGetV30ResponseDataAudienceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceInfoGetV30ResponseDataAudienceInfo.class);
  }

 /**
  * Convert an instance of YuntuAudienceInfoGetV30ResponseDataAudienceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

