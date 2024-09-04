/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * StarChallengeAuthorListV2ResponseDataAuthorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class StarChallengeAuthorListV2ResponseDataAuthorListInner {
  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private Long uid = null;

  public StarChallengeAuthorListV2ResponseDataAuthorListInner() {
  }

  public StarChallengeAuthorListV2ResponseDataAuthorListInner nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 
   * @return nickName
  **/
  @javax.annotation.Nullable
  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public StarChallengeAuthorListV2ResponseDataAuthorListInner starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }


  public StarChallengeAuthorListV2ResponseDataAuthorListInner uid(Long uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * 
   * @return uid
  **/
  @javax.annotation.Nullable
  public Long getUid() {
    return uid;
  }


  public void setUid(Long uid) {
    this.uid = uid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeAuthorListV2ResponseDataAuthorListInner starChallengeAuthorListV2ResponseDataAuthorListInner = (StarChallengeAuthorListV2ResponseDataAuthorListInner) o;
    return Objects.equals(this.nickName, starChallengeAuthorListV2ResponseDataAuthorListInner.nickName) &&
        Objects.equals(this.starId, starChallengeAuthorListV2ResponseDataAuthorListInner.starId) &&
        Objects.equals(this.uid, starChallengeAuthorListV2ResponseDataAuthorListInner.uid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickName, starId, uid);
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
    sb.append("class StarChallengeAuthorListV2ResponseDataAuthorListInner {\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("nick_name");
    openapiFields.add("star_id");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeAuthorListV2ResponseDataAuthorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeAuthorListV2ResponseDataAuthorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeAuthorListV2ResponseDataAuthorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeAuthorListV2ResponseDataAuthorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeAuthorListV2ResponseDataAuthorListInner>() {
           @Override
           public void write(JsonWriter out, StarChallengeAuthorListV2ResponseDataAuthorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeAuthorListV2ResponseDataAuthorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeAuthorListV2ResponseDataAuthorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeAuthorListV2ResponseDataAuthorListInner
  * @throws IOException if the JSON string is invalid with respect to StarChallengeAuthorListV2ResponseDataAuthorListInner
  */
  public static StarChallengeAuthorListV2ResponseDataAuthorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeAuthorListV2ResponseDataAuthorListInner.class);
  }

 /**
  * Convert an instance of StarChallengeAuthorListV2ResponseDataAuthorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

