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
import com.bytedance.ads.model.StarReportCustomDataTopicReportV2ResponseDataDataInner;
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
public class StarReportCustomDataTopicReportV2ResponseData {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<StarReportCustomDataTopicReportV2ResponseDataDataInner> data = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public StarReportCustomDataTopicReportV2ResponseData() {
  }

  public StarReportCustomDataTopicReportV2ResponseData data(List<StarReportCustomDataTopicReportV2ResponseDataDataInner> data) {
    
    this.data = data;
    return this;
  }

  public StarReportCustomDataTopicReportV2ResponseData addDataItem(StarReportCustomDataTopicReportV2ResponseDataDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 对应请求的数据主题数组
   * @return data
  **/
  @javax.annotation.Nullable
  public List<StarReportCustomDataTopicReportV2ResponseDataDataInner> getData() {
    return data;
  }


  public void setData(List<StarReportCustomDataTopicReportV2ResponseDataDataInner> data) {
    this.data = data;
  }


  public StarReportCustomDataTopicReportV2ResponseData demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 请求的任务Id
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarReportCustomDataTopicReportV2ResponseData itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 请求的交付物Id
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportCustomDataTopicReportV2ResponseData starReportCustomDataTopicReportV2ResponseData = (StarReportCustomDataTopicReportV2ResponseData) o;
    return Objects.equals(this.data, starReportCustomDataTopicReportV2ResponseData.data) &&
        Objects.equals(this.demandId, starReportCustomDataTopicReportV2ResponseData.demandId) &&
        Objects.equals(this.itemId, starReportCustomDataTopicReportV2ResponseData.itemId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, demandId, itemId);
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
    sb.append("class StarReportCustomDataTopicReportV2ResponseData {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("demand_id");
    openapiFields.add("item_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("item_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportCustomDataTopicReportV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportCustomDataTopicReportV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportCustomDataTopicReportV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportCustomDataTopicReportV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportCustomDataTopicReportV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarReportCustomDataTopicReportV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportCustomDataTopicReportV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportCustomDataTopicReportV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportCustomDataTopicReportV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarReportCustomDataTopicReportV2ResponseData
  */
  public static StarReportCustomDataTopicReportV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportCustomDataTopicReportV2ResponseData.class);
  }

 /**
  * Convert an instance of StarReportCustomDataTopicReportV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

