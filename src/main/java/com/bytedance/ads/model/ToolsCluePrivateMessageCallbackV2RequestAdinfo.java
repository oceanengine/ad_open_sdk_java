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
 * 线索关联的广告信息，可以和抖开拉取会话接口里面的广告信息对齐
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsCluePrivateMessageCallbackV2RequestAdinfo {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADV_ID = "adv_id";
  @SerializedName(SERIALIZED_NAME_ADV_ID)
  private Long advId = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public ToolsCluePrivateMessageCallbackV2RequestAdinfo() {
  }

  public ToolsCluePrivateMessageCallbackV2RequestAdinfo adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告计划id
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ToolsCluePrivateMessageCallbackV2RequestAdinfo advId(Long advId) {
    
    this.advId = advId;
    return this;
  }

   /**
   * 广告主id
   * @return advId
  **/
  @javax.annotation.Nullable
  public Long getAdvId() {
    return advId;
  }


  public void setAdvId(Long advId) {
    this.advId = advId;
  }


  public ToolsCluePrivateMessageCallbackV2RequestAdinfo creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 广告创意id
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public ToolsCluePrivateMessageCallbackV2RequestAdinfo promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCluePrivateMessageCallbackV2RequestAdinfo toolsCluePrivateMessageCallbackV2RequestAdinfo = (ToolsCluePrivateMessageCallbackV2RequestAdinfo) o;
    return Objects.equals(this.adId, toolsCluePrivateMessageCallbackV2RequestAdinfo.adId) &&
        Objects.equals(this.advId, toolsCluePrivateMessageCallbackV2RequestAdinfo.advId) &&
        Objects.equals(this.creativeId, toolsCluePrivateMessageCallbackV2RequestAdinfo.creativeId) &&
        Objects.equals(this.promotionId, toolsCluePrivateMessageCallbackV2RequestAdinfo.promotionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advId, creativeId, promotionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCluePrivateMessageCallbackV2RequestAdinfo {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advId: ").append(toIndentedString(advId)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("adv_id");
    openapiFields.add("creative_id");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCluePrivateMessageCallbackV2RequestAdinfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCluePrivateMessageCallbackV2RequestAdinfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCluePrivateMessageCallbackV2RequestAdinfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCluePrivateMessageCallbackV2RequestAdinfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCluePrivateMessageCallbackV2RequestAdinfo>() {
           @Override
           public void write(JsonWriter out, ToolsCluePrivateMessageCallbackV2RequestAdinfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCluePrivateMessageCallbackV2RequestAdinfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCluePrivateMessageCallbackV2RequestAdinfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCluePrivateMessageCallbackV2RequestAdinfo
  * @throws IOException if the JSON string is invalid with respect to ToolsCluePrivateMessageCallbackV2RequestAdinfo
  */
  public static ToolsCluePrivateMessageCallbackV2RequestAdinfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCluePrivateMessageCallbackV2RequestAdinfo.class);
  }

 /**
  * Convert an instance of ToolsCluePrivateMessageCallbackV2RequestAdinfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

