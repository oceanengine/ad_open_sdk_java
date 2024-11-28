/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
 * 字节小程序快应用资产
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ToolsEventAssetsGetV2FilteringMiniProgram {
  public static final String SERIALIZED_NAME_ASSET_NAME = "asset_name";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public ToolsEventAssetsGetV2FilteringMiniProgram() {
  }

  public ToolsEventAssetsGetV2FilteringMiniProgram assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * 字节小程序资产name
   * @return assetName
  **/
  @javax.annotation.Nullable
  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public ToolsEventAssetsGetV2FilteringMiniProgram instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 字节小程序instance_id
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2FilteringMiniProgram toolsEventAssetsGetV2FilteringMiniProgram = (ToolsEventAssetsGetV2FilteringMiniProgram) o;
    return Objects.equals(this.assetName, toolsEventAssetsGetV2FilteringMiniProgram.assetName) &&
        Objects.equals(this.instanceId, toolsEventAssetsGetV2FilteringMiniProgram.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetName, instanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEventAssetsGetV2FilteringMiniProgram {\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
    openapiFields.add("asset_name");
    openapiFields.add("instance_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2FilteringMiniProgram.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2FilteringMiniProgram' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2FilteringMiniProgram> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2FilteringMiniProgram.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2FilteringMiniProgram>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2FilteringMiniProgram value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2FilteringMiniProgram read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2FilteringMiniProgram given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2FilteringMiniProgram
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2FilteringMiniProgram
  */
  public static ToolsEventAssetsGetV2FilteringMiniProgram fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2FilteringMiniProgram.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2FilteringMiniProgram to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

