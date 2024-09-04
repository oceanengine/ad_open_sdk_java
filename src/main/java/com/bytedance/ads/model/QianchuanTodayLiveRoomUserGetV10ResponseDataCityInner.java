/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner {
  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value = null;

  public QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner() {
  }

  public QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 
   * @return cityName
  **/
  @javax.annotation.Nullable
  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner qianchuanTodayLiveRoomUserGetV10ResponseDataCityInner = (QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner) o;
    return Objects.equals(this.cityName, qianchuanTodayLiveRoomUserGetV10ResponseDataCityInner.cityName) &&
        Objects.equals(this.value, qianchuanTodayLiveRoomUserGetV10ResponseDataCityInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cityName, value);
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
    sb.append("class QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner {\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("city_name");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner>() {
           @Override
           public void write(JsonWriter out, QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner
  */
  public static QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner.class);
  }

 /**
  * Convert an instance of QianchuanTodayLiveRoomUserGetV10ResponseDataCityInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

