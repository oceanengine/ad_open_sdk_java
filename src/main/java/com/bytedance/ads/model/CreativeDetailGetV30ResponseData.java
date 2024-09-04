/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataAdData;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreative;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class CreativeDetailGetV30ResponseData {
  public static final String SERIALIZED_NAME_AD_DATA = "ad_data";
  @SerializedName(SERIALIZED_NAME_AD_DATA)
  private CreativeDetailGetV30ResponseDataAdData adData = null;

  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CREATIVE = "creative";
  @SerializedName(SERIALIZED_NAME_CREATIVE)
  private CreativeDetailGetV30ResponseDataCreative creative = null;

  public static final String SERIALIZED_NAME_CREATIVE_LIST = "creative_list";
  @SerializedName(SERIALIZED_NAME_CREATIVE_LIST)
  private List<CreativeDetailGetV30ResponseDataCreativeListInner> creativeList = null;

  public CreativeDetailGetV30ResponseData() {
  }

  public CreativeDetailGetV30ResponseData adData(CreativeDetailGetV30ResponseDataAdData adData) {
    
    this.adData = adData;
    return this;
  }

   /**
   * Get adData
   * @return adData
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataAdData getAdData() {
    return adData;
  }


  public void setAdData(CreativeDetailGetV30ResponseDataAdData adData) {
    this.adData = adData;
  }


  public CreativeDetailGetV30ResponseData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public CreativeDetailGetV30ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告账户id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public CreativeDetailGetV30ResponseData creative(CreativeDetailGetV30ResponseDataCreative creative) {
    
    this.creative = creative;
    return this;
  }

   /**
   * Get creative
   * @return creative
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreative getCreative() {
    return creative;
  }


  public void setCreative(CreativeDetailGetV30ResponseDataCreative creative) {
    this.creative = creative;
  }


  public CreativeDetailGetV30ResponseData creativeList(List<CreativeDetailGetV30ResponseDataCreativeListInner> creativeList) {
    
    this.creativeList = creativeList;
    return this;
  }

  public CreativeDetailGetV30ResponseData addCreativeListItem(CreativeDetailGetV30ResponseDataCreativeListInner creativeListItem) {
    if (this.creativeList == null) {
      this.creativeList = new ArrayList<>();
    }
    this.creativeList.add(creativeListItem);
    return this;
  }

   /**
   * 自定义素材信息
   * @return creativeList
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeListInner> getCreativeList() {
    return creativeList;
  }


  public void setCreativeList(List<CreativeDetailGetV30ResponseDataCreativeListInner> creativeList) {
    this.creativeList = creativeList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseData creativeDetailGetV30ResponseData = (CreativeDetailGetV30ResponseData) o;
    return Objects.equals(this.adData, creativeDetailGetV30ResponseData.adData) &&
        Objects.equals(this.adId, creativeDetailGetV30ResponseData.adId) &&
        Objects.equals(this.advertiserId, creativeDetailGetV30ResponseData.advertiserId) &&
        Objects.equals(this.creative, creativeDetailGetV30ResponseData.creative) &&
        Objects.equals(this.creativeList, creativeDetailGetV30ResponseData.creativeList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adData, adId, advertiserId, creative, creativeList);
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
    sb.append("class CreativeDetailGetV30ResponseData {\n");
    sb.append("    adData: ").append(toIndentedString(adData)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    creative: ").append(toIndentedString(creative)).append("\n");
    sb.append("    creativeList: ").append(toIndentedString(creativeList)).append("\n");
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
    openapiFields.add("ad_data");
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("creative");
    openapiFields.add("creative_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseData
  */
  public static CreativeDetailGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseData.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

