/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
 * QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner() {
  }

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return awemeItemId
  **/
  @javax.annotation.Nonnull
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner = (QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner) o;
    return Objects.equals(this.awemeItemId, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner.awemeItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
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
    openapiFields.add("aweme_item_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aweme_item_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner
  */
  public static QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListBlockVideoMaterialInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

