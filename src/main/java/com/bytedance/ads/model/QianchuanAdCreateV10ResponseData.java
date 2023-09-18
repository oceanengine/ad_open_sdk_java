/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdCreateV10ResponseDataNoticeInfosInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-18T11:13:59.161423804+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10ResponseData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_NOTICE_INFOS = "notice_infos";
  @SerializedName(SERIALIZED_NAME_NOTICE_INFOS)
  private List<QianchuanAdCreateV10ResponseDataNoticeInfosInner> noticeInfos = null;

  public QianchuanAdCreateV10ResponseData() {
  }

  public QianchuanAdCreateV10ResponseData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAdCreateV10ResponseData noticeInfos(List<QianchuanAdCreateV10ResponseDataNoticeInfosInner> noticeInfos) {
    
    this.noticeInfos = noticeInfos;
    return this;
  }

  public QianchuanAdCreateV10ResponseData addNoticeInfosItem(QianchuanAdCreateV10ResponseDataNoticeInfosInner noticeInfosItem) {
    if (this.noticeInfos == null) {
      this.noticeInfos = new ArrayList<>();
    }
    this.noticeInfos.add(noticeInfosItem);
    return this;
  }

   /**
   * 
   * @return noticeInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10ResponseDataNoticeInfosInner> getNoticeInfos() {
    return noticeInfos;
  }


  public void setNoticeInfos(List<QianchuanAdCreateV10ResponseDataNoticeInfosInner> noticeInfos) {
    this.noticeInfos = noticeInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10ResponseData qianchuanAdCreateV10ResponseData = (QianchuanAdCreateV10ResponseData) o;
    return Objects.equals(this.adId, qianchuanAdCreateV10ResponseData.adId) &&
        Objects.equals(this.noticeInfos, qianchuanAdCreateV10ResponseData.noticeInfos);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, noticeInfos);
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
    sb.append("class QianchuanAdCreateV10ResponseData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    noticeInfos: ").append(toIndentedString(noticeInfos)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("notice_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10ResponseData
  */
  public static QianchuanAdCreateV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
