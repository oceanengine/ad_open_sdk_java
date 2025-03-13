/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOrderCreateV30ObjectInfosMarketingGoal;
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
 * DouplusOrderCreateV30RequestObjectInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class DouplusOrderCreateV30RequestObjectInfosInner {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private DouplusOrderCreateV30ObjectInfosMarketingGoal marketingGoal = null;

  public DouplusOrderCreateV30RequestObjectInfosInner() {
  }

  public DouplusOrderCreateV30RequestObjectInfosInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号，即客户在手机端上看到的抖音号，若向客户披露抖音号请使用该字段
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public DouplusOrderCreateV30RequestObjectInfosInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 抖音视频ID，当营销目标为视频加热和视频加热直播间：传递视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public DouplusOrderCreateV30RequestObjectInfosInner marketingGoal(DouplusOrderCreateV30ObjectInfosMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public DouplusOrderCreateV30ObjectInfosMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(DouplusOrderCreateV30ObjectInfosMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderCreateV30RequestObjectInfosInner douplusOrderCreateV30RequestObjectInfosInner = (DouplusOrderCreateV30RequestObjectInfosInner) o;
    return Objects.equals(this.awemeId, douplusOrderCreateV30RequestObjectInfosInner.awemeId) &&
        Objects.equals(this.itemId, douplusOrderCreateV30RequestObjectInfosInner.itemId) &&
        Objects.equals(this.marketingGoal, douplusOrderCreateV30RequestObjectInfosInner.marketingGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, itemId, marketingGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderCreateV30RequestObjectInfosInner {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("item_id");
    openapiFields.add("marketing_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderCreateV30RequestObjectInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderCreateV30RequestObjectInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderCreateV30RequestObjectInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderCreateV30RequestObjectInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderCreateV30RequestObjectInfosInner>() {
           @Override
           public void write(JsonWriter out, DouplusOrderCreateV30RequestObjectInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderCreateV30RequestObjectInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderCreateV30RequestObjectInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderCreateV30RequestObjectInfosInner
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderCreateV30RequestObjectInfosInner
  */
  public static DouplusOrderCreateV30RequestObjectInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderCreateV30RequestObjectInfosInner.class);
  }

 /**
  * Convert an instance of DouplusOrderCreateV30RequestObjectInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

