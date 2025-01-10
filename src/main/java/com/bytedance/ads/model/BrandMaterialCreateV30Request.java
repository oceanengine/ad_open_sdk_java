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
import com.bytedance.ads.model.BrandMaterialCreateV30CreativeDisplayMode;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestCategoryInfo;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInner;
import com.bytedance.ads.model.BrandMaterialCreateV30RequestTrackUrlInfo;
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
 * BrandMaterialCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CATEGORY_INFO = "category_info";
  @SerializedName(SERIALIZED_NAME_CATEGORY_INFO)
  private BrandMaterialCreateV30RequestCategoryInfo categoryInfo = null;

  public static final String SERIALIZED_NAME_CREATIVE_DISPLAY_MODE = "creative_display_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_DISPLAY_MODE)
  private BrandMaterialCreateV30CreativeDisplayMode creativeDisplayMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_LIST = "material_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_LIST)
  private List<BrandMaterialCreateV30RequestMaterialListInner> materialList = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_TRACK_URL_INFO = "track_url_info";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_INFO)
  private BrandMaterialCreateV30RequestTrackUrlInfo trackUrlInfo = null;

  public BrandMaterialCreateV30Request() {
  }

  public BrandMaterialCreateV30Request advertiserId(Long advertiserId) {
    
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


  public BrandMaterialCreateV30Request categoryInfo(BrandMaterialCreateV30RequestCategoryInfo categoryInfo) {
    
    this.categoryInfo = categoryInfo;
    return this;
  }

   /**
   * Get categoryInfo
   * @return categoryInfo
  **/
  @javax.annotation.Nonnull
  public BrandMaterialCreateV30RequestCategoryInfo getCategoryInfo() {
    return categoryInfo;
  }


  public void setCategoryInfo(BrandMaterialCreateV30RequestCategoryInfo categoryInfo) {
    this.categoryInfo = categoryInfo;
  }


  public BrandMaterialCreateV30Request creativeDisplayMode(BrandMaterialCreateV30CreativeDisplayMode creativeDisplayMode) {
    
    this.creativeDisplayMode = creativeDisplayMode;
    return this;
  }

   /**
   * Get creativeDisplayMode
   * @return creativeDisplayMode
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30CreativeDisplayMode getCreativeDisplayMode() {
    return creativeDisplayMode;
  }


  public void setCreativeDisplayMode(BrandMaterialCreateV30CreativeDisplayMode creativeDisplayMode) {
    this.creativeDisplayMode = creativeDisplayMode;
  }


  public BrandMaterialCreateV30Request materialList(List<BrandMaterialCreateV30RequestMaterialListInner> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public BrandMaterialCreateV30Request addMaterialListItem(BrandMaterialCreateV30RequestMaterialListInner materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * 
   * @return materialList
  **/
  @javax.annotation.Nonnull
  public List<BrandMaterialCreateV30RequestMaterialListInner> getMaterialList() {
    return materialList;
  }


  public void setMaterialList(List<BrandMaterialCreateV30RequestMaterialListInner> materialList) {
    this.materialList = materialList;
  }


  public BrandMaterialCreateV30Request orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nonnull
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public BrandMaterialCreateV30Request trackUrlInfo(BrandMaterialCreateV30RequestTrackUrlInfo trackUrlInfo) {
    
    this.trackUrlInfo = trackUrlInfo;
    return this;
  }

   /**
   * Get trackUrlInfo
   * @return trackUrlInfo
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestTrackUrlInfo getTrackUrlInfo() {
    return trackUrlInfo;
  }


  public void setTrackUrlInfo(BrandMaterialCreateV30RequestTrackUrlInfo trackUrlInfo) {
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
    BrandMaterialCreateV30Request brandMaterialCreateV30Request = (BrandMaterialCreateV30Request) o;
    return Objects.equals(this.advertiserId, brandMaterialCreateV30Request.advertiserId) &&
        Objects.equals(this.categoryInfo, brandMaterialCreateV30Request.categoryInfo) &&
        Objects.equals(this.creativeDisplayMode, brandMaterialCreateV30Request.creativeDisplayMode) &&
        Objects.equals(this.materialList, brandMaterialCreateV30Request.materialList) &&
        Objects.equals(this.orderId, brandMaterialCreateV30Request.orderId) &&
        Objects.equals(this.trackUrlInfo, brandMaterialCreateV30Request.trackUrlInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, categoryInfo, creativeDisplayMode, materialList, orderId, trackUrlInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    categoryInfo: ").append(toIndentedString(categoryInfo)).append("\n");
    sb.append("    creativeDisplayMode: ").append(toIndentedString(creativeDisplayMode)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("category_info");
    openapiFields.add("creative_display_mode");
    openapiFields.add("material_list");
    openapiFields.add("order_id");
    openapiFields.add("track_url_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("category_info");
    openapiRequiredFields.add("material_list");
    openapiRequiredFields.add("order_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30Request>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30Request
  */
  public static BrandMaterialCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30Request.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
