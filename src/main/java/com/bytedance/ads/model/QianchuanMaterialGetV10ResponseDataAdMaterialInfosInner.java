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
import com.bytedance.ads.model.QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo;
import com.bytedance.ads.model.QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMetrics;
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
 * QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner {
  public static final String SERIALIZED_NAME_MATERIAL_INFO = "material_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_INFO)
  private QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMetrics metrics = null;

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner() {
  }

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner materialInfo(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo) {
    
    this.materialInfo = materialInfo;
    return this;
  }

   /**
   * Get materialInfo
   * @return materialInfo
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo getMaterialInfo() {
    return materialInfo;
  }


  public void setMaterialInfo(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo) {
    this.materialInfo = materialInfo;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner metrics(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMetrics metrics) {
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
    QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner qianchuanMaterialGetV10ResponseDataAdMaterialInfosInner = (QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner) o;
    return Objects.equals(this.materialInfo, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInner.materialInfo) &&
        Objects.equals(this.metrics, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInner.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialInfo, metrics);
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
    sb.append("class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner {\n");
    sb.append("    materialInfo: ").append(toIndentedString(materialInfo)).append("\n");
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
    openapiFields.add("material_info");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner
  */
  public static QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

