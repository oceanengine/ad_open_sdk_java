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
 * AssetsCreativeComponentGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AssetsCreativeComponentGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_COMPONENT_DATA = "component_data";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DATA)
  private Object componentData = null;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_COMPONENT_NAME = "component_name";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName = null;

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private String componentType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public AssetsCreativeComponentGetV2ResponseDataListInner() {
  }

  public AssetsCreativeComponentGetV2ResponseDataListInner componentData(Object componentData) {
    
    this.componentData = componentData;
    return this;
  }

   /**
   * 
   * @return componentData
  **/
  @javax.annotation.Nullable
  public Object getComponentData() {
    return componentData;
  }


  public void setComponentData(Object componentData) {
    this.componentData = componentData;
  }


  public AssetsCreativeComponentGetV2ResponseDataListInner componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public AssetsCreativeComponentGetV2ResponseDataListInner componentName(String componentName) {
    
    this.componentName = componentName;
    return this;
  }

   /**
   * 
   * @return componentName
  **/
  @javax.annotation.Nullable
  public String getComponentName() {
    return componentName;
  }


  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }


  public AssetsCreativeComponentGetV2ResponseDataListInner componentType(String componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * 
   * @return componentType
  **/
  @javax.annotation.Nullable
  public String getComponentType() {
    return componentType;
  }


  public void setComponentType(String componentType) {
    this.componentType = componentType;
  }


  public AssetsCreativeComponentGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AssetsCreativeComponentGetV2ResponseDataListInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsCreativeComponentGetV2ResponseDataListInner assetsCreativeComponentGetV2ResponseDataListInner = (AssetsCreativeComponentGetV2ResponseDataListInner) o;
    return Objects.equals(this.componentData, assetsCreativeComponentGetV2ResponseDataListInner.componentData) &&
        Objects.equals(this.componentId, assetsCreativeComponentGetV2ResponseDataListInner.componentId) &&
        Objects.equals(this.componentName, assetsCreativeComponentGetV2ResponseDataListInner.componentName) &&
        Objects.equals(this.componentType, assetsCreativeComponentGetV2ResponseDataListInner.componentType) &&
        Objects.equals(this.createTime, assetsCreativeComponentGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.status, assetsCreativeComponentGetV2ResponseDataListInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentData, componentId, componentName, componentType, createTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsCreativeComponentGetV2ResponseDataListInner {\n");
    sb.append("    componentData: ").append(toIndentedString(componentData)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("component_data");
    openapiFields.add("component_id");
    openapiFields.add("component_name");
    openapiFields.add("component_type");
    openapiFields.add("create_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsCreativeComponentGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsCreativeComponentGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsCreativeComponentGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsCreativeComponentGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsCreativeComponentGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AssetsCreativeComponentGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetsCreativeComponentGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetsCreativeComponentGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsCreativeComponentGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AssetsCreativeComponentGetV2ResponseDataListInner
  */
  public static AssetsCreativeComponentGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsCreativeComponentGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AssetsCreativeComponentGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

