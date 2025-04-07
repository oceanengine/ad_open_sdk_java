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
import com.bytedance.ads.model.BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCardImage;
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
 * 图片磁贴(含搜索)
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard {
  public static final String SERIALIZED_NAME_ADVANCED_DURATION = "advanced_duration";
  @SerializedName(SERIALIZED_NAME_ADVANCED_DURATION)
  private Long advancedDuration = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCardImage image = null;

  public static final String SERIALIZED_NAME_LIVE_IES_CORE_USER_ID = "live_ies_core_user_id";
  @SerializedName(SERIALIZED_NAME_LIVE_IES_CORE_USER_ID)
  private String liveIesCoreUserId = null;

  public static final String SERIALIZED_NAME_SEARCH_WORDS = "search_words";
  @SerializedName(SERIALIZED_NAME_SEARCH_WORDS)
  private List<String> searchWords = null;

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard() {
  }

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard advancedDuration(Long advancedDuration) {
    
    this.advancedDuration = advancedDuration;
    return this;
  }

   /**
   * 弹出时间 单位秒
   * @return advancedDuration
  **/
  @javax.annotation.Nullable
  public Long getAdvancedDuration() {
    return advancedDuration;
  }


  public void setAdvancedDuration(Long advancedDuration) {
    this.advancedDuration = advancedDuration;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard image(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCardImage image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCardImage getImage() {
    return image;
  }


  public void setImage(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCardImage image) {
    this.image = image;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard liveIesCoreUserId(String liveIesCoreUserId) {
    
    this.liveIesCoreUserId = liveIesCoreUserId;
    return this;
  }

   /**
   * 直播引流磁贴抖音号uid （直播引流磁贴）
   * @return liveIesCoreUserId
  **/
  @javax.annotation.Nullable
  public String getLiveIesCoreUserId() {
    return liveIesCoreUserId;
  }


  public void setLiveIesCoreUserId(String liveIesCoreUserId) {
    this.liveIesCoreUserId = liveIesCoreUserId;
  }


  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard searchWords(List<String> searchWords) {
    
    this.searchWords = searchWords;
    return this;
  }

  public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard addSearchWordsItem(String searchWordsItem) {
    if (this.searchWords == null) {
      this.searchWords = new ArrayList<>();
    }
    this.searchWords.add(searchWordsItem);
    return this;
  }

   /**
   * 搜索词 
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
    BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard brandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard = (BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard) o;
    return Objects.equals(this.advancedDuration, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard.advancedDuration) &&
        Objects.equals(this.image, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard.image) &&
        Objects.equals(this.liveIesCoreUserId, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard.liveIesCoreUserId) &&
        Objects.equals(this.searchWords, brandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard.searchWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedDuration, image, liveIesCoreUserId, searchWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard {\n");
    sb.append("    advancedDuration: ").append(toIndentedString(advancedDuration)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    liveIesCoreUserId: ").append(toIndentedString(liveIesCoreUserId)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("live_ies_core_user_id");
    openapiFields.add("search_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard>() {
           @Override
           public void write(JsonWriter out, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard
  */
  public static BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard.class);
  }

 /**
  * Convert an instance of BrandMaterialCreateV30RequestMaterialListInnerMaterialComponentImageCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

