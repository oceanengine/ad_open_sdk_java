/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30DataListPromotionRelatedProductVideoMateralListImageMode;
import com.bytedance.ads.model.PromotionListV30DataListPromotionRelatedProductVideoMateralListIsCarryMaterial;
import com.bytedance.ads.model.PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialOptStatus;
import com.bytedance.ads.model.PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialStatus;
import com.bytedance.ads.model.PromotionListV30DataListPromotionRelatedProductVideoMateralListVideoHpVisibility;
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
 * PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionListV30DataListPromotionRelatedProductVideoMateralListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IS_CARRY_MATERIAL = "is_carry_material";
  @SerializedName(SERIALIZED_NAME_IS_CARRY_MATERIAL)
  private PromotionListV30DataListPromotionRelatedProductVideoMateralListIsCarryMaterial isCarryMaterial = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_OPT_STATUS = "material_opt_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OPT_STATUS)
  private PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialOptStatus materialOptStatus = null;

  public static final String SERIALIZED_NAME_MATERIAL_STATUS = "material_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_STATUS)
  private PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialStatus materialStatus = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_HP_VISIBILITY = "video_hp_visibility";
  @SerializedName(SERIALIZED_NAME_VIDEO_HP_VISIBILITY)
  private PromotionListV30DataListPromotionRelatedProductVideoMateralListVideoHpVisibility videoHpVisibility = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VISIBLE_END_DATE = "visible_end_date";
  @SerializedName(SERIALIZED_NAME_VISIBLE_END_DATE)
  private String visibleEndDate = null;

  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner imageMode(PromotionListV30DataListPromotionRelatedProductVideoMateralListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionRelatedProductVideoMateralListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionListV30DataListPromotionRelatedProductVideoMateralListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner isCarryMaterial(PromotionListV30DataListPromotionRelatedProductVideoMateralListIsCarryMaterial isCarryMaterial) {
    
    this.isCarryMaterial = isCarryMaterial;
    return this;
  }

   /**
   * Get isCarryMaterial
   * @return isCarryMaterial
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionRelatedProductVideoMateralListIsCarryMaterial getIsCarryMaterial() {
    return isCarryMaterial;
  }


  public void setIsCarryMaterial(PromotionListV30DataListPromotionRelatedProductVideoMateralListIsCarryMaterial isCarryMaterial) {
    this.isCarryMaterial = isCarryMaterial;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner materialOptStatus(PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialOptStatus materialOptStatus) {
    
    this.materialOptStatus = materialOptStatus;
    return this;
  }

   /**
   * Get materialOptStatus
   * @return materialOptStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialOptStatus getMaterialOptStatus() {
    return materialOptStatus;
  }


  public void setMaterialOptStatus(PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialOptStatus materialOptStatus) {
    this.materialOptStatus = materialOptStatus;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner materialStatus(PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialStatus materialStatus) {
    
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Get materialStatus
   * @return materialStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialStatus getMaterialStatus() {
    return materialStatus;
  }


  public void setMaterialStatus(PromotionListV30DataListPromotionRelatedProductVideoMateralListMaterialStatus materialStatus) {
    this.materialStatus = materialStatus;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner videoCoverId(String videoCoverId) {
    
    this.videoCoverId = videoCoverId;
    return this;
  }

   /**
   * 
   * @return videoCoverId
  **/
  @javax.annotation.Nullable
  public String getVideoCoverId() {
    return videoCoverId;
  }


  public void setVideoCoverId(String videoCoverId) {
    this.videoCoverId = videoCoverId;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner videoHpVisibility(PromotionListV30DataListPromotionRelatedProductVideoMateralListVideoHpVisibility videoHpVisibility) {
    
    this.videoHpVisibility = videoHpVisibility;
    return this;
  }

   /**
   * Get videoHpVisibility
   * @return videoHpVisibility
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionRelatedProductVideoMateralListVideoHpVisibility getVideoHpVisibility() {
    return videoHpVisibility;
  }


  public void setVideoHpVisibility(PromotionListV30DataListPromotionRelatedProductVideoMateralListVideoHpVisibility videoHpVisibility) {
    this.videoHpVisibility = videoHpVisibility;
  }


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner videoId(String videoId) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner visibleEndDate(String visibleEndDate) {
    
    this.visibleEndDate = visibleEndDate;
    return this;
  }

   /**
   * 
   * @return visibleEndDate
  **/
  @javax.annotation.Nullable
  public String getVisibleEndDate() {
    return visibleEndDate;
  }


  public void setVisibleEndDate(String visibleEndDate) {
    this.visibleEndDate = visibleEndDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner = (PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner) o;
    return Objects.equals(this.imageMode, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.imageMode) &&
        Objects.equals(this.isCarryMaterial, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.isCarryMaterial) &&
        Objects.equals(this.itemId, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.itemId) &&
        Objects.equals(this.materialId, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.materialId) &&
        Objects.equals(this.materialOptStatus, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.materialOptStatus) &&
        Objects.equals(this.materialStatus, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.materialStatus) &&
        Objects.equals(this.videoCoverId, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.videoCoverId) &&
        Objects.equals(this.videoHpVisibility, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.videoHpVisibility) &&
        Objects.equals(this.videoId, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.videoId) &&
        Objects.equals(this.visibleEndDate, promotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.visibleEndDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, isCarryMaterial, itemId, materialId, materialOptStatus, materialStatus, videoCoverId, videoHpVisibility, videoId, visibleEndDate);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner {\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    isCarryMaterial: ").append(toIndentedString(isCarryMaterial)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialOptStatus: ").append(toIndentedString(materialOptStatus)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
    sb.append("    videoHpVisibility: ").append(toIndentedString(videoHpVisibility)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    visibleEndDate: ").append(toIndentedString(visibleEndDate)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("is_carry_material");
    openapiFields.add("item_id");
    openapiFields.add("material_id");
    openapiFields.add("material_opt_status");
    openapiFields.add("material_status");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_hp_visibility");
    openapiFields.add("video_id");
    openapiFields.add("visible_end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionRelatedProductInnerVideoMateralListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
