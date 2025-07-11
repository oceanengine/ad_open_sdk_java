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
import com.bytedance.ads.model.QianchuanProductAnalyseCompareStatsDataV10ResponseDataCompeteProductData;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareStatsDataV10ResponseDataSimilarProductData;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanProductAnalyseCompareStatsDataV10ResponseData {
  public static final String SERIALIZED_NAME_COMPETE_PRODUCT_DATA = "compete_product_data";
  @SerializedName(SERIALIZED_NAME_COMPETE_PRODUCT_DATA)
  private QianchuanProductAnalyseCompareStatsDataV10ResponseDataCompeteProductData competeProductData = null;

  public static final String SERIALIZED_NAME_OWN_PRODUCT_DATA = "own_product_data";
  @SerializedName(SERIALIZED_NAME_OWN_PRODUCT_DATA)
  private QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData ownProductData = null;

  public static final String SERIALIZED_NAME_SIMILAR_PRODUCT_DATA = "similar_product_data";
  @SerializedName(SERIALIZED_NAME_SIMILAR_PRODUCT_DATA)
  private QianchuanProductAnalyseCompareStatsDataV10ResponseDataSimilarProductData similarProductData = null;

  public QianchuanProductAnalyseCompareStatsDataV10ResponseData() {
  }

  public QianchuanProductAnalyseCompareStatsDataV10ResponseData competeProductData(QianchuanProductAnalyseCompareStatsDataV10ResponseDataCompeteProductData competeProductData) {
    
    this.competeProductData = competeProductData;
    return this;
  }

   /**
   * Get competeProductData
   * @return competeProductData
  **/
  @javax.annotation.Nullable
  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataCompeteProductData getCompeteProductData() {
    return competeProductData;
  }


  public void setCompeteProductData(QianchuanProductAnalyseCompareStatsDataV10ResponseDataCompeteProductData competeProductData) {
    this.competeProductData = competeProductData;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseData ownProductData(QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData ownProductData) {
    
    this.ownProductData = ownProductData;
    return this;
  }

   /**
   * Get ownProductData
   * @return ownProductData
  **/
  @javax.annotation.Nullable
  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData getOwnProductData() {
    return ownProductData;
  }


  public void setOwnProductData(QianchuanProductAnalyseCompareStatsDataV10ResponseDataOwnProductData ownProductData) {
    this.ownProductData = ownProductData;
  }


  public QianchuanProductAnalyseCompareStatsDataV10ResponseData similarProductData(QianchuanProductAnalyseCompareStatsDataV10ResponseDataSimilarProductData similarProductData) {
    
    this.similarProductData = similarProductData;
    return this;
  }

   /**
   * Get similarProductData
   * @return similarProductData
  **/
  @javax.annotation.Nullable
  public QianchuanProductAnalyseCompareStatsDataV10ResponseDataSimilarProductData getSimilarProductData() {
    return similarProductData;
  }


  public void setSimilarProductData(QianchuanProductAnalyseCompareStatsDataV10ResponseDataSimilarProductData similarProductData) {
    this.similarProductData = similarProductData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAnalyseCompareStatsDataV10ResponseData qianchuanProductAnalyseCompareStatsDataV10ResponseData = (QianchuanProductAnalyseCompareStatsDataV10ResponseData) o;
    return Objects.equals(this.competeProductData, qianchuanProductAnalyseCompareStatsDataV10ResponseData.competeProductData) &&
        Objects.equals(this.ownProductData, qianchuanProductAnalyseCompareStatsDataV10ResponseData.ownProductData) &&
        Objects.equals(this.similarProductData, qianchuanProductAnalyseCompareStatsDataV10ResponseData.similarProductData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(competeProductData, ownProductData, similarProductData);
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
    sb.append("class QianchuanProductAnalyseCompareStatsDataV10ResponseData {\n");
    sb.append("    competeProductData: ").append(toIndentedString(competeProductData)).append("\n");
    sb.append("    ownProductData: ").append(toIndentedString(ownProductData)).append("\n");
    sb.append("    similarProductData: ").append(toIndentedString(similarProductData)).append("\n");
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
    openapiFields.add("compete_product_data");
    openapiFields.add("own_product_data");
    openapiFields.add("similar_product_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAnalyseCompareStatsDataV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAnalyseCompareStatsDataV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAnalyseCompareStatsDataV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAnalyseCompareStatsDataV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAnalyseCompareStatsDataV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAnalyseCompareStatsDataV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAnalyseCompareStatsDataV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAnalyseCompareStatsDataV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAnalyseCompareStatsDataV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAnalyseCompareStatsDataV10ResponseData
  */
  public static QianchuanProductAnalyseCompareStatsDataV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAnalyseCompareStatsDataV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanProductAnalyseCompareStatsDataV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

