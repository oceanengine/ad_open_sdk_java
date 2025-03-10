/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataPageInfo;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData {
  public static final String SERIALIZED_NAME_AD_RAISE_VERSION = "ad_raise_version";
  @SerializedName(SERIALIZED_NAME_AD_RAISE_VERSION)
  private Long adRaiseVersion = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_RAISE_RESULTS = "raise_results";
  @SerializedName(SERIALIZED_NAME_RAISE_RESULTS)
  private List<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner> raiseResults = null;

  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData() {
  }

  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData adRaiseVersion(Long adRaiseVersion) {
    
    this.adRaiseVersion = adRaiseVersion;
    return this;
  }

   /**
   * 起量版本号
   * @return adRaiseVersion
  **/
  @javax.annotation.Nullable
  public Long getAdRaiseVersion() {
    return adRaiseVersion;
  }


  public void setAdRaiseVersion(Long adRaiseVersion) {
    this.adRaiseVersion = adRaiseVersion;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData pageInfo(QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData raiseResults(List<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner> raiseResults) {
    
    this.raiseResults = raiseResults;
    return this;
  }

  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData addRaiseResultsItem(QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner raiseResultsItem) {
    if (this.raiseResults == null) {
      this.raiseResults = new ArrayList<>();
    }
    this.raiseResults.add(raiseResultsItem);
    return this;
  }

   /**
   * json返回值
   * @return raiseResults
  **/
  @javax.annotation.Nullable
  public List<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner> getRaiseResults() {
    return raiseResults;
  }


  public void setRaiseResults(List<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner> raiseResults) {
    this.raiseResults = raiseResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData qianchuanToolsSmartBoostAdBoostReportGetV10ResponseData = (QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData) o;
    return Objects.equals(this.adRaiseVersion, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseData.adRaiseVersion) &&
        Objects.equals(this.pageInfo, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseData.pageInfo) &&
        Objects.equals(this.raiseResults, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseData.raiseResults);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adRaiseVersion, pageInfo, raiseResults);
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
    sb.append("class QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData {\n");
    sb.append("    adRaiseVersion: ").append(toIndentedString(adRaiseVersion)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    raiseResults: ").append(toIndentedString(raiseResults)).append("\n");
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
    openapiFields.add("ad_raise_version");
    openapiFields.add("page_info");
    openapiFields.add("raise_results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData
  */
  public static QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanToolsSmartBoostAdBoostReportGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

