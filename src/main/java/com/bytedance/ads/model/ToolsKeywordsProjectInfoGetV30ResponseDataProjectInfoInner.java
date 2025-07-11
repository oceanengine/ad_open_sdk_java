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
 * ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName = null;

  public ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner() {
  }

  public ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * 
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner toolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner = (ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner) o;
    return Objects.equals(this.projectId, toolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner.projectId) &&
        Objects.equals(this.projectName, toolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
    openapiFields.add("project_id");
    openapiFields.add("project_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("project_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner>() {
           @Override
           public void write(JsonWriter out, ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner
  * @throws IOException if the JSON string is invalid with respect to ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner
  */
  public static ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner.class);
  }

 /**
  * Convert an instance of ToolsKeywordsProjectInfoGetV30ResponseDataProjectInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

