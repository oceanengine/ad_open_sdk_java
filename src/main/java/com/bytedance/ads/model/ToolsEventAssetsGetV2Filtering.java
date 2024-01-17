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
import com.bytedance.ads.model.ToolsEventAssetsGetV2FilteringApp;
import com.bytedance.ads.model.ToolsEventAssetsGetV2FilteringLandingPage;
import com.bytedance.ads.model.ToolsEventAssetsGetV2FilteringMiniProgram;
import com.bytedance.ads.model.ToolsEventAssetsGetV2FilteringQuickApp;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsEventAssetsGetV2Filtering {
  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  private ToolsEventAssetsGetV2FilteringApp app = null;

  public static final String SERIALIZED_NAME_LANDING_PAGE = "landing_page";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE)
  private ToolsEventAssetsGetV2FilteringLandingPage landingPage = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM = "mini_program";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM)
  private ToolsEventAssetsGetV2FilteringMiniProgram miniProgram = null;

  public static final String SERIALIZED_NAME_QUICK_APP = "quick_app";
  @SerializedName(SERIALIZED_NAME_QUICK_APP)
  private ToolsEventAssetsGetV2FilteringQuickApp quickApp = null;

  public ToolsEventAssetsGetV2Filtering() {
  }

  public ToolsEventAssetsGetV2Filtering app(ToolsEventAssetsGetV2FilteringApp app) {
    
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @javax.annotation.Nullable
  public ToolsEventAssetsGetV2FilteringApp getApp() {
    return app;
  }


  public void setApp(ToolsEventAssetsGetV2FilteringApp app) {
    this.app = app;
  }


  public ToolsEventAssetsGetV2Filtering landingPage(ToolsEventAssetsGetV2FilteringLandingPage landingPage) {
    
    this.landingPage = landingPage;
    return this;
  }

   /**
   * Get landingPage
   * @return landingPage
  **/
  @javax.annotation.Nullable
  public ToolsEventAssetsGetV2FilteringLandingPage getLandingPage() {
    return landingPage;
  }


  public void setLandingPage(ToolsEventAssetsGetV2FilteringLandingPage landingPage) {
    this.landingPage = landingPage;
  }


  public ToolsEventAssetsGetV2Filtering miniProgram(ToolsEventAssetsGetV2FilteringMiniProgram miniProgram) {
    
    this.miniProgram = miniProgram;
    return this;
  }

   /**
   * Get miniProgram
   * @return miniProgram
  **/
  @javax.annotation.Nullable
  public ToolsEventAssetsGetV2FilteringMiniProgram getMiniProgram() {
    return miniProgram;
  }


  public void setMiniProgram(ToolsEventAssetsGetV2FilteringMiniProgram miniProgram) {
    this.miniProgram = miniProgram;
  }


  public ToolsEventAssetsGetV2Filtering quickApp(ToolsEventAssetsGetV2FilteringQuickApp quickApp) {
    
    this.quickApp = quickApp;
    return this;
  }

   /**
   * Get quickApp
   * @return quickApp
  **/
  @javax.annotation.Nullable
  public ToolsEventAssetsGetV2FilteringQuickApp getQuickApp() {
    return quickApp;
  }


  public void setQuickApp(ToolsEventAssetsGetV2FilteringQuickApp quickApp) {
    this.quickApp = quickApp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventAssetsGetV2Filtering toolsEventAssetsGetV2Filtering = (ToolsEventAssetsGetV2Filtering) o;
    return Objects.equals(this.app, toolsEventAssetsGetV2Filtering.app) &&
        Objects.equals(this.landingPage, toolsEventAssetsGetV2Filtering.landingPage) &&
        Objects.equals(this.miniProgram, toolsEventAssetsGetV2Filtering.miniProgram) &&
        Objects.equals(this.quickApp, toolsEventAssetsGetV2Filtering.quickApp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, landingPage, miniProgram, quickApp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEventAssetsGetV2Filtering {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
    sb.append("    miniProgram: ").append(toIndentedString(miniProgram)).append("\n");
    sb.append("    quickApp: ").append(toIndentedString(quickApp)).append("\n");
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
    openapiFields.add("app");
    openapiFields.add("landing_page");
    openapiFields.add("mini_program");
    openapiFields.add("quick_app");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventAssetsGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventAssetsGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventAssetsGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventAssetsGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventAssetsGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsEventAssetsGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventAssetsGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventAssetsGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventAssetsGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsEventAssetsGetV2Filtering
  */
  public static ToolsEventAssetsGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventAssetsGetV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsEventAssetsGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

