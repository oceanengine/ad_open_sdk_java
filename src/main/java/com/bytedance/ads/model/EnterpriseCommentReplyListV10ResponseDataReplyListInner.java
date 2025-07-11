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
import com.bytedance.ads.model.EnterpriseCommentReplyListV10DataReplyListReplyStatus;
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
 * EnterpriseCommentReplyListV10ResponseDataReplyListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EnterpriseCommentReplyListV10ResponseDataReplyListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_IS_E_DOUYIN_ID = "is_e_douyin_id";
  @SerializedName(SERIALIZED_NAME_IS_E_DOUYIN_ID)
  private Boolean isEDouyinId = null;

  public static final String SERIALIZED_NAME_REPLY_AWEME_NAME = "reply_aweme_name";
  @SerializedName(SERIALIZED_NAME_REPLY_AWEME_NAME)
  private String replyAwemeName = null;

  public static final String SERIALIZED_NAME_REPLY_ID = "reply_id";
  @SerializedName(SERIALIZED_NAME_REPLY_ID)
  private Long replyId = null;

  public static final String SERIALIZED_NAME_REPLY_OPEN_ID = "reply_open_id";
  @SerializedName(SERIALIZED_NAME_REPLY_OPEN_ID)
  private String replyOpenId = null;

  public static final String SERIALIZED_NAME_REPLY_STATUS = "reply_status";
  @SerializedName(SERIALIZED_NAME_REPLY_STATUS)
  private EnterpriseCommentReplyListV10DataReplyListReplyStatus replyStatus = null;

  public static final String SERIALIZED_NAME_REPLY_TEXT = "reply_text";
  @SerializedName(SERIALIZED_NAME_REPLY_TEXT)
  private String replyText = null;

  public EnterpriseCommentReplyListV10ResponseDataReplyListInner() {
  }

  public EnterpriseCommentReplyListV10ResponseDataReplyListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public EnterpriseCommentReplyListV10ResponseDataReplyListInner isEDouyinId(Boolean isEDouyinId) {
    
    this.isEDouyinId = isEDouyinId;
    return this;
  }

   /**
   * 
   * @return isEDouyinId
  **/
  @javax.annotation.Nullable
  public Boolean getIsEDouyinId() {
    return isEDouyinId;
  }


  public void setIsEDouyinId(Boolean isEDouyinId) {
    this.isEDouyinId = isEDouyinId;
  }


  public EnterpriseCommentReplyListV10ResponseDataReplyListInner replyAwemeName(String replyAwemeName) {
    
    this.replyAwemeName = replyAwemeName;
    return this;
  }

   /**
   * 
   * @return replyAwemeName
  **/
  @javax.annotation.Nullable
  public String getReplyAwemeName() {
    return replyAwemeName;
  }


  public void setReplyAwemeName(String replyAwemeName) {
    this.replyAwemeName = replyAwemeName;
  }


  public EnterpriseCommentReplyListV10ResponseDataReplyListInner replyId(Long replyId) {
    
    this.replyId = replyId;
    return this;
  }

   /**
   * 
   * @return replyId
  **/
  @javax.annotation.Nullable
  public Long getReplyId() {
    return replyId;
  }


  public void setReplyId(Long replyId) {
    this.replyId = replyId;
  }


  public EnterpriseCommentReplyListV10ResponseDataReplyListInner replyOpenId(String replyOpenId) {
    
    this.replyOpenId = replyOpenId;
    return this;
  }

   /**
   * 
   * @return replyOpenId
  **/
  @javax.annotation.Nullable
  public String getReplyOpenId() {
    return replyOpenId;
  }


  public void setReplyOpenId(String replyOpenId) {
    this.replyOpenId = replyOpenId;
  }


  public EnterpriseCommentReplyListV10ResponseDataReplyListInner replyStatus(EnterpriseCommentReplyListV10DataReplyListReplyStatus replyStatus) {
    
    this.replyStatus = replyStatus;
    return this;
  }

   /**
   * Get replyStatus
   * @return replyStatus
  **/
  @javax.annotation.Nullable
  public EnterpriseCommentReplyListV10DataReplyListReplyStatus getReplyStatus() {
    return replyStatus;
  }


  public void setReplyStatus(EnterpriseCommentReplyListV10DataReplyListReplyStatus replyStatus) {
    this.replyStatus = replyStatus;
  }


  public EnterpriseCommentReplyListV10ResponseDataReplyListInner replyText(String replyText) {
    
    this.replyText = replyText;
    return this;
  }

   /**
   * 
   * @return replyText
  **/
  @javax.annotation.Nullable
  public String getReplyText() {
    return replyText;
  }


  public void setReplyText(String replyText) {
    this.replyText = replyText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseCommentReplyListV10ResponseDataReplyListInner enterpriseCommentReplyListV10ResponseDataReplyListInner = (EnterpriseCommentReplyListV10ResponseDataReplyListInner) o;
    return Objects.equals(this.createTime, enterpriseCommentReplyListV10ResponseDataReplyListInner.createTime) &&
        Objects.equals(this.isEDouyinId, enterpriseCommentReplyListV10ResponseDataReplyListInner.isEDouyinId) &&
        Objects.equals(this.replyAwemeName, enterpriseCommentReplyListV10ResponseDataReplyListInner.replyAwemeName) &&
        Objects.equals(this.replyId, enterpriseCommentReplyListV10ResponseDataReplyListInner.replyId) &&
        Objects.equals(this.replyOpenId, enterpriseCommentReplyListV10ResponseDataReplyListInner.replyOpenId) &&
        Objects.equals(this.replyStatus, enterpriseCommentReplyListV10ResponseDataReplyListInner.replyStatus) &&
        Objects.equals(this.replyText, enterpriseCommentReplyListV10ResponseDataReplyListInner.replyText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, isEDouyinId, replyAwemeName, replyId, replyOpenId, replyStatus, replyText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentReplyListV10ResponseDataReplyListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    isEDouyinId: ").append(toIndentedString(isEDouyinId)).append("\n");
    sb.append("    replyAwemeName: ").append(toIndentedString(replyAwemeName)).append("\n");
    sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
    sb.append("    replyOpenId: ").append(toIndentedString(replyOpenId)).append("\n");
    sb.append("    replyStatus: ").append(toIndentedString(replyStatus)).append("\n");
    sb.append("    replyText: ").append(toIndentedString(replyText)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("is_e_douyin_id");
    openapiFields.add("reply_aweme_name");
    openapiFields.add("reply_id");
    openapiFields.add("reply_open_id");
    openapiFields.add("reply_status");
    openapiFields.add("reply_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentReplyListV10ResponseDataReplyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentReplyListV10ResponseDataReplyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentReplyListV10ResponseDataReplyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentReplyListV10ResponseDataReplyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentReplyListV10ResponseDataReplyListInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentReplyListV10ResponseDataReplyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentReplyListV10ResponseDataReplyListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentReplyListV10ResponseDataReplyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentReplyListV10ResponseDataReplyListInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentReplyListV10ResponseDataReplyListInner
  */
  public static EnterpriseCommentReplyListV10ResponseDataReplyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentReplyListV10ResponseDataReplyListInner.class);
  }

 /**
  * Convert an instance of EnterpriseCommentReplyListV10ResponseDataReplyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

