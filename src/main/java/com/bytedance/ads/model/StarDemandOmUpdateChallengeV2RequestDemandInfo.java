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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarDemandOmUpdateChallengeV2RequestDemandInfo {
  public static final String SERIALIZED_NAME_ATTATCHMENTS_URL = "attatchments_url";
  @SerializedName(SERIALIZED_NAME_ATTATCHMENTS_URL)
  private List<String> attatchmentsUrl = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_END = "expiration_time_end";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_END)
  private Long expirationTimeEnd = null;

  public StarDemandOmUpdateChallengeV2RequestDemandInfo() {
  }

  public StarDemandOmUpdateChallengeV2RequestDemandInfo attatchmentsUrl(List<String> attatchmentsUrl) {
    
    this.attatchmentsUrl = attatchmentsUrl;
    return this;
  }

  public StarDemandOmUpdateChallengeV2RequestDemandInfo addAttatchmentsUrlItem(String attatchmentsUrlItem) {
    if (this.attatchmentsUrl == null) {
      this.attatchmentsUrl = new ArrayList<>();
    }
    this.attatchmentsUrl.add(attatchmentsUrlItem);
    return this;
  }

   /**
   * 参考素材 最多3个
   * @return attatchmentsUrl
  **/
  @javax.annotation.Nullable
  public List<String> getAttatchmentsUrl() {
    return attatchmentsUrl;
  }


  public void setAttatchmentsUrl(List<String> attatchmentsUrl) {
    this.attatchmentsUrl = attatchmentsUrl;
  }


  public StarDemandOmUpdateChallengeV2RequestDemandInfo demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 任务名称
   * @return demandName
  **/
  @javax.annotation.Nonnull
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarDemandOmUpdateChallengeV2RequestDemandInfo expirationTimeEnd(Long expirationTimeEnd) {
    
    this.expirationTimeEnd = expirationTimeEnd;
    return this;
  }

   /**
   * 任务截止时间 秒级时间戳，即调整任务周期，不能早于当前时间，最长不能超过最初创建任务之后的365天
   * @return expirationTimeEnd
  **/
  @javax.annotation.Nullable
  public Long getExpirationTimeEnd() {
    return expirationTimeEnd;
  }


  public void setExpirationTimeEnd(Long expirationTimeEnd) {
    this.expirationTimeEnd = expirationTimeEnd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmUpdateChallengeV2RequestDemandInfo starDemandOmUpdateChallengeV2RequestDemandInfo = (StarDemandOmUpdateChallengeV2RequestDemandInfo) o;
    return Objects.equals(this.attatchmentsUrl, starDemandOmUpdateChallengeV2RequestDemandInfo.attatchmentsUrl) &&
        Objects.equals(this.demandName, starDemandOmUpdateChallengeV2RequestDemandInfo.demandName) &&
        Objects.equals(this.expirationTimeEnd, starDemandOmUpdateChallengeV2RequestDemandInfo.expirationTimeEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attatchmentsUrl, demandName, expirationTimeEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandOmUpdateChallengeV2RequestDemandInfo {\n");
    sb.append("    attatchmentsUrl: ").append(toIndentedString(attatchmentsUrl)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    expirationTimeEnd: ").append(toIndentedString(expirationTimeEnd)).append("\n");
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
    openapiFields.add("attatchments_url");
    openapiFields.add("demand_name");
    openapiFields.add("expiration_time_end");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demand_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmUpdateChallengeV2RequestDemandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmUpdateChallengeV2RequestDemandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmUpdateChallengeV2RequestDemandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmUpdateChallengeV2RequestDemandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmUpdateChallengeV2RequestDemandInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandOmUpdateChallengeV2RequestDemandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmUpdateChallengeV2RequestDemandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmUpdateChallengeV2RequestDemandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmUpdateChallengeV2RequestDemandInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmUpdateChallengeV2RequestDemandInfo
  */
  public static StarDemandOmUpdateChallengeV2RequestDemandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmUpdateChallengeV2RequestDemandInfo.class);
  }

 /**
  * Convert an instance of StarDemandOmUpdateChallengeV2RequestDemandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

