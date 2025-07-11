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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList {
  public static final String SERIALIZED_NAME_DAY_LIST = "day_list";
  @SerializedName(SERIALIZED_NAME_DAY_LIST)
  private List<String> dayList = null;

  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList() {
  }

  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList dayList(List<String> dayList) {
    
    this.dayList = dayList;
    return this;
  }

  public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList addDayListItem(String dayListItem) {
    if (this.dayList == null) {
      this.dayList = new ArrayList<>();
    }
    this.dayList.add(dayListItem);
    return this;
  }

   /**
   * eg: [\&quot;2006-01-02\&quot;] 可以跨天填写
   * @return dayList
  **/
  @javax.annotation.Nullable
  public List<String> getDayList() {
    return dayList;
  }


  public void setDayList(List<String> dayList) {
    this.dayList = dayList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList = (BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList) o;
    return Objects.equals(this.dayList, brandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList.dayList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList {\n");
    sb.append("    dayList: ").append(toIndentedString(dayList)).append("\n");
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
    openapiFields.add("day_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList>() {
           @Override
           public void write(JsonWriter out, BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList
  * @throws IOException if the JSON string is invalid with respect to BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList
  */
  public static BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList.class);
  }

 /**
  * Convert an instance of BrandMaterialUpdateV30RequestMaterialListInnerMaterialComponentDeliveryTimeList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

