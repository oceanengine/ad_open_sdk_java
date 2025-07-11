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
import com.bytedance.ads.model.QianchuanAdRecommendKeywordsGetV10ResponseDataListInner;
import com.bytedance.ads.model.QianchuanAdRecommendKeywordsGetV10ResponseDataPageInfo;
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
public class QianchuanAdRecommendKeywordsGetV10ResponseData {
  public static final String SERIALIZED_NAME_CACHE_ID = "cache_id";
  @SerializedName(SERIALIZED_NAME_CACHE_ID)
  private String cacheId = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<QianchuanAdRecommendKeywordsGetV10ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanAdRecommendKeywordsGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanAdRecommendKeywordsGetV10ResponseData() {
  }

  public QianchuanAdRecommendKeywordsGetV10ResponseData cacheId(String cacheId) {
    
    this.cacheId = cacheId;
    return this;
  }

   /**
   * 本次查询的唯一标识ID，有效期12h。 可用于后续请求，用以保证查询到数据的完整性。
   * @return cacheId
  **/
  @javax.annotation.Nullable
  public String getCacheId() {
    return cacheId;
  }


  public void setCacheId(String cacheId) {
    this.cacheId = cacheId;
  }


  public QianchuanAdRecommendKeywordsGetV10ResponseData _list(List<QianchuanAdRecommendKeywordsGetV10ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public QianchuanAdRecommendKeywordsGetV10ResponseData addListItem(QianchuanAdRecommendKeywordsGetV10ResponseDataListInner _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * 关键词列表
   * @return _list
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdRecommendKeywordsGetV10ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<QianchuanAdRecommendKeywordsGetV10ResponseDataListInner> _list) {
    this._list = _list;
  }


  public QianchuanAdRecommendKeywordsGetV10ResponseData pageInfo(QianchuanAdRecommendKeywordsGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdRecommendKeywordsGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanAdRecommendKeywordsGetV10ResponseDataPageInfo pageInfo) {
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
    QianchuanAdRecommendKeywordsGetV10ResponseData qianchuanAdRecommendKeywordsGetV10ResponseData = (QianchuanAdRecommendKeywordsGetV10ResponseData) o;
    return Objects.equals(this.cacheId, qianchuanAdRecommendKeywordsGetV10ResponseData.cacheId) &&
        Objects.equals(this._list, qianchuanAdRecommendKeywordsGetV10ResponseData._list) &&
        Objects.equals(this.pageInfo, qianchuanAdRecommendKeywordsGetV10ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheId, _list, pageInfo);
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
    sb.append("class QianchuanAdRecommendKeywordsGetV10ResponseData {\n");
    sb.append("    cacheId: ").append(toIndentedString(cacheId)).append("\n");
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
    openapiFields.add("cache_id");
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdRecommendKeywordsGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdRecommendKeywordsGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdRecommendKeywordsGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdRecommendKeywordsGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdRecommendKeywordsGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAdRecommendKeywordsGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdRecommendKeywordsGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdRecommendKeywordsGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdRecommendKeywordsGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdRecommendKeywordsGetV10ResponseData
  */
  public static QianchuanAdRecommendKeywordsGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdRecommendKeywordsGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAdRecommendKeywordsGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

