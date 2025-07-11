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
import com.bytedance.ads.model.LocalCxtReportAudienceGetV30ResponseDataListInnerMetrics;
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
 * LocalCxtReportAudienceGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class LocalCxtReportAudienceGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private String age = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private LocalCxtReportAudienceGetV30ResponseDataListInnerMetrics metrics = null;

  public LocalCxtReportAudienceGetV30ResponseDataListInner() {
  }

  public LocalCxtReportAudienceGetV30ResponseDataListInner age(String age) {
    
    this.age = age;
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public String getAge() {
    return age;
  }


  public void setAge(String age) {
    this.age = age;
  }


  public LocalCxtReportAudienceGetV30ResponseDataListInner city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public LocalCxtReportAudienceGetV30ResponseDataListInner gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public LocalCxtReportAudienceGetV30ResponseDataListInner metrics(LocalCxtReportAudienceGetV30ResponseDataListInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public LocalCxtReportAudienceGetV30ResponseDataListInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(LocalCxtReportAudienceGetV30ResponseDataListInnerMetrics metrics) {
    this.metrics = metrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalCxtReportAudienceGetV30ResponseDataListInner localCxtReportAudienceGetV30ResponseDataListInner = (LocalCxtReportAudienceGetV30ResponseDataListInner) o;
    return Objects.equals(this.age, localCxtReportAudienceGetV30ResponseDataListInner.age) &&
        Objects.equals(this.city, localCxtReportAudienceGetV30ResponseDataListInner.city) &&
        Objects.equals(this.gender, localCxtReportAudienceGetV30ResponseDataListInner.gender) &&
        Objects.equals(this.metrics, localCxtReportAudienceGetV30ResponseDataListInner.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, city, gender, metrics);
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
    sb.append("class LocalCxtReportAudienceGetV30ResponseDataListInner {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("city");
    openapiFields.add("gender");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalCxtReportAudienceGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalCxtReportAudienceGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalCxtReportAudienceGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalCxtReportAudienceGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalCxtReportAudienceGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, LocalCxtReportAudienceGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalCxtReportAudienceGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalCxtReportAudienceGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalCxtReportAudienceGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to LocalCxtReportAudienceGetV30ResponseDataListInner
  */
  public static LocalCxtReportAudienceGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalCxtReportAudienceGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of LocalCxtReportAudienceGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

