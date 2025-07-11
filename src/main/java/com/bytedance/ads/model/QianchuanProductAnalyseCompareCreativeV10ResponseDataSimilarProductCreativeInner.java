/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeImageMode;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerTitleMaterialInner;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner;
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
 * QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner {
  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_RATE = "direct_order_pay_rate";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_RATE)
  private Double directOrderPayRate = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PAY_ROI = "direct_order_pay_roi";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PAY_ROI)
  private Double directOrderPayRoi = null;

  public static final String SERIALIZED_NAME_DIRECT_ORDER_PREPAY_AND_PAY_ROI = "direct_order_prepay_and_pay_roi";
  @SerializedName(SERIALIZED_NAME_DIRECT_ORDER_PREPAY_AND_PAY_ROI)
  private Double directOrderPrepayAndPayRoi = null;

  public static final String SERIALIZED_NAME_DY_COMMENT = "dy_comment";
  @SerializedName(SERIALIZED_NAME_DY_COMMENT)
  private Long dyComment = null;

  public static final String SERIALIZED_NAME_DY_FOLLOW = "dy_follow";
  @SerializedName(SERIALIZED_NAME_DY_FOLLOW)
  private Long dyFollow = null;

  public static final String SERIALIZED_NAME_DY_LIKE = "dy_like";
  @SerializedName(SERIALIZED_NAME_DY_LIKE)
  private Long dyLike = null;

  public static final String SERIALIZED_NAME_DY_SHARE = "dy_share";
  @SerializedName(SERIALIZED_NAME_DY_SHARE)
  private Long dyShare = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeImageMode imageMode = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo productInfo = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerTitleMaterialInner> titleMaterial = null;

  public static final String SERIALIZED_NAME_TOTAL_PLAY = "total_play";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLAY)
  private Long totalPlay = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner> videoMaterial = null;

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner() {
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner directOrderPayRate(Double directOrderPayRate) {
    
    this.directOrderPayRate = directOrderPayRate;
    return this;
  }

   /**
   * 
   * @return directOrderPayRate
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayRate() {
    return directOrderPayRate;
  }


  public void setDirectOrderPayRate(Double directOrderPayRate) {
    this.directOrderPayRate = directOrderPayRate;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner directOrderPayRoi(Double directOrderPayRoi) {
    
    this.directOrderPayRoi = directOrderPayRoi;
    return this;
  }

   /**
   * 
   * @return directOrderPayRoi
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPayRoi() {
    return directOrderPayRoi;
  }


  public void setDirectOrderPayRoi(Double directOrderPayRoi) {
    this.directOrderPayRoi = directOrderPayRoi;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner directOrderPrepayAndPayRoi(Double directOrderPrepayAndPayRoi) {
    
    this.directOrderPrepayAndPayRoi = directOrderPrepayAndPayRoi;
    return this;
  }

   /**
   * 
   * @return directOrderPrepayAndPayRoi
  **/
  @javax.annotation.Nullable
  public Double getDirectOrderPrepayAndPayRoi() {
    return directOrderPrepayAndPayRoi;
  }


  public void setDirectOrderPrepayAndPayRoi(Double directOrderPrepayAndPayRoi) {
    this.directOrderPrepayAndPayRoi = directOrderPrepayAndPayRoi;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner dyComment(Long dyComment) {
    
    this.dyComment = dyComment;
    return this;
  }

   /**
   * 
   * @return dyComment
  **/
  @javax.annotation.Nullable
  public Long getDyComment() {
    return dyComment;
  }


  public void setDyComment(Long dyComment) {
    this.dyComment = dyComment;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner dyFollow(Long dyFollow) {
    
    this.dyFollow = dyFollow;
    return this;
  }

   /**
   * 
   * @return dyFollow
  **/
  @javax.annotation.Nullable
  public Long getDyFollow() {
    return dyFollow;
  }


  public void setDyFollow(Long dyFollow) {
    this.dyFollow = dyFollow;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner dyLike(Long dyLike) {
    
    this.dyLike = dyLike;
    return this;
  }

   /**
   * 
   * @return dyLike
  **/
  @javax.annotation.Nullable
  public Long getDyLike() {
    return dyLike;
  }


  public void setDyLike(Long dyLike) {
    this.dyLike = dyLike;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner dyShare(Long dyShare) {
    
    this.dyShare = dyShare;
    return this;
  }

   /**
   * 
   * @return dyShare
  **/
  @javax.annotation.Nullable
  public Long getDyShare() {
    return dyShare;
  }


  public void setDyShare(Long dyShare) {
    this.dyShare = dyShare;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner imageMode(QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanProductAnalyseCompareCreativeV10DataSimilarProductCreativeImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner productInfo(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerProductInfo productInfo) {
    this.productInfo = productInfo;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner titleMaterial(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerTitleMaterialInner> titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner addTitleMaterialItem(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerTitleMaterialInner titleMaterialItem) {
    if (this.titleMaterial == null) {
      this.titleMaterial = new ArrayList<>();
    }
    this.titleMaterial.add(titleMaterialItem);
    return this;
  }

   /**
   * 
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerTitleMaterialInner> getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerTitleMaterialInner> titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner totalPlay(Long totalPlay) {
    
    this.totalPlay = totalPlay;
    return this;
  }

   /**
   * 
   * @return totalPlay
  **/
  @javax.annotation.Nullable
  public Long getTotalPlay() {
    return totalPlay;
  }


  public void setTotalPlay(Long totalPlay) {
    this.totalPlay = totalPlay;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner videoMaterial(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner> videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner addVideoMaterialItem(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner videoMaterialItem) {
    if (this.videoMaterial == null) {
      this.videoMaterial = new ArrayList<>();
    }
    this.videoMaterial.add(videoMaterialItem);
    return this;
  }

   /**
   * 
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner> getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInnerVideoMaterialInner> videoMaterial) {
    this.videoMaterial = videoMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner = (QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner) o;
    return Objects.equals(this.ctr, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.ctr) &&
        Objects.equals(this.directOrderPayRate, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.directOrderPayRate) &&
        Objects.equals(this.directOrderPayRoi, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.directOrderPayRoi) &&
        Objects.equals(this.directOrderPrepayAndPayRoi, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.directOrderPrepayAndPayRoi) &&
        Objects.equals(this.dyComment, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.dyComment) &&
        Objects.equals(this.dyFollow, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.dyFollow) &&
        Objects.equals(this.dyLike, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.dyLike) &&
        Objects.equals(this.dyShare, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.dyShare) &&
        Objects.equals(this.imageMode, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.imageMode) &&
        Objects.equals(this.productInfo, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.productInfo) &&
        Objects.equals(this.statCost, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.statCost) &&
        Objects.equals(this.titleMaterial, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.titleMaterial) &&
        Objects.equals(this.totalPlay, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.totalPlay) &&
        Objects.equals(this.videoMaterial, qianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.videoMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ctr, directOrderPayRate, directOrderPayRoi, directOrderPrepayAndPayRoi, dyComment, dyFollow, dyLike, dyShare, imageMode, productInfo, statCost, titleMaterial, totalPlay, videoMaterial);
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
    sb.append("class QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner {\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    directOrderPayRate: ").append(toIndentedString(directOrderPayRate)).append("\n");
    sb.append("    directOrderPayRoi: ").append(toIndentedString(directOrderPayRoi)).append("\n");
    sb.append("    directOrderPrepayAndPayRoi: ").append(toIndentedString(directOrderPrepayAndPayRoi)).append("\n");
    sb.append("    dyComment: ").append(toIndentedString(dyComment)).append("\n");
    sb.append("    dyFollow: ").append(toIndentedString(dyFollow)).append("\n");
    sb.append("    dyLike: ").append(toIndentedString(dyLike)).append("\n");
    sb.append("    dyShare: ").append(toIndentedString(dyShare)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    titleMaterial: ").append(toIndentedString(titleMaterial)).append("\n");
    sb.append("    totalPlay: ").append(toIndentedString(totalPlay)).append("\n");
    sb.append("    videoMaterial: ").append(toIndentedString(videoMaterial)).append("\n");
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
    openapiFields.add("ctr");
    openapiFields.add("direct_order_pay_rate");
    openapiFields.add("direct_order_pay_roi");
    openapiFields.add("direct_order_prepay_and_pay_roi");
    openapiFields.add("dy_comment");
    openapiFields.add("dy_follow");
    openapiFields.add("dy_like");
    openapiFields.add("dy_share");
    openapiFields.add("image_mode");
    openapiFields.add("product_info");
    openapiFields.add("stat_cost");
    openapiFields.add("title_material");
    openapiFields.add("total_play");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner
  */
  public static QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner.class);
  }

 /**
  * Convert an instance of QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

