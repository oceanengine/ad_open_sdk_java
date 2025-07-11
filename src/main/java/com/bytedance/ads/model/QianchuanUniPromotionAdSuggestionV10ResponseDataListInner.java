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
import com.bytedance.ads.model.QianchuanUniPromotionAdSuggestionV10DataListAuditPlatform;
import com.bytedance.ads.model.QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerImageMaterial;
import com.bytedance.ads.model.QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerVideoMaterial;
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
 * QianchuanUniPromotionAdSuggestionV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdSuggestionV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIT_PLATFORM = "audit_platform";
  @SerializedName(SERIALIZED_NAME_AUDIT_PLATFORM)
  private QianchuanUniPromotionAdSuggestionV10DataListAuditPlatform auditPlatform = null;

  public static final String SERIALIZED_NAME_AUDIT_REASON = "audit_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_REASON)
  private List<String> auditReason = null;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerImageMaterial imageMaterial = null;

  public static final String SERIALIZED_NAME_IS_AWEME_VIDEO_TITLE = "is_aweme_video_title";
  @SerializedName(SERIALIZED_NAME_IS_AWEME_VIDEO_TITLE)
  private Boolean isAwemeVideoTitle = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_RELATED_VIDEO_MATERIAL_ID = "related_video_material_id";
  @SerializedName(SERIALIZED_NAME_RELATED_VIDEO_MATERIAL_ID)
  private Long relatedVideoMaterialId = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerVideoMaterial videoMaterial = null;

  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner() {
  }

  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner auditPlatform(QianchuanUniPromotionAdSuggestionV10DataListAuditPlatform auditPlatform) {
    
    this.auditPlatform = auditPlatform;
    return this;
  }

   /**
   * Get auditPlatform
   * @return auditPlatform
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdSuggestionV10DataListAuditPlatform getAuditPlatform() {
    return auditPlatform;
  }


  public void setAuditPlatform(QianchuanUniPromotionAdSuggestionV10DataListAuditPlatform auditPlatform) {
    this.auditPlatform = auditPlatform;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner auditReason(List<String> auditReason) {
    
    this.auditReason = auditReason;
    return this;
  }

  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner addAuditReasonItem(String auditReasonItem) {
    if (this.auditReason == null) {
      this.auditReason = new ArrayList<>();
    }
    this.auditReason.add(auditReasonItem);
    return this;
  }

   /**
   * 审核建议
   * @return auditReason
  **/
  @javax.annotation.Nullable
  public List<String> getAuditReason() {
    return auditReason;
  }


  public void setAuditReason(List<String> auditReason) {
    this.auditReason = auditReason;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 审核的对象类型
   * @return desc
  **/
  @javax.annotation.Nullable
  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner imageMaterial(QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerImageMaterial imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

   /**
   * Get imageMaterial
   * @return imageMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerImageMaterial getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerImageMaterial imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner isAwemeVideoTitle(Boolean isAwemeVideoTitle) {
    
    this.isAwemeVideoTitle = isAwemeVideoTitle;
    return this;
  }

   /**
   * 是否为抖音主页视频标题
   * @return isAwemeVideoTitle
  **/
  @javax.annotation.Nullable
  public Boolean getIsAwemeVideoTitle() {
    return isAwemeVideoTitle;
  }


  public void setIsAwemeVideoTitle(Boolean isAwemeVideoTitle) {
    this.isAwemeVideoTitle = isAwemeVideoTitle;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材ID
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品ID
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner relatedVideoMaterialId(Long relatedVideoMaterialId) {
    
    this.relatedVideoMaterialId = relatedVideoMaterialId;
    return this;
  }

   /**
   * 当Type为音频标题 &amp; 视频标题 &amp; 抖音主页视频标题时，这个字段为对应的视频素材ID
   * @return relatedVideoMaterialId
  **/
  @javax.annotation.Nullable
  public Long getRelatedVideoMaterialId() {
    return relatedVideoMaterialId;
  }


  public void setRelatedVideoMaterialId(Long relatedVideoMaterialId) {
    this.relatedVideoMaterialId = relatedVideoMaterialId;
  }


  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner videoMaterial(QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(QianchuanUniPromotionAdSuggestionV10ResponseDataListInnerVideoMaterial videoMaterial) {
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
    QianchuanUniPromotionAdSuggestionV10ResponseDataListInner qianchuanUniPromotionAdSuggestionV10ResponseDataListInner = (QianchuanUniPromotionAdSuggestionV10ResponseDataListInner) o;
    return Objects.equals(this.auditPlatform, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.auditPlatform) &&
        Objects.equals(this.auditReason, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.auditReason) &&
        Objects.equals(this.desc, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.desc) &&
        Objects.equals(this.imageMaterial, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.imageMaterial) &&
        Objects.equals(this.isAwemeVideoTitle, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.isAwemeVideoTitle) &&
        Objects.equals(this.materialId, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.materialId) &&
        Objects.equals(this.productId, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.productId) &&
        Objects.equals(this.relatedVideoMaterialId, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.relatedVideoMaterialId) &&
        Objects.equals(this.videoMaterial, qianchuanUniPromotionAdSuggestionV10ResponseDataListInner.videoMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditPlatform, auditReason, desc, imageMaterial, isAwemeVideoTitle, materialId, productId, relatedVideoMaterialId, videoMaterial);
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
    sb.append("class QianchuanUniPromotionAdSuggestionV10ResponseDataListInner {\n");
    sb.append("    auditPlatform: ").append(toIndentedString(auditPlatform)).append("\n");
    sb.append("    auditReason: ").append(toIndentedString(auditReason)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    imageMaterial: ").append(toIndentedString(imageMaterial)).append("\n");
    sb.append("    isAwemeVideoTitle: ").append(toIndentedString(isAwemeVideoTitle)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    relatedVideoMaterialId: ").append(toIndentedString(relatedVideoMaterialId)).append("\n");
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
    openapiFields.add("audit_platform");
    openapiFields.add("audit_reason");
    openapiFields.add("desc");
    openapiFields.add("image_material");
    openapiFields.add("is_aweme_video_title");
    openapiFields.add("material_id");
    openapiFields.add("product_id");
    openapiFields.add("related_video_material_id");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdSuggestionV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdSuggestionV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdSuggestionV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdSuggestionV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdSuggestionV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdSuggestionV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdSuggestionV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdSuggestionV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdSuggestionV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdSuggestionV10ResponseDataListInner
  */
  public static QianchuanUniPromotionAdSuggestionV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdSuggestionV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdSuggestionV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

