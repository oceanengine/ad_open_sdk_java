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
public class ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink {
  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private String linkType = null;

  public static final String SERIALIZED_NAME_QUICK_APP = "quick_app";
  @SerializedName(SERIALIZED_NAME_QUICK_APP)
  private String quickApp = null;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink() {
  }

  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink linkType(String linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * 
   * @return linkType
  **/
  @javax.annotation.Nullable
  public String getLinkType() {
    return linkType;
  }


  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink quickApp(String quickApp) {
    
    this.quickApp = quickApp;
    return this;
  }

   /**
   * 
   * @return quickApp
  **/
  @javax.annotation.Nullable
  public String getQuickApp() {
    return quickApp;
  }


  public void setQuickApp(String quickApp) {
    this.quickApp = quickApp;
  }


  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * 
   * @return scheme
  **/
  @javax.annotation.Nullable
  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink = (ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink) o;
    return Objects.equals(this.linkType, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink.linkType) &&
        Objects.equals(this.quickApp, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink.quickApp) &&
        Objects.equals(this.scheme, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink.scheme) &&
        Objects.equals(this.url, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkType, quickApp, scheme, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink {\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    quickApp: ").append(toIndentedString(quickApp)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("link_type");
    openapiFields.add("quick_app");
    openapiFields.add("scheme");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink
  */
  public static ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink.class);
  }

 /**
  * Convert an instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

