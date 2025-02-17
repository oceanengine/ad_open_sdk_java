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
import com.bytedance.ads.model.LocalPromotionDetailV30DataLiveMaterialType;
import com.bytedance.ads.model.LocalPromotionDetailV30DataVideoHpVisibility;
import com.bytedance.ads.model.LocalPromotionDetailV30ResponseDataCustomerMaterialListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class LocalPromotionDetailV30ResponseData {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_MATERIAL_LIST = "customer_material_list";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_MATERIAL_LIST)
  private List<LocalPromotionDetailV30ResponseDataCustomerMaterialListInner> customerMaterialList = null;

  public static final String SERIALIZED_NAME_ENABLE_GRAPHIC_DELIVERY = "enable_graphic_delivery";
  @SerializedName(SERIALIZED_NAME_ENABLE_GRAPHIC_DELIVERY)
  private Boolean enableGraphicDelivery = null;

  public static final String SERIALIZED_NAME_LIVE_MATERIAL_TYPE = "live_material_type";
  @SerializedName(SERIALIZED_NAME_LIVE_MATERIAL_TYPE)
  private LocalPromotionDetailV30DataLiveMaterialType liveMaterialType = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_VIDEO_HP_VISIBILITY = "video_hp_visibility";
  @SerializedName(SERIALIZED_NAME_VIDEO_HP_VISIBILITY)
  private LocalPromotionDetailV30DataVideoHpVisibility videoHpVisibility = null;

  public LocalPromotionDetailV30ResponseData() {
  }

  public LocalPromotionDetailV30ResponseData awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public LocalPromotionDetailV30ResponseData customerMaterialList(List<LocalPromotionDetailV30ResponseDataCustomerMaterialListInner> customerMaterialList) {
    
    this.customerMaterialList = customerMaterialList;
    return this;
  }

  public LocalPromotionDetailV30ResponseData addCustomerMaterialListItem(LocalPromotionDetailV30ResponseDataCustomerMaterialListInner customerMaterialListItem) {
    if (this.customerMaterialList == null) {
      this.customerMaterialList = new ArrayList<>();
    }
    this.customerMaterialList.add(customerMaterialListItem);
    return this;
  }

   /**
   * 自定义素材组合
   * @return customerMaterialList
  **/
  @javax.annotation.Nullable
  public List<LocalPromotionDetailV30ResponseDataCustomerMaterialListInner> getCustomerMaterialList() {
    return customerMaterialList;
  }


  public void setCustomerMaterialList(List<LocalPromotionDetailV30ResponseDataCustomerMaterialListInner> customerMaterialList) {
    this.customerMaterialList = customerMaterialList;
  }


  public LocalPromotionDetailV30ResponseData enableGraphicDelivery(Boolean enableGraphicDelivery) {
    
    this.enableGraphicDelivery = enableGraphicDelivery;
    return this;
  }

   /**
   * 是否开启团购卡
   * @return enableGraphicDelivery
  **/
  @javax.annotation.Nullable
  public Boolean getEnableGraphicDelivery() {
    return enableGraphicDelivery;
  }


  public void setEnableGraphicDelivery(Boolean enableGraphicDelivery) {
    this.enableGraphicDelivery = enableGraphicDelivery;
  }


  public LocalPromotionDetailV30ResponseData liveMaterialType(LocalPromotionDetailV30DataLiveMaterialType liveMaterialType) {
    
    this.liveMaterialType = liveMaterialType;
    return this;
  }

   /**
   * Get liveMaterialType
   * @return liveMaterialType
  **/
  @javax.annotation.Nullable
  public LocalPromotionDetailV30DataLiveMaterialType getLiveMaterialType() {
    return liveMaterialType;
  }


  public void setLiveMaterialType(LocalPromotionDetailV30DataLiveMaterialType liveMaterialType) {
    this.liveMaterialType = liveMaterialType;
  }


  public LocalPromotionDetailV30ResponseData promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public LocalPromotionDetailV30ResponseData videoHpVisibility(LocalPromotionDetailV30DataVideoHpVisibility videoHpVisibility) {
    
    this.videoHpVisibility = videoHpVisibility;
    return this;
  }

   /**
   * Get videoHpVisibility
   * @return videoHpVisibility
  **/
  @javax.annotation.Nullable
  public LocalPromotionDetailV30DataVideoHpVisibility getVideoHpVisibility() {
    return videoHpVisibility;
  }


  public void setVideoHpVisibility(LocalPromotionDetailV30DataVideoHpVisibility videoHpVisibility) {
    this.videoHpVisibility = videoHpVisibility;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPromotionDetailV30ResponseData localPromotionDetailV30ResponseData = (LocalPromotionDetailV30ResponseData) o;
    return Objects.equals(this.awemeId, localPromotionDetailV30ResponseData.awemeId) &&
        Objects.equals(this.customerMaterialList, localPromotionDetailV30ResponseData.customerMaterialList) &&
        Objects.equals(this.enableGraphicDelivery, localPromotionDetailV30ResponseData.enableGraphicDelivery) &&
        Objects.equals(this.liveMaterialType, localPromotionDetailV30ResponseData.liveMaterialType) &&
        Objects.equals(this.promotionId, localPromotionDetailV30ResponseData.promotionId) &&
        Objects.equals(this.videoHpVisibility, localPromotionDetailV30ResponseData.videoHpVisibility);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, customerMaterialList, enableGraphicDelivery, liveMaterialType, promotionId, videoHpVisibility);
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
    sb.append("class LocalPromotionDetailV30ResponseData {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    customerMaterialList: ").append(toIndentedString(customerMaterialList)).append("\n");
    sb.append("    enableGraphicDelivery: ").append(toIndentedString(enableGraphicDelivery)).append("\n");
    sb.append("    liveMaterialType: ").append(toIndentedString(liveMaterialType)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    videoHpVisibility: ").append(toIndentedString(videoHpVisibility)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("customer_material_list");
    openapiFields.add("enable_graphic_delivery");
    openapiFields.add("live_material_type");
    openapiFields.add("promotion_id");
    openapiFields.add("video_hp_visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionDetailV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionDetailV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionDetailV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionDetailV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionDetailV30ResponseData>() {
           @Override
           public void write(JsonWriter out, LocalPromotionDetailV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionDetailV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionDetailV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionDetailV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionDetailV30ResponseData
  */
  public static LocalPromotionDetailV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionDetailV30ResponseData.class);
  }

 /**
  * Convert an instance of LocalPromotionDetailV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

