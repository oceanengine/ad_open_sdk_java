/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
 * FileImageDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class FileImageDeleteV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public FileImageDeleteV30Request() {
  }

  public FileImageDeleteV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public FileImageDeleteV30Request imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public FileImageDeleteV30Request addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 待删除的图片ID列表，长度范围：1 ~ 100
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileImageDeleteV30Request fileImageDeleteV30Request = (FileImageDeleteV30Request) o;
    return Objects.equals(this.advertiserId, fileImageDeleteV30Request.advertiserId) &&
        Objects.equals(this.imageIds, fileImageDeleteV30Request.imageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, imageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileImageDeleteV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
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
    openapiFields.add("image_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileImageDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileImageDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileImageDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileImageDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileImageDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, FileImageDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileImageDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileImageDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileImageDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to FileImageDeleteV30Request
  */
  public static FileImageDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileImageDeleteV30Request.class);
  }

 /**
  * Convert an instance of FileImageDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

