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
import com.bytedance.ads.model.QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner;
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
 * QianchuanAdRejectReasonV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QianchuanAdRejectReasonV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AUDIT_RECORDS = "audit_records";
  @SerializedName(SERIALIZED_NAME_AUDIT_RECORDS)
  private List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> auditRecords = null;

  public QianchuanAdRejectReasonV10ResponseDataListInner() {
  }

  public QianchuanAdRejectReasonV10ResponseDataListInner adId(Long adId) {
    
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


  public QianchuanAdRejectReasonV10ResponseDataListInner auditRecords(List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> auditRecords) {
    
    this.auditRecords = auditRecords;
    return this;
  }

  public QianchuanAdRejectReasonV10ResponseDataListInner addAuditRecordsItem(QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner auditRecordsItem) {
    if (this.auditRecords == null) {
      this.auditRecords = new ArrayList<>();
    }
    this.auditRecords.add(auditRecordsItem);
    return this;
  }

   /**
   * 
   * @return auditRecords
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> getAuditRecords() {
    return auditRecords;
  }


  public void setAuditRecords(List<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> auditRecords) {
    this.auditRecords = auditRecords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdRejectReasonV10ResponseDataListInner qianchuanAdRejectReasonV10ResponseDataListInner = (QianchuanAdRejectReasonV10ResponseDataListInner) o;
    return Objects.equals(this.adId, qianchuanAdRejectReasonV10ResponseDataListInner.adId) &&
        Objects.equals(this.auditRecords, qianchuanAdRejectReasonV10ResponseDataListInner.auditRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, auditRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdRejectReasonV10ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    auditRecords: ").append(toIndentedString(auditRecords)).append("\n");
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
    openapiFields.add("audit_records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdRejectReasonV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdRejectReasonV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdRejectReasonV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdRejectReasonV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdRejectReasonV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdRejectReasonV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdRejectReasonV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdRejectReasonV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdRejectReasonV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdRejectReasonV10ResponseDataListInner
  */
  public static QianchuanAdRejectReasonV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdRejectReasonV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdRejectReasonV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

