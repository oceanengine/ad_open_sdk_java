/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class LocalCxtReportConvertGetV30ResponseData {
  public static final String SERIALIZED_NAME_AD_POI_VERIFICATION_UV_CNT = "ad_poi_verification_uv_cnt";
  @SerializedName(SERIALIZED_NAME_AD_POI_VERIFICATION_UV_CNT)
  private Long adPoiVerificationUvCnt = null;

  public static final String SERIALIZED_NAME_AD_PREDICT_POI_RECOMMEND_UV_CNT_HIGH = "ad_predict_poi_recommend_uv_cnt_high";
  @SerializedName(SERIALIZED_NAME_AD_PREDICT_POI_RECOMMEND_UV_CNT_HIGH)
  private Long adPredictPoiRecommendUvCntHigh = null;

  public static final String SERIALIZED_NAME_AD_PREDICT_POI_RECOMMEND_UV_CNT_LOW = "ad_predict_poi_recommend_uv_cnt_low";
  @SerializedName(SERIALIZED_NAME_AD_PREDICT_POI_RECOMMEND_UV_CNT_LOW)
  private Long adPredictPoiRecommendUvCntLow = null;

  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Long clickCnt = null;

  public static final String SERIALIZED_NAME_POI_RECOMMEND_COUNT = "poi_recommend_count";
  @SerializedName(SERIALIZED_NAME_POI_RECOMMEND_COUNT)
  private Long poiRecommendCount = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private Long showCnt = null;

  public static final String SERIALIZED_NAME_VIDEO_OTO_PAY_ORDER_COUNT = "video_oto_pay_order_count";
  @SerializedName(SERIALIZED_NAME_VIDEO_OTO_PAY_ORDER_COUNT)
  private Long videoOtoPayOrderCount = null;

  public LocalCxtReportConvertGetV30ResponseData() {
  }

  public LocalCxtReportConvertGetV30ResponseData adPoiVerificationUvCnt(Long adPoiVerificationUvCnt) {
    
    this.adPoiVerificationUvCnt = adPoiVerificationUvCnt;
    return this;
  }

   /**
   * 
   * @return adPoiVerificationUvCnt
  **/
  @javax.annotation.Nullable
  public Long getAdPoiVerificationUvCnt() {
    return adPoiVerificationUvCnt;
  }


  public void setAdPoiVerificationUvCnt(Long adPoiVerificationUvCnt) {
    this.adPoiVerificationUvCnt = adPoiVerificationUvCnt;
  }


  public LocalCxtReportConvertGetV30ResponseData adPredictPoiRecommendUvCntHigh(Long adPredictPoiRecommendUvCntHigh) {
    
    this.adPredictPoiRecommendUvCntHigh = adPredictPoiRecommendUvCntHigh;
    return this;
  }

   /**
   * 
   * @return adPredictPoiRecommendUvCntHigh
  **/
  @javax.annotation.Nullable
  public Long getAdPredictPoiRecommendUvCntHigh() {
    return adPredictPoiRecommendUvCntHigh;
  }


  public void setAdPredictPoiRecommendUvCntHigh(Long adPredictPoiRecommendUvCntHigh) {
    this.adPredictPoiRecommendUvCntHigh = adPredictPoiRecommendUvCntHigh;
  }


  public LocalCxtReportConvertGetV30ResponseData adPredictPoiRecommendUvCntLow(Long adPredictPoiRecommendUvCntLow) {
    
    this.adPredictPoiRecommendUvCntLow = adPredictPoiRecommendUvCntLow;
    return this;
  }

   /**
   * 
   * @return adPredictPoiRecommendUvCntLow
  **/
  @javax.annotation.Nullable
  public Long getAdPredictPoiRecommendUvCntLow() {
    return adPredictPoiRecommendUvCntLow;
  }


  public void setAdPredictPoiRecommendUvCntLow(Long adPredictPoiRecommendUvCntLow) {
    this.adPredictPoiRecommendUvCntLow = adPredictPoiRecommendUvCntLow;
  }


  public LocalCxtReportConvertGetV30ResponseData clickCnt(Long clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public Long getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
  }


  public LocalCxtReportConvertGetV30ResponseData poiRecommendCount(Long poiRecommendCount) {
    
    this.poiRecommendCount = poiRecommendCount;
    return this;
  }

   /**
   * 
   * @return poiRecommendCount
  **/
  @javax.annotation.Nullable
  public Long getPoiRecommendCount() {
    return poiRecommendCount;
  }


  public void setPoiRecommendCount(Long poiRecommendCount) {
    this.poiRecommendCount = poiRecommendCount;
  }


  public LocalCxtReportConvertGetV30ResponseData showCnt(Long showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public Long getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(Long showCnt) {
    this.showCnt = showCnt;
  }


  public LocalCxtReportConvertGetV30ResponseData videoOtoPayOrderCount(Long videoOtoPayOrderCount) {
    
    this.videoOtoPayOrderCount = videoOtoPayOrderCount;
    return this;
  }

   /**
   * 
   * @return videoOtoPayOrderCount
  **/
  @javax.annotation.Nullable
  public Long getVideoOtoPayOrderCount() {
    return videoOtoPayOrderCount;
  }


  public void setVideoOtoPayOrderCount(Long videoOtoPayOrderCount) {
    this.videoOtoPayOrderCount = videoOtoPayOrderCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalCxtReportConvertGetV30ResponseData localCxtReportConvertGetV30ResponseData = (LocalCxtReportConvertGetV30ResponseData) o;
    return Objects.equals(this.adPoiVerificationUvCnt, localCxtReportConvertGetV30ResponseData.adPoiVerificationUvCnt) &&
        Objects.equals(this.adPredictPoiRecommendUvCntHigh, localCxtReportConvertGetV30ResponseData.adPredictPoiRecommendUvCntHigh) &&
        Objects.equals(this.adPredictPoiRecommendUvCntLow, localCxtReportConvertGetV30ResponseData.adPredictPoiRecommendUvCntLow) &&
        Objects.equals(this.clickCnt, localCxtReportConvertGetV30ResponseData.clickCnt) &&
        Objects.equals(this.poiRecommendCount, localCxtReportConvertGetV30ResponseData.poiRecommendCount) &&
        Objects.equals(this.showCnt, localCxtReportConvertGetV30ResponseData.showCnt) &&
        Objects.equals(this.videoOtoPayOrderCount, localCxtReportConvertGetV30ResponseData.videoOtoPayOrderCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adPoiVerificationUvCnt, adPredictPoiRecommendUvCntHigh, adPredictPoiRecommendUvCntLow, clickCnt, poiRecommendCount, showCnt, videoOtoPayOrderCount);
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
    sb.append("class LocalCxtReportConvertGetV30ResponseData {\n");
    sb.append("    adPoiVerificationUvCnt: ").append(toIndentedString(adPoiVerificationUvCnt)).append("\n");
    sb.append("    adPredictPoiRecommendUvCntHigh: ").append(toIndentedString(adPredictPoiRecommendUvCntHigh)).append("\n");
    sb.append("    adPredictPoiRecommendUvCntLow: ").append(toIndentedString(adPredictPoiRecommendUvCntLow)).append("\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    poiRecommendCount: ").append(toIndentedString(poiRecommendCount)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
    sb.append("    videoOtoPayOrderCount: ").append(toIndentedString(videoOtoPayOrderCount)).append("\n");
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
    openapiFields.add("ad_poi_verification_uv_cnt");
    openapiFields.add("ad_predict_poi_recommend_uv_cnt_high");
    openapiFields.add("ad_predict_poi_recommend_uv_cnt_low");
    openapiFields.add("click_cnt");
    openapiFields.add("poi_recommend_count");
    openapiFields.add("show_cnt");
    openapiFields.add("video_oto_pay_order_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalCxtReportConvertGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalCxtReportConvertGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalCxtReportConvertGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalCxtReportConvertGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalCxtReportConvertGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, LocalCxtReportConvertGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalCxtReportConvertGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalCxtReportConvertGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalCxtReportConvertGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to LocalCxtReportConvertGetV30ResponseData
  */
  public static LocalCxtReportConvertGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalCxtReportConvertGetV30ResponseData.class);
  }

 /**
  * Convert an instance of LocalCxtReportConvertGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

