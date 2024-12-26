/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ToolsForbiddenLinkGreyGetV30ResponseData {
  public static final String SERIALIZED_NAME_FORBIDDEN_DATE = "forbidden_date";
  @SerializedName(SERIALIZED_NAME_FORBIDDEN_DATE)
  private String forbiddenDate = null;

  public static final String SERIALIZED_NAME_IN_FORBIDDEN_LIST = "in_forbidden_list";
  @SerializedName(SERIALIZED_NAME_IN_FORBIDDEN_LIST)
  private Boolean inForbiddenList = null;

  public ToolsForbiddenLinkGreyGetV30ResponseData() {
  }

  public ToolsForbiddenLinkGreyGetV30ResponseData forbiddenDate(String forbiddenDate) {
    
    this.forbiddenDate = forbiddenDate;
    return this;
  }

   /**
   * 
   * @return forbiddenDate
  **/
  @javax.annotation.Nullable
  public String getForbiddenDate() {
    return forbiddenDate;
  }


  public void setForbiddenDate(String forbiddenDate) {
    this.forbiddenDate = forbiddenDate;
  }


  public ToolsForbiddenLinkGreyGetV30ResponseData inForbiddenList(Boolean inForbiddenList) {
    
    this.inForbiddenList = inForbiddenList;
    return this;
  }

   /**
   * 是否命中禁投线索名单 true表示命中，但命中不代表立即禁投，请结合forbidden_date字段判断当前是否可投 false表示未命中
   * @return inForbiddenList
  **/
  @javax.annotation.Nullable
  public Boolean getInForbiddenList() {
    return inForbiddenList;
  }


  public void setInForbiddenList(Boolean inForbiddenList) {
    this.inForbiddenList = inForbiddenList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsForbiddenLinkGreyGetV30ResponseData toolsForbiddenLinkGreyGetV30ResponseData = (ToolsForbiddenLinkGreyGetV30ResponseData) o;
    return Objects.equals(this.forbiddenDate, toolsForbiddenLinkGreyGetV30ResponseData.forbiddenDate) &&
        Objects.equals(this.inForbiddenList, toolsForbiddenLinkGreyGetV30ResponseData.inForbiddenList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(forbiddenDate, inForbiddenList);
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
    sb.append("class ToolsForbiddenLinkGreyGetV30ResponseData {\n");
    sb.append("    forbiddenDate: ").append(toIndentedString(forbiddenDate)).append("\n");
    sb.append("    inForbiddenList: ").append(toIndentedString(inForbiddenList)).append("\n");
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
    openapiFields.add("forbidden_date");
    openapiFields.add("in_forbidden_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsForbiddenLinkGreyGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsForbiddenLinkGreyGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsForbiddenLinkGreyGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsForbiddenLinkGreyGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsForbiddenLinkGreyGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsForbiddenLinkGreyGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsForbiddenLinkGreyGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsForbiddenLinkGreyGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsForbiddenLinkGreyGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsForbiddenLinkGreyGetV30ResponseData
  */
  public static ToolsForbiddenLinkGreyGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsForbiddenLinkGreyGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsForbiddenLinkGreyGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

