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
import com.bytedance.ads.model.ToolsPrivativeWordAdAddV2ResponseDataAdListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordAdAddV2ResponseData {
  public static final String SERIALIZED_NAME_AD_ERROR_LIST = "ad_error_list";
  @SerializedName(SERIALIZED_NAME_AD_ERROR_LIST)
  private List<Long> adErrorList = null;

  public static final String SERIALIZED_NAME_AD_LIST = "ad_list";
  @SerializedName(SERIALIZED_NAME_AD_LIST)
  private List<ToolsPrivativeWordAdAddV2ResponseDataAdListInner> adList = null;

  public ToolsPrivativeWordAdAddV2ResponseData() {
  }

  public ToolsPrivativeWordAdAddV2ResponseData adErrorList(List<Long> adErrorList) {
    
    this.adErrorList = adErrorList;
    return this;
  }

  public ToolsPrivativeWordAdAddV2ResponseData addAdErrorListItem(Long adErrorListItem) {
    if (this.adErrorList == null) {
      this.adErrorList = new ArrayList<>();
    }
    this.adErrorList.add(adErrorListItem);
    return this;
  }

   /**
   * 
   * @return adErrorList
  **/
  @javax.annotation.Nullable
  public List<Long> getAdErrorList() {
    return adErrorList;
  }


  public void setAdErrorList(List<Long> adErrorList) {
    this.adErrorList = adErrorList;
  }


  public ToolsPrivativeWordAdAddV2ResponseData adList(List<ToolsPrivativeWordAdAddV2ResponseDataAdListInner> adList) {
    
    this.adList = adList;
    return this;
  }

  public ToolsPrivativeWordAdAddV2ResponseData addAdListItem(ToolsPrivativeWordAdAddV2ResponseDataAdListInner adListItem) {
    if (this.adList == null) {
      this.adList = new ArrayList<>();
    }
    this.adList.add(adListItem);
    return this;
  }

   /**
   * 
   * @return adList
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordAdAddV2ResponseDataAdListInner> getAdList() {
    return adList;
  }


  public void setAdList(List<ToolsPrivativeWordAdAddV2ResponseDataAdListInner> adList) {
    this.adList = adList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordAdAddV2ResponseData toolsPrivativeWordAdAddV2ResponseData = (ToolsPrivativeWordAdAddV2ResponseData) o;
    return Objects.equals(this.adErrorList, toolsPrivativeWordAdAddV2ResponseData.adErrorList) &&
        Objects.equals(this.adList, toolsPrivativeWordAdAddV2ResponseData.adList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adErrorList, adList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordAdAddV2ResponseData {\n");
    sb.append("    adErrorList: ").append(toIndentedString(adErrorList)).append("\n");
    sb.append("    adList: ").append(toIndentedString(adList)).append("\n");
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
    openapiFields.add("ad_error_list");
    openapiFields.add("ad_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordAdAddV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordAdAddV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordAdAddV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordAdAddV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordAdAddV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordAdAddV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordAdAddV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordAdAddV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordAdAddV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordAdAddV2ResponseData
  */
  public static ToolsPrivativeWordAdAddV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordAdAddV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordAdAddV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

