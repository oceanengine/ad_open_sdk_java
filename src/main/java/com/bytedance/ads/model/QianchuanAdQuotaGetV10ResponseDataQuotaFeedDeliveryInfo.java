/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * 当前所在投放阶段信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo {
  public static final String SERIALIZED_NAME_ADLAB_NUM = "adlab_num";
  @SerializedName(SERIALIZED_NAME_ADLAB_NUM)
  private Long adlabNum = null;

  public static final String SERIALIZED_NAME_NO_ADLAB_NUM = "no_adlab_num";
  @SerializedName(SERIALIZED_NAME_NO_ADLAB_NUM)
  private Long noAdlabNum = null;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Long totalNum = null;

  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo() {
  }

  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo adlabNum(Long adlabNum) {
    
    this.adlabNum = adlabNum;
    return this;
  }

   /**
   * 托管在投计划数
   * @return adlabNum
  **/
  @javax.annotation.Nullable
  public Long getAdlabNum() {
    return adlabNum;
  }


  public void setAdlabNum(Long adlabNum) {
    this.adlabNum = adlabNum;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo noAdlabNum(Long noAdlabNum) {
    
    this.noAdlabNum = noAdlabNum;
    return this;
  }

   /**
   * 非托管在投计划数
   * @return noAdlabNum
  **/
  @javax.annotation.Nullable
  public Long getNoAdlabNum() {
    return noAdlabNum;
  }


  public void setNoAdlabNum(Long noAdlabNum) {
    this.noAdlabNum = noAdlabNum;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo totalNum(Long totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 总在投计划数
   * @return totalNum
  **/
  @javax.annotation.Nullable
  public Long getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo qianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo = (QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo) o;
    return Objects.equals(this.adlabNum, qianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo.adlabNum) &&
        Objects.equals(this.noAdlabNum, qianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo.noAdlabNum) &&
        Objects.equals(this.totalNum, qianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo.totalNum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adlabNum, noAdlabNum, totalNum);
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
    sb.append("class QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo {\n");
    sb.append("    adlabNum: ").append(toIndentedString(adlabNum)).append("\n");
    sb.append("    noAdlabNum: ").append(toIndentedString(noAdlabNum)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
    openapiFields.add("adlab_num");
    openapiFields.add("no_adlab_num");
    openapiFields.add("total_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo
  */
  public static QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo.class);
  }

 /**
  * Convert an instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

