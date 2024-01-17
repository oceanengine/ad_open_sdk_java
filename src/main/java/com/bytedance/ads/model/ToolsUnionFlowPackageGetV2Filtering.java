/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsUnionFlowPackageGetV2FilteringFlowPackageType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsUnionFlowPackageGetV2Filtering {
  public static final String SERIALIZED_NAME_FLOW_PACKAGE_IDS = "flow_package_ids";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE_IDS)
  private List<Long> flowPackageIds = null;

  public static final String SERIALIZED_NAME_FLOW_PACKAGE_TYPE = "flow_package_type";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE_TYPE)
  private ToolsUnionFlowPackageGetV2FilteringFlowPackageType flowPackageType = null;

  public ToolsUnionFlowPackageGetV2Filtering() {
  }

  public ToolsUnionFlowPackageGetV2Filtering flowPackageIds(List<Long> flowPackageIds) {
    
    this.flowPackageIds = flowPackageIds;
    return this;
  }

  public ToolsUnionFlowPackageGetV2Filtering addFlowPackageIdsItem(Long flowPackageIdsItem) {
    if (this.flowPackageIds == null) {
      this.flowPackageIds = new ArrayList<>();
    }
    this.flowPackageIds.add(flowPackageIdsItem);
    return this;
  }

   /**
   * 
   * @return flowPackageIds
  **/
  @javax.annotation.Nullable
  public List<Long> getFlowPackageIds() {
    return flowPackageIds;
  }


  public void setFlowPackageIds(List<Long> flowPackageIds) {
    this.flowPackageIds = flowPackageIds;
  }


  public ToolsUnionFlowPackageGetV2Filtering flowPackageType(ToolsUnionFlowPackageGetV2FilteringFlowPackageType flowPackageType) {
    
    this.flowPackageType = flowPackageType;
    return this;
  }

   /**
   * Get flowPackageType
   * @return flowPackageType
  **/
  @javax.annotation.Nullable
  public ToolsUnionFlowPackageGetV2FilteringFlowPackageType getFlowPackageType() {
    return flowPackageType;
  }


  public void setFlowPackageType(ToolsUnionFlowPackageGetV2FilteringFlowPackageType flowPackageType) {
    this.flowPackageType = flowPackageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsUnionFlowPackageGetV2Filtering toolsUnionFlowPackageGetV2Filtering = (ToolsUnionFlowPackageGetV2Filtering) o;
    return Objects.equals(this.flowPackageIds, toolsUnionFlowPackageGetV2Filtering.flowPackageIds) &&
        Objects.equals(this.flowPackageType, toolsUnionFlowPackageGetV2Filtering.flowPackageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowPackageIds, flowPackageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsUnionFlowPackageGetV2Filtering {\n");
    sb.append("    flowPackageIds: ").append(toIndentedString(flowPackageIds)).append("\n");
    sb.append("    flowPackageType: ").append(toIndentedString(flowPackageType)).append("\n");
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
    openapiFields.add("flow_package_ids");
    openapiFields.add("flow_package_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsUnionFlowPackageGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsUnionFlowPackageGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsUnionFlowPackageGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsUnionFlowPackageGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsUnionFlowPackageGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsUnionFlowPackageGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsUnionFlowPackageGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsUnionFlowPackageGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsUnionFlowPackageGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsUnionFlowPackageGetV2Filtering
  */
  public static ToolsUnionFlowPackageGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsUnionFlowPackageGetV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsUnionFlowPackageGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

