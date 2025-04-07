/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AssetsCreativeComponentGetV2FilteringComponentTypes;
import com.bytedance.ads.model.AssetsCreativeComponentGetV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class AssetsCreativeComponentGetV2Filtering {
  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_COMPONENT_NAME = "component_name";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName = null;

  public static final String SERIALIZED_NAME_COMPONENT_TYPES = "component_types";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPES)
  private List<AssetsCreativeComponentGetV2FilteringComponentTypes> componentTypes = null;

  public static final String SERIALIZED_NAME_SKIN_TYPES = "skin_types";
  @SerializedName(SERIALIZED_NAME_SKIN_TYPES)
  private List<String> skinTypes = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<AssetsCreativeComponentGetV2FilteringStatus> status = null;

  public AssetsCreativeComponentGetV2Filtering() {
  }

  public AssetsCreativeComponentGetV2Filtering componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public AssetsCreativeComponentGetV2Filtering componentName(String componentName) {
    
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


  public AssetsCreativeComponentGetV2Filtering componentTypes(List<AssetsCreativeComponentGetV2FilteringComponentTypes> componentTypes) {
    
    this.componentTypes = componentTypes;
    return this;
  }

  public AssetsCreativeComponentGetV2Filtering addComponentTypesItem(AssetsCreativeComponentGetV2FilteringComponentTypes componentTypesItem) {
    if (this.componentTypes == null) {
      this.componentTypes = new ArrayList<>();
    }
    this.componentTypes.add(componentTypesItem);
    return this;
  }

   /**
   * 
   * @return componentTypes
  **/
  @javax.annotation.Nullable
  public List<AssetsCreativeComponentGetV2FilteringComponentTypes> getComponentTypes() {
    return componentTypes;
  }


  public void setComponentTypes(List<AssetsCreativeComponentGetV2FilteringComponentTypes> componentTypes) {
    this.componentTypes = componentTypes;
  }


  public AssetsCreativeComponentGetV2Filtering skinTypes(List<String> skinTypes) {
    
    this.skinTypes = skinTypes;
    return this;
  }

  public AssetsCreativeComponentGetV2Filtering addSkinTypesItem(String skinTypesItem) {
    if (this.skinTypes == null) {
      this.skinTypes = new ArrayList<>();
    }
    this.skinTypes.add(skinTypesItem);
    return this;
  }

   /**
   * 
   * @return skinTypes
  **/
  @javax.annotation.Nullable
  public List<String> getSkinTypes() {
    return skinTypes;
  }


  public void setSkinTypes(List<String> skinTypes) {
    this.skinTypes = skinTypes;
  }


  public AssetsCreativeComponentGetV2Filtering status(List<AssetsCreativeComponentGetV2FilteringStatus> status) {
    
    this.status = status;
    return this;
  }

  public AssetsCreativeComponentGetV2Filtering addStatusItem(AssetsCreativeComponentGetV2FilteringStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public List<AssetsCreativeComponentGetV2FilteringStatus> getStatus() {
    return status;
  }


  public void setStatus(List<AssetsCreativeComponentGetV2FilteringStatus> status) {
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
    AssetsCreativeComponentGetV2Filtering assetsCreativeComponentGetV2Filtering = (AssetsCreativeComponentGetV2Filtering) o;
    return Objects.equals(this.componentId, assetsCreativeComponentGetV2Filtering.componentId) &&
        Objects.equals(this.componentName, assetsCreativeComponentGetV2Filtering.componentName) &&
        Objects.equals(this.componentTypes, assetsCreativeComponentGetV2Filtering.componentTypes) &&
        Objects.equals(this.skinTypes, assetsCreativeComponentGetV2Filtering.skinTypes) &&
        Objects.equals(this.status, assetsCreativeComponentGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, componentName, componentTypes, skinTypes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsCreativeComponentGetV2Filtering {\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    componentTypes: ").append(toIndentedString(componentTypes)).append("\n");
    sb.append("    skinTypes: ").append(toIndentedString(skinTypes)).append("\n");
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
    openapiFields.add("component_id");
    openapiFields.add("component_name");
    openapiFields.add("component_types");
    openapiFields.add("skin_types");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsCreativeComponentGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsCreativeComponentGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsCreativeComponentGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsCreativeComponentGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsCreativeComponentGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, AssetsCreativeComponentGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetsCreativeComponentGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetsCreativeComponentGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsCreativeComponentGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to AssetsCreativeComponentGetV2Filtering
  */
  public static AssetsCreativeComponentGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsCreativeComponentGetV2Filtering.class);
  }

 /**
  * Convert an instance of AssetsCreativeComponentGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

