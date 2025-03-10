/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsThirdSiteGetV2DataListAuditStatus;
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
 * ToolsThirdSiteGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class ToolsThirdSiteGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ToolsThirdSiteGetV2DataListAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Long siteId = null;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public ToolsThirdSiteGetV2ResponseDataListInner() {
  }

  public ToolsThirdSiteGetV2ResponseDataListInner auditStatus(ToolsThirdSiteGetV2DataListAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ToolsThirdSiteGetV2DataListAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ToolsThirdSiteGetV2DataListAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ToolsThirdSiteGetV2ResponseDataListInner createTime(String createTime) {
    
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


  public ToolsThirdSiteGetV2ResponseDataListInner name(String name) {
    
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


  public ToolsThirdSiteGetV2ResponseDataListInner siteId(Long siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 
   * @return siteId
  **/
  @javax.annotation.Nullable
  public Long getSiteId() {
    return siteId;
  }


  public void setSiteId(Long siteId) {
    this.siteId = siteId;
  }


  public ToolsThirdSiteGetV2ResponseDataListInner thumbnail(String thumbnail) {
    
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


  public ToolsThirdSiteGetV2ResponseDataListInner url(String url) {
    
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
    ToolsThirdSiteGetV2ResponseDataListInner toolsThirdSiteGetV2ResponseDataListInner = (ToolsThirdSiteGetV2ResponseDataListInner) o;
    return Objects.equals(this.auditStatus, toolsThirdSiteGetV2ResponseDataListInner.auditStatus) &&
        Objects.equals(this.createTime, toolsThirdSiteGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.name, toolsThirdSiteGetV2ResponseDataListInner.name) &&
        Objects.equals(this.siteId, toolsThirdSiteGetV2ResponseDataListInner.siteId) &&
        Objects.equals(this.thumbnail, toolsThirdSiteGetV2ResponseDataListInner.thumbnail) &&
        Objects.equals(this.url, toolsThirdSiteGetV2ResponseDataListInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, createTime, name, siteId, thumbnail, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsThirdSiteGetV2ResponseDataListInner {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("create_time");
    openapiFields.add("name");
    openapiFields.add("site_id");
    openapiFields.add("thumbnail");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsThirdSiteGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsThirdSiteGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsThirdSiteGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsThirdSiteGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsThirdSiteGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsThirdSiteGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsThirdSiteGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsThirdSiteGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsThirdSiteGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsThirdSiteGetV2ResponseDataListInner
  */
  public static ToolsThirdSiteGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsThirdSiteGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsThirdSiteGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

