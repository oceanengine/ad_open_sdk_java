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
import com.bytedance.ads.model.PromotionUpdateV30DataErrorListObjectType;
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
 * PromotionUpdateV30ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class PromotionUpdateV30ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Long errorCode = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private PromotionUpdateV30DataErrorListObjectType objectType = null;

  public PromotionUpdateV30ResponseDataErrorListInner() {
  }

  public PromotionUpdateV30ResponseDataErrorListInner errorCode(Long errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 
   * @return errorCode
  **/
  @javax.annotation.Nullable
  public Long getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
  }


  public PromotionUpdateV30ResponseDataErrorListInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public PromotionUpdateV30ResponseDataErrorListInner objectType(PromotionUpdateV30DataErrorListObjectType objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30DataErrorListObjectType getObjectType() {
    return objectType;
  }


  public void setObjectType(PromotionUpdateV30DataErrorListObjectType objectType) {
    this.objectType = objectType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30ResponseDataErrorListInner promotionUpdateV30ResponseDataErrorListInner = (PromotionUpdateV30ResponseDataErrorListInner) o;
    return Objects.equals(this.errorCode, promotionUpdateV30ResponseDataErrorListInner.errorCode) &&
        Objects.equals(this.errorMessage, promotionUpdateV30ResponseDataErrorListInner.errorMessage) &&
        Objects.equals(this.objectType, promotionUpdateV30ResponseDataErrorListInner.objectType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, objectType);
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
    sb.append("class PromotionUpdateV30ResponseDataErrorListInner {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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
    openapiFields.add("error_code");
    openapiFields.add("error_message");
    openapiFields.add("object_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30ResponseDataErrorListInner
  */
  public static PromotionUpdateV30ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

