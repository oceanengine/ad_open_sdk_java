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
import com.bytedance.ads.model.CreativeGetV2DataListImageMode;
import com.bytedance.ads.model.CreativeGetV2DataListOptStatus;
import com.bytedance.ads.model.CreativeGetV2DataListStatus;
import com.bytedance.ads.model.CreativeGetV2ResponseDataListInnerMaterialsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * CreativeGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class CreativeGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_CREATIVE_CREATE_TIME = "creative_create_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CREATE_TIME)
  private String creativeCreateTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_MODIFY_TIME = "creative_modify_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MODIFY_TIME)
  private String creativeModifyTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_WORD_IDS = "creative_word_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_WORD_IDS)
  private List<Long> creativeWordIds = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeGetV2DataListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_MATERIALS = "materials";
  @SerializedName(SERIALIZED_NAME_MATERIALS)
  private List<CreativeGetV2ResponseDataListInnerMaterialsInner> materials = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private CreativeGetV2DataListOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CreativeGetV2DataListStatus status = null;

  public static final String SERIALIZED_NAME_THIRD_PARTY_ID = "third_party_id";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_ID)
  private String thirdPartyId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public CreativeGetV2ResponseDataListInner() {
  }

  public CreativeGetV2ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public CreativeGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CreativeGetV2ResponseDataListInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public CreativeGetV2ResponseDataListInner creativeCreateTime(String creativeCreateTime) {
    
    this.creativeCreateTime = creativeCreateTime;
    return this;
  }

   /**
   * 
   * @return creativeCreateTime
  **/
  @javax.annotation.Nullable
  public String getCreativeCreateTime() {
    return creativeCreateTime;
  }


  public void setCreativeCreateTime(String creativeCreateTime) {
    this.creativeCreateTime = creativeCreateTime;
  }


  public CreativeGetV2ResponseDataListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public CreativeGetV2ResponseDataListInner creativeModifyTime(String creativeModifyTime) {
    
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

   /**
   * 
   * @return creativeModifyTime
  **/
  @javax.annotation.Nullable
  public String getCreativeModifyTime() {
    return creativeModifyTime;
  }


  public void setCreativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
  }


  public CreativeGetV2ResponseDataListInner creativeWordIds(List<Long> creativeWordIds) {
    
    this.creativeWordIds = creativeWordIds;
    return this;
  }

  public CreativeGetV2ResponseDataListInner addCreativeWordIdsItem(Long creativeWordIdsItem) {
    if (this.creativeWordIds == null) {
      this.creativeWordIds = new ArrayList<>();
    }
    this.creativeWordIds.add(creativeWordIdsItem);
    return this;
  }

   /**
   * 
   * @return creativeWordIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeWordIds() {
    return creativeWordIds;
  }


  public void setCreativeWordIds(List<Long> creativeWordIds) {
    this.creativeWordIds = creativeWordIds;
  }


  public CreativeGetV2ResponseDataListInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public CreativeGetV2ResponseDataListInner imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public CreativeGetV2ResponseDataListInner addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public CreativeGetV2ResponseDataListInner imageMode(CreativeGetV2DataListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeGetV2DataListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeGetV2DataListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeGetV2ResponseDataListInner materials(List<CreativeGetV2ResponseDataListInnerMaterialsInner> materials) {
    
    this.materials = materials;
    return this;
  }

  public CreativeGetV2ResponseDataListInner addMaterialsItem(CreativeGetV2ResponseDataListInnerMaterialsInner materialsItem) {
    if (this.materials == null) {
      this.materials = new ArrayList<>();
    }
    this.materials.add(materialsItem);
    return this;
  }

   /**
   * 
   * @return materials
  **/
  @javax.annotation.Nullable
  public List<CreativeGetV2ResponseDataListInnerMaterialsInner> getMaterials() {
    return materials;
  }


  public void setMaterials(List<CreativeGetV2ResponseDataListInnerMaterialsInner> materials) {
    this.materials = materials;
  }


  public CreativeGetV2ResponseDataListInner optStatus(CreativeGetV2DataListOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public CreativeGetV2DataListOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(CreativeGetV2DataListOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public CreativeGetV2ResponseDataListInner status(CreativeGetV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public CreativeGetV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(CreativeGetV2DataListStatus status) {
    this.status = status;
  }


  public CreativeGetV2ResponseDataListInner thirdPartyId(String thirdPartyId) {
    
    this.thirdPartyId = thirdPartyId;
    return this;
  }

   /**
   * 
   * @return thirdPartyId
  **/
  @javax.annotation.Nullable
  public String getThirdPartyId() {
    return thirdPartyId;
  }


  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }


  public CreativeGetV2ResponseDataListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreativeGetV2ResponseDataListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeGetV2ResponseDataListInner creativeGetV2ResponseDataListInner = (CreativeGetV2ResponseDataListInner) o;
    return Objects.equals(this.adId, creativeGetV2ResponseDataListInner.adId) &&
        Objects.equals(this.advertiserId, creativeGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.awemeItemId, creativeGetV2ResponseDataListInner.awemeItemId) &&
        Objects.equals(this.creativeCreateTime, creativeGetV2ResponseDataListInner.creativeCreateTime) &&
        Objects.equals(this.creativeId, creativeGetV2ResponseDataListInner.creativeId) &&
        Objects.equals(this.creativeModifyTime, creativeGetV2ResponseDataListInner.creativeModifyTime) &&
        Objects.equals(this.creativeWordIds, creativeGetV2ResponseDataListInner.creativeWordIds) &&
        Objects.equals(this.imageId, creativeGetV2ResponseDataListInner.imageId) &&
        Objects.equals(this.imageIds, creativeGetV2ResponseDataListInner.imageIds) &&
        Objects.equals(this.imageMode, creativeGetV2ResponseDataListInner.imageMode) &&
        Objects.equals(this.materials, creativeGetV2ResponseDataListInner.materials) &&
        Objects.equals(this.optStatus, creativeGetV2ResponseDataListInner.optStatus) &&
        Objects.equals(this.status, creativeGetV2ResponseDataListInner.status) &&
        Objects.equals(this.thirdPartyId, creativeGetV2ResponseDataListInner.thirdPartyId) &&
        Objects.equals(this.title, creativeGetV2ResponseDataListInner.title) &&
        Objects.equals(this.videoId, creativeGetV2ResponseDataListInner.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, awemeItemId, creativeCreateTime, creativeId, creativeModifyTime, creativeWordIds, imageId, imageIds, imageMode, materials, optStatus, status, thirdPartyId, title, videoId);
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
    sb.append("class CreativeGetV2ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    creativeCreateTime: ").append(toIndentedString(creativeCreateTime)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeModifyTime: ").append(toIndentedString(creativeModifyTime)).append("\n");
    sb.append("    creativeWordIds: ").append(toIndentedString(creativeWordIds)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thirdPartyId: ").append(toIndentedString(thirdPartyId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("creative_create_time");
    openapiFields.add("creative_id");
    openapiFields.add("creative_modify_time");
    openapiFields.add("creative_word_ids");
    openapiFields.add("image_id");
    openapiFields.add("image_ids");
    openapiFields.add("image_mode");
    openapiFields.add("materials");
    openapiFields.add("opt_status");
    openapiFields.add("status");
    openapiFields.add("third_party_id");
    openapiFields.add("title");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, CreativeGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeGetV2ResponseDataListInner
  */
  public static CreativeGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of CreativeGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

