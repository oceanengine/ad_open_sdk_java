/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfo;
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
 * NativeAnchorUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class NativeAnchorUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ANCHOR_INFO = "anchor_info";
  @SerializedName(SERIALIZED_NAME_ANCHOR_INFO)
  private NativeAnchorUpdateV30RequestAnchorInfo anchorInfo = null;

  public NativeAnchorUpdateV30Request() {
  }

  public NativeAnchorUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public NativeAnchorUpdateV30Request anchorInfo(NativeAnchorUpdateV30RequestAnchorInfo anchorInfo) {
    
    this.anchorInfo = anchorInfo;
    return this;
  }

   /**
   * Get anchorInfo
   * @return anchorInfo
  **/
  @javax.annotation.Nonnull
  public NativeAnchorUpdateV30RequestAnchorInfo getAnchorInfo() {
    return anchorInfo;
  }


  public void setAnchorInfo(NativeAnchorUpdateV30RequestAnchorInfo anchorInfo) {
    this.anchorInfo = anchorInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorUpdateV30Request nativeAnchorUpdateV30Request = (NativeAnchorUpdateV30Request) o;
    return Objects.equals(this.advertiserId, nativeAnchorUpdateV30Request.advertiserId) &&
        Objects.equals(this.anchorInfo, nativeAnchorUpdateV30Request.anchorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, anchorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    anchorInfo: ").append(toIndentedString(anchorInfo)).append("\n");
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
    openapiFields.add("anchor_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("anchor_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30Request
  */
  public static NativeAnchorUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30Request.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

