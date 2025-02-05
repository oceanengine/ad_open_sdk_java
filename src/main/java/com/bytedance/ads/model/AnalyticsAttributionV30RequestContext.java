/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AnalyticsAttributionV30RequestContextAd;
import com.bytedance.ads.model.AnalyticsAttributionV30RequestContextDevice;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class AnalyticsAttributionV30RequestContext {
  public static final String SERIALIZED_NAME_AD = "ad";
  @SerializedName(SERIALIZED_NAME_AD)
  private AnalyticsAttributionV30RequestContextAd ad = null;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private AnalyticsAttributionV30RequestContextDevice device = null;

  public AnalyticsAttributionV30RequestContext() {
  }

  public AnalyticsAttributionV30RequestContext ad(AnalyticsAttributionV30RequestContextAd ad) {
    
    this.ad = ad;
    return this;
  }

   /**
   * Get ad
   * @return ad
  **/
  @javax.annotation.Nullable
  public AnalyticsAttributionV30RequestContextAd getAd() {
    return ad;
  }


  public void setAd(AnalyticsAttributionV30RequestContextAd ad) {
    this.ad = ad;
  }


  public AnalyticsAttributionV30RequestContext device(AnalyticsAttributionV30RequestContextDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  public AnalyticsAttributionV30RequestContextDevice getDevice() {
    return device;
  }


  public void setDevice(AnalyticsAttributionV30RequestContextDevice device) {
    this.device = device;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAttributionV30RequestContext analyticsAttributionV30RequestContext = (AnalyticsAttributionV30RequestContext) o;
    return Objects.equals(this.ad, analyticsAttributionV30RequestContext.ad) &&
        Objects.equals(this.device, analyticsAttributionV30RequestContext.device);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ad, device);
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
    sb.append("class AnalyticsAttributionV30RequestContext {\n");
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
    openapiFields.add("ad");
    openapiFields.add("device");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticsAttributionV30RequestContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticsAttributionV30RequestContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticsAttributionV30RequestContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticsAttributionV30RequestContext.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticsAttributionV30RequestContext>() {
           @Override
           public void write(JsonWriter out, AnalyticsAttributionV30RequestContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyticsAttributionV30RequestContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyticsAttributionV30RequestContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticsAttributionV30RequestContext
  * @throws IOException if the JSON string is invalid with respect to AnalyticsAttributionV30RequestContext
  */
  public static AnalyticsAttributionV30RequestContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticsAttributionV30RequestContext.class);
  }

 /**
  * Convert an instance of AnalyticsAttributionV30RequestContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

