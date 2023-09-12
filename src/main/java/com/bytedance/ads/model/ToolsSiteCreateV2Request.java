/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteCreateV2RequestBricksInner;
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
 * ToolsSiteCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class ToolsSiteCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BRICKS = "bricks";
  @SerializedName(SERIALIZED_NAME_BRICKS)
  private List<ToolsSiteCreateV2RequestBricksInner> bricks = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public ToolsSiteCreateV2Request() {
  }

  public ToolsSiteCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsSiteCreateV2Request bricks(List<ToolsSiteCreateV2RequestBricksInner> bricks) {
    
    this.bricks = bricks;
    return this;
  }

  public ToolsSiteCreateV2Request addBricksItem(ToolsSiteCreateV2RequestBricksInner bricksItem) {
    if (this.bricks == null) {
      this.bricks = new ArrayList<>();
    }
    this.bricks.add(bricksItem);
    return this;
  }

   /**
   * 
   * @return bricks
  **/
  @javax.annotation.Nonnull
  public List<ToolsSiteCreateV2RequestBricksInner> getBricks() {
    return bricks;
  }


  public void setBricks(List<ToolsSiteCreateV2RequestBricksInner> bricks) {
    this.bricks = bricks;
  }


  public ToolsSiteCreateV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteCreateV2Request toolsSiteCreateV2Request = (ToolsSiteCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsSiteCreateV2Request.advertiserId) &&
        Objects.equals(this.bricks, toolsSiteCreateV2Request.bricks) &&
        Objects.equals(this.name, toolsSiteCreateV2Request.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, bricks, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bricks: ").append(toIndentedString(bricks)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("bricks");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("bricks");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCreateV2Request
  */
  public static ToolsSiteCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsSiteCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

