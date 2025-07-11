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
import com.bytedance.ads.model.QianchuanProductAnalyseCompareCreativeV10ResponseDataOwnProductCreativeInner;
import com.bytedance.ads.model.QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class QianchuanProductAnalyseCompareCreativeV10ResponseData {
  public static final String SERIALIZED_NAME_OWN_PRODUCT_CREATIVE = "own_product_creative";
  @SerializedName(SERIALIZED_NAME_OWN_PRODUCT_CREATIVE)
  private List<QianchuanProductAnalyseCompareCreativeV10ResponseDataOwnProductCreativeInner> ownProductCreative = null;

  public static final String SERIALIZED_NAME_SIMILAR_PRODUCT_CREATIVE = "similar_product_creative";
  @SerializedName(SERIALIZED_NAME_SIMILAR_PRODUCT_CREATIVE)
  private List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner> similarProductCreative = null;

  public QianchuanProductAnalyseCompareCreativeV10ResponseData() {
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseData ownProductCreative(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataOwnProductCreativeInner> ownProductCreative) {
    
    this.ownProductCreative = ownProductCreative;
    return this;
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseData addOwnProductCreativeItem(QianchuanProductAnalyseCompareCreativeV10ResponseDataOwnProductCreativeInner ownProductCreativeItem) {
    if (this.ownProductCreative == null) {
      this.ownProductCreative = new ArrayList<>();
    }
    this.ownProductCreative.add(ownProductCreativeItem);
    return this;
  }

   /**
   * 
   * @return ownProductCreative
  **/
  @javax.annotation.Nullable
  public List<QianchuanProductAnalyseCompareCreativeV10ResponseDataOwnProductCreativeInner> getOwnProductCreative() {
    return ownProductCreative;
  }


  public void setOwnProductCreative(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataOwnProductCreativeInner> ownProductCreative) {
    this.ownProductCreative = ownProductCreative;
  }


  public QianchuanProductAnalyseCompareCreativeV10ResponseData similarProductCreative(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner> similarProductCreative) {
    
    this.similarProductCreative = similarProductCreative;
    return this;
  }

  public QianchuanProductAnalyseCompareCreativeV10ResponseData addSimilarProductCreativeItem(QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner similarProductCreativeItem) {
    if (this.similarProductCreative == null) {
      this.similarProductCreative = new ArrayList<>();
    }
    this.similarProductCreative.add(similarProductCreativeItem);
    return this;
  }

   /**
   * 
   * @return similarProductCreative
  **/
  @javax.annotation.Nullable
  public List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner> getSimilarProductCreative() {
    return similarProductCreative;
  }


  public void setSimilarProductCreative(List<QianchuanProductAnalyseCompareCreativeV10ResponseDataSimilarProductCreativeInner> similarProductCreative) {
    this.similarProductCreative = similarProductCreative;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanProductAnalyseCompareCreativeV10ResponseData qianchuanProductAnalyseCompareCreativeV10ResponseData = (QianchuanProductAnalyseCompareCreativeV10ResponseData) o;
    return Objects.equals(this.ownProductCreative, qianchuanProductAnalyseCompareCreativeV10ResponseData.ownProductCreative) &&
        Objects.equals(this.similarProductCreative, qianchuanProductAnalyseCompareCreativeV10ResponseData.similarProductCreative);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownProductCreative, similarProductCreative);
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
    sb.append("class QianchuanProductAnalyseCompareCreativeV10ResponseData {\n");
    sb.append("    ownProductCreative: ").append(toIndentedString(ownProductCreative)).append("\n");
    sb.append("    similarProductCreative: ").append(toIndentedString(similarProductCreative)).append("\n");
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
    openapiFields.add("own_product_creative");
    openapiFields.add("similar_product_creative");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanProductAnalyseCompareCreativeV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanProductAnalyseCompareCreativeV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanProductAnalyseCompareCreativeV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanProductAnalyseCompareCreativeV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanProductAnalyseCompareCreativeV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanProductAnalyseCompareCreativeV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanProductAnalyseCompareCreativeV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanProductAnalyseCompareCreativeV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanProductAnalyseCompareCreativeV10ResponseData
  */
  public static QianchuanProductAnalyseCompareCreativeV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanProductAnalyseCompareCreativeV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanProductAnalyseCompareCreativeV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

