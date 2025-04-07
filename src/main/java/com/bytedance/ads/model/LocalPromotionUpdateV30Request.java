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
import com.bytedance.ads.model.LocalPromotionUpdateV30RequestCustomerMaterialListInner;
import com.bytedance.ads.model.LocalPromotionUpdateV30VideoHpVisibility;
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
 * LocalPromotionUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class LocalPromotionUpdateV30Request {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_MATERIAL_LIST = "customer_material_list";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_MATERIAL_LIST)
  private List<LocalPromotionUpdateV30RequestCustomerMaterialListInner> customerMaterialList = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_VIDEO_HP_VISIBILITY = "video_hp_visibility";
  @SerializedName(SERIALIZED_NAME_VIDEO_HP_VISIBILITY)
  private LocalPromotionUpdateV30VideoHpVisibility videoHpVisibility = null;

  public LocalPromotionUpdateV30Request() {
  }

  public LocalPromotionUpdateV30Request awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号id
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public LocalPromotionUpdateV30Request customerMaterialList(List<LocalPromotionUpdateV30RequestCustomerMaterialListInner> customerMaterialList) {
    
    this.customerMaterialList = customerMaterialList;
    return this;
  }

  public LocalPromotionUpdateV30Request addCustomerMaterialListItem(LocalPromotionUpdateV30RequestCustomerMaterialListInner customerMaterialListItem) {
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
  public List<LocalPromotionUpdateV30RequestCustomerMaterialListInner> getCustomerMaterialList() {
    return customerMaterialList;
  }


  public void setCustomerMaterialList(List<LocalPromotionUpdateV30RequestCustomerMaterialListInner> customerMaterialList) {
    this.customerMaterialList = customerMaterialList;
  }


  public LocalPromotionUpdateV30Request localAccountId(Long localAccountId) {
    
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


  public LocalPromotionUpdateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocalPromotionUpdateV30Request promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nonnull
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public LocalPromotionUpdateV30Request videoHpVisibility(LocalPromotionUpdateV30VideoHpVisibility videoHpVisibility) {
    
    this.videoHpVisibility = videoHpVisibility;
    return this;
  }

   /**
   * Get videoHpVisibility
   * @return videoHpVisibility
  **/
  @javax.annotation.Nullable
  public LocalPromotionUpdateV30VideoHpVisibility getVideoHpVisibility() {
    return videoHpVisibility;
  }


  public void setVideoHpVisibility(LocalPromotionUpdateV30VideoHpVisibility videoHpVisibility) {
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
    LocalPromotionUpdateV30Request localPromotionUpdateV30Request = (LocalPromotionUpdateV30Request) o;
    return Objects.equals(this.awemeId, localPromotionUpdateV30Request.awemeId) &&
        Objects.equals(this.customerMaterialList, localPromotionUpdateV30Request.customerMaterialList) &&
        Objects.equals(this.localAccountId, localPromotionUpdateV30Request.localAccountId) &&
        Objects.equals(this.name, localPromotionUpdateV30Request.name) &&
        Objects.equals(this.promotionId, localPromotionUpdateV30Request.promotionId) &&
        Objects.equals(this.videoHpVisibility, localPromotionUpdateV30Request.videoHpVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, customerMaterialList, localAccountId, name, promotionId, videoHpVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalPromotionUpdateV30Request {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    customerMaterialList: ").append(toIndentedString(customerMaterialList)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("local_account_id");
    openapiFields.add("name");
    openapiFields.add("promotion_id");
    openapiFields.add("video_hp_visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("local_account_id");
    openapiRequiredFields.add("promotion_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalPromotionUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionUpdateV30Request
  */
  public static LocalPromotionUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionUpdateV30Request.class);
  }

 /**
  * Convert an instance of LocalPromotionUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

