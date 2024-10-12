/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DiagnosisTaskAdvCreateV2RequestDiagnoseConfig;
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
 * DiagnosisTaskAdvCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class DiagnosisTaskAdvCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DIAGNOSE_CONFIG = "diagnose_config";
  @SerializedName(SERIALIZED_NAME_DIAGNOSE_CONFIG)
  private DiagnosisTaskAdvCreateV2RequestDiagnoseConfig diagnoseConfig = null;

  public static final String SERIALIZED_NAME_REF_AD_ID = "ref_ad_id";
  @SerializedName(SERIALIZED_NAME_REF_AD_ID)
  private Long refAdId = null;

  public static final String SERIALIZED_NAME_REF_PROMOTION_ID = "ref_promotion_id";
  @SerializedName(SERIALIZED_NAME_REF_PROMOTION_ID)
  private Long refPromotionId = null;

  public static final String SERIALIZED_NAME_VIDEO_IDS = "video_ids";
  @SerializedName(SERIALIZED_NAME_VIDEO_IDS)
  private List<String> videoIds = null;

  public DiagnosisTaskAdvCreateV2Request() {
  }

  public DiagnosisTaskAdvCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DiagnosisTaskAdvCreateV2Request diagnoseConfig(DiagnosisTaskAdvCreateV2RequestDiagnoseConfig diagnoseConfig) {
    
    this.diagnoseConfig = diagnoseConfig;
    return this;
  }

   /**
   * Get diagnoseConfig
   * @return diagnoseConfig
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAdvCreateV2RequestDiagnoseConfig getDiagnoseConfig() {
    return diagnoseConfig;
  }


  public void setDiagnoseConfig(DiagnosisTaskAdvCreateV2RequestDiagnoseConfig diagnoseConfig) {
    this.diagnoseConfig = diagnoseConfig;
  }


  public DiagnosisTaskAdvCreateV2Request refAdId(Long refAdId) {
    
    this.refAdId = refAdId;
    return this;
  }

   /**
   *  参考广告id，可复用该广告id的setting进行前测，非空情况下会忽略diagnose_config。 和ref_promotion_id二选一
   * @return refAdId
  **/
  @javax.annotation.Nullable
  public Long getRefAdId() {
    return refAdId;
  }


  public void setRefAdId(Long refAdId) {
    this.refAdId = refAdId;
  }


  public DiagnosisTaskAdvCreateV2Request refPromotionId(Long refPromotionId) {
    
    this.refPromotionId = refPromotionId;
    return this;
  }

   /**
   *  参考广告id，可复用该广告id的setting进行前测，非空情况下会忽略diagnose_config。 和ref_ad_id二选一
   * @return refPromotionId
  **/
  @javax.annotation.Nullable
  public Long getRefPromotionId() {
    return refPromotionId;
  }


  public void setRefPromotionId(Long refPromotionId) {
    this.refPromotionId = refPromotionId;
  }


  public DiagnosisTaskAdvCreateV2Request videoIds(List<String> videoIds) {
    
    this.videoIds = videoIds;
    return this;
  }

  public DiagnosisTaskAdvCreateV2Request addVideoIdsItem(String videoIdsItem) {
    if (this.videoIds == null) {
      this.videoIds = new ArrayList<>();
    }
    this.videoIds.add(videoIdsItem);
    return this;
  }

   /**
   * 视频id
   * @return videoIds
  **/
  @javax.annotation.Nullable
  public List<String> getVideoIds() {
    return videoIds;
  }


  public void setVideoIds(List<String> videoIds) {
    this.videoIds = videoIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisTaskAdvCreateV2Request diagnosisTaskAdvCreateV2Request = (DiagnosisTaskAdvCreateV2Request) o;
    return Objects.equals(this.advertiserId, diagnosisTaskAdvCreateV2Request.advertiserId) &&
        Objects.equals(this.diagnoseConfig, diagnosisTaskAdvCreateV2Request.diagnoseConfig) &&
        Objects.equals(this.refAdId, diagnosisTaskAdvCreateV2Request.refAdId) &&
        Objects.equals(this.refPromotionId, diagnosisTaskAdvCreateV2Request.refPromotionId) &&
        Objects.equals(this.videoIds, diagnosisTaskAdvCreateV2Request.videoIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, diagnoseConfig, refAdId, refPromotionId, videoIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosisTaskAdvCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    diagnoseConfig: ").append(toIndentedString(diagnoseConfig)).append("\n");
    sb.append("    refAdId: ").append(toIndentedString(refAdId)).append("\n");
    sb.append("    refPromotionId: ").append(toIndentedString(refPromotionId)).append("\n");
    sb.append("    videoIds: ").append(toIndentedString(videoIds)).append("\n");
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
    openapiFields.add("diagnose_config");
    openapiFields.add("ref_ad_id");
    openapiFields.add("ref_promotion_id");
    openapiFields.add("video_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiagnosisTaskAdvCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiagnosisTaskAdvCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiagnosisTaskAdvCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiagnosisTaskAdvCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DiagnosisTaskAdvCreateV2Request>() {
           @Override
           public void write(JsonWriter out, DiagnosisTaskAdvCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiagnosisTaskAdvCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiagnosisTaskAdvCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiagnosisTaskAdvCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to DiagnosisTaskAdvCreateV2Request
  */
  public static DiagnosisTaskAdvCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiagnosisTaskAdvCreateV2Request.class);
  }

 /**
  * Convert an instance of DiagnosisTaskAdvCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
