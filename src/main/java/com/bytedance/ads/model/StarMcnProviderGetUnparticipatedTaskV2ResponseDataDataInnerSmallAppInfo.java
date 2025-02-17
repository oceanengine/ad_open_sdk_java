/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * 小程序信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo() {
  }

  public StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 小程序id
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 小程序名称
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo starMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo = (StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo) o;
    return Objects.equals(this.appId, starMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo.appId) &&
        Objects.equals(this.appName, starMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo.appName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("app_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo>() {
           @Override
           public void write(JsonWriter out, StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo
  * @throws IOException if the JSON string is invalid with respect to StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo
  */
  public static StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo.class);
  }

 /**
  * Convert an instance of StarMcnProviderGetUnparticipatedTaskV2ResponseDataDataInnerSmallAppInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

