/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
 * DpaProductDetailGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class DpaProductDetailGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<String> city = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_FIRST_CATEGORY = "first_category";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY)
  private String firstCategory = null;

  public static final String SERIALIZED_NAME_HAS_VIDEO = "has_video";
  @SerializedName(SERIALIZED_NAME_HAS_VIDEO)
  private Boolean hasVideo = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OFFLINE_TIME = "offline_time";
  @SerializedName(SERIALIZED_NAME_OFFLINE_TIME)
  private String offlineTime = null;

  public static final String SERIALIZED_NAME_ONLINE_TIME = "online_time";
  @SerializedName(SERIALIZED_NAME_ONLINE_TIME)
  private String onlineTime = null;

  public static final String SERIALIZED_NAME_PLATFORM_ID = "platform_id";
  @SerializedName(SERIALIZED_NAME_PLATFORM_ID)
  private Long platformId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_SUB_CATEGORY = "sub_category";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private String subCategory = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_THIRD_CATEGORY = "third_category";
  @SerializedName(SERIALIZED_NAME_THIRD_CATEGORY)
  private String thirdCategory = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public DpaProductDetailGetV2ResponseDataListInner() {
  }

  public DpaProductDetailGetV2ResponseDataListInner brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public DpaProductDetailGetV2ResponseDataListInner city(List<String> city) {
    
    this.city = city;
    return this;
  }

  public DpaProductDetailGetV2ResponseDataListInner addCityItem(String cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<String> getCity() {
    return city;
  }


  public void setCity(List<String> city) {
    this.city = city;
  }


  public DpaProductDetailGetV2ResponseDataListInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DpaProductDetailGetV2ResponseDataListInner externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public DpaProductDetailGetV2ResponseDataListInner firstCategory(String firstCategory) {
    
    this.firstCategory = firstCategory;
    return this;
  }

   /**
   * 
   * @return firstCategory
  **/
  @javax.annotation.Nullable
  public String getFirstCategory() {
    return firstCategory;
  }


  public void setFirstCategory(String firstCategory) {
    this.firstCategory = firstCategory;
  }


  public DpaProductDetailGetV2ResponseDataListInner hasVideo(Boolean hasVideo) {
    
    this.hasVideo = hasVideo;
    return this;
  }

   /**
   * 
   * @return hasVideo
  **/
  @javax.annotation.Nullable
  public Boolean getHasVideo() {
    return hasVideo;
  }


  public void setHasVideo(Boolean hasVideo) {
    this.hasVideo = hasVideo;
  }


  public DpaProductDetailGetV2ResponseDataListInner imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public DpaProductDetailGetV2ResponseDataListInner name(String name) {
    
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


  public DpaProductDetailGetV2ResponseDataListInner offlineTime(String offlineTime) {
    
    this.offlineTime = offlineTime;
    return this;
  }

   /**
   * 
   * @return offlineTime
  **/
  @javax.annotation.Nullable
  public String getOfflineTime() {
    return offlineTime;
  }


  public void setOfflineTime(String offlineTime) {
    this.offlineTime = offlineTime;
  }


  public DpaProductDetailGetV2ResponseDataListInner onlineTime(String onlineTime) {
    
    this.onlineTime = onlineTime;
    return this;
  }

   /**
   * 
   * @return onlineTime
  **/
  @javax.annotation.Nullable
  public String getOnlineTime() {
    return onlineTime;
  }


  public void setOnlineTime(String onlineTime) {
    this.onlineTime = onlineTime;
  }


  public DpaProductDetailGetV2ResponseDataListInner platformId(Long platformId) {
    
    this.platformId = platformId;
    return this;
  }

   /**
   * 
   * @return platformId
  **/
  @javax.annotation.Nullable
  public Long getPlatformId() {
    return platformId;
  }


  public void setPlatformId(Long platformId) {
    this.platformId = platformId;
  }


  public DpaProductDetailGetV2ResponseDataListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public DpaProductDetailGetV2ResponseDataListInner subCategory(String subCategory) {
    
    this.subCategory = subCategory;
    return this;
  }

   /**
   * 
   * @return subCategory
  **/
  @javax.annotation.Nullable
  public String getSubCategory() {
    return subCategory;
  }


  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }


  public DpaProductDetailGetV2ResponseDataListInner tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DpaProductDetailGetV2ResponseDataListInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public DpaProductDetailGetV2ResponseDataListInner thirdCategory(String thirdCategory) {
    
    this.thirdCategory = thirdCategory;
    return this;
  }

   /**
   * 
   * @return thirdCategory
  **/
  @javax.annotation.Nullable
  public String getThirdCategory() {
    return thirdCategory;
  }


  public void setThirdCategory(String thirdCategory) {
    this.thirdCategory = thirdCategory;
  }


  public DpaProductDetailGetV2ResponseDataListInner title(String title) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductDetailGetV2ResponseDataListInner dpaProductDetailGetV2ResponseDataListInner = (DpaProductDetailGetV2ResponseDataListInner) o;
    return Objects.equals(this.brandName, dpaProductDetailGetV2ResponseDataListInner.brandName) &&
        Objects.equals(this.city, dpaProductDetailGetV2ResponseDataListInner.city) &&
        Objects.equals(this.description, dpaProductDetailGetV2ResponseDataListInner.description) &&
        Objects.equals(this.externalUrl, dpaProductDetailGetV2ResponseDataListInner.externalUrl) &&
        Objects.equals(this.firstCategory, dpaProductDetailGetV2ResponseDataListInner.firstCategory) &&
        Objects.equals(this.hasVideo, dpaProductDetailGetV2ResponseDataListInner.hasVideo) &&
        Objects.equals(this.imageUrl, dpaProductDetailGetV2ResponseDataListInner.imageUrl) &&
        Objects.equals(this.name, dpaProductDetailGetV2ResponseDataListInner.name) &&
        Objects.equals(this.offlineTime, dpaProductDetailGetV2ResponseDataListInner.offlineTime) &&
        Objects.equals(this.onlineTime, dpaProductDetailGetV2ResponseDataListInner.onlineTime) &&
        Objects.equals(this.platformId, dpaProductDetailGetV2ResponseDataListInner.platformId) &&
        Objects.equals(this.productId, dpaProductDetailGetV2ResponseDataListInner.productId) &&
        Objects.equals(this.subCategory, dpaProductDetailGetV2ResponseDataListInner.subCategory) &&
        Objects.equals(this.tags, dpaProductDetailGetV2ResponseDataListInner.tags) &&
        Objects.equals(this.thirdCategory, dpaProductDetailGetV2ResponseDataListInner.thirdCategory) &&
        Objects.equals(this.title, dpaProductDetailGetV2ResponseDataListInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, city, description, externalUrl, firstCategory, hasVideo, imageUrl, name, offlineTime, onlineTime, platformId, productId, subCategory, tags, thirdCategory, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductDetailGetV2ResponseDataListInner {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    firstCategory: ").append(toIndentedString(firstCategory)).append("\n");
    sb.append("    hasVideo: ").append(toIndentedString(hasVideo)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    offlineTime: ").append(toIndentedString(offlineTime)).append("\n");
    sb.append("    onlineTime: ").append(toIndentedString(onlineTime)).append("\n");
    sb.append("    platformId: ").append(toIndentedString(platformId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thirdCategory: ").append(toIndentedString(thirdCategory)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("brand_name");
    openapiFields.add("city");
    openapiFields.add("description");
    openapiFields.add("external_url");
    openapiFields.add("first_category");
    openapiFields.add("has_video");
    openapiFields.add("image_url");
    openapiFields.add("name");
    openapiFields.add("offline_time");
    openapiFields.add("online_time");
    openapiFields.add("platform_id");
    openapiFields.add("product_id");
    openapiFields.add("sub_category");
    openapiFields.add("tags");
    openapiFields.add("third_category");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductDetailGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductDetailGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductDetailGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductDetailGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductDetailGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, DpaProductDetailGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductDetailGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductDetailGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductDetailGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to DpaProductDetailGetV2ResponseDataListInner
  */
  public static DpaProductDetailGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductDetailGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of DpaProductDetailGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

