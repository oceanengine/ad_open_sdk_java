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
import com.bytedance.ads.model.EventManagerAbnormalAssetsGetV30ResponseDataPageInfo;
import com.bytedance.ads.model.EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner;
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
public class EventManagerAbnormalAssetsGetV30ResponseData {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private EventManagerAbnormalAssetsGetV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_SINGLE_CASE = "single_case";
  @SerializedName(SERIALIZED_NAME_SINGLE_CASE)
  private List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner> singleCase = null;

  public EventManagerAbnormalAssetsGetV30ResponseData() {
  }

  public EventManagerAbnormalAssetsGetV30ResponseData date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 最新一天的接入状态（天级别更新）
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public EventManagerAbnormalAssetsGetV30ResponseData pageInfo(EventManagerAbnormalAssetsGetV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public EventManagerAbnormalAssetsGetV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(EventManagerAbnormalAssetsGetV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public EventManagerAbnormalAssetsGetV30ResponseData singleCase(List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner> singleCase) {
    
    this.singleCase = singleCase;
    return this;
  }

  public EventManagerAbnormalAssetsGetV30ResponseData addSingleCaseItem(EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner singleCaseItem) {
    if (this.singleCase == null) {
      this.singleCase = new ArrayList<>();
    }
    this.singleCase.add(singleCaseItem);
    return this;
  }

   /**
   * 分包的接入状态信息
   * @return singleCase
  **/
  @javax.annotation.Nullable
  public List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner> getSingleCase() {
    return singleCase;
  }


  public void setSingleCase(List<EventManagerAbnormalAssetsGetV30ResponseDataSingleCaseInner> singleCase) {
    this.singleCase = singleCase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAbnormalAssetsGetV30ResponseData eventManagerAbnormalAssetsGetV30ResponseData = (EventManagerAbnormalAssetsGetV30ResponseData) o;
    return Objects.equals(this.date, eventManagerAbnormalAssetsGetV30ResponseData.date) &&
        Objects.equals(this.pageInfo, eventManagerAbnormalAssetsGetV30ResponseData.pageInfo) &&
        Objects.equals(this.singleCase, eventManagerAbnormalAssetsGetV30ResponseData.singleCase);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, pageInfo, singleCase);
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
    sb.append("class EventManagerAbnormalAssetsGetV30ResponseData {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    singleCase: ").append(toIndentedString(singleCase)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("page_info");
    openapiFields.add("single_case");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAbnormalAssetsGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAbnormalAssetsGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAbnormalAssetsGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAbnormalAssetsGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAbnormalAssetsGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, EventManagerAbnormalAssetsGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAbnormalAssetsGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAbnormalAssetsGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAbnormalAssetsGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to EventManagerAbnormalAssetsGetV30ResponseData
  */
  public static EventManagerAbnormalAssetsGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAbnormalAssetsGetV30ResponseData.class);
  }

 /**
  * Convert an instance of EventManagerAbnormalAssetsGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

