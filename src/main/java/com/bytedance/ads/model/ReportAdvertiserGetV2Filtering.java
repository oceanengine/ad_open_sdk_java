/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportAdvertiserGetV2FilteringDeliveryMode;
import com.bytedance.ads.model.ReportAdvertiserGetV2FilteringPlatformVersion;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ReportAdvertiserGetV2Filtering {
  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private List<ReportAdvertiserGetV2FilteringDeliveryMode> deliveryMode = null;

  public static final String SERIALIZED_NAME_PLATFORM_VERSION = "platform_version";
  @SerializedName(SERIALIZED_NAME_PLATFORM_VERSION)
  private ReportAdvertiserGetV2FilteringPlatformVersion platformVersion = null;

  public ReportAdvertiserGetV2Filtering() {
  }

  public ReportAdvertiserGetV2Filtering deliveryMode(List<ReportAdvertiserGetV2FilteringDeliveryMode> deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

  public ReportAdvertiserGetV2Filtering addDeliveryModeItem(ReportAdvertiserGetV2FilteringDeliveryMode deliveryModeItem) {
    if (this.deliveryMode == null) {
      this.deliveryMode = new ArrayList<>();
    }
    this.deliveryMode.add(deliveryModeItem);
    return this;
  }

   /**
   * 
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public List<ReportAdvertiserGetV2FilteringDeliveryMode> getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(List<ReportAdvertiserGetV2FilteringDeliveryMode> deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public ReportAdvertiserGetV2Filtering platformVersion(ReportAdvertiserGetV2FilteringPlatformVersion platformVersion) {
    
    this.platformVersion = platformVersion;
    return this;
  }

   /**
   * Get platformVersion
   * @return platformVersion
  **/
  @javax.annotation.Nullable
  public ReportAdvertiserGetV2FilteringPlatformVersion getPlatformVersion() {
    return platformVersion;
  }


  public void setPlatformVersion(ReportAdvertiserGetV2FilteringPlatformVersion platformVersion) {
    this.platformVersion = platformVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAdvertiserGetV2Filtering reportAdvertiserGetV2Filtering = (ReportAdvertiserGetV2Filtering) o;
    return Objects.equals(this.deliveryMode, reportAdvertiserGetV2Filtering.deliveryMode) &&
        Objects.equals(this.platformVersion, reportAdvertiserGetV2Filtering.platformVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryMode, platformVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAdvertiserGetV2Filtering {\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    platformVersion: ").append(toIndentedString(platformVersion)).append("\n");
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
    openapiFields.add("delivery_mode");
    openapiFields.add("platform_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAdvertiserGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAdvertiserGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAdvertiserGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAdvertiserGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAdvertiserGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportAdvertiserGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAdvertiserGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAdvertiserGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAdvertiserGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportAdvertiserGetV2Filtering
  */
  public static ReportAdvertiserGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAdvertiserGetV2Filtering.class);
  }

 /**
  * Convert an instance of ReportAdvertiserGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

