/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EnterpriseItemListV10ResponseDataItemListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class EnterpriseItemListV10ResponseData {
  public static final String SERIALIZED_NAME_ITEM_LIST = "item_list";
  @SerializedName(SERIALIZED_NAME_ITEM_LIST)
  private List<EnterpriseItemListV10ResponseDataItemListInner> itemList = null;

  public EnterpriseItemListV10ResponseData() {
  }

  public EnterpriseItemListV10ResponseData itemList(List<EnterpriseItemListV10ResponseDataItemListInner> itemList) {
    
    this.itemList = itemList;
    return this;
  }

  public EnterpriseItemListV10ResponseData addItemListItem(EnterpriseItemListV10ResponseDataItemListInner itemListItem) {
    if (this.itemList == null) {
      this.itemList = new ArrayList<>();
    }
    this.itemList.add(itemListItem);
    return this;
  }

   /**
   * 
   * @return itemList
  **/
  @javax.annotation.Nullable
  public List<EnterpriseItemListV10ResponseDataItemListInner> getItemList() {
    return itemList;
  }


  public void setItemList(List<EnterpriseItemListV10ResponseDataItemListInner> itemList) {
    this.itemList = itemList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseItemListV10ResponseData enterpriseItemListV10ResponseData = (EnterpriseItemListV10ResponseData) o;
    return Objects.equals(this.itemList, enterpriseItemListV10ResponseData.itemList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseItemListV10ResponseData {\n");
    sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
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
    openapiFields.add("item_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseItemListV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseItemListV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseItemListV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseItemListV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseItemListV10ResponseData>() {
           @Override
           public void write(JsonWriter out, EnterpriseItemListV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseItemListV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseItemListV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseItemListV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to EnterpriseItemListV10ResponseData
  */
  public static EnterpriseItemListV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseItemListV10ResponseData.class);
  }

 /**
  * Convert an instance of EnterpriseItemListV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

