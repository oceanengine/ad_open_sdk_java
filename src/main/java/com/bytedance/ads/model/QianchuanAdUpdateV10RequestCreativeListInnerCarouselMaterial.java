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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial {
  public static final String SERIALIZED_NAME_AWEME_CAROUSEL_ID = "aweme_carousel_id";
  @SerializedName(SERIALIZED_NAME_AWEME_CAROUSEL_ID)
  private Long awemeCarouselId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_ID = "carousel_id";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_ID)
  private Long carouselId = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial() {
  }

  public QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial awemeCarouselId(Long awemeCarouselId) {
    
    this.awemeCarouselId = awemeCarouselId;
    return this;
  }

   /**
   * 
   * @return awemeCarouselId
  **/
  @javax.annotation.Nullable
  public Long getAwemeCarouselId() {
    return awemeCarouselId;
  }


  public void setAwemeCarouselId(Long awemeCarouselId) {
    this.awemeCarouselId = awemeCarouselId;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial carouselId(Long carouselId) {
    
    this.carouselId = carouselId;
    return this;
  }

   /**
   * 
   * @return carouselId
  **/
  @javax.annotation.Nullable
  public Long getCarouselId() {
    return carouselId;
  }


  public void setCarouselId(Long carouselId) {
    this.carouselId = carouselId;
  }


  public QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial qianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial = (QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial) o;
    return Objects.equals(this.awemeCarouselId, qianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial.awemeCarouselId) &&
        Objects.equals(this.carouselId, qianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial.carouselId) &&
        Objects.equals(this.id, qianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeCarouselId, carouselId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial {\n");
    sb.append("    awemeCarouselId: ").append(toIndentedString(awemeCarouselId)).append("\n");
    sb.append("    carouselId: ").append(toIndentedString(carouselId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("aweme_carousel_id");
    openapiFields.add("carousel_id");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial
  */
  public static QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestCreativeListInnerCarouselMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

