/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCreativeCreateV30CreativeDisplayMode;
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCategoryInfo;
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInner;
import com.bytedance.ads.model.BrandCreativeCreateV30RequestTrackUrlInfo;
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
 * BrandCreativeCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class BrandCreativeCreateV30Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CATEGORY_INFO = "category_info";
  @SerializedName(SERIALIZED_NAME_CATEGORY_INFO)
  private BrandCreativeCreateV30RequestCategoryInfo categoryInfo = null;

  public static final String SERIALIZED_NAME_CREATIVE_DISPLAY_MODE = "creative_display_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_DISPLAY_MODE)
  private BrandCreativeCreateV30CreativeDisplayMode creativeDisplayMode = null;

  public static final String SERIALIZED_NAME_CREATIVE_LIST = "creative_list";
  @SerializedName(SERIALIZED_NAME_CREATIVE_LIST)
  private List<BrandCreativeCreateV30RequestCreativeListInner> creativeList = null;

  public static final String SERIALIZED_NAME_STAFF_ID = "staff_id";
  @SerializedName(SERIALIZED_NAME_STAFF_ID)
  private Long staffId = null;

  public static final String SERIALIZED_NAME_TRACK_URL_INFO = "track_url_info";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_INFO)
  private BrandCreativeCreateV30RequestTrackUrlInfo trackUrlInfo = null;

  public BrandCreativeCreateV30Request() {
  }

  public BrandCreativeCreateV30Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划id
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public BrandCreativeCreateV30Request advertiserId(Long advertiserId) {
    
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


  public BrandCreativeCreateV30Request categoryInfo(BrandCreativeCreateV30RequestCategoryInfo categoryInfo) {
    
    this.categoryInfo = categoryInfo;
    return this;
  }

   /**
   * Get categoryInfo
   * @return categoryInfo
  **/
  @javax.annotation.Nonnull
  public BrandCreativeCreateV30RequestCategoryInfo getCategoryInfo() {
    return categoryInfo;
  }


  public void setCategoryInfo(BrandCreativeCreateV30RequestCategoryInfo categoryInfo) {
    this.categoryInfo = categoryInfo;
  }


  public BrandCreativeCreateV30Request creativeDisplayMode(BrandCreativeCreateV30CreativeDisplayMode creativeDisplayMode) {
    
    this.creativeDisplayMode = creativeDisplayMode;
    return this;
  }

   /**
   * Get creativeDisplayMode
   * @return creativeDisplayMode
  **/
  @javax.annotation.Nonnull
  public BrandCreativeCreateV30CreativeDisplayMode getCreativeDisplayMode() {
    return creativeDisplayMode;
  }


  public void setCreativeDisplayMode(BrandCreativeCreateV30CreativeDisplayMode creativeDisplayMode) {
    this.creativeDisplayMode = creativeDisplayMode;
  }


  public BrandCreativeCreateV30Request creativeList(List<BrandCreativeCreateV30RequestCreativeListInner> creativeList) {
    
    this.creativeList = creativeList;
    return this;
  }

  public BrandCreativeCreateV30Request addCreativeListItem(BrandCreativeCreateV30RequestCreativeListInner creativeListItem) {
    if (this.creativeList == null) {
      this.creativeList = new ArrayList<>();
    }
    this.creativeList.add(creativeListItem);
    return this;
  }

   /**
   * 创意列表
   * @return creativeList
  **/
  @javax.annotation.Nonnull
  public List<BrandCreativeCreateV30RequestCreativeListInner> getCreativeList() {
    return creativeList;
  }


  public void setCreativeList(List<BrandCreativeCreateV30RequestCreativeListInner> creativeList) {
    this.creativeList = creativeList;
  }


  public BrandCreativeCreateV30Request staffId(Long staffId) {
    
    this.staffId = staffId;
    return this;
  }

   /**
   * 代理商员工id
   * @return staffId
  **/
  @javax.annotation.Nullable
  public Long getStaffId() {
    return staffId;
  }


  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }


  public BrandCreativeCreateV30Request trackUrlInfo(BrandCreativeCreateV30RequestTrackUrlInfo trackUrlInfo) {
    
    this.trackUrlInfo = trackUrlInfo;
    return this;
  }

   /**
   * Get trackUrlInfo
   * @return trackUrlInfo
  **/
  @javax.annotation.Nonnull
  public BrandCreativeCreateV30RequestTrackUrlInfo getTrackUrlInfo() {
    return trackUrlInfo;
  }


  public void setTrackUrlInfo(BrandCreativeCreateV30RequestTrackUrlInfo trackUrlInfo) {
    this.trackUrlInfo = trackUrlInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeCreateV30Request brandCreativeCreateV30Request = (BrandCreativeCreateV30Request) o;
    return Objects.equals(this.adId, brandCreativeCreateV30Request.adId) &&
        Objects.equals(this.advertiserId, brandCreativeCreateV30Request.advertiserId) &&
        Objects.equals(this.categoryInfo, brandCreativeCreateV30Request.categoryInfo) &&
        Objects.equals(this.creativeDisplayMode, brandCreativeCreateV30Request.creativeDisplayMode) &&
        Objects.equals(this.creativeList, brandCreativeCreateV30Request.creativeList) &&
        Objects.equals(this.staffId, brandCreativeCreateV30Request.staffId) &&
        Objects.equals(this.trackUrlInfo, brandCreativeCreateV30Request.trackUrlInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, categoryInfo, creativeDisplayMode, creativeList, staffId, trackUrlInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeCreateV30Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    categoryInfo: ").append(toIndentedString(categoryInfo)).append("\n");
    sb.append("    creativeDisplayMode: ").append(toIndentedString(creativeDisplayMode)).append("\n");
    sb.append("    creativeList: ").append(toIndentedString(creativeList)).append("\n");
    sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
    sb.append("    trackUrlInfo: ").append(toIndentedString(trackUrlInfo)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("category_info");
    openapiFields.add("creative_display_mode");
    openapiFields.add("creative_list");
    openapiFields.add("staff_id");
    openapiFields.add("track_url_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("category_info");
    openapiRequiredFields.add("creative_display_mode");
    openapiRequiredFields.add("creative_list");
    openapiRequiredFields.add("track_url_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeCreateV30Request>() {
           @Override
           public void write(JsonWriter out, BrandCreativeCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeCreateV30Request
  */
  public static BrandCreativeCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeCreateV30Request.class);
  }

 /**
  * Convert an instance of BrandCreativeCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

