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
import com.bytedance.ads.model.LocalPromotionCreateV30LiveMaterialType;
import com.bytedance.ads.model.LocalPromotionCreateV30RequestCustomerMaterialListInner;
import com.bytedance.ads.model.LocalPromotionCreateV30VideoHpVisibility;
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
 * LocalPromotionCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class LocalPromotionCreateV30Request {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_MATERIAL_LIST = "customer_material_list";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_MATERIAL_LIST)
  private List<LocalPromotionCreateV30RequestCustomerMaterialListInner> customerMaterialList = null;

  public static final String SERIALIZED_NAME_ENABLE_GRAPHIC_DELIVERY = "enable_graphic_delivery";
  @SerializedName(SERIALIZED_NAME_ENABLE_GRAPHIC_DELIVERY)
  private Boolean enableGraphicDelivery = null;

  public static final String SERIALIZED_NAME_LIVE_MATERIAL_TYPE = "live_material_type";
  @SerializedName(SERIALIZED_NAME_LIVE_MATERIAL_TYPE)
  private LocalPromotionCreateV30LiveMaterialType liveMaterialType = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_VIDEO_HP_VISIBILITY = "video_hp_visibility";
  @SerializedName(SERIALIZED_NAME_VIDEO_HP_VISIBILITY)
  private LocalPromotionCreateV30VideoHpVisibility videoHpVisibility = null;

  public LocalPromotionCreateV30Request() {
  }

  public LocalPromotionCreateV30Request awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号 说明：当选择素材库和上传视频投广时，该字段必填
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public LocalPromotionCreateV30Request customerMaterialList(List<LocalPromotionCreateV30RequestCustomerMaterialListInner> customerMaterialList) {
    
    this.customerMaterialList = customerMaterialList;
    return this;
  }

  public LocalPromotionCreateV30Request addCustomerMaterialListItem(LocalPromotionCreateV30RequestCustomerMaterialListInner customerMaterialListItem) {
    if (this.customerMaterialList == null) {
      this.customerMaterialList = new ArrayList<>();
    }
    this.customerMaterialList.add(customerMaterialListItem);
    return this;
  }

   /**
   * 
   * @return customerMaterialList
  **/
  @javax.annotation.Nullable
  public List<LocalPromotionCreateV30RequestCustomerMaterialListInner> getCustomerMaterialList() {
    return customerMaterialList;
  }


  public void setCustomerMaterialList(List<LocalPromotionCreateV30RequestCustomerMaterialListInner> customerMaterialList) {
    this.customerMaterialList = customerMaterialList;
  }


  public LocalPromotionCreateV30Request enableGraphicDelivery(Boolean enableGraphicDelivery) {
    
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


  public LocalPromotionCreateV30Request liveMaterialType(LocalPromotionCreateV30LiveMaterialType liveMaterialType) {
    
    this.liveMaterialType = liveMaterialType;
    return this;
  }

   /**
   * Get liveMaterialType
   * @return liveMaterialType
  **/
  @javax.annotation.Nullable
  public LocalPromotionCreateV30LiveMaterialType getLiveMaterialType() {
    return liveMaterialType;
  }


  public void setLiveMaterialType(LocalPromotionCreateV30LiveMaterialType liveMaterialType) {
    this.liveMaterialType = liveMaterialType;
  }


  public LocalPromotionCreateV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalPromotionCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 广告名称
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocalPromotionCreateV30Request projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public LocalPromotionCreateV30Request videoHpVisibility(LocalPromotionCreateV30VideoHpVisibility videoHpVisibility) {
    
    this.videoHpVisibility = videoHpVisibility;
    return this;
  }

   /**
   * Get videoHpVisibility
   * @return videoHpVisibility
  **/
  @javax.annotation.Nullable
  public LocalPromotionCreateV30VideoHpVisibility getVideoHpVisibility() {
    return videoHpVisibility;
  }


  public void setVideoHpVisibility(LocalPromotionCreateV30VideoHpVisibility videoHpVisibility) {
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
    LocalPromotionCreateV30Request localPromotionCreateV30Request = (LocalPromotionCreateV30Request) o;
    return Objects.equals(this.awemeId, localPromotionCreateV30Request.awemeId) &&
        Objects.equals(this.customerMaterialList, localPromotionCreateV30Request.customerMaterialList) &&
        Objects.equals(this.enableGraphicDelivery, localPromotionCreateV30Request.enableGraphicDelivery) &&
        Objects.equals(this.liveMaterialType, localPromotionCreateV30Request.liveMaterialType) &&
        Objects.equals(this.localAccountId, localPromotionCreateV30Request.localAccountId) &&
        Objects.equals(this.name, localPromotionCreateV30Request.name) &&
        Objects.equals(this.projectId, localPromotionCreateV30Request.projectId) &&
        Objects.equals(this.videoHpVisibility, localPromotionCreateV30Request.videoHpVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, customerMaterialList, enableGraphicDelivery, liveMaterialType, localAccountId, name, projectId, videoHpVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalPromotionCreateV30Request {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    customerMaterialList: ").append(toIndentedString(customerMaterialList)).append("\n");
    sb.append("    enableGraphicDelivery: ").append(toIndentedString(enableGraphicDelivery)).append("\n");
    sb.append("    liveMaterialType: ").append(toIndentedString(liveMaterialType)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("local_account_id");
    openapiFields.add("name");
    openapiFields.add("project_id");
    openapiFields.add("video_hp_visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("local_account_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("project_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionCreateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalPromotionCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionCreateV30Request
  */
  public static LocalPromotionCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionCreateV30Request.class);
  }

 /**
  * Convert an instance of LocalPromotionCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

