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
import com.bytedance.ads.model.StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner;
import com.bytedance.ads.model.StarDemandOmGetChallengeItemsDataV2ResponseDataPageInfo;
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
public class StarDemandOmGetChallengeItemsDataV2ResponseData {
  public static final String SERIALIZED_NAME_DATA_LIST = "data_list";
  @SerializedName(SERIALIZED_NAME_DATA_LIST)
  private List<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner> dataList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private StarDemandOmGetChallengeItemsDataV2ResponseDataPageInfo pageInfo = null;

  public StarDemandOmGetChallengeItemsDataV2ResponseData() {
  }

  public StarDemandOmGetChallengeItemsDataV2ResponseData dataList(List<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner> dataList) {
    
    this.dataList = dataList;
    return this;
  }

  public StarDemandOmGetChallengeItemsDataV2ResponseData addDataListItem(StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner dataListItem) {
    if (this.dataList == null) {
      this.dataList = new ArrayList<>();
    }
    this.dataList.add(dataListItem);
    return this;
  }

   /**
   * 
   * @return dataList
  **/
  @javax.annotation.Nullable
  public List<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner> getDataList() {
    return dataList;
  }


  public void setDataList(List<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner> dataList) {
    this.dataList = dataList;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseData pageInfo(StarDemandOmGetChallengeItemsDataV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public StarDemandOmGetChallengeItemsDataV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(StarDemandOmGetChallengeItemsDataV2ResponseDataPageInfo pageInfo) {
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
    StarDemandOmGetChallengeItemsDataV2ResponseData starDemandOmGetChallengeItemsDataV2ResponseData = (StarDemandOmGetChallengeItemsDataV2ResponseData) o;
    return Objects.equals(this.dataList, starDemandOmGetChallengeItemsDataV2ResponseData.dataList) &&
        Objects.equals(this.pageInfo, starDemandOmGetChallengeItemsDataV2ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataList, pageInfo);
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
    sb.append("class StarDemandOmGetChallengeItemsDataV2ResponseData {\n");
    sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
    openapiFields.add("data_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeItemsDataV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeItemsDataV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeItemsDataV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeItemsDataV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeItemsDataV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeItemsDataV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeItemsDataV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeItemsDataV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeItemsDataV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeItemsDataV2ResponseData
  */
  public static StarDemandOmGetChallengeItemsDataV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeItemsDataV2ResponseData.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeItemsDataV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

