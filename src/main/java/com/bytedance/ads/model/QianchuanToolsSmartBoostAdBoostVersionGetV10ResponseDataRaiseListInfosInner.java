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
 * QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner {
  public static final String SERIALIZED_NAME_AD_RAISE_VERSION = "ad_raise_version";
  @SerializedName(SERIALIZED_NAME_AD_RAISE_VERSION)
  private Long adRaiseVersion = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner() {
  }

  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner adRaiseVersion(Long adRaiseVersion) {
    
    this.adRaiseVersion = adRaiseVersion;
    return this;
  }

   /**
   * 起量版本号
   * @return adRaiseVersion
  **/
  @javax.annotation.Nullable
  public Long getAdRaiseVersion() {
    return adRaiseVersion;
  }


  public void setAdRaiseVersion(Long adRaiseVersion) {
    this.adRaiseVersion = adRaiseVersion;
  }


  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 当前起量版本结束时间，格式：2021-03-31 17:00:00
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 当前版本起量开始时间，格式：2021-03-31 16:00:00
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
    QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner qianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner = (QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner) o;
    return Objects.equals(this.adRaiseVersion, qianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner.adRaiseVersion) &&
        Objects.equals(this.endTime, qianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner.endTime) &&
        Objects.equals(this.startTime, qianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adRaiseVersion, endTime, startTime);
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
    sb.append("class QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner {\n");
    sb.append("    adRaiseVersion: ").append(toIndentedString(adRaiseVersion)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
    openapiFields.add("ad_raise_version");
    openapiFields.add("end_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner
  */
  public static QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

