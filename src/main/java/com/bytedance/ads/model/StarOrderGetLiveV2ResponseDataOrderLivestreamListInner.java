/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarOrderGetLiveV2ResponseDataOrderLivestreamListInnerLivestreamListInner;
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
 * StarOrderGetLiveV2ResponseDataOrderLivestreamListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class StarOrderGetLiveV2ResponseDataOrderLivestreamListInner {
  public static final String SERIALIZED_NAME_LIVESTREAM_LIST = "livestream_list";
  @SerializedName(SERIALIZED_NAME_LIVESTREAM_LIST)
  private List<StarOrderGetLiveV2ResponseDataOrderLivestreamListInnerLivestreamListInner> livestreamList = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_TOTAL_DURATION = "total_duration";
  @SerializedName(SERIALIZED_NAME_TOTAL_DURATION)
  private Long totalDuration = null;

  public StarOrderGetLiveV2ResponseDataOrderLivestreamListInner() {
  }

  public StarOrderGetLiveV2ResponseDataOrderLivestreamListInner livestreamList(List<StarOrderGetLiveV2ResponseDataOrderLivestreamListInnerLivestreamListInner> livestreamList) {
    
    this.livestreamList = livestreamList;
    return this;
  }

  public StarOrderGetLiveV2ResponseDataOrderLivestreamListInner addLivestreamListItem(StarOrderGetLiveV2ResponseDataOrderLivestreamListInnerLivestreamListInner livestreamListItem) {
    if (this.livestreamList == null) {
      this.livestreamList = new ArrayList<>();
    }
    this.livestreamList.add(livestreamListItem);
    return this;
  }

   /**
   * 
   * @return livestreamList
  **/
  @javax.annotation.Nullable
  public List<StarOrderGetLiveV2ResponseDataOrderLivestreamListInnerLivestreamListInner> getLivestreamList() {
    return livestreamList;
  }


  public void setLivestreamList(List<StarOrderGetLiveV2ResponseDataOrderLivestreamListInnerLivestreamListInner> livestreamList) {
    this.livestreamList = livestreamList;
  }


  public StarOrderGetLiveV2ResponseDataOrderLivestreamListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 任务ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarOrderGetLiveV2ResponseDataOrderLivestreamListInner totalDuration(Long totalDuration) {
    
    this.totalDuration = totalDuration;
    return this;
  }

   /**
   * 直播总时长
   * @return totalDuration
  **/
  @javax.annotation.Nullable
  public Long getTotalDuration() {
    return totalDuration;
  }


  public void setTotalDuration(Long totalDuration) {
    this.totalDuration = totalDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetLiveV2ResponseDataOrderLivestreamListInner starOrderGetLiveV2ResponseDataOrderLivestreamListInner = (StarOrderGetLiveV2ResponseDataOrderLivestreamListInner) o;
    return Objects.equals(this.livestreamList, starOrderGetLiveV2ResponseDataOrderLivestreamListInner.livestreamList) &&
        Objects.equals(this.orderId, starOrderGetLiveV2ResponseDataOrderLivestreamListInner.orderId) &&
        Objects.equals(this.totalDuration, starOrderGetLiveV2ResponseDataOrderLivestreamListInner.totalDuration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(livestreamList, orderId, totalDuration);
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
    sb.append("class StarOrderGetLiveV2ResponseDataOrderLivestreamListInner {\n");
    sb.append("    livestreamList: ").append(toIndentedString(livestreamList)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
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
    openapiFields.add("livestream_list");
    openapiFields.add("order_id");
    openapiFields.add("total_duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetLiveV2ResponseDataOrderLivestreamListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetLiveV2ResponseDataOrderLivestreamListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetLiveV2ResponseDataOrderLivestreamListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetLiveV2ResponseDataOrderLivestreamListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetLiveV2ResponseDataOrderLivestreamListInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetLiveV2ResponseDataOrderLivestreamListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetLiveV2ResponseDataOrderLivestreamListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetLiveV2ResponseDataOrderLivestreamListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetLiveV2ResponseDataOrderLivestreamListInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetLiveV2ResponseDataOrderLivestreamListInner
  */
  public static StarOrderGetLiveV2ResponseDataOrderLivestreamListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetLiveV2ResponseDataOrderLivestreamListInner.class);
  }

 /**
  * Convert an instance of StarOrderGetLiveV2ResponseDataOrderLivestreamListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

