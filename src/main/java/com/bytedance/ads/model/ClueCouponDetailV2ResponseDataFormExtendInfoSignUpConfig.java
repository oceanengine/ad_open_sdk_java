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
import com.bytedance.ads.model.ClueCouponDetailV2DataFormExtendInfoSignUpConfigSignType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig {
  public static final String SERIALIZED_NAME_SIGN_TYPE = "sign_type";
  @SerializedName(SERIALIZED_NAME_SIGN_TYPE)
  private ClueCouponDetailV2DataFormExtendInfoSignUpConfigSignType signType = null;

  public ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig() {
  }

  public ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig signType(ClueCouponDetailV2DataFormExtendInfoSignUpConfigSignType signType) {
    
    this.signType = signType;
    return this;
  }

   /**
   * Get signType
   * @return signType
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2DataFormExtendInfoSignUpConfigSignType getSignType() {
    return signType;
  }


  public void setSignType(ClueCouponDetailV2DataFormExtendInfoSignUpConfigSignType signType) {
    this.signType = signType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig clueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig = (ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig) o;
    return Objects.equals(this.signType, clueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig.signType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig {\n");
    sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
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
    openapiFields.add("sign_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig>() {
           @Override
           public void write(JsonWriter out, ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig
  * @throws IOException if the JSON string is invalid with respect to ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig
  */
  public static ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig.class);
  }

 /**
  * Convert an instance of ClueCouponDetailV2ResponseDataFormExtendInfoSignUpConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

