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
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard;
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent;
import com.bytedance.ads.model.BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoSearchComponent;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * 新的附加创意字段
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo {
  public static final String SERIALIZED_NAME_ADVANCED_CREATIVE_TYPE = "advanced_creative_type";
  @SerializedName(SERIALIZED_NAME_ADVANCED_CREATIVE_TYPE)
  private Long advancedCreativeType = null;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard card = null;

  public static final String SERIALIZED_NAME_EXPLORE_ONE_TIME_COMPONENT = "explore_one_time_component";
  @SerializedName(SERIALIZED_NAME_EXPLORE_ONE_TIME_COMPONENT)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent exploreOneTimeComponent = null;

  public static final String SERIALIZED_NAME_SEARCH_COMPONENT = "search_component";
  @SerializedName(SERIALIZED_NAME_SEARCH_COMPONENT)
  private BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoSearchComponent searchComponent = null;

  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo() {
  }

  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo advancedCreativeType(Long advancedCreativeType) {
    
    this.advancedCreativeType = advancedCreativeType;
    return this;
  }

   /**
   * 附加创意类型
   * @return advancedCreativeType
  **/
  @javax.annotation.Nullable
  public Long getAdvancedCreativeType() {
    return advancedCreativeType;
  }


  public void setAdvancedCreativeType(Long advancedCreativeType) {
    this.advancedCreativeType = advancedCreativeType;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo card(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard getCard() {
    return card;
  }


  public void setCard(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoCard card) {
    this.card = card;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo exploreOneTimeComponent(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent exploreOneTimeComponent) {
    
    this.exploreOneTimeComponent = exploreOneTimeComponent;
    return this;
  }

   /**
   * Get exploreOneTimeComponent
   * @return exploreOneTimeComponent
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent getExploreOneTimeComponent() {
    return exploreOneTimeComponent;
  }


  public void setExploreOneTimeComponent(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoExploreOneTimeComponent exploreOneTimeComponent) {
    this.exploreOneTimeComponent = exploreOneTimeComponent;
  }


  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo searchComponent(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoSearchComponent searchComponent) {
    
    this.searchComponent = searchComponent;
    return this;
  }

   /**
   * Get searchComponent
   * @return searchComponent
  **/
  @javax.annotation.Nullable
  public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoSearchComponent getSearchComponent() {
    return searchComponent;
  }


  public void setSearchComponent(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfoSearchComponent searchComponent) {
    this.searchComponent = searchComponent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo = (BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo) o;
    return Objects.equals(this.advancedCreativeType, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo.advancedCreativeType) &&
        Objects.equals(this.card, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo.card) &&
        Objects.equals(this.exploreOneTimeComponent, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo.exploreOneTimeComponent) &&
        Objects.equals(this.searchComponent, brandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo.searchComponent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedCreativeType, card, exploreOneTimeComponent, searchComponent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo {\n");
    sb.append("    advancedCreativeType: ").append(toIndentedString(advancedCreativeType)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    exploreOneTimeComponent: ").append(toIndentedString(exploreOneTimeComponent)).append("\n");
    sb.append("    searchComponent: ").append(toIndentedString(searchComponent)).append("\n");
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
    openapiFields.add("advanced_creative_type");
    openapiFields.add("card");
    openapiFields.add("explore_one_time_component");
    openapiFields.add("search_component");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo
  */
  public static BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeCreateV30RequestCreativeListInnerAdvancedCreativeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

