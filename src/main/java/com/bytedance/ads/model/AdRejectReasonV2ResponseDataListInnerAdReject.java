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
import com.bytedance.ads.model.AdRejectReasonV2ResponseDataListInnerAdRejectRejectDataInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class AdRejectReasonV2ResponseDataListInnerAdReject {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_REJECT_DATA = "reject_data";
  @SerializedName(SERIALIZED_NAME_REJECT_DATA)
  private List<AdRejectReasonV2ResponseDataListInnerAdRejectRejectDataInner> rejectData = null;

  public AdRejectReasonV2ResponseDataListInnerAdReject() {
  }

  public AdRejectReasonV2ResponseDataListInnerAdReject adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public AdRejectReasonV2ResponseDataListInnerAdReject rejectData(List<AdRejectReasonV2ResponseDataListInnerAdRejectRejectDataInner> rejectData) {
    
    this.rejectData = rejectData;
    return this;
  }

  public AdRejectReasonV2ResponseDataListInnerAdReject addRejectDataItem(AdRejectReasonV2ResponseDataListInnerAdRejectRejectDataInner rejectDataItem) {
    if (this.rejectData == null) {
      this.rejectData = new ArrayList<>();
    }
    this.rejectData.add(rejectDataItem);
    return this;
  }

   /**
   * 
   * @return rejectData
  **/
  @javax.annotation.Nullable
  public List<AdRejectReasonV2ResponseDataListInnerAdRejectRejectDataInner> getRejectData() {
    return rejectData;
  }


  public void setRejectData(List<AdRejectReasonV2ResponseDataListInnerAdRejectRejectDataInner> rejectData) {
    this.rejectData = rejectData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdRejectReasonV2ResponseDataListInnerAdReject adRejectReasonV2ResponseDataListInnerAdReject = (AdRejectReasonV2ResponseDataListInnerAdReject) o;
    return Objects.equals(this.adId, adRejectReasonV2ResponseDataListInnerAdReject.adId) &&
        Objects.equals(this.rejectData, adRejectReasonV2ResponseDataListInnerAdReject.rejectData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, rejectData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdRejectReasonV2ResponseDataListInnerAdReject {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    rejectData: ").append(toIndentedString(rejectData)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("reject_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdRejectReasonV2ResponseDataListInnerAdReject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdRejectReasonV2ResponseDataListInnerAdReject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdRejectReasonV2ResponseDataListInnerAdReject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdRejectReasonV2ResponseDataListInnerAdReject.class));

       return (TypeAdapter<T>) new TypeAdapter<AdRejectReasonV2ResponseDataListInnerAdReject>() {
           @Override
           public void write(JsonWriter out, AdRejectReasonV2ResponseDataListInnerAdReject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdRejectReasonV2ResponseDataListInnerAdReject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdRejectReasonV2ResponseDataListInnerAdReject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdRejectReasonV2ResponseDataListInnerAdReject
  * @throws IOException if the JSON string is invalid with respect to AdRejectReasonV2ResponseDataListInnerAdReject
  */
  public static AdRejectReasonV2ResponseDataListInnerAdReject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdRejectReasonV2ResponseDataListInnerAdReject.class);
  }

 /**
  * Convert an instance of AdRejectReasonV2ResponseDataListInnerAdReject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

