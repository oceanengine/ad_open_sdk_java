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
import com.bytedance.ads.model.AdvertiserDeliveryQualificationDeleteV30ResponseDataErrorsInner;
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
public class AdvertiserDeliveryQualificationDeleteV30ResponseData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<AdvertiserDeliveryQualificationDeleteV30ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_IDS = "qualification_ids";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_IDS)
  private List<Long> qualificationIds = null;

  public AdvertiserDeliveryQualificationDeleteV30ResponseData() {
  }

  public AdvertiserDeliveryQualificationDeleteV30ResponseData errors(List<AdvertiserDeliveryQualificationDeleteV30ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public AdvertiserDeliveryQualificationDeleteV30ResponseData addErrorsItem(AdvertiserDeliveryQualificationDeleteV30ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 删除失败的投放资质列表
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryQualificationDeleteV30ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<AdvertiserDeliveryQualificationDeleteV30ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public AdvertiserDeliveryQualificationDeleteV30ResponseData qualificationIds(List<Long> qualificationIds) {
    
    this.qualificationIds = qualificationIds;
    return this;
  }

  public AdvertiserDeliveryQualificationDeleteV30ResponseData addQualificationIdsItem(Long qualificationIdsItem) {
    if (this.qualificationIds == null) {
      this.qualificationIds = new ArrayList<>();
    }
    this.qualificationIds.add(qualificationIdsItem);
    return this;
  }

   /**
   * 删除成功的投放资质id
   * @return qualificationIds
  **/
  @javax.annotation.Nullable
  public List<Long> getQualificationIds() {
    return qualificationIds;
  }


  public void setQualificationIds(List<Long> qualificationIds) {
    this.qualificationIds = qualificationIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryQualificationDeleteV30ResponseData advertiserDeliveryQualificationDeleteV30ResponseData = (AdvertiserDeliveryQualificationDeleteV30ResponseData) o;
    return Objects.equals(this.errors, advertiserDeliveryQualificationDeleteV30ResponseData.errors) &&
        Objects.equals(this.qualificationIds, advertiserDeliveryQualificationDeleteV30ResponseData.qualificationIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, qualificationIds);
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
    sb.append("class AdvertiserDeliveryQualificationDeleteV30ResponseData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    qualificationIds: ").append(toIndentedString(qualificationIds)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("qualification_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryQualificationDeleteV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryQualificationDeleteV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryQualificationDeleteV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryQualificationDeleteV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryQualificationDeleteV30ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryQualificationDeleteV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryQualificationDeleteV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryQualificationDeleteV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryQualificationDeleteV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryQualificationDeleteV30ResponseData
  */
  public static AdvertiserDeliveryQualificationDeleteV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryQualificationDeleteV30ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryQualificationDeleteV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

