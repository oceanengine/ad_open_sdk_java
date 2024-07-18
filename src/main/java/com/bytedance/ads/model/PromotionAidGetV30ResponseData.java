/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionAidGetV30ResponseDataErrorListInner;
import com.bytedance.ads.model.PromotionAidGetV30ResponseDataPromotionMapDataInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class PromotionAidGetV30ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<PromotionAidGetV30ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_PROMOTION_MAP_DATA = "promotion_map_data";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MAP_DATA)
  private List<PromotionAidGetV30ResponseDataPromotionMapDataInner> promotionMapData = null;

  public PromotionAidGetV30ResponseData() {
  }

  public PromotionAidGetV30ResponseData errorList(List<PromotionAidGetV30ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public PromotionAidGetV30ResponseData addErrorListItem(PromotionAidGetV30ResponseDataErrorListInner errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 
   * @return errorList
  **/
  @javax.annotation.Nullable
  public List<PromotionAidGetV30ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<PromotionAidGetV30ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public PromotionAidGetV30ResponseData promotionMapData(List<PromotionAidGetV30ResponseDataPromotionMapDataInner> promotionMapData) {
    
    this.promotionMapData = promotionMapData;
    return this;
  }

  public PromotionAidGetV30ResponseData addPromotionMapDataItem(PromotionAidGetV30ResponseDataPromotionMapDataInner promotionMapDataItem) {
    if (this.promotionMapData == null) {
      this.promotionMapData = new ArrayList<>();
    }
    this.promotionMapData.add(promotionMapDataItem);
    return this;
  }

   /**
   * 
   * @return promotionMapData
  **/
  @javax.annotation.Nullable
  public List<PromotionAidGetV30ResponseDataPromotionMapDataInner> getPromotionMapData() {
    return promotionMapData;
  }


  public void setPromotionMapData(List<PromotionAidGetV30ResponseDataPromotionMapDataInner> promotionMapData) {
    this.promotionMapData = promotionMapData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAidGetV30ResponseData promotionAidGetV30ResponseData = (PromotionAidGetV30ResponseData) o;
    return Objects.equals(this.errorList, promotionAidGetV30ResponseData.errorList) &&
        Objects.equals(this.promotionMapData, promotionAidGetV30ResponseData.promotionMapData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList, promotionMapData);
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
    sb.append("class PromotionAidGetV30ResponseData {\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    promotionMapData: ").append(toIndentedString(promotionMapData)).append("\n");
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
    openapiFields.add("error_list");
    openapiFields.add("promotion_map_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAidGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAidGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAidGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAidGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAidGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, PromotionAidGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAidGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAidGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAidGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to PromotionAidGetV30ResponseData
  */
  public static PromotionAidGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAidGetV30ResponseData.class);
  }

 /**
  * Convert an instance of PromotionAidGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

