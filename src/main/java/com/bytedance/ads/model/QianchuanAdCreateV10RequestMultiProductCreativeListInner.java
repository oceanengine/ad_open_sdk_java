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
import com.bytedance.ads.model.QianchuanAdCreateV10MultiProductCreativeListCreativeMaterialMode;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting;
import com.bytedance.ads.model.QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative;
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
 * QianchuanAdCreateV10RequestMultiProductCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10RequestMultiProductCreativeListInner {
  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODE = "creative_material_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODE)
  private QianchuanAdCreateV10MultiProductCreativeListCreativeMaterialMode creativeMaterialMode = null;

  public static final String SERIALIZED_NAME_CREATIVE_SETTING = "creative_setting";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SETTING)
  private QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting creativeSetting = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE = "programmatic_creative";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE)
  private QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative programmaticCreative = null;

  public QianchuanAdCreateV10RequestMultiProductCreativeListInner() {
  }

  public QianchuanAdCreateV10RequestMultiProductCreativeListInner creativeMaterialMode(QianchuanAdCreateV10MultiProductCreativeListCreativeMaterialMode creativeMaterialMode) {
    
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

   /**
   * Get creativeMaterialMode
   * @return creativeMaterialMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10MultiProductCreativeListCreativeMaterialMode getCreativeMaterialMode() {
    return creativeMaterialMode;
  }


  public void setCreativeMaterialMode(QianchuanAdCreateV10MultiProductCreativeListCreativeMaterialMode creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInner creativeSetting(QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting creativeSetting) {
    
    this.creativeSetting = creativeSetting;
    return this;
  }

   /**
   * Get creativeSetting
   * @return creativeSetting
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting getCreativeSetting() {
    return creativeSetting;
  }


  public void setCreativeSetting(QianchuanAdCreateV10RequestMultiProductCreativeListInnerCreativeSetting creativeSetting) {
    this.creativeSetting = creativeSetting;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public QianchuanAdCreateV10RequestMultiProductCreativeListInner programmaticCreative(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative programmaticCreative) {
    
    this.programmaticCreative = programmaticCreative;
    return this;
  }

   /**
   * Get programmaticCreative
   * @return programmaticCreative
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative getProgrammaticCreative() {
    return programmaticCreative;
  }


  public void setProgrammaticCreative(QianchuanAdCreateV10RequestMultiProductCreativeListInnerProgrammaticCreative programmaticCreative) {
    this.programmaticCreative = programmaticCreative;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestMultiProductCreativeListInner qianchuanAdCreateV10RequestMultiProductCreativeListInner = (QianchuanAdCreateV10RequestMultiProductCreativeListInner) o;
    return Objects.equals(this.creativeMaterialMode, qianchuanAdCreateV10RequestMultiProductCreativeListInner.creativeMaterialMode) &&
        Objects.equals(this.creativeSetting, qianchuanAdCreateV10RequestMultiProductCreativeListInner.creativeSetting) &&
        Objects.equals(this.productId, qianchuanAdCreateV10RequestMultiProductCreativeListInner.productId) &&
        Objects.equals(this.programmaticCreative, qianchuanAdCreateV10RequestMultiProductCreativeListInner.programmaticCreative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeMaterialMode, creativeSetting, productId, programmaticCreative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestMultiProductCreativeListInner {\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    creativeSetting: ").append(toIndentedString(creativeSetting)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    programmaticCreative: ").append(toIndentedString(programmaticCreative)).append("\n");
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
    openapiFields.add("creative_material_mode");
    openapiFields.add("creative_setting");
    openapiFields.add("product_id");
    openapiFields.add("programmatic_creative");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("creative_material_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestMultiProductCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestMultiProductCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestMultiProductCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestMultiProductCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestMultiProductCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestMultiProductCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestMultiProductCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestMultiProductCreativeListInner
  */
  public static QianchuanAdCreateV10RequestMultiProductCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestMultiProductCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestMultiProductCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

