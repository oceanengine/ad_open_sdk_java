/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarComponentCreateCommonComponentV2RequestCommonComponent;
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
 * StarComponentCreateCommonComponentV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class StarComponentCreateCommonComponentV2Request {
  public static final String SERIALIZED_NAME_COMMON_COMPONENT = "common_component";
  @SerializedName(SERIALIZED_NAME_COMMON_COMPONENT)
  private StarComponentCreateCommonComponentV2RequestCommonComponent commonComponent = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarComponentCreateCommonComponentV2Request() {
  }

  public StarComponentCreateCommonComponentV2Request commonComponent(StarComponentCreateCommonComponentV2RequestCommonComponent commonComponent) {
    
    this.commonComponent = commonComponent;
    return this;
  }

   /**
   * Get commonComponent
   * @return commonComponent
  **/
  @javax.annotation.Nonnull
  public StarComponentCreateCommonComponentV2RequestCommonComponent getCommonComponent() {
    return commonComponent;
  }


  public void setCommonComponent(StarComponentCreateCommonComponentV2RequestCommonComponent commonComponent) {
    this.commonComponent = commonComponent;
  }


  public StarComponentCreateCommonComponentV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
   * @return starId
  **/
  @javax.annotation.Nonnull
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
    StarComponentCreateCommonComponentV2Request starComponentCreateCommonComponentV2Request = (StarComponentCreateCommonComponentV2Request) o;
    return Objects.equals(this.commonComponent, starComponentCreateCommonComponentV2Request.commonComponent) &&
        Objects.equals(this.starId, starComponentCreateCommonComponentV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonComponent, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarComponentCreateCommonComponentV2Request {\n");
    sb.append("    commonComponent: ").append(toIndentedString(commonComponent)).append("\n");
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
    openapiFields.add("common_component");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("common_component");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentCreateCommonComponentV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentCreateCommonComponentV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentCreateCommonComponentV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentCreateCommonComponentV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentCreateCommonComponentV2Request>() {
           @Override
           public void write(JsonWriter out, StarComponentCreateCommonComponentV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentCreateCommonComponentV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentCreateCommonComponentV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentCreateCommonComponentV2Request
  * @throws IOException if the JSON string is invalid with respect to StarComponentCreateCommonComponentV2Request
  */
  public static StarComponentCreateCommonComponentV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentCreateCommonComponentV2Request.class);
  }

 /**
  * Convert an instance of StarComponentCreateCommonComponentV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
