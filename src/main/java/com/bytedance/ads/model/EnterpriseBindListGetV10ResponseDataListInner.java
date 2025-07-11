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
import com.bytedance.ads.model.EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner;
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
 * EnterpriseBindListGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EnterpriseBindListGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUTHORIZE_TIMES = "authorize_times";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE_TIMES)
  private List<EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner> authorizeTimes = null;

  public static final String SERIALIZED_NAME_AWEME_AVATAR = "aweme_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AVATAR)
  private String awemeAvatar = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId = null;

  public EnterpriseBindListGetV10ResponseDataListInner() {
  }

  public EnterpriseBindListGetV10ResponseDataListInner authorizeTimes(List<EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner> authorizeTimes) {
    
    this.authorizeTimes = authorizeTimes;
    return this;
  }

  public EnterpriseBindListGetV10ResponseDataListInner addAuthorizeTimesItem(EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner authorizeTimesItem) {
    if (this.authorizeTimes == null) {
      this.authorizeTimes = new ArrayList<>();
    }
    this.authorizeTimes.add(authorizeTimesItem);
    return this;
  }

   /**
   * 
   * @return authorizeTimes
  **/
  @javax.annotation.Nullable
  public List<EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner> getAuthorizeTimes() {
    return authorizeTimes;
  }


  public void setAuthorizeTimes(List<EnterpriseBindListGetV10ResponseDataListInnerAuthorizeTimesInner> authorizeTimes) {
    this.authorizeTimes = authorizeTimes;
  }


  public EnterpriseBindListGetV10ResponseDataListInner awemeAvatar(String awemeAvatar) {
    
    this.awemeAvatar = awemeAvatar;
    return this;
  }

   /**
   * 
   * @return awemeAvatar
  **/
  @javax.annotation.Nullable
  public String getAwemeAvatar() {
    return awemeAvatar;
  }


  public void setAwemeAvatar(String awemeAvatar) {
    this.awemeAvatar = awemeAvatar;
  }


  public EnterpriseBindListGetV10ResponseDataListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public EnterpriseBindListGetV10ResponseDataListInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public EnterpriseBindListGetV10ResponseDataListInner openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 
   * @return openId
  **/
  @javax.annotation.Nullable
  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseBindListGetV10ResponseDataListInner enterpriseBindListGetV10ResponseDataListInner = (EnterpriseBindListGetV10ResponseDataListInner) o;
    return Objects.equals(this.authorizeTimes, enterpriseBindListGetV10ResponseDataListInner.authorizeTimes) &&
        Objects.equals(this.awemeAvatar, enterpriseBindListGetV10ResponseDataListInner.awemeAvatar) &&
        Objects.equals(this.awemeId, enterpriseBindListGetV10ResponseDataListInner.awemeId) &&
        Objects.equals(this.awemeName, enterpriseBindListGetV10ResponseDataListInner.awemeName) &&
        Objects.equals(this.openId, enterpriseBindListGetV10ResponseDataListInner.openId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizeTimes, awemeAvatar, awemeId, awemeName, openId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseBindListGetV10ResponseDataListInner {\n");
    sb.append("    authorizeTimes: ").append(toIndentedString(authorizeTimes)).append("\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
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
    openapiFields.add("authorize_times");
    openapiFields.add("aweme_avatar");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("open_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseBindListGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseBindListGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseBindListGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseBindListGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseBindListGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseBindListGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseBindListGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseBindListGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseBindListGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseBindListGetV10ResponseDataListInner
  */
  public static EnterpriseBindListGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseBindListGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of EnterpriseBindListGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

