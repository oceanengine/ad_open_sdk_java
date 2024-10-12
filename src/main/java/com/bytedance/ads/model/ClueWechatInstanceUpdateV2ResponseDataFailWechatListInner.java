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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner {
  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason = null;

  public static final String SERIALIZED_NAME_WECHAT = "wechat";
  @SerializedName(SERIALIZED_NAME_WECHAT)
  private String wechat = null;

  public ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner() {
  }

  public ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner wechat(String wechat) {
    
    this.wechat = wechat;
    return this;
  }

   /**
   * 微信号码
   * @return wechat
  **/
  @javax.annotation.Nullable
  public String getWechat() {
    return wechat;
  }


  public void setWechat(String wechat) {
    this.wechat = wechat;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner clueWechatInstanceUpdateV2ResponseDataFailWechatListInner = (ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner) o;
    return Objects.equals(this.failReason, clueWechatInstanceUpdateV2ResponseDataFailWechatListInner.failReason) &&
        Objects.equals(this.wechat, clueWechatInstanceUpdateV2ResponseDataFailWechatListInner.wechat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, wechat);
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
    sb.append("class ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner {\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    wechat: ").append(toIndentedString(wechat)).append("\n");
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
    openapiFields.add("fail_reason");
    openapiFields.add("wechat");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner>() {
           @Override
           public void write(JsonWriter out, ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner
  * @throws IOException if the JSON string is invalid with respect to ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner
  */
  public static ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner.class);
  }

 /**
  * Convert an instance of ClueWechatInstanceUpdateV2ResponseDataFailWechatListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

