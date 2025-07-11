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
public class StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent {
  public static final String SERIALIZED_NAME_ANCHOR_TITLE = "anchor_title";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TITLE)
  private String anchorTitle = null;

  public static final String SERIALIZED_NAME_MICRO_APP_ID = "micro_app_id";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_ID)
  private String microAppId = null;

  public static final String SERIALIZED_NAME_MICRO_APP_NAME = "micro_app_name";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_NAME)
  private String microAppName = null;

  public static final String SERIALIZED_NAME_START_PATH = "start_path";
  @SerializedName(SERIALIZED_NAME_START_PATH)
  private String startPath = null;

  public StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent() {
  }

  public StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent anchorTitle(String anchorTitle) {
    
    this.anchorTitle = anchorTitle;
    return this;
  }

   /**
   * 自定义标题
   * @return anchorTitle
  **/
  @javax.annotation.Nullable
  public String getAnchorTitle() {
    return anchorTitle;
  }


  public void setAnchorTitle(String anchorTitle) {
    this.anchorTitle = anchorTitle;
  }


  public StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent microAppId(String microAppId) {
    
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 小程序id
   * @return microAppId
  **/
  @javax.annotation.Nonnull
  public String getMicroAppId() {
    return microAppId;
  }


  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }


  public StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent microAppName(String microAppName) {
    
    this.microAppName = microAppName;
    return this;
  }

   /**
   * 小程序名称
   * @return microAppName
  **/
  @javax.annotation.Nonnull
  public String getMicroAppName() {
    return microAppName;
  }


  public void setMicroAppName(String microAppName) {
    this.microAppName = microAppName;
  }


  public StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent startPath(String startPath) {
    
    this.startPath = startPath;
    return this;
  }

   /**
   * 起始页
   * @return startPath
  **/
  @javax.annotation.Nonnull
  public String getStartPath() {
    return startPath;
  }


  public void setStartPath(String startPath) {
    this.startPath = startPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent starComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent = (StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent) o;
    return Objects.equals(this.anchorTitle, starComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent.anchorTitle) &&
        Objects.equals(this.microAppId, starComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent.microAppId) &&
        Objects.equals(this.microAppName, starComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent.microAppName) &&
        Objects.equals(this.startPath, starComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent.startPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorTitle, microAppId, microAppName, startPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent {\n");
    sb.append("    anchorTitle: ").append(toIndentedString(anchorTitle)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    microAppName: ").append(toIndentedString(microAppName)).append("\n");
    sb.append("    startPath: ").append(toIndentedString(startPath)).append("\n");
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
    openapiFields.add("anchor_title");
    openapiFields.add("micro_app_id");
    openapiFields.add("micro_app_name");
    openapiFields.add("start_path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("micro_app_id");
    openapiRequiredFields.add("micro_app_name");
    openapiRequiredFields.add("start_path");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent>() {
           @Override
           public void write(JsonWriter out, StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent
  * @throws IOException if the JSON string is invalid with respect to StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent
  */
  public static StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent.class);
  }

 /**
  * Convert an instance of StarComponentCreateCommonComponentV2RequestCommonComponentAnchorComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

