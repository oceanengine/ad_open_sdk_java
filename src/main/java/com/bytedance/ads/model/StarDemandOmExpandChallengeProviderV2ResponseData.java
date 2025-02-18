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
import java.util.HashMap;
import java.util.Map;
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
public class StarDemandOmExpandChallengeProviderV2ResponseData {
  public static final String SERIALIZED_NAME_FAILED_PROVIDER_REASON = "failed_provider_reason";
  @SerializedName(SERIALIZED_NAME_FAILED_PROVIDER_REASON)
  private Map<String, String> failedProviderReason = null;

  public StarDemandOmExpandChallengeProviderV2ResponseData() {
  }

  public StarDemandOmExpandChallengeProviderV2ResponseData failedProviderReason(Map<String, String> failedProviderReason) {
    
    this.failedProviderReason = failedProviderReason;
    return this;
  }

  public StarDemandOmExpandChallengeProviderV2ResponseData putFailedProviderReasonItem(String key, String failedProviderReasonItem) {
    if (this.failedProviderReason == null) {
      this.failedProviderReason = new HashMap<>();
    }
    this.failedProviderReason.put(key, failedProviderReasonItem);
    return this;
  }

   /**
   * 
   * @return failedProviderReason
  **/
  @javax.annotation.Nullable
  public Map<String, String> getFailedProviderReason() {
    return failedProviderReason;
  }


  public void setFailedProviderReason(Map<String, String> failedProviderReason) {
    this.failedProviderReason = failedProviderReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmExpandChallengeProviderV2ResponseData starDemandOmExpandChallengeProviderV2ResponseData = (StarDemandOmExpandChallengeProviderV2ResponseData) o;
    return Objects.equals(this.failedProviderReason, starDemandOmExpandChallengeProviderV2ResponseData.failedProviderReason);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedProviderReason);
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
    sb.append("class StarDemandOmExpandChallengeProviderV2ResponseData {\n");
    sb.append("    failedProviderReason: ").append(toIndentedString(failedProviderReason)).append("\n");
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
    openapiFields.add("failed_provider_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmExpandChallengeProviderV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmExpandChallengeProviderV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmExpandChallengeProviderV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmExpandChallengeProviderV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmExpandChallengeProviderV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarDemandOmExpandChallengeProviderV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmExpandChallengeProviderV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmExpandChallengeProviderV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmExpandChallengeProviderV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmExpandChallengeProviderV2ResponseData
  */
  public static StarDemandOmExpandChallengeProviderV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmExpandChallengeProviderV2ResponseData.class);
  }

 /**
  * Convert an instance of StarDemandOmExpandChallengeProviderV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

