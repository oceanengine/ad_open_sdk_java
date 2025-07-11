/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data = null;

  public static final String SERIALIZED_NAME_PARAM_CONFIG_ID = "param_config_id";
  @SerializedName(SERIALIZED_NAME_PARAM_CONFIG_ID)
  private String paramConfigId = null;

  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner() {
  }

  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * 人群包/标签的参数
   * @return data
  **/
  @javax.annotation.Nonnull
  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  public YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner paramConfigId(String paramConfigId) {
    
    this.paramConfigId = paramConfigId;
    return this;
  }

   /**
   * 人群包/标签的标识
   * @return paramConfigId
  **/
  @javax.annotation.Nonnull
  public String getParamConfigId() {
    return paramConfigId;
  }


  public void setParamConfigId(String paramConfigId) {
    this.paramConfigId = paramConfigId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner yuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner = (YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner) o;
    return Objects.equals(this.data, yuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner.data) &&
        Objects.equals(this.paramConfigId, yuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner.paramConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, paramConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    paramConfigId: ").append(toIndentedString(paramConfigId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("param_config_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("param_config_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner
  */
  public static YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner.class);
  }

 /**
  * Convert an instance of YuntuAudienceInfoCreateV30RequestCalculatePoolsInnerTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

