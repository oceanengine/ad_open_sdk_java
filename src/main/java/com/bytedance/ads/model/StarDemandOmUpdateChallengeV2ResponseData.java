/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarDemandOmUpdateChallengeV2ResponseData {
  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public StarDemandOmUpdateChallengeV2ResponseData() {
  }

  public StarDemandOmUpdateChallengeV2ResponseData challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 
   * @return challengeTaskId
  **/
  @javax.annotation.Nullable
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmUpdateChallengeV2ResponseData starDemandOmUpdateChallengeV2ResponseData = (StarDemandOmUpdateChallengeV2ResponseData) o;
    return Objects.equals(this.challengeTaskId, starDemandOmUpdateChallengeV2ResponseData.challengeTaskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeTaskId);
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
    sb.append("class StarDemandOmUpdateChallengeV2ResponseData {\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
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
    openapiFields.add("challenge_task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmUpdateChallengeV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmUpdateChallengeV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmUpdateChallengeV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmUpdateChallengeV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmUpdateChallengeV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarDemandOmUpdateChallengeV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmUpdateChallengeV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmUpdateChallengeV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmUpdateChallengeV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmUpdateChallengeV2ResponseData
  */
  public static StarDemandOmUpdateChallengeV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmUpdateChallengeV2ResponseData.class);
  }

 /**
  * Convert an instance of StarDemandOmUpdateChallengeV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

