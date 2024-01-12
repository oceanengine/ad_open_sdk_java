/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsLandingGroupGetV2DataListSitesSiteAuditStatus;
import com.bytedance.ads.model.ToolsLandingGroupGetV2DataListSitesSiteOptStatus;
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
 * ToolsLandingGroupGetV2ResponseDataListInnerSitesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class ToolsLandingGroupGetV2ResponseDataListInnerSitesInner {
  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private Long memberId = null;

  public static final String SERIALIZED_NAME_SITE_AUDIT_STATUS = "site_audit_status";
  @SerializedName(SERIALIZED_NAME_SITE_AUDIT_STATUS)
  private ToolsLandingGroupGetV2DataListSitesSiteAuditStatus siteAuditStatus = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Long siteId = null;

  public static final String SERIALIZED_NAME_SITE_OPT_STATUS = "site_opt_status";
  @SerializedName(SERIALIZED_NAME_SITE_OPT_STATUS)
  private ToolsLandingGroupGetV2DataListSitesSiteOptStatus siteOptStatus = null;

  public static final String SERIALIZED_NAME_SITE_URL = "site_url";
  @SerializedName(SERIALIZED_NAME_SITE_URL)
  private String siteUrl = null;

  public ToolsLandingGroupGetV2ResponseDataListInnerSitesInner() {
  }

  public ToolsLandingGroupGetV2ResponseDataListInnerSitesInner memberId(Long memberId) {
    
    this.memberId = memberId;
    return this;
  }

   /**
   * 
   * @return memberId
  **/
  @javax.annotation.Nullable
  public Long getMemberId() {
    return memberId;
  }


  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }


  public ToolsLandingGroupGetV2ResponseDataListInnerSitesInner siteAuditStatus(ToolsLandingGroupGetV2DataListSitesSiteAuditStatus siteAuditStatus) {
    
    this.siteAuditStatus = siteAuditStatus;
    return this;
  }

   /**
   * Get siteAuditStatus
   * @return siteAuditStatus
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupGetV2DataListSitesSiteAuditStatus getSiteAuditStatus() {
    return siteAuditStatus;
  }


  public void setSiteAuditStatus(ToolsLandingGroupGetV2DataListSitesSiteAuditStatus siteAuditStatus) {
    this.siteAuditStatus = siteAuditStatus;
  }


  public ToolsLandingGroupGetV2ResponseDataListInnerSitesInner siteId(Long siteId) {
    
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


  public ToolsLandingGroupGetV2ResponseDataListInnerSitesInner siteOptStatus(ToolsLandingGroupGetV2DataListSitesSiteOptStatus siteOptStatus) {
    
    this.siteOptStatus = siteOptStatus;
    return this;
  }

   /**
   * Get siteOptStatus
   * @return siteOptStatus
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupGetV2DataListSitesSiteOptStatus getSiteOptStatus() {
    return siteOptStatus;
  }


  public void setSiteOptStatus(ToolsLandingGroupGetV2DataListSitesSiteOptStatus siteOptStatus) {
    this.siteOptStatus = siteOptStatus;
  }


  public ToolsLandingGroupGetV2ResponseDataListInnerSitesInner siteUrl(String siteUrl) {
    
    this.siteUrl = siteUrl;
    return this;
  }

   /**
   * 
   * @return siteUrl
  **/
  @javax.annotation.Nullable
  public String getSiteUrl() {
    return siteUrl;
  }


  public void setSiteUrl(String siteUrl) {
    this.siteUrl = siteUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLandingGroupGetV2ResponseDataListInnerSitesInner toolsLandingGroupGetV2ResponseDataListInnerSitesInner = (ToolsLandingGroupGetV2ResponseDataListInnerSitesInner) o;
    return Objects.equals(this.memberId, toolsLandingGroupGetV2ResponseDataListInnerSitesInner.memberId) &&
        Objects.equals(this.siteAuditStatus, toolsLandingGroupGetV2ResponseDataListInnerSitesInner.siteAuditStatus) &&
        Objects.equals(this.siteId, toolsLandingGroupGetV2ResponseDataListInnerSitesInner.siteId) &&
        Objects.equals(this.siteOptStatus, toolsLandingGroupGetV2ResponseDataListInnerSitesInner.siteOptStatus) &&
        Objects.equals(this.siteUrl, toolsLandingGroupGetV2ResponseDataListInnerSitesInner.siteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, siteAuditStatus, siteId, siteOptStatus, siteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLandingGroupGetV2ResponseDataListInnerSitesInner {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    siteAuditStatus: ").append(toIndentedString(siteAuditStatus)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteOptStatus: ").append(toIndentedString(siteOptStatus)).append("\n");
    sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
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
    openapiFields.add("member_id");
    openapiFields.add("site_audit_status");
    openapiFields.add("site_id");
    openapiFields.add("site_opt_status");
    openapiFields.add("site_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLandingGroupGetV2ResponseDataListInnerSitesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupGetV2ResponseDataListInnerSitesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupGetV2ResponseDataListInnerSitesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupGetV2ResponseDataListInnerSitesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupGetV2ResponseDataListInnerSitesInner>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupGetV2ResponseDataListInnerSitesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupGetV2ResponseDataListInnerSitesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupGetV2ResponseDataListInnerSitesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupGetV2ResponseDataListInnerSitesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupGetV2ResponseDataListInnerSitesInner
  */
  public static ToolsLandingGroupGetV2ResponseDataListInnerSitesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupGetV2ResponseDataListInnerSitesInner.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupGetV2ResponseDataListInnerSitesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

