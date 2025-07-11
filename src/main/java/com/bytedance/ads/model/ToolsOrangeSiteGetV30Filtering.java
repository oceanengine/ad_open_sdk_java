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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsOrangeSiteGetV30Filtering {
  public static final String SERIALIZED_NAME_MICRO_APP_INSTANCE_ID = "micro_app_instance_id";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_INSTANCE_ID)
  private Long microAppInstanceId = null;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private String search = null;

  public ToolsOrangeSiteGetV30Filtering() {
  }

  public ToolsOrangeSiteGetV30Filtering microAppInstanceId(Long microAppInstanceId) {
    
    this.microAppInstanceId = microAppInstanceId;
    return this;
  }

   /**
   * 
   * @return microAppInstanceId
  **/
  @javax.annotation.Nullable
  public Long getMicroAppInstanceId() {
    return microAppInstanceId;
  }


  public void setMicroAppInstanceId(Long microAppInstanceId) {
    this.microAppInstanceId = microAppInstanceId;
  }


  public ToolsOrangeSiteGetV30Filtering search(String search) {
    
    this.search = search;
    return this;
  }

   /**
   * 
   * @return search
  **/
  @javax.annotation.Nullable
  public String getSearch() {
    return search;
  }


  public void setSearch(String search) {
    this.search = search;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsOrangeSiteGetV30Filtering toolsOrangeSiteGetV30Filtering = (ToolsOrangeSiteGetV30Filtering) o;
    return Objects.equals(this.microAppInstanceId, toolsOrangeSiteGetV30Filtering.microAppInstanceId) &&
        Objects.equals(this.search, toolsOrangeSiteGetV30Filtering.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(microAppInstanceId, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsOrangeSiteGetV30Filtering {\n");
    sb.append("    microAppInstanceId: ").append(toIndentedString(microAppInstanceId)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
    openapiFields.add("micro_app_instance_id");
    openapiFields.add("search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsOrangeSiteGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsOrangeSiteGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsOrangeSiteGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsOrangeSiteGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsOrangeSiteGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsOrangeSiteGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsOrangeSiteGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsOrangeSiteGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsOrangeSiteGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsOrangeSiteGetV30Filtering
  */
  public static ToolsOrangeSiteGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsOrangeSiteGetV30Filtering.class);
  }

 /**
  * Convert an instance of ToolsOrangeSiteGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

