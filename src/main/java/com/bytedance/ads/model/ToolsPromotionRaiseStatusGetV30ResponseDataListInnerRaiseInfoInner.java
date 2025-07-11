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
import com.bytedance.ads.model.ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime;
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
 * ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner {
  public static final String SERIALIZED_NAME_APPOINT_TIME = "appoint_time";
  @SerializedName(SERIALIZED_NAME_APPOINT_TIME)
  private ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime appointTime = null;

  public static final String SERIALIZED_NAME_IS_EFFECTIVE_NOW = "is_effective_now";
  @SerializedName(SERIALIZED_NAME_IS_EFFECTIVE_NOW)
  private Boolean isEffectiveNow = null;

  public static final String SERIALIZED_NAME_RAISE_BUDGET = "raise_budget";
  @SerializedName(SERIALIZED_NAME_RAISE_BUDGET)
  private Double raiseBudget = null;

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner() {
  }

  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner appointTime(ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime appointTime) {
    
    this.appointTime = appointTime;
    return this;
  }

   /**
   * Get appointTime
   * @return appointTime
  **/
  @javax.annotation.Nullable
  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime getAppointTime() {
    return appointTime;
  }


  public void setAppointTime(ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInnerAppointTime appointTime) {
    this.appointTime = appointTime;
  }


  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner isEffectiveNow(Boolean isEffectiveNow) {
    
    this.isEffectiveNow = isEffectiveNow;
    return this;
  }

   /**
   * 是否立即生效
   * @return isEffectiveNow
  **/
  @javax.annotation.Nullable
  public Boolean getIsEffectiveNow() {
    return isEffectiveNow;
  }


  public void setIsEffectiveNow(Boolean isEffectiveNow) {
    this.isEffectiveNow = isEffectiveNow;
  }


  public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner raiseBudget(Double raiseBudget) {
    
    this.raiseBudget = raiseBudget;
    return this;
  }

   /**
   * 起量预算
   * @return raiseBudget
  **/
  @javax.annotation.Nullable
  public Double getRaiseBudget() {
    return raiseBudget;
  }


  public void setRaiseBudget(Double raiseBudget) {
    this.raiseBudget = raiseBudget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner toolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner = (ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner) o;
    return Objects.equals(this.appointTime, toolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner.appointTime) &&
        Objects.equals(this.isEffectiveNow, toolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner.isEffectiveNow) &&
        Objects.equals(this.raiseBudget, toolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner.raiseBudget);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointTime, isEffectiveNow, raiseBudget);
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
    sb.append("class ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner {\n");
    sb.append("    appointTime: ").append(toIndentedString(appointTime)).append("\n");
    sb.append("    isEffectiveNow: ").append(toIndentedString(isEffectiveNow)).append("\n");
    sb.append("    raiseBudget: ").append(toIndentedString(raiseBudget)).append("\n");
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
    openapiFields.add("appoint_time");
    openapiFields.add("is_effective_now");
    openapiFields.add("raise_budget");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner
  */
  public static ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseStatusGetV30ResponseDataListInnerRaiseInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

