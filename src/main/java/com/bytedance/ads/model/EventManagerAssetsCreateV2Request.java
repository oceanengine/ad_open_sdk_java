/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerAssetsCreateV2AssetType;
import com.bytedance.ads.model.EventManagerAssetsCreateV2RequestAppAsset;
import com.bytedance.ads.model.EventManagerAssetsCreateV2RequestMicroAppAsset;
import com.bytedance.ads.model.EventManagerAssetsCreateV2RequestQuickAppAsset;
import com.bytedance.ads.model.EventManagerAssetsCreateV2RequestSiteAsset;
import com.bytedance.ads.model.EventManagerAssetsCreateV2RequestThirdPartAsset;
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
 * EventManagerAssetsCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class EventManagerAssetsCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ASSET = "app_asset";
  @SerializedName(SERIALIZED_NAME_APP_ASSET)
  private EventManagerAssetsCreateV2RequestAppAsset appAsset = null;

  public static final String SERIALIZED_NAME_ASSET_TYPE = "asset_type";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private EventManagerAssetsCreateV2AssetType assetType = null;

  public static final String SERIALIZED_NAME_MICRO_APP_ASSET = "micro_app_asset";
  @SerializedName(SERIALIZED_NAME_MICRO_APP_ASSET)
  private EventManagerAssetsCreateV2RequestMicroAppAsset microAppAsset = null;

  public static final String SERIALIZED_NAME_QUICK_APP_ASSET = "quick_app_asset";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_ASSET)
  private EventManagerAssetsCreateV2RequestQuickAppAsset quickAppAsset = null;

  public static final String SERIALIZED_NAME_SITE_ASSET = "site_asset";
  @SerializedName(SERIALIZED_NAME_SITE_ASSET)
  private EventManagerAssetsCreateV2RequestSiteAsset siteAsset = null;

  public static final String SERIALIZED_NAME_THIRD_PART_ASSET = "third_part_asset";
  @SerializedName(SERIALIZED_NAME_THIRD_PART_ASSET)
  private EventManagerAssetsCreateV2RequestThirdPartAsset thirdPartAsset = null;

  public EventManagerAssetsCreateV2Request() {
  }

  public EventManagerAssetsCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public EventManagerAssetsCreateV2Request appAsset(EventManagerAssetsCreateV2RequestAppAsset appAsset) {
    
    this.appAsset = appAsset;
    return this;
  }

   /**
   * Get appAsset
   * @return appAsset
  **/
  @javax.annotation.Nullable
  public EventManagerAssetsCreateV2RequestAppAsset getAppAsset() {
    return appAsset;
  }


  public void setAppAsset(EventManagerAssetsCreateV2RequestAppAsset appAsset) {
    this.appAsset = appAsset;
  }


  public EventManagerAssetsCreateV2Request assetType(EventManagerAssetsCreateV2AssetType assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Get assetType
   * @return assetType
  **/
  @javax.annotation.Nonnull
  public EventManagerAssetsCreateV2AssetType getAssetType() {
    return assetType;
  }


  public void setAssetType(EventManagerAssetsCreateV2AssetType assetType) {
    this.assetType = assetType;
  }


  public EventManagerAssetsCreateV2Request microAppAsset(EventManagerAssetsCreateV2RequestMicroAppAsset microAppAsset) {
    
    this.microAppAsset = microAppAsset;
    return this;
  }

   /**
   * Get microAppAsset
   * @return microAppAsset
  **/
  @javax.annotation.Nullable
  public EventManagerAssetsCreateV2RequestMicroAppAsset getMicroAppAsset() {
    return microAppAsset;
  }


  public void setMicroAppAsset(EventManagerAssetsCreateV2RequestMicroAppAsset microAppAsset) {
    this.microAppAsset = microAppAsset;
  }


  public EventManagerAssetsCreateV2Request quickAppAsset(EventManagerAssetsCreateV2RequestQuickAppAsset quickAppAsset) {
    
    this.quickAppAsset = quickAppAsset;
    return this;
  }

   /**
   * Get quickAppAsset
   * @return quickAppAsset
  **/
  @javax.annotation.Nullable
  public EventManagerAssetsCreateV2RequestQuickAppAsset getQuickAppAsset() {
    return quickAppAsset;
  }


  public void setQuickAppAsset(EventManagerAssetsCreateV2RequestQuickAppAsset quickAppAsset) {
    this.quickAppAsset = quickAppAsset;
  }


  public EventManagerAssetsCreateV2Request siteAsset(EventManagerAssetsCreateV2RequestSiteAsset siteAsset) {
    
    this.siteAsset = siteAsset;
    return this;
  }

   /**
   * Get siteAsset
   * @return siteAsset
  **/
  @javax.annotation.Nullable
  public EventManagerAssetsCreateV2RequestSiteAsset getSiteAsset() {
    return siteAsset;
  }


  public void setSiteAsset(EventManagerAssetsCreateV2RequestSiteAsset siteAsset) {
    this.siteAsset = siteAsset;
  }


  public EventManagerAssetsCreateV2Request thirdPartAsset(EventManagerAssetsCreateV2RequestThirdPartAsset thirdPartAsset) {
    
    this.thirdPartAsset = thirdPartAsset;
    return this;
  }

   /**
   * Get thirdPartAsset
   * @return thirdPartAsset
  **/
  @javax.annotation.Nullable
  public EventManagerAssetsCreateV2RequestThirdPartAsset getThirdPartAsset() {
    return thirdPartAsset;
  }


  public void setThirdPartAsset(EventManagerAssetsCreateV2RequestThirdPartAsset thirdPartAsset) {
    this.thirdPartAsset = thirdPartAsset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAssetsCreateV2Request eventManagerAssetsCreateV2Request = (EventManagerAssetsCreateV2Request) o;
    return Objects.equals(this.advertiserId, eventManagerAssetsCreateV2Request.advertiserId) &&
        Objects.equals(this.appAsset, eventManagerAssetsCreateV2Request.appAsset) &&
        Objects.equals(this.assetType, eventManagerAssetsCreateV2Request.assetType) &&
        Objects.equals(this.microAppAsset, eventManagerAssetsCreateV2Request.microAppAsset) &&
        Objects.equals(this.quickAppAsset, eventManagerAssetsCreateV2Request.quickAppAsset) &&
        Objects.equals(this.siteAsset, eventManagerAssetsCreateV2Request.siteAsset) &&
        Objects.equals(this.thirdPartAsset, eventManagerAssetsCreateV2Request.thirdPartAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appAsset, assetType, microAppAsset, quickAppAsset, siteAsset, thirdPartAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerAssetsCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appAsset: ").append(toIndentedString(appAsset)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    microAppAsset: ").append(toIndentedString(microAppAsset)).append("\n");
    sb.append("    quickAppAsset: ").append(toIndentedString(quickAppAsset)).append("\n");
    sb.append("    siteAsset: ").append(toIndentedString(siteAsset)).append("\n");
    sb.append("    thirdPartAsset: ").append(toIndentedString(thirdPartAsset)).append("\n");
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
    openapiFields.add("app_asset");
    openapiFields.add("asset_type");
    openapiFields.add("micro_app_asset");
    openapiFields.add("quick_app_asset");
    openapiFields.add("site_asset");
    openapiFields.add("third_part_asset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("asset_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAssetsCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAssetsCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAssetsCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAssetsCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAssetsCreateV2Request>() {
           @Override
           public void write(JsonWriter out, EventManagerAssetsCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAssetsCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAssetsCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAssetsCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to EventManagerAssetsCreateV2Request
  */
  public static EventManagerAssetsCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAssetsCreateV2Request.class);
  }

 /**
  * Convert an instance of EventManagerAssetsCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

