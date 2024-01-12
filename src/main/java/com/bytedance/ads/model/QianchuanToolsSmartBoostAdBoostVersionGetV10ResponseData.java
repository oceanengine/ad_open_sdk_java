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
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-12T18:56:42.173434436+08:00[PRC]")
public class QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData {
  public static final String SERIALIZED_NAME_RAISE_LIST_INFOS = "raise_list_infos";
  @SerializedName(SERIALIZED_NAME_RAISE_LIST_INFOS)
  private List<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner> raiseListInfos = null;

  public static final String SERIALIZED_NAME_TOTAL_CNT = "total_cnt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CNT)
  private Integer totalCnt = null;

  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData() {
  }

  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData raiseListInfos(List<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner> raiseListInfos) {
    
    this.raiseListInfos = raiseListInfos;
    return this;
  }

  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData addRaiseListInfosItem(QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner raiseListInfosItem) {
    if (this.raiseListInfos == null) {
      this.raiseListInfos = new ArrayList<>();
    }
    this.raiseListInfos.add(raiseListInfosItem);
    return this;
  }

   /**
   * json返回值
   * @return raiseListInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner> getRaiseListInfos() {
    return raiseListInfos;
  }


  public void setRaiseListInfos(List<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseDataRaiseListInfosInner> raiseListInfos) {
    this.raiseListInfos = raiseListInfos;
  }


  public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData totalCnt(Integer totalCnt) {
    
    this.totalCnt = totalCnt;
    return this;
  }

   /**
   * 总数
   * @return totalCnt
  **/
  @javax.annotation.Nullable
  public Integer getTotalCnt() {
    return totalCnt;
  }


  public void setTotalCnt(Integer totalCnt) {
    this.totalCnt = totalCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData qianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData = (QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData) o;
    return Objects.equals(this.raiseListInfos, qianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData.raiseListInfos) &&
        Objects.equals(this.totalCnt, qianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData.totalCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(raiseListInfos, totalCnt);
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
    sb.append("class QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData {\n");
    sb.append("    raiseListInfos: ").append(toIndentedString(raiseListInfos)).append("\n");
    sb.append("    totalCnt: ").append(toIndentedString(totalCnt)).append("\n");
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
    openapiFields.add("raise_list_infos");
    openapiFields.add("total_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData
  */
  public static QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanToolsSmartBoostAdBoostVersionGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

