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
 * QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner() {
  }

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner title(String title) {
    
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
    QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner = (QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner) o;
    return Objects.equals(this.title, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner {\n");
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
       if (!QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner
  */
  public static QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListTitleMaterialInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

