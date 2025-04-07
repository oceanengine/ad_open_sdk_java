/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * EnterpriseCommentReplyV10ResponseDataErrorsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class EnterpriseCommentReplyV10ResponseDataErrorsInner {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_REPLY_ID = "reply_id";
  @SerializedName(SERIALIZED_NAME_REPLY_ID)
  private Long replyId = null;

  public EnterpriseCommentReplyV10ResponseDataErrorsInner() {
  }

  public EnterpriseCommentReplyV10ResponseDataErrorsInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public EnterpriseCommentReplyV10ResponseDataErrorsInner replyId(Long replyId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseCommentReplyV10ResponseDataErrorsInner enterpriseCommentReplyV10ResponseDataErrorsInner = (EnterpriseCommentReplyV10ResponseDataErrorsInner) o;
    return Objects.equals(this.message, enterpriseCommentReplyV10ResponseDataErrorsInner.message) &&
        Objects.equals(this.replyId, enterpriseCommentReplyV10ResponseDataErrorsInner.replyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, replyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseCommentReplyV10ResponseDataErrorsInner {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    replyId: ").append(toIndentedString(replyId)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("reply_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseCommentReplyV10ResponseDataErrorsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseCommentReplyV10ResponseDataErrorsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseCommentReplyV10ResponseDataErrorsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseCommentReplyV10ResponseDataErrorsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseCommentReplyV10ResponseDataErrorsInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseCommentReplyV10ResponseDataErrorsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseCommentReplyV10ResponseDataErrorsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseCommentReplyV10ResponseDataErrorsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseCommentReplyV10ResponseDataErrorsInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseCommentReplyV10ResponseDataErrorsInner
  */
  public static EnterpriseCommentReplyV10ResponseDataErrorsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseCommentReplyV10ResponseDataErrorsInner.class);
  }

 /**
  * Convert an instance of EnterpriseCommentReplyV10ResponseDataErrorsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

