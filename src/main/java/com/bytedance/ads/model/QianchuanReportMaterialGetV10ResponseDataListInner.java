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
import com.bytedance.ads.model.QianchuanReportMaterialGetV10DataListCarouselSource;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10DataListImageSource;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10DataListMaterialMode;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10DataListMaterialType;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10DataListVideoSource;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10ResponseDataListInnerFields;
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
 * QianchuanReportMaterialGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class QianchuanReportMaterialGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ANALYSIS_TYPE = "analysis_type";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_TYPE)
  private List<String> analysisType = null;

  public static final String SERIALIZED_NAME_CAROUSEL_SOURCE = "carousel_source";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_SOURCE)
  private QianchuanReportMaterialGetV10DataListCarouselSource carouselSource = null;

  public static final String SERIALIZED_NAME_CREATE_DATA = "create_data";
  @SerializedName(SERIALIZED_NAME_CREATE_DATA)
  private String createData = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private QianchuanReportMaterialGetV10ResponseDataListInnerFields fields = null;

  public static final String SERIALIZED_NAME_IMAGE_SOURCE = "image_source";
  @SerializedName(SERIALIZED_NAME_IMAGE_SOURCE)
  private QianchuanReportMaterialGetV10DataListImageSource imageSource = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_MODE = "material_mode";
  @SerializedName(SERIALIZED_NAME_MATERIAL_MODE)
  private QianchuanReportMaterialGetV10DataListMaterialMode materialMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private QianchuanReportMaterialGetV10DataListMaterialType materialType = null;

  public static final String SERIALIZED_NAME_RELATED_AD_CNT = "related_ad_cnt";
  @SerializedName(SERIALIZED_NAME_RELATED_AD_CNT)
  private Long relatedAdCnt = null;

  public static final String SERIALIZED_NAME_RELATED_AD_IDS = "related_ad_ids";
  @SerializedName(SERIALIZED_NAME_RELATED_AD_IDS)
  private List<Long> relatedAdIds = null;

  public static final String SERIALIZED_NAME_RELATED_CREATIVE_CNT = "related_creative_cnt";
  @SerializedName(SERIALIZED_NAME_RELATED_CREATIVE_CNT)
  private Long relatedCreativeCnt = null;

  public static final String SERIALIZED_NAME_RELATED_CREATIVE_IDS = "related_creative_ids";
  @SerializedName(SERIALIZED_NAME_RELATED_CREATIVE_IDS)
  private List<Long> relatedCreativeIds = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private String tags = null;

  public static final String SERIALIZED_NAME_VIDEO_SOURCE = "video_source";
  @SerializedName(SERIALIZED_NAME_VIDEO_SOURCE)
  private QianchuanReportMaterialGetV10DataListVideoSource videoSource = null;

  public QianchuanReportMaterialGetV10ResponseDataListInner() {
  }

  public QianchuanReportMaterialGetV10ResponseDataListInner advertiserId(Long advertiserId) {
    
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


  public QianchuanReportMaterialGetV10ResponseDataListInner analysisType(List<String> analysisType) {
    
    this.analysisType = analysisType;
    return this;
  }

  public QianchuanReportMaterialGetV10ResponseDataListInner addAnalysisTypeItem(String analysisTypeItem) {
    if (this.analysisType == null) {
      this.analysisType = new ArrayList<>();
    }
    this.analysisType.add(analysisTypeItem);
    return this;
  }

   /**
   * 
   * @return analysisType
  **/
  @javax.annotation.Nullable
  public List<String> getAnalysisType() {
    return analysisType;
  }


  public void setAnalysisType(List<String> analysisType) {
    this.analysisType = analysisType;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner carouselSource(QianchuanReportMaterialGetV10DataListCarouselSource carouselSource) {
    
    this.carouselSource = carouselSource;
    return this;
  }

   /**
   * Get carouselSource
   * @return carouselSource
  **/
  @javax.annotation.Nullable
  public QianchuanReportMaterialGetV10DataListCarouselSource getCarouselSource() {
    return carouselSource;
  }


  public void setCarouselSource(QianchuanReportMaterialGetV10DataListCarouselSource carouselSource) {
    this.carouselSource = carouselSource;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner createData(String createData) {
    
    this.createData = createData;
    return this;
  }

   /**
   * 
   * @return createData
  **/
  @javax.annotation.Nullable
  public String getCreateData() {
    return createData;
  }


  public void setCreateData(String createData) {
    this.createData = createData;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner fields(QianchuanReportMaterialGetV10ResponseDataListInnerFields fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  public QianchuanReportMaterialGetV10ResponseDataListInnerFields getFields() {
    return fields;
  }


  public void setFields(QianchuanReportMaterialGetV10ResponseDataListInnerFields fields) {
    this.fields = fields;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner imageSource(QianchuanReportMaterialGetV10DataListImageSource imageSource) {
    
    this.imageSource = imageSource;
    return this;
  }

   /**
   * Get imageSource
   * @return imageSource
  **/
  @javax.annotation.Nullable
  public QianchuanReportMaterialGetV10DataListImageSource getImageSource() {
    return imageSource;
  }


  public void setImageSource(QianchuanReportMaterialGetV10DataListImageSource imageSource) {
    this.imageSource = imageSource;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner materialId(Long materialId) {
    
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


  public QianchuanReportMaterialGetV10ResponseDataListInner materialMode(QianchuanReportMaterialGetV10DataListMaterialMode materialMode) {
    
    this.materialMode = materialMode;
    return this;
  }

   /**
   * Get materialMode
   * @return materialMode
  **/
  @javax.annotation.Nullable
  public QianchuanReportMaterialGetV10DataListMaterialMode getMaterialMode() {
    return materialMode;
  }


  public void setMaterialMode(QianchuanReportMaterialGetV10DataListMaterialMode materialMode) {
    this.materialMode = materialMode;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner materialType(QianchuanReportMaterialGetV10DataListMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public QianchuanReportMaterialGetV10DataListMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(QianchuanReportMaterialGetV10DataListMaterialType materialType) {
    this.materialType = materialType;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner relatedAdCnt(Long relatedAdCnt) {
    
    this.relatedAdCnt = relatedAdCnt;
    return this;
  }

   /**
   * 
   * @return relatedAdCnt
  **/
  @javax.annotation.Nullable
  public Long getRelatedAdCnt() {
    return relatedAdCnt;
  }


  public void setRelatedAdCnt(Long relatedAdCnt) {
    this.relatedAdCnt = relatedAdCnt;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner relatedAdIds(List<Long> relatedAdIds) {
    
    this.relatedAdIds = relatedAdIds;
    return this;
  }

  public QianchuanReportMaterialGetV10ResponseDataListInner addRelatedAdIdsItem(Long relatedAdIdsItem) {
    if (this.relatedAdIds == null) {
      this.relatedAdIds = new ArrayList<>();
    }
    this.relatedAdIds.add(relatedAdIdsItem);
    return this;
  }

   /**
   * 
   * @return relatedAdIds
  **/
  @javax.annotation.Nullable
  public List<Long> getRelatedAdIds() {
    return relatedAdIds;
  }


  public void setRelatedAdIds(List<Long> relatedAdIds) {
    this.relatedAdIds = relatedAdIds;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner relatedCreativeCnt(Long relatedCreativeCnt) {
    
    this.relatedCreativeCnt = relatedCreativeCnt;
    return this;
  }

   /**
   * 
   * @return relatedCreativeCnt
  **/
  @javax.annotation.Nullable
  public Long getRelatedCreativeCnt() {
    return relatedCreativeCnt;
  }


  public void setRelatedCreativeCnt(Long relatedCreativeCnt) {
    this.relatedCreativeCnt = relatedCreativeCnt;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner relatedCreativeIds(List<Long> relatedCreativeIds) {
    
    this.relatedCreativeIds = relatedCreativeIds;
    return this;
  }

  public QianchuanReportMaterialGetV10ResponseDataListInner addRelatedCreativeIdsItem(Long relatedCreativeIdsItem) {
    if (this.relatedCreativeIds == null) {
      this.relatedCreativeIds = new ArrayList<>();
    }
    this.relatedCreativeIds.add(relatedCreativeIdsItem);
    return this;
  }

   /**
   * 
   * @return relatedCreativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getRelatedCreativeIds() {
    return relatedCreativeIds;
  }


  public void setRelatedCreativeIds(List<Long> relatedCreativeIds) {
    this.relatedCreativeIds = relatedCreativeIds;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner tags(String tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  public String getTags() {
    return tags;
  }


  public void setTags(String tags) {
    this.tags = tags;
  }


  public QianchuanReportMaterialGetV10ResponseDataListInner videoSource(QianchuanReportMaterialGetV10DataListVideoSource videoSource) {
    
    this.videoSource = videoSource;
    return this;
  }

   /**
   * Get videoSource
   * @return videoSource
  **/
  @javax.annotation.Nullable
  public QianchuanReportMaterialGetV10DataListVideoSource getVideoSource() {
    return videoSource;
  }


  public void setVideoSource(QianchuanReportMaterialGetV10DataListVideoSource videoSource) {
    this.videoSource = videoSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportMaterialGetV10ResponseDataListInner qianchuanReportMaterialGetV10ResponseDataListInner = (QianchuanReportMaterialGetV10ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, qianchuanReportMaterialGetV10ResponseDataListInner.advertiserId) &&
        Objects.equals(this.analysisType, qianchuanReportMaterialGetV10ResponseDataListInner.analysisType) &&
        Objects.equals(this.carouselSource, qianchuanReportMaterialGetV10ResponseDataListInner.carouselSource) &&
        Objects.equals(this.createData, qianchuanReportMaterialGetV10ResponseDataListInner.createData) &&
        Objects.equals(this.createTime, qianchuanReportMaterialGetV10ResponseDataListInner.createTime) &&
        Objects.equals(this.duration, qianchuanReportMaterialGetV10ResponseDataListInner.duration) &&
        Objects.equals(this.fields, qianchuanReportMaterialGetV10ResponseDataListInner.fields) &&
        Objects.equals(this.imageSource, qianchuanReportMaterialGetV10ResponseDataListInner.imageSource) &&
        Objects.equals(this.materialId, qianchuanReportMaterialGetV10ResponseDataListInner.materialId) &&
        Objects.equals(this.materialMode, qianchuanReportMaterialGetV10ResponseDataListInner.materialMode) &&
        Objects.equals(this.materialType, qianchuanReportMaterialGetV10ResponseDataListInner.materialType) &&
        Objects.equals(this.relatedAdCnt, qianchuanReportMaterialGetV10ResponseDataListInner.relatedAdCnt) &&
        Objects.equals(this.relatedAdIds, qianchuanReportMaterialGetV10ResponseDataListInner.relatedAdIds) &&
        Objects.equals(this.relatedCreativeCnt, qianchuanReportMaterialGetV10ResponseDataListInner.relatedCreativeCnt) &&
        Objects.equals(this.relatedCreativeIds, qianchuanReportMaterialGetV10ResponseDataListInner.relatedCreativeIds) &&
        Objects.equals(this.tags, qianchuanReportMaterialGetV10ResponseDataListInner.tags) &&
        Objects.equals(this.videoSource, qianchuanReportMaterialGetV10ResponseDataListInner.videoSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, analysisType, carouselSource, createData, createTime, duration, fields, imageSource, materialId, materialMode, materialType, relatedAdCnt, relatedAdIds, relatedCreativeCnt, relatedCreativeIds, tags, videoSource);
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
    sb.append("class QianchuanReportMaterialGetV10ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
    sb.append("    carouselSource: ").append(toIndentedString(carouselSource)).append("\n");
    sb.append("    createData: ").append(toIndentedString(createData)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialMode: ").append(toIndentedString(materialMode)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    relatedAdCnt: ").append(toIndentedString(relatedAdCnt)).append("\n");
    sb.append("    relatedAdIds: ").append(toIndentedString(relatedAdIds)).append("\n");
    sb.append("    relatedCreativeCnt: ").append(toIndentedString(relatedCreativeCnt)).append("\n");
    sb.append("    relatedCreativeIds: ").append(toIndentedString(relatedCreativeIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    videoSource: ").append(toIndentedString(videoSource)).append("\n");
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
    openapiFields.add("analysis_type");
    openapiFields.add("carousel_source");
    openapiFields.add("create_data");
    openapiFields.add("create_time");
    openapiFields.add("duration");
    openapiFields.add("fields");
    openapiFields.add("image_source");
    openapiFields.add("material_id");
    openapiFields.add("material_mode");
    openapiFields.add("material_type");
    openapiFields.add("related_ad_cnt");
    openapiFields.add("related_ad_ids");
    openapiFields.add("related_creative_cnt");
    openapiFields.add("related_creative_ids");
    openapiFields.add("tags");
    openapiFields.add("video_source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportMaterialGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportMaterialGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportMaterialGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportMaterialGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportMaterialGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportMaterialGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportMaterialGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportMaterialGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportMaterialGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportMaterialGetV10ResponseDataListInner
  */
  public static QianchuanReportMaterialGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportMaterialGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanReportMaterialGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

