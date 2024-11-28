/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord {
  public static final String SERIALIZED_NAME_DETAIL_DESC_LIST = "detail_desc_list";
  @SerializedName(SERIALIZED_NAME_DETAIL_DESC_LIST)
  private List<String> detailDescList = null;

  public static final String SERIALIZED_NAME_STATUS_ATTACH_DESP = "status_attach_desp";
  @SerializedName(SERIALIZED_NAME_STATUS_ATTACH_DESP)
  private String statusAttachDesp = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord detailDescList(List<String> detailDescList) {
    
    this.detailDescList = detailDescList;
    return this;
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord addDetailDescListItem(String detailDescListItem) {
    if (this.detailDescList == null) {
      this.detailDescList = new ArrayList<>();
    }
    this.detailDescList.add(detailDescListItem);
    return this;
  }

   /**
   * 
   * @return detailDescList
  **/
  @javax.annotation.Nullable
  public List<String> getDetailDescList() {
    return detailDescList;
  }


  public void setDetailDescList(List<String> detailDescList) {
    this.detailDescList = detailDescList;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord statusAttachDesp(String statusAttachDesp) {
    
    this.statusAttachDesp = statusAttachDesp;
    return this;
  }

   /**
   * 
   * @return statusAttachDesp
  **/
  @javax.annotation.Nullable
  public String getStatusAttachDesp() {
    return statusAttachDesp;
  }


  public void setStatusAttachDesp(String statusAttachDesp) {
    this.statusAttachDesp = statusAttachDesp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord qianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord = (QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord) o;
    return Objects.equals(this.detailDescList, qianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord.detailDescList) &&
        Objects.equals(this.statusAttachDesp, qianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord.statusAttachDesp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailDescList, statusAttachDesp);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord {\n");
    sb.append("    detailDescList: ").append(toIndentedString(detailDescList)).append("\n");
    sb.append("    statusAttachDesp: ").append(toIndentedString(statusAttachDesp)).append("\n");
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
    openapiFields.add("detail_desc_list");
    openapiFields.add("status_attach_desp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

