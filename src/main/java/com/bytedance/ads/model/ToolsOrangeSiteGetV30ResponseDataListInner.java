/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30DataListFunctionType;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30DataListSiteType;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30DataListStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ToolsOrangeSiteGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class ToolsOrangeSiteGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_FUNCTION_TYPE = "function_type";
  @SerializedName(SERIALIZED_NAME_FUNCTION_TYPE)
  private ToolsOrangeSiteGetV30DataListFunctionType functionType = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public static final String SERIALIZED_NAME_SITE_TYPE = "site_type";
  @SerializedName(SERIALIZED_NAME_SITE_TYPE)
  private ToolsOrangeSiteGetV30DataListSiteType siteType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsOrangeSiteGetV30DataListStatus status = null;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public ToolsOrangeSiteGetV30ResponseDataListInner() {
  }

  public ToolsOrangeSiteGetV30ResponseDataListInner functionType(ToolsOrangeSiteGetV30DataListFunctionType functionType) {
    
    this.functionType = functionType;
    return this;
  }

   /**
   * Get functionType
   * @return functionType
  **/
  @javax.annotation.Nullable
  public ToolsOrangeSiteGetV30DataListFunctionType getFunctionType() {
    return functionType;
  }


  public void setFunctionType(ToolsOrangeSiteGetV30DataListFunctionType functionType) {
    this.functionType = functionType;
  }


  public ToolsOrangeSiteGetV30ResponseDataListInner name(String name) {
    
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


  public ToolsOrangeSiteGetV30ResponseDataListInner siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public ToolsOrangeSiteGetV30ResponseDataListInner siteType(ToolsOrangeSiteGetV30DataListSiteType siteType) {
    
    this.siteType = siteType;
    return this;
  }

   /**
   * Get siteType
   * @return siteType
  **/
  @javax.annotation.Nullable
  public ToolsOrangeSiteGetV30DataListSiteType getSiteType() {
    return siteType;
  }


  public void setSiteType(ToolsOrangeSiteGetV30DataListSiteType siteType) {
    this.siteType = siteType;
  }


  public ToolsOrangeSiteGetV30ResponseDataListInner status(ToolsOrangeSiteGetV30DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsOrangeSiteGetV30DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsOrangeSiteGetV30DataListStatus status) {
    this.status = status;
  }


  public ToolsOrangeSiteGetV30ResponseDataListInner thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * 
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  public String getThumbnail() {
    return thumbnail;
  }


  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public ToolsOrangeSiteGetV30ResponseDataListInner url(String url) {
    
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
    ToolsOrangeSiteGetV30ResponseDataListInner toolsOrangeSiteGetV30ResponseDataListInner = (ToolsOrangeSiteGetV30ResponseDataListInner) o;
    return Objects.equals(this.functionType, toolsOrangeSiteGetV30ResponseDataListInner.functionType) &&
        Objects.equals(this.name, toolsOrangeSiteGetV30ResponseDataListInner.name) &&
        Objects.equals(this.siteId, toolsOrangeSiteGetV30ResponseDataListInner.siteId) &&
        Objects.equals(this.siteType, toolsOrangeSiteGetV30ResponseDataListInner.siteType) &&
        Objects.equals(this.status, toolsOrangeSiteGetV30ResponseDataListInner.status) &&
        Objects.equals(this.thumbnail, toolsOrangeSiteGetV30ResponseDataListInner.thumbnail) &&
        Objects.equals(this.url, toolsOrangeSiteGetV30ResponseDataListInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionType, name, siteId, siteType, status, thumbnail, url);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsOrangeSiteGetV30ResponseDataListInner {\n");
    sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
    openapiFields.add("function_type");
    openapiFields.add("name");
    openapiFields.add("site_id");
    openapiFields.add("site_type");
    openapiFields.add("status");
    openapiFields.add("thumbnail");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsOrangeSiteGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsOrangeSiteGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsOrangeSiteGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsOrangeSiteGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsOrangeSiteGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsOrangeSiteGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsOrangeSiteGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsOrangeSiteGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsOrangeSiteGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsOrangeSiteGetV30ResponseDataListInner
  */
  public static ToolsOrangeSiteGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsOrangeSiteGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsOrangeSiteGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

