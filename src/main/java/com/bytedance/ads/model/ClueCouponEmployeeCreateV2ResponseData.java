/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponEmployeeCreateV2ResponseDataExistedListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ClueCouponEmployeeCreateV2ResponseData {
  public static final String SERIALIZED_NAME_EXISTED_LIST = "existed_list";
  @SerializedName(SERIALIZED_NAME_EXISTED_LIST)
  private List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> existedList = null;

  public static final String SERIALIZED_NAME_SUCCESS_LIST = "success_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST)
  private List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> successList = null;

  public ClueCouponEmployeeCreateV2ResponseData() {
  }

  public ClueCouponEmployeeCreateV2ResponseData existedList(List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> existedList) {
    
    this.existedList = existedList;
    return this;
  }

  public ClueCouponEmployeeCreateV2ResponseData addExistedListItem(ClueCouponEmployeeCreateV2ResponseDataExistedListInner existedListItem) {
    if (this.existedList == null) {
      this.existedList = new ArrayList<>();
    }
    this.existedList.add(existedListItem);
    return this;
  }

   /**
   * 
   * @return existedList
  **/
  @javax.annotation.Nullable
  public List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> getExistedList() {
    return existedList;
  }


  public void setExistedList(List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> existedList) {
    this.existedList = existedList;
  }


  public ClueCouponEmployeeCreateV2ResponseData successList(List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> successList) {
    
    this.successList = successList;
    return this;
  }

  public ClueCouponEmployeeCreateV2ResponseData addSuccessListItem(ClueCouponEmployeeCreateV2ResponseDataExistedListInner successListItem) {
    if (this.successList == null) {
      this.successList = new ArrayList<>();
    }
    this.successList.add(successListItem);
    return this;
  }

   /**
   * 
   * @return successList
  **/
  @javax.annotation.Nullable
  public List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> getSuccessList() {
    return successList;
  }


  public void setSuccessList(List<ClueCouponEmployeeCreateV2ResponseDataExistedListInner> successList) {
    this.successList = successList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponEmployeeCreateV2ResponseData clueCouponEmployeeCreateV2ResponseData = (ClueCouponEmployeeCreateV2ResponseData) o;
    return Objects.equals(this.existedList, clueCouponEmployeeCreateV2ResponseData.existedList) &&
        Objects.equals(this.successList, clueCouponEmployeeCreateV2ResponseData.successList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existedList, successList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponEmployeeCreateV2ResponseData {\n");
    sb.append("    existedList: ").append(toIndentedString(existedList)).append("\n");
    sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
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
    openapiFields.add("existed_list");
    openapiFields.add("success_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponEmployeeCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponEmployeeCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponEmployeeCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponEmployeeCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponEmployeeCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ClueCouponEmployeeCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponEmployeeCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponEmployeeCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponEmployeeCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ClueCouponEmployeeCreateV2ResponseData
  */
  public static ClueCouponEmployeeCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponEmployeeCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of ClueCouponEmployeeCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

