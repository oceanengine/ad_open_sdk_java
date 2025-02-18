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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class Oauth2AppAccessTokenResponseData {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken = null;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Long expiresIn = null;

  public Oauth2AppAccessTokenResponseData() {
  }

  public Oauth2AppAccessTokenResponseData accessToken(String accessToken) {
    
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


  public Oauth2AppAccessTokenResponseData expiresIn(Long expiresIn) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2AppAccessTokenResponseData oauth2AppAccessTokenResponseData = (Oauth2AppAccessTokenResponseData) o;
    return Objects.equals(this.accessToken, oauth2AppAccessTokenResponseData.accessToken) &&
        Objects.equals(this.expiresIn, oauth2AppAccessTokenResponseData.expiresIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn);
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
    sb.append("class Oauth2AppAccessTokenResponseData {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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
    openapiFields.add("expires_in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Oauth2AppAccessTokenResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Oauth2AppAccessTokenResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Oauth2AppAccessTokenResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Oauth2AppAccessTokenResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<Oauth2AppAccessTokenResponseData>() {
           @Override
           public void write(JsonWriter out, Oauth2AppAccessTokenResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Oauth2AppAccessTokenResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Oauth2AppAccessTokenResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Oauth2AppAccessTokenResponseData
  * @throws IOException if the JSON string is invalid with respect to Oauth2AppAccessTokenResponseData
  */
  public static Oauth2AppAccessTokenResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Oauth2AppAccessTokenResponseData.class);
  }

 /**
  * Convert an instance of Oauth2AppAccessTokenResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

