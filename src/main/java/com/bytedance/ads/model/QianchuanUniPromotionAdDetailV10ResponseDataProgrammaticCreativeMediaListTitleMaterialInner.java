/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner() {
  }

  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner qianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner = (QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner) o;
    return Objects.equals(this.title, qianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner
  */
  public static QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaListTitleMaterialInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

