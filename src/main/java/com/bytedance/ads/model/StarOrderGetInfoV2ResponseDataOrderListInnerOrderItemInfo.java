/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfoAuthorListInner;
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
 * 任务供给侧相关信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo {
  public static final String SERIALIZED_NAME_AUTHOR_LIST = "author_list";
  @SerializedName(SERIALIZED_NAME_AUTHOR_LIST)
  private List<StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfoAuthorListInner> authorList = null;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private Long orderType = null;

  public StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo authorList(List<StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfoAuthorListInner> authorList) {
    
    this.authorList = authorList;
    return this;
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo addAuthorListItem(StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfoAuthorListInner authorListItem) {
    if (this.authorList == null) {
      this.authorList = new ArrayList<>();
    }
    this.authorList.add(authorListItem);
    return this;
  }

   /**
   * 需求所选达人列表
   * @return authorList
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfoAuthorListInner> getAuthorList() {
    return authorList;
  }


  public void setAuthorList(List<StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfoAuthorListInner> authorList) {
    this.authorList = authorList;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo orderType(Long orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * 任务付款类型 (1)：全款； (2)：预付
   * @return orderType
  **/
  @javax.annotation.Nullable
  public Long getOrderType() {
    return orderType;
  }


  public void setOrderType(Long orderType) {
    this.orderType = orderType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo starOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo = (StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo) o;
    return Objects.equals(this.authorList, starOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo.authorList) &&
        Objects.equals(this.orderType, starOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo.orderType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorList, orderType);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo {\n");
    sb.append("    authorList: ").append(toIndentedString(authorList)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
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
    openapiFields.add("author_list");
    openapiFields.add("order_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerOrderItemInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

