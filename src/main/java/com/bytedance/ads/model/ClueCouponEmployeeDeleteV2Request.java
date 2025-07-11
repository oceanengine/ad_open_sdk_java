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
import com.bytedance.ads.model.ClueCouponEmployeeDeleteV2RequestListInner;
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
 * ClueCouponEmployeeDeleteV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ClueCouponEmployeeDeleteV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<ClueCouponEmployeeDeleteV2RequestListInner> _list = null;

  public ClueCouponEmployeeDeleteV2Request() {
  }

  public ClueCouponEmployeeDeleteV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueCouponEmployeeDeleteV2Request _list(List<ClueCouponEmployeeDeleteV2RequestListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public ClueCouponEmployeeDeleteV2Request addListItem(ClueCouponEmployeeDeleteV2RequestListInner _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * 
   * @return _list
  **/
  @javax.annotation.Nonnull
  public List<ClueCouponEmployeeDeleteV2RequestListInner> getList() {
    return _list;
  }


  public void setList(List<ClueCouponEmployeeDeleteV2RequestListInner> _list) {
    this._list = _list;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponEmployeeDeleteV2Request clueCouponEmployeeDeleteV2Request = (ClueCouponEmployeeDeleteV2Request) o;
    return Objects.equals(this.advertiserId, clueCouponEmployeeDeleteV2Request.advertiserId) &&
        Objects.equals(this._list, clueCouponEmployeeDeleteV2Request._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponEmployeeDeleteV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponEmployeeDeleteV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponEmployeeDeleteV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponEmployeeDeleteV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponEmployeeDeleteV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponEmployeeDeleteV2Request>() {
           @Override
           public void write(JsonWriter out, ClueCouponEmployeeDeleteV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponEmployeeDeleteV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponEmployeeDeleteV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponEmployeeDeleteV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueCouponEmployeeDeleteV2Request
  */
  public static ClueCouponEmployeeDeleteV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponEmployeeDeleteV2Request.class);
  }

 /**
  * Convert an instance of ClueCouponEmployeeDeleteV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

