/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange {
  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType operationType = null;

  public static final String SERIALIZED_NAME_PROVIDER_IDS = "provider_ids";
  @SerializedName(SERIALIZED_NAME_PROVIDER_IDS)
  private List<Long> providerIds = null;

  public StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange() {
  }

  public StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange operationType(StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nullable
  public StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType getOperationType() {
    return operationType;
  }


  public void setOperationType(StarDemandOmExpandChallengeProviderV2OmParticipateProviderRangeOperationType operationType) {
    this.operationType = operationType;
  }


  public StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange providerIds(List<Long> providerIds) {
    
    this.providerIds = providerIds;
    return this;
  }

  public StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange addProviderIdsItem(Long providerIdsItem) {
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
    StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange starDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange = (StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange) o;
    return Objects.equals(this.operationType, starDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange.operationType) &&
        Objects.equals(this.providerIds, starDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange.providerIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, providerIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange {\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
    openapiFields.add("operation_type");
    openapiFields.add("provider_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange>() {
           @Override
           public void write(JsonWriter out, StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange
  */
  public static StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange.class);
  }

 /**
  * Convert an instance of StarDemandOmExpandChallengeProviderV2RequestOmParticipateProviderRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

