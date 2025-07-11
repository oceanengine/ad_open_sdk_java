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
 * ToolsRegionGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsRegionGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Long parentId = null;

  public static final String SERIALIZED_NAME_REGION_LEVEL = "region_level";
  @SerializedName(SERIALIZED_NAME_REGION_LEVEL)
  private String regionLevel = null;

  public ToolsRegionGetV2ResponseDataListInner() {
  }

  public ToolsRegionGetV2ResponseDataListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsRegionGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsRegionGetV2ResponseDataListInner parentId(Long parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * 
   * @return parentId
  **/
  @javax.annotation.Nullable
  public Long getParentId() {
    return parentId;
  }


  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  public ToolsRegionGetV2ResponseDataListInner regionLevel(String regionLevel) {
    
    this.regionLevel = regionLevel;
    return this;
  }

   /**
   * 
   * @return regionLevel
  **/
  @javax.annotation.Nullable
  public String getRegionLevel() {
    return regionLevel;
  }


  public void setRegionLevel(String regionLevel) {
    this.regionLevel = regionLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRegionGetV2ResponseDataListInner toolsRegionGetV2ResponseDataListInner = (ToolsRegionGetV2ResponseDataListInner) o;
    return Objects.equals(this.id, toolsRegionGetV2ResponseDataListInner.id) &&
        Objects.equals(this.name, toolsRegionGetV2ResponseDataListInner.name) &&
        Objects.equals(this.parentId, toolsRegionGetV2ResponseDataListInner.parentId) &&
        Objects.equals(this.regionLevel, toolsRegionGetV2ResponseDataListInner.regionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentId, regionLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsRegionGetV2ResponseDataListInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    regionLevel: ").append(toIndentedString(regionLevel)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("parent_id");
    openapiFields.add("region_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRegionGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRegionGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRegionGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRegionGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRegionGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsRegionGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRegionGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRegionGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRegionGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsRegionGetV2ResponseDataListInner
  */
  public static ToolsRegionGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRegionGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsRegionGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

