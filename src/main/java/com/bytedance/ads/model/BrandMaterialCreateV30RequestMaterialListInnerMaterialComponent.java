/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentBusinessUrl;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentCommonExternal;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTime;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExternalTitle;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentIesCoreUser;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentSearch;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent {
  public static final String SERIALIZED_NAME_AWEME_ANCHOR = "aweme_anchor";
  @SerializedName(SERIALIZED_NAME_AWEME_ANCHOR)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor awemeAnchor = null;

  public static final String SERIALIZED_NAME_AWEME_VIDEO = "aweme_video";
  @SerializedName(SERIALIZED_NAME_AWEME_VIDEO)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo awemeVideo = null;

  public static final String SERIALIZED_NAME_BUSINESS_URL = "business_url";
  @SerializedName(SERIALIZED_NAME_BUSINESS_URL)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentBusinessUrl businessUrl = null;

  public static final String SERIALIZED_NAME_COMMON_EXTERNAL = "common_external";
  @SerializedName(SERIALIZED_NAME_COMMON_EXTERNAL)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentCommonExternal commonExternal = null;

  public static final String SERIALIZED_NAME_DELIVERY_TIME_LIST = "delivery_time_list";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIME_LIST)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList deliveryTimeList = null;

  public static final String SERIALIZED_NAME_EXPLORE_ONE_TIME = "explore_one_time";
  @SerializedName(SERIALIZED_NAME_EXPLORE_ONE_TIME)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTime exploreOneTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_TITLE = "external_title";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TITLE)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExternalTitle externalTitle = null;

  public static final String SERIALIZED_NAME_IES_CORE_USER = "ies_core_user";
  @SerializedName(SERIALIZED_NAME_IES_CORE_USER)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentIesCoreUser iesCoreUser = null;

  public static final String SERIALIZED_NAME_IMAGE_CARD = "image_card";
  @SerializedName(SERIALIZED_NAME_IMAGE_CARD)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard imageCard = null;

  public static final String SERIALIZED_NAME_SEARCH = "search";
  @SerializedName(SERIALIZED_NAME_SEARCH)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentSearch search = null;

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent() {
  }

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent awemeAnchor(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor awemeAnchor) {
    
    this.awemeAnchor = awemeAnchor;
    return this;
  }

   /**
   * Get awemeAnchor
   * @return awemeAnchor
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor getAwemeAnchor() {
    return awemeAnchor;
  }


  public void setAwemeAnchor(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeAnchor awemeAnchor) {
    this.awemeAnchor = awemeAnchor;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent awemeVideo(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo awemeVideo) {
    
    this.awemeVideo = awemeVideo;
    return this;
  }

   /**
   * Get awemeVideo
   * @return awemeVideo
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo getAwemeVideo() {
    return awemeVideo;
  }


  public void setAwemeVideo(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentAwemeVideo awemeVideo) {
    this.awemeVideo = awemeVideo;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent businessUrl(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentBusinessUrl businessUrl) {
    
    this.businessUrl = businessUrl;
    return this;
  }

   /**
   * Get businessUrl
   * @return businessUrl
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentBusinessUrl getBusinessUrl() {
    return businessUrl;
  }


  public void setBusinessUrl(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentBusinessUrl businessUrl) {
    this.businessUrl = businessUrl;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent commonExternal(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentCommonExternal commonExternal) {
    
    this.commonExternal = commonExternal;
    return this;
  }

   /**
   * Get commonExternal
   * @return commonExternal
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentCommonExternal getCommonExternal() {
    return commonExternal;
  }


  public void setCommonExternal(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentCommonExternal commonExternal) {
    this.commonExternal = commonExternal;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent deliveryTimeList(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList deliveryTimeList) {
    
    this.deliveryTimeList = deliveryTimeList;
    return this;
  }

   /**
   * Get deliveryTimeList
   * @return deliveryTimeList
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList getDeliveryTimeList() {
    return deliveryTimeList;
  }


  public void setDeliveryTimeList(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList deliveryTimeList) {
    this.deliveryTimeList = deliveryTimeList;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent exploreOneTime(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTime exploreOneTime) {
    
    this.exploreOneTime = exploreOneTime;
    return this;
  }

   /**
   * Get exploreOneTime
   * @return exploreOneTime
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTime getExploreOneTime() {
    return exploreOneTime;
  }


  public void setExploreOneTime(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExploreOneTime exploreOneTime) {
    this.exploreOneTime = exploreOneTime;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent externalTitle(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExternalTitle externalTitle) {
    
    this.externalTitle = externalTitle;
    return this;
  }

   /**
   * Get externalTitle
   * @return externalTitle
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExternalTitle getExternalTitle() {
    return externalTitle;
  }


  public void setExternalTitle(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentExternalTitle externalTitle) {
    this.externalTitle = externalTitle;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent iesCoreUser(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentIesCoreUser iesCoreUser) {
    
    this.iesCoreUser = iesCoreUser;
    return this;
  }

   /**
   * Get iesCoreUser
   * @return iesCoreUser
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentIesCoreUser getIesCoreUser() {
    return iesCoreUser;
  }


  public void setIesCoreUser(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentIesCoreUser iesCoreUser) {
    this.iesCoreUser = iesCoreUser;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent imageCard(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard imageCard) {
    
    this.imageCard = imageCard;
    return this;
  }

   /**
   * Get imageCard
   * @return imageCard
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard getImageCard() {
    return imageCard;
  }


  public void setImageCard(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard imageCard) {
    this.imageCard = imageCard;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent search(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentSearch search) {
    
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentSearch getSearch() {
    return search;
  }


  public void setSearch(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentSearch search) {
    this.search = search;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent brandMaterialCreateV30RequestMaterialListInnerMaterialComponent = (BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent) o;
    return Objects.equals(this.awemeAnchor, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.awemeAnchor) &&
        Objects.equals(this.awemeVideo, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.awemeVideo) &&
        Objects.equals(this.businessUrl, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.businessUrl) &&
        Objects.equals(this.commonExternal, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.commonExternal) &&
        Objects.equals(this.deliveryTimeList, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.deliveryTimeList) &&
        Objects.equals(this.exploreOneTime, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.exploreOneTime) &&
        Objects.equals(this.externalTitle, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.externalTitle) &&
        Objects.equals(this.iesCoreUser, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.iesCoreUser) &&
        Objects.equals(this.imageCard, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.imageCard) &&
        Objects.equals(this.search, brandMaterialCreateV30RequestMaterialListInnerMaterialComponent.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAnchor, awemeVideo, businessUrl, commonExternal, deliveryTimeList, exploreOneTime, externalTitle, iesCoreUser, imageCard, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent {\n");
    sb.append("    awemeAnchor: ").append(toIndentedString(awemeAnchor)).append("\n");
    sb.append("    awemeVideo: ").append(toIndentedString(awemeVideo)).append("\n");
    sb.append("    businessUrl: ").append(toIndentedString(businessUrl)).append("\n");
    sb.append("    commonExternal: ").append(toIndentedString(commonExternal)).append("\n");
    sb.append("    deliveryTimeList: ").append(toIndentedString(deliveryTimeList)).append("\n");
    sb.append("    exploreOneTime: ").append(toIndentedString(exploreOneTime)).append("\n");
    sb.append("    externalTitle: ").append(toIndentedString(externalTitle)).append("\n");
    sb.append("    iesCoreUser: ").append(toIndentedString(iesCoreUser)).append("\n");
    sb.append("    imageCard: ").append(toIndentedString(imageCard)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
    openapiFields.add("aweme_anchor");
    openapiFields.add("aweme_video");
    openapiFields.add("business_url");
    openapiFields.add("common_external");
    openapiFields.add("delivery_time_list");
    openapiFields.add("explore_one_time");
    openapiFields.add("external_title");
    openapiFields.add("ies_core_user");
    openapiFields.add("image_card");
    openapiFields.add("search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent
  */
  public static BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

