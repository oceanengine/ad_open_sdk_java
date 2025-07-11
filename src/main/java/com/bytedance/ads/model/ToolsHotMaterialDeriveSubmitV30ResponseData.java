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
import com.bytedance.ads.model.ToolsHotMaterialDeriveSubmitV30ResponseDataTasksInner;
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
public class ToolsHotMaterialDeriveSubmitV30ResponseData {
  public static final String SERIALIZED_NAME_TASKS = "tasks";
  @SerializedName(SERIALIZED_NAME_TASKS)
  private List<ToolsHotMaterialDeriveSubmitV30ResponseDataTasksInner> tasks = null;

  public ToolsHotMaterialDeriveSubmitV30ResponseData() {
  }

  public ToolsHotMaterialDeriveSubmitV30ResponseData tasks(List<ToolsHotMaterialDeriveSubmitV30ResponseDataTasksInner> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public ToolsHotMaterialDeriveSubmitV30ResponseData addTasksItem(ToolsHotMaterialDeriveSubmitV30ResponseDataTasksInner tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * 
   * @return tasks
  **/
  @javax.annotation.Nullable
  public List<ToolsHotMaterialDeriveSubmitV30ResponseDataTasksInner> getTasks() {
    return tasks;
  }


  public void setTasks(List<ToolsHotMaterialDeriveSubmitV30ResponseDataTasksInner> tasks) {
    this.tasks = tasks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsHotMaterialDeriveSubmitV30ResponseData toolsHotMaterialDeriveSubmitV30ResponseData = (ToolsHotMaterialDeriveSubmitV30ResponseData) o;
    return Objects.equals(this.tasks, toolsHotMaterialDeriveSubmitV30ResponseData.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsHotMaterialDeriveSubmitV30ResponseData {\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
    openapiFields.add("tasks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tasks");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsHotMaterialDeriveSubmitV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsHotMaterialDeriveSubmitV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsHotMaterialDeriveSubmitV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsHotMaterialDeriveSubmitV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsHotMaterialDeriveSubmitV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsHotMaterialDeriveSubmitV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsHotMaterialDeriveSubmitV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsHotMaterialDeriveSubmitV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsHotMaterialDeriveSubmitV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsHotMaterialDeriveSubmitV30ResponseData
  */
  public static ToolsHotMaterialDeriveSubmitV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsHotMaterialDeriveSubmitV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsHotMaterialDeriveSubmitV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

