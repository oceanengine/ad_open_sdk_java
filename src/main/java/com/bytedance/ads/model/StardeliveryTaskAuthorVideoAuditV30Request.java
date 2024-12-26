/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoAuditV30OptStatus;
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
 * StardeliveryTaskAuthorVideoAuditV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StardeliveryTaskAuthorVideoAuditV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BAN_REASON = "ban_reason";
  @SerializedName(SERIALIZED_NAME_BAN_REASON)
  private String banReason = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private StardeliveryTaskAuthorVideoAuditV30OptStatus optStatus = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ID = "star_task_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ID)
  private Long starTaskId = null;

  public StardeliveryTaskAuthorVideoAuditV30Request() {
  }

  public StardeliveryTaskAuthorVideoAuditV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StardeliveryTaskAuthorVideoAuditV30Request banReason(String banReason) {
    
    this.banReason = banReason;
    return this;
  }

   /**
   * 审核拒绝理由，当opt_status &#x3D; REJECT 拒绝时必填，输入字数范围[5,50]
   * @return banReason
  **/
  @javax.annotation.Nullable
  public String getBanReason() {
    return banReason;
  }


  public void setBanReason(String banReason) {
    this.banReason = banReason;
  }


  public StardeliveryTaskAuthorVideoAuditV30Request materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 要审核的星广联投任务下视频ID，可从「获取星广联投任务视频列表」接口获取
   * @return materialId
  **/
  @javax.annotation.Nonnull
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public StardeliveryTaskAuthorVideoAuditV30Request optStatus(StardeliveryTaskAuthorVideoAuditV30OptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskAuthorVideoAuditV30OptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(StardeliveryTaskAuthorVideoAuditV30OptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public StardeliveryTaskAuthorVideoAuditV30Request starTaskId(Long starTaskId) {
    
    this.starTaskId = starTaskId;
    return this;
  }

   /**
   * 星广联投任务ID
   * @return starTaskId
  **/
  @javax.annotation.Nonnull
  public Long getStarTaskId() {
    return starTaskId;
  }


  public void setStarTaskId(Long starTaskId) {
    this.starTaskId = starTaskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskAuthorVideoAuditV30Request stardeliveryTaskAuthorVideoAuditV30Request = (StardeliveryTaskAuthorVideoAuditV30Request) o;
    return Objects.equals(this.advertiserId, stardeliveryTaskAuthorVideoAuditV30Request.advertiserId) &&
        Objects.equals(this.banReason, stardeliveryTaskAuthorVideoAuditV30Request.banReason) &&
        Objects.equals(this.materialId, stardeliveryTaskAuthorVideoAuditV30Request.materialId) &&
        Objects.equals(this.optStatus, stardeliveryTaskAuthorVideoAuditV30Request.optStatus) &&
        Objects.equals(this.starTaskId, stardeliveryTaskAuthorVideoAuditV30Request.starTaskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, banReason, materialId, optStatus, starTaskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskAuthorVideoAuditV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    banReason: ").append(toIndentedString(banReason)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    starTaskId: ").append(toIndentedString(starTaskId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("ban_reason");
    openapiFields.add("material_id");
    openapiFields.add("opt_status");
    openapiFields.add("star_task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("material_id");
    openapiRequiredFields.add("opt_status");
    openapiRequiredFields.add("star_task_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskAuthorVideoAuditV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskAuthorVideoAuditV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskAuthorVideoAuditV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskAuthorVideoAuditV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskAuthorVideoAuditV30Request>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskAuthorVideoAuditV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskAuthorVideoAuditV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskAuthorVideoAuditV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskAuthorVideoAuditV30Request
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskAuthorVideoAuditV30Request
  */
  public static StardeliveryTaskAuthorVideoAuditV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskAuthorVideoAuditV30Request.class);
  }

 /**
  * Convert an instance of StardeliveryTaskAuthorVideoAuditV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

