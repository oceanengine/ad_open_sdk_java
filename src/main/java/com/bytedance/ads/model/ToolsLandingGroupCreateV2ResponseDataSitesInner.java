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
import com.bytedance.ads.model.ToolsLandingGroupCreateV2DataSitesSiteOptStatus;
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
 * ToolsLandingGroupCreateV2ResponseDataSitesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class ToolsLandingGroupCreateV2ResponseDataSitesInner {
  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private Long memberId = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private Long siteId = null;

  public static final String SERIALIZED_NAME_SITE_OPT_STATUS = "site_opt_status";
  @SerializedName(SERIALIZED_NAME_SITE_OPT_STATUS)
  private ToolsLandingGroupCreateV2DataSitesSiteOptStatus siteOptStatus = null;

  public static final String SERIALIZED_NAME_SITE_URL = "site_url";
  @SerializedName(SERIALIZED_NAME_SITE_URL)
  private String siteUrl = null;

  public ToolsLandingGroupCreateV2ResponseDataSitesInner() {
  }

  public ToolsLandingGroupCreateV2ResponseDataSitesInner memberId(Long memberId) {
    
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


  public ToolsLandingGroupCreateV2ResponseDataSitesInner siteId(Long siteId) {
    
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


  public ToolsLandingGroupCreateV2ResponseDataSitesInner siteOptStatus(ToolsLandingGroupCreateV2DataSitesSiteOptStatus siteOptStatus) {
    
    this.siteOptStatus = siteOptStatus;
    return this;
  }

   /**
   * Get siteOptStatus
   * @return siteOptStatus
  **/
  @javax.annotation.Nullable
  public ToolsLandingGroupCreateV2DataSitesSiteOptStatus getSiteOptStatus() {
    return siteOptStatus;
  }


  public void setSiteOptStatus(ToolsLandingGroupCreateV2DataSitesSiteOptStatus siteOptStatus) {
    this.siteOptStatus = siteOptStatus;
  }


  public ToolsLandingGroupCreateV2ResponseDataSitesInner siteUrl(String siteUrl) {
    
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
    ToolsLandingGroupCreateV2ResponseDataSitesInner toolsLandingGroupCreateV2ResponseDataSitesInner = (ToolsLandingGroupCreateV2ResponseDataSitesInner) o;
    return Objects.equals(this.memberId, toolsLandingGroupCreateV2ResponseDataSitesInner.memberId) &&
        Objects.equals(this.siteId, toolsLandingGroupCreateV2ResponseDataSitesInner.siteId) &&
        Objects.equals(this.siteOptStatus, toolsLandingGroupCreateV2ResponseDataSitesInner.siteOptStatus) &&
        Objects.equals(this.siteUrl, toolsLandingGroupCreateV2ResponseDataSitesInner.siteUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, siteId, siteOptStatus, siteUrl);
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
    sb.append("class ToolsLandingGroupCreateV2ResponseDataSitesInner {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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
       if (!ToolsLandingGroupCreateV2ResponseDataSitesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLandingGroupCreateV2ResponseDataSitesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLandingGroupCreateV2ResponseDataSitesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLandingGroupCreateV2ResponseDataSitesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLandingGroupCreateV2ResponseDataSitesInner>() {
           @Override
           public void write(JsonWriter out, ToolsLandingGroupCreateV2ResponseDataSitesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLandingGroupCreateV2ResponseDataSitesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLandingGroupCreateV2ResponseDataSitesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLandingGroupCreateV2ResponseDataSitesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsLandingGroupCreateV2ResponseDataSitesInner
  */
  public static ToolsLandingGroupCreateV2ResponseDataSitesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLandingGroupCreateV2ResponseDataSitesInner.class);
  }

 /**
  * Convert an instance of ToolsLandingGroupCreateV2ResponseDataSitesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

