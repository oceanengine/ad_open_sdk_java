/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanMaterialAdGetV10ResponseDataAdListInnerMetrics;
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
 * QianchuanMaterialAdGetV10ResponseDataAdListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class QianchuanMaterialAdGetV10ResponseDataAdListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private QianchuanMaterialAdGetV10ResponseDataAdListInnerMetrics metrics = null;

  public QianchuanMaterialAdGetV10ResponseDataAdListInner() {
  }

  public QianchuanMaterialAdGetV10ResponseDataAdListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告主id
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanMaterialAdGetV10ResponseDataAdListInner adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 计划名称
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public QianchuanMaterialAdGetV10ResponseDataAdListInner metrics(QianchuanMaterialAdGetV10ResponseDataAdListInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialAdGetV10ResponseDataAdListInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(QianchuanMaterialAdGetV10ResponseDataAdListInnerMetrics metrics) {
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
    QianchuanMaterialAdGetV10ResponseDataAdListInner qianchuanMaterialAdGetV10ResponseDataAdListInner = (QianchuanMaterialAdGetV10ResponseDataAdListInner) o;
    return Objects.equals(this.adId, qianchuanMaterialAdGetV10ResponseDataAdListInner.adId) &&
        Objects.equals(this.adName, qianchuanMaterialAdGetV10ResponseDataAdListInner.adName) &&
        Objects.equals(this.metrics, qianchuanMaterialAdGetV10ResponseDataAdListInner.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adName, metrics);
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
    sb.append("class QianchuanMaterialAdGetV10ResponseDataAdListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_name");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanMaterialAdGetV10ResponseDataAdListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanMaterialAdGetV10ResponseDataAdListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanMaterialAdGetV10ResponseDataAdListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanMaterialAdGetV10ResponseDataAdListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanMaterialAdGetV10ResponseDataAdListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanMaterialAdGetV10ResponseDataAdListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanMaterialAdGetV10ResponseDataAdListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanMaterialAdGetV10ResponseDataAdListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanMaterialAdGetV10ResponseDataAdListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanMaterialAdGetV10ResponseDataAdListInner
  */
  public static QianchuanMaterialAdGetV10ResponseDataAdListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanMaterialAdGetV10ResponseDataAdListInner.class);
  }

 /**
  * Convert an instance of QianchuanMaterialAdGetV10ResponseDataAdListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

