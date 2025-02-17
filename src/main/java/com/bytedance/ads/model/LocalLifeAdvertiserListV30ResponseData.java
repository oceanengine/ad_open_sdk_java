/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalLifeAdvertiserListV30ResponseDataAdvListInner;
import com.bytedance.ads.model.LocalLifeAdvertiserListV30ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class LocalLifeAdvertiserListV30ResponseData {
  public static final String SERIALIZED_NAME_ADV_LIST = "adv_list";
  @SerializedName(SERIALIZED_NAME_ADV_LIST)
  private List<LocalLifeAdvertiserListV30ResponseDataAdvListInner> advList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private LocalLifeAdvertiserListV30ResponseDataPageInfo pageInfo = null;

  public LocalLifeAdvertiserListV30ResponseData() {
  }

  public LocalLifeAdvertiserListV30ResponseData advList(List<LocalLifeAdvertiserListV30ResponseDataAdvListInner> advList) {
    
    this.advList = advList;
    return this;
  }

  public LocalLifeAdvertiserListV30ResponseData addAdvListItem(LocalLifeAdvertiserListV30ResponseDataAdvListInner advListItem) {
    if (this.advList == null) {
      this.advList = new ArrayList<>();
    }
    this.advList.add(advListItem);
    return this;
  }

   /**
   * 
   * @return advList
  **/
  @javax.annotation.Nullable
  public List<LocalLifeAdvertiserListV30ResponseDataAdvListInner> getAdvList() {
    return advList;
  }


  public void setAdvList(List<LocalLifeAdvertiserListV30ResponseDataAdvListInner> advList) {
    this.advList = advList;
  }


  public LocalLifeAdvertiserListV30ResponseData pageInfo(LocalLifeAdvertiserListV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public LocalLifeAdvertiserListV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(LocalLifeAdvertiserListV30ResponseDataPageInfo pageInfo) {
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
    LocalLifeAdvertiserListV30ResponseData localLifeAdvertiserListV30ResponseData = (LocalLifeAdvertiserListV30ResponseData) o;
    return Objects.equals(this.advList, localLifeAdvertiserListV30ResponseData.advList) &&
        Objects.equals(this.pageInfo, localLifeAdvertiserListV30ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advList, pageInfo);
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
    sb.append("class LocalLifeAdvertiserListV30ResponseData {\n");
    sb.append("    advList: ").append(toIndentedString(advList)).append("\n");
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
    openapiFields.add("adv_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalLifeAdvertiserListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalLifeAdvertiserListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalLifeAdvertiserListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalLifeAdvertiserListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalLifeAdvertiserListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, LocalLifeAdvertiserListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalLifeAdvertiserListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalLifeAdvertiserListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalLifeAdvertiserListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to LocalLifeAdvertiserListV30ResponseData
  */
  public static LocalLifeAdvertiserListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalLifeAdvertiserListV30ResponseData.class);
  }

 /**
  * Convert an instance of LocalLifeAdvertiserListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

