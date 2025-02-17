/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:36:04.545962331+08:00[Asia/Shanghai]")
public class Oauth2AccessTokenResponseData {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Long expiresIn = null;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken = null;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN_EXPIRES_IN = "refresh_token_expires_in";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN_EXPIRES_IN)
  private Long refreshTokenExpiresIn = null;

  public Oauth2AccessTokenResponseData() {
  }

  public Oauth2AccessTokenResponseData accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * 
   * @return accessToken
  **/
  @javax.annotation.Nullable
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public Oauth2AccessTokenResponseData advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public Oauth2AccessTokenResponseData addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public Oauth2AccessTokenResponseData expiresIn(Long expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  public Long getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }


  public Oauth2AccessTokenResponseData refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public Oauth2AccessTokenResponseData refreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

   /**
   * 
   * @return refreshTokenExpiresIn
  **/
  @javax.annotation.Nullable
  public Long getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }


  public void setRefreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2AccessTokenResponseData oauth2AccessTokenResponseData = (Oauth2AccessTokenResponseData) o;
    return Objects.equals(this.accessToken, oauth2AccessTokenResponseData.accessToken) &&
        Objects.equals(this.advertiserIds, oauth2AccessTokenResponseData.advertiserIds) &&
        Objects.equals(this.expiresIn, oauth2AccessTokenResponseData.expiresIn) &&
        Objects.equals(this.refreshToken, oauth2AccessTokenResponseData.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresIn, oauth2AccessTokenResponseData.refreshTokenExpiresIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, advertiserIds, expiresIn, refreshToken, refreshTokenExpiresIn);
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
    sb.append("class Oauth2AccessTokenResponseData {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("advertiser_ids");
    openapiFields.add("expires_in");
    openapiFields.add("refresh_token");
    openapiFields.add("refresh_token_expires_in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Oauth2AccessTokenResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Oauth2AccessTokenResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Oauth2AccessTokenResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Oauth2AccessTokenResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<Oauth2AccessTokenResponseData>() {
           @Override
           public void write(JsonWriter out, Oauth2AccessTokenResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Oauth2AccessTokenResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Oauth2AccessTokenResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Oauth2AccessTokenResponseData
  * @throws IOException if the JSON string is invalid with respect to Oauth2AccessTokenResponseData
  */
  public static Oauth2AccessTokenResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Oauth2AccessTokenResponseData.class);
  }

 /**
  * Convert an instance of Oauth2AccessTokenResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

