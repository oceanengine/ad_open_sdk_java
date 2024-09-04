/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30ResponseDataCursorInfo;
import com.bytedance.ads.model.PromotionListV30ResponseDataListInner;
import com.bytedance.ads.model.PromotionListV30ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class PromotionListV30ResponseData {
  public static final String SERIALIZED_NAME_CURSOR_INFO = "cursor_info";
  @SerializedName(SERIALIZED_NAME_CURSOR_INFO)
  private PromotionListV30ResponseDataCursorInfo cursorInfo = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<PromotionListV30ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private PromotionListV30ResponseDataPageInfo pageInfo = null;

  public PromotionListV30ResponseData() {
  }

  public PromotionListV30ResponseData cursorInfo(PromotionListV30ResponseDataCursorInfo cursorInfo) {
    
    this.cursorInfo = cursorInfo;
    return this;
  }

   /**
   * Get cursorInfo
   * @return cursorInfo
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataCursorInfo getCursorInfo() {
    return cursorInfo;
  }


  public void setCursorInfo(PromotionListV30ResponseDataCursorInfo cursorInfo) {
    this.cursorInfo = cursorInfo;
  }


  public PromotionListV30ResponseData _list(List<PromotionListV30ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public PromotionListV30ResponseData addListItem(PromotionListV30ResponseDataListInner _listItem) {
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
  @javax.annotation.Nullable
  public List<PromotionListV30ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<PromotionListV30ResponseDataListInner> _list) {
    this._list = _list;
  }


  public PromotionListV30ResponseData pageInfo(PromotionListV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public PromotionListV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(PromotionListV30ResponseDataPageInfo pageInfo) {
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
    PromotionListV30ResponseData promotionListV30ResponseData = (PromotionListV30ResponseData) o;
    return Objects.equals(this.cursorInfo, promotionListV30ResponseData.cursorInfo) &&
        Objects.equals(this._list, promotionListV30ResponseData._list) &&
        Objects.equals(this.pageInfo, promotionListV30ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursorInfo, _list, pageInfo);
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
    sb.append("class PromotionListV30ResponseData {\n");
    sb.append("    cursorInfo: ").append(toIndentedString(cursorInfo)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("cursor_info");
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseData
  */
  public static PromotionListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseData.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

