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
import com.bytedance.ads.model.StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorBaseInfo;
import com.bytedance.ads.model.StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorOrderInfo;
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
 * StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner {
  public static final String SERIALIZED_NAME_AUTHOR_BASE_INFO = "author_base_info";
  @SerializedName(SERIALIZED_NAME_AUTHOR_BASE_INFO)
  private StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorBaseInfo authorBaseInfo = null;

  public static final String SERIALIZED_NAME_AUTHOR_ORDER_INFO = "author_order_info";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ORDER_INFO)
  private StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorOrderInfo authorOrderInfo = null;

  public StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner() {
  }

  public StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner authorBaseInfo(StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorBaseInfo authorBaseInfo) {
    
    this.authorBaseInfo = authorBaseInfo;
    return this;
  }

   /**
   * Get authorBaseInfo
   * @return authorBaseInfo
  **/
  @javax.annotation.Nullable
  public StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorBaseInfo getAuthorBaseInfo() {
    return authorBaseInfo;
  }


  public void setAuthorBaseInfo(StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorBaseInfo authorBaseInfo) {
    this.authorBaseInfo = authorBaseInfo;
  }


  public StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner authorOrderInfo(StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorOrderInfo authorOrderInfo) {
    
    this.authorOrderInfo = authorOrderInfo;
    return this;
  }

   /**
   * Get authorOrderInfo
   * @return authorOrderInfo
  **/
  @javax.annotation.Nullable
  public StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorOrderInfo getAuthorOrderInfo() {
    return authorOrderInfo;
  }


  public void setAuthorOrderInfo(StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInnerAuthorOrderInfo authorOrderInfo) {
    this.authorOrderInfo = authorOrderInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner starMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner = (StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner) o;
    return Objects.equals(this.authorBaseInfo, starMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner.authorBaseInfo) &&
        Objects.equals(this.authorOrderInfo, starMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner.authorOrderInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorBaseInfo, authorOrderInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner {\n");
    sb.append("    authorBaseInfo: ").append(toIndentedString(authorBaseInfo)).append("\n");
    sb.append("    authorOrderInfo: ").append(toIndentedString(authorOrderInfo)).append("\n");
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
    openapiFields.add("author_base_info");
    openapiFields.add("author_order_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author_base_info");
    openapiRequiredFields.add("author_order_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner>() {
           @Override
           public void write(JsonWriter out, StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner
  * @throws IOException if the JSON string is invalid with respect to StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner
  */
  public static StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner.class);
  }

 /**
  * Convert an instance of StarMcnProviderGetTaskAuthorListV2ResponseDataAuthorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

