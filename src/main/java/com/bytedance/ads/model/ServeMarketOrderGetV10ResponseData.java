/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ServeMarketOrderGetV10ResponseDataOrderListInner;
import com.bytedance.ads.model.ServeMarketOrderGetV10ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ServeMarketOrderGetV10ResponseData {
  public static final String SERIALIZED_NAME_ORDER_LIST = "order_list";
  @SerializedName(SERIALIZED_NAME_ORDER_LIST)
  private List<ServeMarketOrderGetV10ResponseDataOrderListInner> orderList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ServeMarketOrderGetV10ResponseDataPageInfo pageInfo = null;

  public ServeMarketOrderGetV10ResponseData() {
  }

  public ServeMarketOrderGetV10ResponseData orderList(List<ServeMarketOrderGetV10ResponseDataOrderListInner> orderList) {
    
    this.orderList = orderList;
    return this;
  }

  public ServeMarketOrderGetV10ResponseData addOrderListItem(ServeMarketOrderGetV10ResponseDataOrderListInner orderListItem) {
    if (this.orderList == null) {
      this.orderList = new ArrayList<>();
    }
    this.orderList.add(orderListItem);
    return this;
  }

   /**
   * 
   * @return orderList
  **/
  @javax.annotation.Nullable
  public List<ServeMarketOrderGetV10ResponseDataOrderListInner> getOrderList() {
    return orderList;
  }


  public void setOrderList(List<ServeMarketOrderGetV10ResponseDataOrderListInner> orderList) {
    this.orderList = orderList;
  }


  public ServeMarketOrderGetV10ResponseData pageInfo(ServeMarketOrderGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ServeMarketOrderGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ServeMarketOrderGetV10ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServeMarketOrderGetV10ResponseData serveMarketOrderGetV10ResponseData = (ServeMarketOrderGetV10ResponseData) o;
    return Objects.equals(this.orderList, serveMarketOrderGetV10ResponseData.orderList) &&
        Objects.equals(this.pageInfo, serveMarketOrderGetV10ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderList, pageInfo);
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
    sb.append("class ServeMarketOrderGetV10ResponseData {\n");
    sb.append("    orderList: ").append(toIndentedString(orderList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("order_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServeMarketOrderGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServeMarketOrderGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServeMarketOrderGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServeMarketOrderGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ServeMarketOrderGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, ServeMarketOrderGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServeMarketOrderGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServeMarketOrderGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServeMarketOrderGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to ServeMarketOrderGetV10ResponseData
  */
  public static ServeMarketOrderGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServeMarketOrderGetV10ResponseData.class);
  }

 /**
  * Convert an instance of ServeMarketOrderGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

