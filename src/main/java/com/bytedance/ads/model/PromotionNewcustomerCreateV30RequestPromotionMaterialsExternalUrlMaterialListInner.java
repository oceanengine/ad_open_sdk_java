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
 * PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner {
  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner() {
  }

  public PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner promotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner = (PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner) o;
    return Objects.equals(this.externalUrl, promotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner.externalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner {\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
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
    openapiFields.add("external_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner
  */
  public static PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

