/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsMicroAppCreateV30RequestAppPage;
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
 * ToolsMicroAppCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-10T18:05:36.409643208+08:00[PRC]")
public class ToolsMicroAppCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_APP_PAGE = "app_page";
  @SerializedName(SERIALIZED_NAME_APP_PAGE)
  private ToolsMicroAppCreateV30RequestAppPage appPage = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public ToolsMicroAppCreateV30Request() {
  }

  public ToolsMicroAppCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsMicroAppCreateV30Request appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nonnull
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public ToolsMicroAppCreateV30Request appPage(ToolsMicroAppCreateV30RequestAppPage appPage) {
    
    this.appPage = appPage;
    return this;
  }

   /**
   * Get appPage
   * @return appPage
  **/
  @javax.annotation.Nonnull
  public ToolsMicroAppCreateV30RequestAppPage getAppPage() {
    return appPage;
  }


  public void setAppPage(ToolsMicroAppCreateV30RequestAppPage appPage) {
    this.appPage = appPage;
  }


  public ToolsMicroAppCreateV30Request remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 
   * @return remark
  **/
  @javax.annotation.Nonnull
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroAppCreateV30Request toolsMicroAppCreateV30Request = (ToolsMicroAppCreateV30Request) o;
    return Objects.equals(this.advertiserId, toolsMicroAppCreateV30Request.advertiserId) &&
        Objects.equals(this.appId, toolsMicroAppCreateV30Request.appId) &&
        Objects.equals(this.appPage, toolsMicroAppCreateV30Request.appPage) &&
        Objects.equals(this.remark, toolsMicroAppCreateV30Request.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appId, appPage, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroAppCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appPage: ").append(toIndentedString(appPage)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("app_id");
    openapiFields.add("app_page");
    openapiFields.add("remark");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("app_page");
    openapiRequiredFields.add("remark");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroAppCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroAppCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroAppCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroAppCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroAppCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsMicroAppCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroAppCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroAppCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroAppCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroAppCreateV30Request
  */
  public static ToolsMicroAppCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroAppCreateV30Request.class);
  }

 /**
  * Convert an instance of ToolsMicroAppCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
