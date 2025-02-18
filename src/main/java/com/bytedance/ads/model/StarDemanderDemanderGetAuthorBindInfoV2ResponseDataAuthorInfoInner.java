/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner {
  public static final String SERIALIZED_NAME_BIZ_UID = "biz_uid";
  @SerializedName(SERIALIZED_NAME_BIZ_UID)
  private String bizUid = null;

  public static final String SERIALIZED_NAME_DOUYIN_ID = "douyin_id";
  @SerializedName(SERIALIZED_NAME_DOUYIN_ID)
  private String douyinId = null;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner() {
  }

  public StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner bizUid(String bizUid) {
    
    this.bizUid = bizUid;
    return this;
  }

   /**
   * 
   * @return bizUid
  **/
  @javax.annotation.Nullable
  public String getBizUid() {
    return bizUid;
  }


  public void setBizUid(String bizUid) {
    this.bizUid = bizUid;
  }


  public StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner douyinId(String douyinId) {
    
    this.douyinId = douyinId;
    return this;
  }

   /**
   * 抖音号
   * @return douyinId
  **/
  @javax.annotation.Nullable
  public String getDouyinId() {
    return douyinId;
  }


  public void setDouyinId(String douyinId) {
    this.douyinId = douyinId;
  }


  public StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 星图昵称
   * @return nickName
  **/
  @javax.annotation.Nullable
  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 星图id
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner starDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner = (StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner) o;
    return Objects.equals(this.bizUid, starDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner.bizUid) &&
        Objects.equals(this.douyinId, starDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner.douyinId) &&
        Objects.equals(this.nickName, starDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner.nickName) &&
        Objects.equals(this.starId, starDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner.starId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizUid, douyinId, nickName, starId);
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
    sb.append("class StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner {\n");
    sb.append("    bizUid: ").append(toIndentedString(bizUid)).append("\n");
    sb.append("    douyinId: ").append(toIndentedString(douyinId)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("biz_uid");
    openapiFields.add("douyin_id");
    openapiFields.add("nick_name");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner>() {
           @Override
           public void write(JsonWriter out, StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner
  */
  public static StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner.class);
  }

 /**
  * Convert an instance of StarDemanderDemanderGetAuthorBindInfoV2ResponseDataAuthorInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

