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
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCardImageInfo;
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
 * 图片磁贴或图片磁贴含搜索组件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard {
  public static final String SERIALIZED_NAME_ADVANCED_DURATION = "advanced_duration";
  @SerializedName(SERIALIZED_NAME_ADVANCED_DURATION)
  private Long advancedDuration = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCardImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_SEARCH_WORDS = "search_words";
  @SerializedName(SERIALIZED_NAME_SEARCH_WORDS)
  private List<String> searchWords = null;

  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard() {
  }

  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard advancedDuration(Long advancedDuration) {
    
    this.advancedDuration = advancedDuration;
    return this;
  }

   /**
   * 组件弹出时间
   * @return advancedDuration
  **/
  @javax.annotation.Nullable
  public Long getAdvancedDuration() {
    return advancedDuration;
  }


  public void setAdvancedDuration(Long advancedDuration) {
    this.advancedDuration = advancedDuration;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard imageInfo(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCardImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCardImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCardImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard searchWords(List<String> searchWords) {
    
    this.searchWords = searchWords;
    return this;
  }

  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard addSearchWordsItem(String searchWordsItem) {
    if (this.searchWords == null) {
      this.searchWords = new ArrayList<>();
    }
    this.searchWords.add(searchWordsItem);
    return this;
  }

   /**
   * 搜索词数组
   * @return searchWords
  **/
  @javax.annotation.Nullable
  public List<String> getSearchWords() {
    return searchWords;
  }


  public void setSearchWords(List<String> searchWords) {
    this.searchWords = searchWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard = (BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard) o;
    return Objects.equals(this.advancedDuration, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard.advancedDuration) &&
        Objects.equals(this.imageInfo, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard.imageInfo) &&
        Objects.equals(this.searchWords, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard.searchWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedDuration, imageInfo, searchWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard {\n");
    sb.append("    advancedDuration: ").append(toIndentedString(advancedDuration)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    searchWords: ").append(toIndentedString(searchWords)).append("\n");
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
    openapiFields.add("advanced_duration");
    openapiFields.add("image_info");
    openapiFields.add("search_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard>() {
           @Override
           public void write(JsonWriter out, BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard
  */
  public static BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard.class);
  }

 /**
  * Convert an instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

