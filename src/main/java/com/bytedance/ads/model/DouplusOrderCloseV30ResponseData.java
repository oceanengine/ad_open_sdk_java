/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class DouplusOrderCloseV30ResponseData {
  public static final String SERIALIZED_NAME_FAIL_LIST = "fail_list";
  @SerializedName(SERIALIZED_NAME_FAIL_LIST)
  private Map<String, String> failList = null;

  public static final String SERIALIZED_NAME_SUCCESS_LIST = "success_list";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST)
  private List<Long> successList = null;

  public DouplusOrderCloseV30ResponseData() {
  }

  public DouplusOrderCloseV30ResponseData failList(Map<String, String> failList) {
    
    this.failList = failList;
    return this;
  }

  public DouplusOrderCloseV30ResponseData putFailListItem(String key, String failListItem) {
    if (this.failList == null) {
      this.failList = new HashMap<>();
    }
    this.failList.put(key, failListItem);
    return this;
  }

   /**
   * 
   * @return failList
  **/
  @javax.annotation.Nullable
  public Map<String, String> getFailList() {
    return failList;
  }


  public void setFailList(Map<String, String> failList) {
    this.failList = failList;
  }


  public DouplusOrderCloseV30ResponseData successList(List<Long> successList) {
    
    this.successList = successList;
    return this;
  }

  public DouplusOrderCloseV30ResponseData addSuccessListItem(Long successListItem) {
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
  public List<Long> getSuccessList() {
    return successList;
  }


  public void setSuccessList(List<Long> successList) {
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
    DouplusOrderCloseV30ResponseData douplusOrderCloseV30ResponseData = (DouplusOrderCloseV30ResponseData) o;
    return Objects.equals(this.failList, douplusOrderCloseV30ResponseData.failList) &&
        Objects.equals(this.successList, douplusOrderCloseV30ResponseData.successList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failList, successList);
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
    sb.append("class DouplusOrderCloseV30ResponseData {\n");
    sb.append("    failList: ").append(toIndentedString(failList)).append("\n");
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
    openapiFields.add("fail_list");
    openapiFields.add("success_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderCloseV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderCloseV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderCloseV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderCloseV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderCloseV30ResponseData>() {
           @Override
           public void write(JsonWriter out, DouplusOrderCloseV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderCloseV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderCloseV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderCloseV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderCloseV30ResponseData
  */
  public static DouplusOrderCloseV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderCloseV30ResponseData.class);
  }

 /**
  * Convert an instance of DouplusOrderCloseV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
