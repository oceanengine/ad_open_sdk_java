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
import com.bytedance.ads.model.PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner;
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
 * PromotionAidGetV30ResponseDataPromotionMapDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class PromotionAidGetV30ResponseDataPromotionMapDataInner {
  public static final String SERIALIZED_NAME_ADS = "ads";
  @SerializedName(SERIALIZED_NAME_ADS)
  private List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner> ads = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public PromotionAidGetV30ResponseDataPromotionMapDataInner() {
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInner ads(List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner> ads) {
    
    this.ads = ads;
    return this;
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInner addAdsItem(PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner adsItem) {
    if (this.ads == null) {
      this.ads = new ArrayList<>();
    }
    this.ads.add(adsItem);
    return this;
  }

   /**
   * 
   * @return ads
  **/
  @javax.annotation.Nullable
  public List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner> getAds() {
    return ads;
  }


  public void setAds(List<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInner> ads) {
    this.ads = ads;
  }


  public PromotionAidGetV30ResponseDataPromotionMapDataInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAidGetV30ResponseDataPromotionMapDataInner promotionAidGetV30ResponseDataPromotionMapDataInner = (PromotionAidGetV30ResponseDataPromotionMapDataInner) o;
    return Objects.equals(this.ads, promotionAidGetV30ResponseDataPromotionMapDataInner.ads) &&
        Objects.equals(this.promotionId, promotionAidGetV30ResponseDataPromotionMapDataInner.promotionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ads, promotionId);
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
    sb.append("class PromotionAidGetV30ResponseDataPromotionMapDataInner {\n");
    sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("ads");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAidGetV30ResponseDataPromotionMapDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAidGetV30ResponseDataPromotionMapDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAidGetV30ResponseDataPromotionMapDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInner>() {
           @Override
           public void write(JsonWriter out, PromotionAidGetV30ResponseDataPromotionMapDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAidGetV30ResponseDataPromotionMapDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAidGetV30ResponseDataPromotionMapDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAidGetV30ResponseDataPromotionMapDataInner
  * @throws IOException if the JSON string is invalid with respect to PromotionAidGetV30ResponseDataPromotionMapDataInner
  */
  public static PromotionAidGetV30ResponseDataPromotionMapDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAidGetV30ResponseDataPromotionMapDataInner.class);
  }

 /**
  * Convert an instance of PromotionAidGetV30ResponseDataPromotionMapDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

