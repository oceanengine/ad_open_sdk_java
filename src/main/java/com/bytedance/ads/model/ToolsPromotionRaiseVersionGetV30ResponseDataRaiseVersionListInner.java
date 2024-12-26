/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_RAISE_VERSION = "raise_version";
  @SerializedName(SERIALIZED_NAME_RAISE_VERSION)
  private Long raiseVersion = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner() {
  }

  public ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 当前起量版本结束时间，格式：yyyy-mm-dd HH:MM
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner raiseVersion(Long raiseVersion) {
    
    this.raiseVersion = raiseVersion;
    return this;
  }

   /**
   * 起量版本号
   * @return raiseVersion
  **/
  @javax.annotation.Nullable
  public Long getRaiseVersion() {
    return raiseVersion;
  }


  public void setRaiseVersion(Long raiseVersion) {
    this.raiseVersion = raiseVersion;
  }


  public ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 当前版本起量开始时间，格式：yyyy-mm-dd HH:MM
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner toolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner = (ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner) o;
    return Objects.equals(this.endTime, toolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner.endTime) &&
        Objects.equals(this.raiseVersion, toolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner.raiseVersion) &&
        Objects.equals(this.startTime, toolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, raiseVersion, startTime);
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
    sb.append("class ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    raiseVersion: ").append(toIndentedString(raiseVersion)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("raise_version");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner
  */
  public static ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionRaiseVersionGetV30ResponseDataRaiseVersionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

