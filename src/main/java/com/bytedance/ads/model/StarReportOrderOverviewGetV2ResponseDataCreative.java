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
public class StarReportOrderOverviewGetV2ResponseDataCreative {
  public static final String SERIALIZED_NAME_FINISH_RATE = "finish_rate";
  @SerializedName(SERIALIZED_NAME_FINISH_RATE)
  private Long finishRate = null;

  public static final String SERIALIZED_NAME_FIVE_S_PLAY_RATE = "five_s_play_rate";
  @SerializedName(SERIALIZED_NAME_FIVE_S_PLAY_RATE)
  private Long fiveSPlayRate = null;

  public static final String SERIALIZED_NAME_PLAY_RATE = "play_rate";
  @SerializedName(SERIALIZED_NAME_PLAY_RATE)
  private Long playRate = null;

  public StarReportOrderOverviewGetV2ResponseDataCreative() {
  }

  public StarReportOrderOverviewGetV2ResponseDataCreative finishRate(Long finishRate) {
    
    this.finishRate = finishRate;
    return this;
  }

   /**
   * 
   * @return finishRate
  **/
  @javax.annotation.Nullable
  public Long getFinishRate() {
    return finishRate;
  }


  public void setFinishRate(Long finishRate) {
    this.finishRate = finishRate;
  }


  public StarReportOrderOverviewGetV2ResponseDataCreative fiveSPlayRate(Long fiveSPlayRate) {
    
    this.fiveSPlayRate = fiveSPlayRate;
    return this;
  }

   /**
   * 
   * @return fiveSPlayRate
  **/
  @javax.annotation.Nullable
  public Long getFiveSPlayRate() {
    return fiveSPlayRate;
  }


  public void setFiveSPlayRate(Long fiveSPlayRate) {
    this.fiveSPlayRate = fiveSPlayRate;
  }


  public StarReportOrderOverviewGetV2ResponseDataCreative playRate(Long playRate) {
    
    this.playRate = playRate;
    return this;
  }

   /**
   * 
   * @return playRate
  **/
  @javax.annotation.Nullable
  public Long getPlayRate() {
    return playRate;
  }


  public void setPlayRate(Long playRate) {
    this.playRate = playRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewGetV2ResponseDataCreative starReportOrderOverviewGetV2ResponseDataCreative = (StarReportOrderOverviewGetV2ResponseDataCreative) o;
    return Objects.equals(this.finishRate, starReportOrderOverviewGetV2ResponseDataCreative.finishRate) &&
        Objects.equals(this.fiveSPlayRate, starReportOrderOverviewGetV2ResponseDataCreative.fiveSPlayRate) &&
        Objects.equals(this.playRate, starReportOrderOverviewGetV2ResponseDataCreative.playRate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(finishRate, fiveSPlayRate, playRate);
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
    sb.append("class StarReportOrderOverviewGetV2ResponseDataCreative {\n");
    sb.append("    finishRate: ").append(toIndentedString(finishRate)).append("\n");
    sb.append("    fiveSPlayRate: ").append(toIndentedString(fiveSPlayRate)).append("\n");
    sb.append("    playRate: ").append(toIndentedString(playRate)).append("\n");
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
    openapiFields.add("finish_rate");
    openapiFields.add("five_s_play_rate");
    openapiFields.add("play_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewGetV2ResponseDataCreative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewGetV2ResponseDataCreative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewGetV2ResponseDataCreative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewGetV2ResponseDataCreative.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewGetV2ResponseDataCreative>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewGetV2ResponseDataCreative value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewGetV2ResponseDataCreative read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewGetV2ResponseDataCreative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewGetV2ResponseDataCreative
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewGetV2ResponseDataCreative
  */
  public static StarReportOrderOverviewGetV2ResponseDataCreative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewGetV2ResponseDataCreative.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewGetV2ResponseDataCreative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

