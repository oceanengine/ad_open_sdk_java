/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * 当前的起量信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo {
  public static final String SERIALIZED_NAME_RAISE_BUDGET = "raise_budget";
  @SerializedName(SERIALIZED_NAME_RAISE_BUDGET)
  private Double raiseBudget = null;

  public static final String SERIALIZED_NAME_RAISE_END_TIME = "raise_end_time";
  @SerializedName(SERIALIZED_NAME_RAISE_END_TIME)
  private String raiseEndTime = null;

  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo() {
  }

  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo raiseBudget(Double raiseBudget) {
    
    this.raiseBudget = raiseBudget;
    return this;
  }

   /**
   * 
   * @return raiseBudget
  **/
  @javax.annotation.Nullable
  public Double getRaiseBudget() {
    return raiseBudget;
  }


  public void setRaiseBudget(Double raiseBudget) {
    this.raiseBudget = raiseBudget;
  }


  public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo raiseEndTime(String raiseEndTime) {
    
    this.raiseEndTime = raiseEndTime;
    return this;
  }

   /**
   * 
   * @return raiseEndTime
  **/
  @javax.annotation.Nullable
  public String getRaiseEndTime() {
    return raiseEndTime;
  }


  public void setRaiseEndTime(String raiseEndTime) {
    this.raiseEndTime = raiseEndTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo = (ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo) o;
    return Objects.equals(this.raiseBudget, toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo.raiseBudget) &&
        Objects.equals(this.raiseEndTime, toolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo.raiseEndTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(raiseBudget, raiseEndTime);
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
    sb.append("class ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo {\n");
    sb.append("    raiseBudget: ").append(toIndentedString(raiseBudget)).append("\n");
    sb.append("    raiseEndTime: ").append(toIndentedString(raiseEndTime)).append("\n");
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
    openapiFields.add("raise_budget");
    openapiFields.add("raise_end_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo
  */
  public static ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseStatusCurrentIdsGetV30ResponseDataDataInnerRaiseInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

