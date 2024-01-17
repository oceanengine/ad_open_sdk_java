/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
 * 产出物推送巨量引擎配置信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine {
  public static final String SERIALIZED_NAME_SYNC_DURATION = "sync_duration";
  @SerializedName(SERIALIZED_NAME_SYNC_DURATION)
  private Long syncDuration = null;

  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine() {
  }

  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine syncDuration(Long syncDuration) {
    
    this.syncDuration = syncDuration;
    return this;
  }

   /**
   * 期望投放时长（单位：天） 大于0的整数，默认30天
   * @return syncDuration
  **/
  @javax.annotation.Nullable
  public Long getSyncDuration() {
    return syncDuration;
  }


  public void setSyncDuration(Long syncDuration) {
    this.syncDuration = syncDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine = (StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine) o;
    return Objects.equals(this.syncDuration, starDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.syncDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine {\n");
    sb.append("    syncDuration: ").append(toIndentedString(syncDuration)).append("\n");
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
    openapiFields.add("sync_duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine
  */
  public static StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestDemandInfoAdSyncConfOceanEngine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

