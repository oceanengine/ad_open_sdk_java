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
 * 巨量引擎AD
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine {
  public static final String SERIALIZED_NAME_AD_SYNC = "ad_sync";
  @SerializedName(SERIALIZED_NAME_AD_SYNC)
  private Long adSync = null;

  public static final String SERIALIZED_NAME_AD_SYNC_ORIGIN = "ad_sync_origin";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_ORIGIN)
  private Long adSyncOrigin = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTO_SYNC = "auto_sync";
  @SerializedName(SERIALIZED_NAME_AUTO_SYNC)
  private Long autoSync = null;

  public static final String SERIALIZED_NAME_PRODUCT_LINK = "product_link";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINK)
  private String productLink = null;

  public static final String SERIALIZED_NAME_PRODUCT_PICS = "product_pics";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PICS)
  private List<String> productPics = null;

  public static final String SERIALIZED_NAME_SYNC_DURATION = "sync_duration";
  @SerializedName(SERIALIZED_NAME_SYNC_DURATION)
  private Long syncDuration = null;

  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine() {
  }

  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine adSync(Long adSync) {
    
    this.adSync = adSync;
    return this;
  }

   /**
   * 是否推送原素材 1-推送 2-不推送
   * minimum: 1
   * maximum: 2
   * @return adSync
  **/
  @javax.annotation.Nullable
  public Long getAdSync() {
    return adSync;
  }


  public void setAdSync(Long adSync) {
    this.adSync = adSync;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine adSyncOrigin(Long adSyncOrigin) {
    
    this.adSyncOrigin = adSyncOrigin;
    return this;
  }

   /**
   * 是否投放原生视频0否1 是 
   * minimum: 0
   * maximum: 1
   * @return adSyncOrigin
  **/
  @javax.annotation.Nullable
  public Long getAdSyncOrigin() {
    return adSyncOrigin;
  }


  public void setAdSyncOrigin(Long adSyncOrigin) {
    this.adSyncOrigin = adSyncOrigin;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine autoSync(Long autoSync) {
    
    this.autoSync = autoSync;
    return this;
  }

   /**
   * 是否自动投放 0-否 1-是
   * minimum: 0
   * maximum: 1
   * @return autoSync
  **/
  @javax.annotation.Nullable
  public Long getAutoSync() {
    return autoSync;
  }


  public void setAutoSync(Long autoSync) {
    this.autoSync = autoSync;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine productLink(String productLink) {
    
    this.productLink = productLink;
    return this;
  }

   /**
   * 推广产品链接
   * @return productLink
  **/
  @javax.annotation.Nullable
  public String getProductLink() {
    return productLink;
  }


  public void setProductLink(String productLink) {
    this.productLink = productLink;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine productPics(List<String> productPics) {
    
    this.productPics = productPics;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine addProductPicsItem(String productPicsItem) {
    if (this.productPics == null) {
      this.productPics = new ArrayList<>();
    }
    this.productPics.add(productPicsItem);
    return this;
  }

   /**
   * 推广产品图片链接
   * @return productPics
  **/
  @javax.annotation.Nullable
  public List<String> getProductPics() {
    return productPics;
  }


  public void setProductPics(List<String> productPics) {
    this.productPics = productPics;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine syncDuration(Long syncDuration) {
    
    this.syncDuration = syncDuration;
    return this;
  }

   /**
   * 期望投放时长（单位：天） 大于0的整数，默认30天
   * @return syncDuration
  **/
  @javax.annotation.Nullable
  public Long getSyncDuration() {
    return syncDuration;
  }


  public void setSyncDuration(Long syncDuration) {
    this.syncDuration = syncDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine = (StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine) o;
    return Objects.equals(this.adSync, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.adSync) &&
        Objects.equals(this.adSyncOrigin, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.adSyncOrigin) &&
        Objects.equals(this.advertiserId, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.advertiserId) &&
        Objects.equals(this.autoSync, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.autoSync) &&
        Objects.equals(this.productLink, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.productLink) &&
        Objects.equals(this.productPics, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.productPics) &&
        Objects.equals(this.syncDuration, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.syncDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSync, adSyncOrigin, advertiserId, autoSync, productLink, productPics, syncDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine {\n");
    sb.append("    adSync: ").append(toIndentedString(adSync)).append("\n");
    sb.append("    adSyncOrigin: ").append(toIndentedString(adSyncOrigin)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoSync: ").append(toIndentedString(autoSync)).append("\n");
    sb.append("    productLink: ").append(toIndentedString(productLink)).append("\n");
    sb.append("    productPics: ").append(toIndentedString(productPics)).append("\n");
    sb.append("    syncDuration: ").append(toIndentedString(syncDuration)).append("\n");
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
    openapiFields.add("ad_sync");
    openapiFields.add("ad_sync_origin");
    openapiFields.add("advertiser_id");
    openapiFields.add("auto_sync");
    openapiFields.add("product_link");
    openapiFields.add("product_pics");
    openapiFields.add("sync_duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine
  */
  public static StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

