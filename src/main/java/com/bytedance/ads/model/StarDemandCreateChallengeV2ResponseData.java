/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateChallengeV2ResponseDataBillInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class StarDemandCreateChallengeV2ResponseData {
  public static final String SERIALIZED_NAME_BILL_INFO = "bill_info";
  @SerializedName(SERIALIZED_NAME_BILL_INFO)
  private StarDemandCreateChallengeV2ResponseDataBillInfo billInfo = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public StarDemandCreateChallengeV2ResponseData() {
  }

  public StarDemandCreateChallengeV2ResponseData billInfo(StarDemandCreateChallengeV2ResponseDataBillInfo billInfo) {
    
    this.billInfo = billInfo;
    return this;
  }

   /**
   * Get billInfo
   * @return billInfo
  **/
  @javax.annotation.Nullable
  public StarDemandCreateChallengeV2ResponseDataBillInfo getBillInfo() {
    return billInfo;
  }


  public void setBillInfo(StarDemandCreateChallengeV2ResponseDataBillInfo billInfo) {
    this.billInfo = billInfo;
  }


  public StarDemandCreateChallengeV2ResponseData challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 投稿任务ID
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
    StarDemandCreateChallengeV2ResponseData starDemandCreateChallengeV2ResponseData = (StarDemandCreateChallengeV2ResponseData) o;
    return Objects.equals(this.billInfo, starDemandCreateChallengeV2ResponseData.billInfo) &&
        Objects.equals(this.challengeTaskId, starDemandCreateChallengeV2ResponseData.challengeTaskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billInfo, challengeTaskId);
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
    sb.append("class StarDemandCreateChallengeV2ResponseData {\n");
    sb.append("    billInfo: ").append(toIndentedString(billInfo)).append("\n");
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
    openapiFields.add("bill_info");
    openapiFields.add("challenge_task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2ResponseData
  */
  public static StarDemandCreateChallengeV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2ResponseData.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

