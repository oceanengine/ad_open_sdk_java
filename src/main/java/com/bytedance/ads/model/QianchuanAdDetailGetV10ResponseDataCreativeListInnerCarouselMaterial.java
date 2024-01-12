/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial {
  public static final String SERIALIZED_NAME_AWEME_CAROUSEL_ID = "aweme_carousel_id";
  @SerializedName(SERIALIZED_NAME_AWEME_CAROUSEL_ID)
  private Long awemeCarouselId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_ID = "carousel_id";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_ID)
  private Long carouselId = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IS_AUTO_GENERATE = "is_auto_generate";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATE)
  private Long isAutoGenerate = null;

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial() {
  }

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial awemeCarouselId(Long awemeCarouselId) {
    
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


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial carouselId(Long carouselId) {
    
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


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial id(Long id) {
    
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


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial isAutoGenerate(Long isAutoGenerate) {
    
    this.isAutoGenerate = isAutoGenerate;
    return this;
  }

   /**
   * 
   * @return isAutoGenerate
  **/
  @javax.annotation.Nullable
  public Long getIsAutoGenerate() {
    return isAutoGenerate;
  }


  public void setIsAutoGenerate(Long isAutoGenerate) {
    this.isAutoGenerate = isAutoGenerate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial qianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial = (QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial) o;
    return Objects.equals(this.awemeCarouselId, qianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial.awemeCarouselId) &&
        Objects.equals(this.carouselId, qianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial.carouselId) &&
        Objects.equals(this.id, qianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial.id) &&
        Objects.equals(this.isAutoGenerate, qianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial.isAutoGenerate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeCarouselId, carouselId, id, isAutoGenerate);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial {\n");
    sb.append("    awemeCarouselId: ").append(toIndentedString(awemeCarouselId)).append("\n");
    sb.append("    carouselId: ").append(toIndentedString(carouselId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAutoGenerate: ").append(toIndentedString(isAutoGenerate)).append("\n");
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
    openapiFields.add("is_auto_generate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial
  */
  public static QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

