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
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2DataIsSupportUniversal;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsIsSupportUniversalGetV2ResponseData {
  public static final String SERIALIZED_NAME_IS_SUPPORT_UNIVERSAL = "is_support_universal";
  @SerializedName(SERIALIZED_NAME_IS_SUPPORT_UNIVERSAL)
  private ToolsIsSupportUniversalGetV2DataIsSupportUniversal isSupportUniversal = null;

  public ToolsIsSupportUniversalGetV2ResponseData() {
  }

  public ToolsIsSupportUniversalGetV2ResponseData isSupportUniversal(ToolsIsSupportUniversalGetV2DataIsSupportUniversal isSupportUniversal) {
    
    this.isSupportUniversal = isSupportUniversal;
    return this;
  }

   /**
   * Get isSupportUniversal
   * @return isSupportUniversal
  **/
  @javax.annotation.Nullable
  public ToolsIsSupportUniversalGetV2DataIsSupportUniversal getIsSupportUniversal() {
    return isSupportUniversal;
  }


  public void setIsSupportUniversal(ToolsIsSupportUniversalGetV2DataIsSupportUniversal isSupportUniversal) {
    this.isSupportUniversal = isSupportUniversal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsIsSupportUniversalGetV2ResponseData toolsIsSupportUniversalGetV2ResponseData = (ToolsIsSupportUniversalGetV2ResponseData) o;
    return Objects.equals(this.isSupportUniversal, toolsIsSupportUniversalGetV2ResponseData.isSupportUniversal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSupportUniversal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsIsSupportUniversalGetV2ResponseData {\n");
    sb.append("    isSupportUniversal: ").append(toIndentedString(isSupportUniversal)).append("\n");
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
    openapiFields.add("is_support_universal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("is_support_universal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsIsSupportUniversalGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsIsSupportUniversalGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsIsSupportUniversalGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsIsSupportUniversalGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsIsSupportUniversalGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsIsSupportUniversalGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsIsSupportUniversalGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsIsSupportUniversalGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsIsSupportUniversalGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsIsSupportUniversalGetV2ResponseData
  */
  public static ToolsIsSupportUniversalGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsIsSupportUniversalGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsIsSupportUniversalGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

