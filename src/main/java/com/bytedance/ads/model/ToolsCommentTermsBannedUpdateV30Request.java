/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * ToolsCommentTermsBannedUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsCommentTermsBannedUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_IS_APPLY_TO_ADV = "is_apply_to_adv";
  @SerializedName(SERIALIZED_NAME_IS_APPLY_TO_ADV)
  private Boolean isApplyToAdv = null;

  public static final String SERIALIZED_NAME_NEW_TERM = "new_term";
  @SerializedName(SERIALIZED_NAME_NEW_TERM)
  private String newTerm = null;

  public static final String SERIALIZED_NAME_ORIGIN_TERM = "origin_term";
  @SerializedName(SERIALIZED_NAME_ORIGIN_TERM)
  private String originTerm = null;

  public ToolsCommentTermsBannedUpdateV30Request() {
  }

  public ToolsCommentTermsBannedUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsCommentTermsBannedUpdateV30Request awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号，当is_apply_to_adv不传或为false时，aweme_id生效
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsCommentTermsBannedUpdateV30Request isApplyToAdv(Boolean isApplyToAdv) {
    
    this.isApplyToAdv = isApplyToAdv;
    return this;
  }

   /**
   * 是否应用于当前账户，当is_apply_to_adv不传或为false时，aweme_id生效
   * @return isApplyToAdv
  **/
  @javax.annotation.Nullable
  public Boolean getIsApplyToAdv() {
    return isApplyToAdv;
  }


  public void setIsApplyToAdv(Boolean isApplyToAdv) {
    this.isApplyToAdv = isApplyToAdv;
  }


  public ToolsCommentTermsBannedUpdateV30Request newTerm(String newTerm) {
    
    this.newTerm = newTerm;
    return this;
  }

   /**
   * 更新后的屏蔽词，屏蔽词长度范围为1-20字
   * @return newTerm
  **/
  @javax.annotation.Nonnull
  public String getNewTerm() {
    return newTerm;
  }


  public void setNewTerm(String newTerm) {
    this.newTerm = newTerm;
  }


  public ToolsCommentTermsBannedUpdateV30Request originTerm(String originTerm) {
    
    this.originTerm = originTerm;
    return this;
  }

   /**
   * 待更新的屏蔽词，屏蔽词长度范围为1-20字
   * @return originTerm
  **/
  @javax.annotation.Nonnull
  public String getOriginTerm() {
    return originTerm;
  }


  public void setOriginTerm(String originTerm) {
    this.originTerm = originTerm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentTermsBannedUpdateV30Request toolsCommentTermsBannedUpdateV30Request = (ToolsCommentTermsBannedUpdateV30Request) o;
    return Objects.equals(this.advertiserId, toolsCommentTermsBannedUpdateV30Request.advertiserId) &&
        Objects.equals(this.awemeId, toolsCommentTermsBannedUpdateV30Request.awemeId) &&
        Objects.equals(this.isApplyToAdv, toolsCommentTermsBannedUpdateV30Request.isApplyToAdv) &&
        Objects.equals(this.newTerm, toolsCommentTermsBannedUpdateV30Request.newTerm) &&
        Objects.equals(this.originTerm, toolsCommentTermsBannedUpdateV30Request.originTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, awemeId, isApplyToAdv, newTerm, originTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentTermsBannedUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    isApplyToAdv: ").append(toIndentedString(isApplyToAdv)).append("\n");
    sb.append("    newTerm: ").append(toIndentedString(newTerm)).append("\n");
    sb.append("    originTerm: ").append(toIndentedString(originTerm)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("is_apply_to_adv");
    openapiFields.add("new_term");
    openapiFields.add("origin_term");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("new_term");
    openapiRequiredFields.add("origin_term");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentTermsBannedUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentTermsBannedUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentTermsBannedUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentTermsBannedUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentTermsBannedUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsCommentTermsBannedUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentTermsBannedUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentTermsBannedUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentTermsBannedUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentTermsBannedUpdateV30Request
  */
  public static ToolsCommentTermsBannedUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentTermsBannedUpdateV30Request.class);
  }

 /**
  * Convert an instance of ToolsCommentTermsBannedUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

