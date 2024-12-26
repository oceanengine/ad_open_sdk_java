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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StarUserGetAwemeAuthorIdV2ResponseData {
  public static final String SERIALIZED_NAME_AWEME_AUTHOR_ID = "aweme_author_id";
  @SerializedName(SERIALIZED_NAME_AWEME_AUTHOR_ID)
  private Long awemeAuthorId = null;

  public StarUserGetAwemeAuthorIdV2ResponseData() {
  }

  public StarUserGetAwemeAuthorIdV2ResponseData awemeAuthorId(Long awemeAuthorId) {
    
    this.awemeAuthorId = awemeAuthorId;
    return this;
  }

   /**
   * 达人uid
   * @return awemeAuthorId
  **/
  @javax.annotation.Nullable
  public Long getAwemeAuthorId() {
    return awemeAuthorId;
  }


  public void setAwemeAuthorId(Long awemeAuthorId) {
    this.awemeAuthorId = awemeAuthorId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarUserGetAwemeAuthorIdV2ResponseData starUserGetAwemeAuthorIdV2ResponseData = (StarUserGetAwemeAuthorIdV2ResponseData) o;
    return Objects.equals(this.awemeAuthorId, starUserGetAwemeAuthorIdV2ResponseData.awemeAuthorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAuthorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarUserGetAwemeAuthorIdV2ResponseData {\n");
    sb.append("    awemeAuthorId: ").append(toIndentedString(awemeAuthorId)).append("\n");
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
    openapiFields.add("aweme_author_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aweme_author_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarUserGetAwemeAuthorIdV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarUserGetAwemeAuthorIdV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarUserGetAwemeAuthorIdV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarUserGetAwemeAuthorIdV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarUserGetAwemeAuthorIdV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarUserGetAwemeAuthorIdV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarUserGetAwemeAuthorIdV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarUserGetAwemeAuthorIdV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarUserGetAwemeAuthorIdV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarUserGetAwemeAuthorIdV2ResponseData
  */
  public static StarUserGetAwemeAuthorIdV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarUserGetAwemeAuthorIdV2ResponseData.class);
  }

 /**
  * Convert an instance of StarUserGetAwemeAuthorIdV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

