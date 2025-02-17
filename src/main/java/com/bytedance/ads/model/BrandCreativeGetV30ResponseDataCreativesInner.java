/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandCreativeGetV30DataCreativesCreativeStatus;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerCreative;
import com.bytedance.ads.model.BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo;
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
 * BrandCreativeGetV30ResponseDataCreativesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandCreativeGetV30ResponseDataCreativesInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private String adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private String advertiserId = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_NAME = "anchor_name";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NAME)
  private String anchorName = null;

  public static final String SERIALIZED_NAME_CATEGORY_INFO = "category_info";
  @SerializedName(SERIALIZED_NAME_CATEGORY_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo categoryInfo = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CREATIVE = "creative";
  @SerializedName(SERIALIZED_NAME_CREATIVE)
  private BrandCreativeGetV30ResponseDataCreativesInnerCreative creative = null;

  public static final String SERIALIZED_NAME_CREATIVE_STATUS = "creative_status";
  @SerializedName(SERIALIZED_NAME_CREATIVE_STATUS)
  private BrandCreativeGetV30DataCreativesCreativeStatus creativeStatus = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TRACK_URL_INFO = "track_url_info";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_INFO)
  private BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo trackUrlInfo = null;

  public BrandCreativeGetV30ResponseDataCreativesInner() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInner adId(String adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID
   * @return adId
  **/
  @javax.annotation.Nullable
  public String getAdId() {
    return adId;
  }


  public void setAdId(String adId) {
    this.adId = adId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner advertiserId(String advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public String getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 三方购物车锚点ID
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * 三方购物车锚点名称
   * @return anchorName
  **/
  @javax.annotation.Nullable
  public String getAnchorName() {
    return anchorName;
  }


  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner categoryInfo(BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo categoryInfo) {
    
    this.categoryInfo = categoryInfo;
    return this;
  }

   /**
   * Get categoryInfo
   * @return categoryInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo getCategoryInfo() {
    return categoryInfo;
  }


  public void setCategoryInfo(BrandCreativeGetV30ResponseDataCreativesInnerCategoryInfo categoryInfo) {
    this.categoryInfo = categoryInfo;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner creative(BrandCreativeGetV30ResponseDataCreativesInnerCreative creative) {
    
    this.creative = creative;
    return this;
  }

   /**
   * Get creative
   * @return creative
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerCreative getCreative() {
    return creative;
  }


  public void setCreative(BrandCreativeGetV30ResponseDataCreativesInnerCreative creative) {
    this.creative = creative;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner creativeStatus(BrandCreativeGetV30DataCreativesCreativeStatus creativeStatus) {
    
    this.creativeStatus = creativeStatus;
    return this;
  }

   /**
   * Get creativeStatus
   * @return creativeStatus
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30DataCreativesCreativeStatus getCreativeStatus() {
    return creativeStatus;
  }


  public void setCreativeStatus(BrandCreativeGetV30DataCreativesCreativeStatus creativeStatus) {
    this.creativeStatus = creativeStatus;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投放结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 修改时间
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投放起始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public BrandCreativeGetV30ResponseDataCreativesInner trackUrlInfo(BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo trackUrlInfo) {
    
    this.trackUrlInfo = trackUrlInfo;
    return this;
  }

   /**
   * Get trackUrlInfo
   * @return trackUrlInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo getTrackUrlInfo() {
    return trackUrlInfo;
  }


  public void setTrackUrlInfo(BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo trackUrlInfo) {
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
    BrandCreativeGetV30ResponseDataCreativesInner brandCreativeGetV30ResponseDataCreativesInner = (BrandCreativeGetV30ResponseDataCreativesInner) o;
    return Objects.equals(this.adId, brandCreativeGetV30ResponseDataCreativesInner.adId) &&
        Objects.equals(this.advertiserId, brandCreativeGetV30ResponseDataCreativesInner.advertiserId) &&
        Objects.equals(this.anchorId, brandCreativeGetV30ResponseDataCreativesInner.anchorId) &&
        Objects.equals(this.anchorName, brandCreativeGetV30ResponseDataCreativesInner.anchorName) &&
        Objects.equals(this.categoryInfo, brandCreativeGetV30ResponseDataCreativesInner.categoryInfo) &&
        Objects.equals(this.createTime, brandCreativeGetV30ResponseDataCreativesInner.createTime) &&
        Objects.equals(this.creative, brandCreativeGetV30ResponseDataCreativesInner.creative) &&
        Objects.equals(this.creativeStatus, brandCreativeGetV30ResponseDataCreativesInner.creativeStatus) &&
        Objects.equals(this.endTime, brandCreativeGetV30ResponseDataCreativesInner.endTime) &&
        Objects.equals(this.modifyTime, brandCreativeGetV30ResponseDataCreativesInner.modifyTime) &&
        Objects.equals(this.startTime, brandCreativeGetV30ResponseDataCreativesInner.startTime) &&
        Objects.equals(this.trackUrlInfo, brandCreativeGetV30ResponseDataCreativesInner.trackUrlInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, anchorId, anchorName, categoryInfo, createTime, creative, creativeStatus, endTime, modifyTime, startTime, trackUrlInfo);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
    sb.append("    categoryInfo: ").append(toIndentedString(categoryInfo)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creative: ").append(toIndentedString(creative)).append("\n");
    sb.append("    creativeStatus: ").append(toIndentedString(creativeStatus)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_name");
    openapiFields.add("category_info");
    openapiFields.add("create_time");
    openapiFields.add("creative");
    openapiFields.add("creative_status");
    openapiFields.add("end_time");
    openapiFields.add("modify_time");
    openapiFields.add("start_time");
    openapiFields.add("track_url_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInner>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInner
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInner
  */
  public static BrandCreativeGetV30ResponseDataCreativesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInner.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

