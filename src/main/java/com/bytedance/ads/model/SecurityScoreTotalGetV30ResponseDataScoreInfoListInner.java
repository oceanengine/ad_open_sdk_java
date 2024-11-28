/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SecurityScoreTotalGetV30DataScoreInfoListIllegalType;
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
 * SecurityScoreTotalGetV30ResponseDataScoreInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class SecurityScoreTotalGetV30ResponseDataScoreInfoListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ILLEGAL_TYPE = "illegal_type";
  @SerializedName(SERIALIZED_NAME_ILLEGAL_TYPE)
  private SecurityScoreTotalGetV30DataScoreInfoListIllegalType illegalType = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Long score = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year = null;

  public SecurityScoreTotalGetV30ResponseDataScoreInfoListInner() {
  }

  public SecurityScoreTotalGetV30ResponseDataScoreInfoListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public SecurityScoreTotalGetV30ResponseDataScoreInfoListInner illegalType(SecurityScoreTotalGetV30DataScoreInfoListIllegalType illegalType) {
    
    this.illegalType = illegalType;
    return this;
  }

   /**
   * Get illegalType
   * @return illegalType
  **/
  @javax.annotation.Nullable
  public SecurityScoreTotalGetV30DataScoreInfoListIllegalType getIllegalType() {
    return illegalType;
  }


  public void setIllegalType(SecurityScoreTotalGetV30DataScoreInfoListIllegalType illegalType) {
    this.illegalType = illegalType;
  }


  public SecurityScoreTotalGetV30ResponseDataScoreInfoListInner score(Long score) {
    
    this.score = score;
    return this;
  }

   /**
   * 年分
   * @return score
  **/
  @javax.annotation.Nullable
  public Long getScore() {
    return score;
  }


  public void setScore(Long score) {
    this.score = score;
  }


  public SecurityScoreTotalGetV30ResponseDataScoreInfoListInner year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * 积分年度
   * @return year
  **/
  @javax.annotation.Nullable
  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScoreTotalGetV30ResponseDataScoreInfoListInner securityScoreTotalGetV30ResponseDataScoreInfoListInner = (SecurityScoreTotalGetV30ResponseDataScoreInfoListInner) o;
    return Objects.equals(this.advertiserId, securityScoreTotalGetV30ResponseDataScoreInfoListInner.advertiserId) &&
        Objects.equals(this.illegalType, securityScoreTotalGetV30ResponseDataScoreInfoListInner.illegalType) &&
        Objects.equals(this.score, securityScoreTotalGetV30ResponseDataScoreInfoListInner.score) &&
        Objects.equals(this.year, securityScoreTotalGetV30ResponseDataScoreInfoListInner.year);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, illegalType, score, year);
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
    sb.append("class SecurityScoreTotalGetV30ResponseDataScoreInfoListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    illegalType: ").append(toIndentedString(illegalType)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("illegal_type");
    openapiFields.add("score");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("illegal_type");
    openapiRequiredFields.add("score");
    openapiRequiredFields.add("year");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityScoreTotalGetV30ResponseDataScoreInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityScoreTotalGetV30ResponseDataScoreInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityScoreTotalGetV30ResponseDataScoreInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityScoreTotalGetV30ResponseDataScoreInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityScoreTotalGetV30ResponseDataScoreInfoListInner>() {
           @Override
           public void write(JsonWriter out, SecurityScoreTotalGetV30ResponseDataScoreInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityScoreTotalGetV30ResponseDataScoreInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityScoreTotalGetV30ResponseDataScoreInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityScoreTotalGetV30ResponseDataScoreInfoListInner
  * @throws IOException if the JSON string is invalid with respect to SecurityScoreTotalGetV30ResponseDataScoreInfoListInner
  */
  public static SecurityScoreTotalGetV30ResponseDataScoreInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityScoreTotalGetV30ResponseDataScoreInfoListInner.class);
  }

 /**
  * Convert an instance of SecurityScoreTotalGetV30ResponseDataScoreInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

