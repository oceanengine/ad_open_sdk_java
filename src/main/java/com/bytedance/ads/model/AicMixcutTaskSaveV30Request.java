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
import com.bytedance.ads.model.AicMixcutTaskSaveV30AccountType;
import com.bytedance.ads.model.AicMixcutTaskSaveV30RequestVideosInner;
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
 * AicMixcutTaskSaveV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class AicMixcutTaskSaveV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AicMixcutTaskSaveV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<AicMixcutTaskSaveV30RequestVideosInner> videos = null;

  public AicMixcutTaskSaveV30Request() {
  }

  public AicMixcutTaskSaveV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * BP账户体系:组织id，Agent账户体系:代理商id
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AicMixcutTaskSaveV30Request accountType(AicMixcutTaskSaveV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public AicMixcutTaskSaveV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(AicMixcutTaskSaveV30AccountType accountType) {
    this.accountType = accountType;
  }


  public AicMixcutTaskSaveV30Request videos(List<AicMixcutTaskSaveV30RequestVideosInner> videos) {
    
    this.videos = videos;
    return this;
  }

  public AicMixcutTaskSaveV30Request addVideosItem(AicMixcutTaskSaveV30RequestVideosInner videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * 需要保存的视频数组，数量限制:50
   * @return videos
  **/
  @javax.annotation.Nonnull
  public List<AicMixcutTaskSaveV30RequestVideosInner> getVideos() {
    return videos;
  }


  public void setVideos(List<AicMixcutTaskSaveV30RequestVideosInner> videos) {
    this.videos = videos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicMixcutTaskSaveV30Request aicMixcutTaskSaveV30Request = (AicMixcutTaskSaveV30Request) o;
    return Objects.equals(this.accountId, aicMixcutTaskSaveV30Request.accountId) &&
        Objects.equals(this.accountType, aicMixcutTaskSaveV30Request.accountType) &&
        Objects.equals(this.videos, aicMixcutTaskSaveV30Request.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicMixcutTaskSaveV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("videos");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicMixcutTaskSaveV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMixcutTaskSaveV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMixcutTaskSaveV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMixcutTaskSaveV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMixcutTaskSaveV30Request>() {
           @Override
           public void write(JsonWriter out, AicMixcutTaskSaveV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMixcutTaskSaveV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMixcutTaskSaveV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMixcutTaskSaveV30Request
  * @throws IOException if the JSON string is invalid with respect to AicMixcutTaskSaveV30Request
  */
  public static AicMixcutTaskSaveV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMixcutTaskSaveV30Request.class);
  }

 /**
  * Convert an instance of AicMixcutTaskSaveV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

