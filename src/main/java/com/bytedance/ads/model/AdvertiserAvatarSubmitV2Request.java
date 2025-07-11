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
 * AdvertiserAvatarSubmitV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class AdvertiserAvatarSubmitV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_SOURCE_INFO = "source_info";
  @SerializedName(SERIALIZED_NAME_SOURCE_INFO)
  private String sourceInfo = null;

  public AdvertiserAvatarSubmitV2Request() {
  }

  public AdvertiserAvatarSubmitV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserAvatarSubmitV2Request imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nonnull
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public AdvertiserAvatarSubmitV2Request sourceInfo(String sourceInfo) {
    
    this.sourceInfo = sourceInfo;
    return this;
  }

   /**
   * 
   * @return sourceInfo
  **/
  @javax.annotation.Nullable
  public String getSourceInfo() {
    return sourceInfo;
  }


  public void setSourceInfo(String sourceInfo) {
    this.sourceInfo = sourceInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserAvatarSubmitV2Request advertiserAvatarSubmitV2Request = (AdvertiserAvatarSubmitV2Request) o;
    return Objects.equals(this.advertiserId, advertiserAvatarSubmitV2Request.advertiserId) &&
        Objects.equals(this.imageId, advertiserAvatarSubmitV2Request.imageId) &&
        Objects.equals(this.sourceInfo, advertiserAvatarSubmitV2Request.sourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, imageId, sourceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserAvatarSubmitV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
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
    openapiFields.add("image_id");
    openapiFields.add("source_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("image_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserAvatarSubmitV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserAvatarSubmitV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserAvatarSubmitV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserAvatarSubmitV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserAvatarSubmitV2Request>() {
           @Override
           public void write(JsonWriter out, AdvertiserAvatarSubmitV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserAvatarSubmitV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserAvatarSubmitV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserAvatarSubmitV2Request
  * @throws IOException if the JSON string is invalid with respect to AdvertiserAvatarSubmitV2Request
  */
  public static AdvertiserAvatarSubmitV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserAvatarSubmitV2Request.class);
  }

 /**
  * Convert an instance of AdvertiserAvatarSubmitV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

