/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange {
  public static final String SERIALIZED_NAME_PROVIDER_IDS = "provider_ids";
  @SerializedName(SERIALIZED_NAME_PROVIDER_IDS)
  private List<Long> providerIds = null;

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange() {
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange providerIds(List<Long> providerIds) {
    
    this.providerIds = providerIds;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange addProviderIdsItem(Long providerIdsItem) {
    if (this.providerIds == null) {
      this.providerIds = new ArrayList<>();
    }
    this.providerIds.add(providerIdsItem);
    return this;
  }

   /**
   * 
   * @return providerIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProviderIds() {
    return providerIds;
  }


  public void setProviderIds(List<Long> providerIds) {
    this.providerIds = providerIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange starDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange = (StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange) o;
    return Objects.equals(this.providerIds, starDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange.providerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange {\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
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
    openapiFields.add("provider_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange
  */
  public static StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateProviderRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

