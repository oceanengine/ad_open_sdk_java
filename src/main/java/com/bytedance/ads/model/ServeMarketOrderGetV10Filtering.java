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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class ServeMarketOrderGetV10Filtering {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private List<Long> orderId = null;

  public static final String SERIALIZED_NAME_USE_UID = "use_uid";
  @SerializedName(SERIALIZED_NAME_USE_UID)
  private Long useUid = null;

  public ServeMarketOrderGetV10Filtering() {
  }

  public ServeMarketOrderGetV10Filtering orderId(List<Long> orderId) {
    
    this.orderId = orderId;
    return this;
  }

  public ServeMarketOrderGetV10Filtering addOrderIdItem(Long orderIdItem) {
    if (this.orderId == null) {
      this.orderId = new ArrayList<>();
    }
    this.orderId.add(orderIdItem);
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderId() {
    return orderId;
  }


  public void setOrderId(List<Long> orderId) {
    this.orderId = orderId;
  }


  public ServeMarketOrderGetV10Filtering useUid(Long useUid) {
    
    this.useUid = useUid;
    return this;
  }

   /**
   * 
   * @return useUid
  **/
  @javax.annotation.Nullable
  public Long getUseUid() {
    return useUid;
  }


  public void setUseUid(Long useUid) {
    this.useUid = useUid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServeMarketOrderGetV10Filtering serveMarketOrderGetV10Filtering = (ServeMarketOrderGetV10Filtering) o;
    return Objects.equals(this.orderId, serveMarketOrderGetV10Filtering.orderId) &&
        Objects.equals(this.useUid, serveMarketOrderGetV10Filtering.useUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, useUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServeMarketOrderGetV10Filtering {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    useUid: ").append(toIndentedString(useUid)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("use_uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServeMarketOrderGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServeMarketOrderGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServeMarketOrderGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServeMarketOrderGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ServeMarketOrderGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, ServeMarketOrderGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServeMarketOrderGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServeMarketOrderGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServeMarketOrderGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to ServeMarketOrderGetV10Filtering
  */
  public static ServeMarketOrderGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServeMarketOrderGetV10Filtering.class);
  }

 /**
  * Convert an instance of ServeMarketOrderGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

