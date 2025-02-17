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
import com.bytedance.ads.model.QianchuanAdMaterialSuggestionV10ResponseDataListInnerAuditRecords;
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
 * QianchuanAdMaterialSuggestionV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QianchuanAdMaterialSuggestionV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIT_RECORDS = "audit_records";
  @SerializedName(SERIALIZED_NAME_AUDIT_RECORDS)
  private QianchuanAdMaterialSuggestionV10ResponseDataListInnerAuditRecords auditRecords = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public QianchuanAdMaterialSuggestionV10ResponseDataListInner() {
  }

  public QianchuanAdMaterialSuggestionV10ResponseDataListInner auditRecords(QianchuanAdMaterialSuggestionV10ResponseDataListInnerAuditRecords auditRecords) {
    
    this.auditRecords = auditRecords;
    return this;
  }

   /**
   * Get auditRecords
   * @return auditRecords
  **/
  @javax.annotation.Nullable
  public QianchuanAdMaterialSuggestionV10ResponseDataListInnerAuditRecords getAuditRecords() {
    return auditRecords;
  }


  public void setAuditRecords(QianchuanAdMaterialSuggestionV10ResponseDataListInnerAuditRecords auditRecords) {
    this.auditRecords = auditRecords;
  }


  public QianchuanAdMaterialSuggestionV10ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdMaterialSuggestionV10ResponseDataListInner qianchuanAdMaterialSuggestionV10ResponseDataListInner = (QianchuanAdMaterialSuggestionV10ResponseDataListInner) o;
    return Objects.equals(this.auditRecords, qianchuanAdMaterialSuggestionV10ResponseDataListInner.auditRecords) &&
        Objects.equals(this.materialId, qianchuanAdMaterialSuggestionV10ResponseDataListInner.materialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditRecords, materialId);
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
    sb.append("class QianchuanAdMaterialSuggestionV10ResponseDataListInner {\n");
    sb.append("    auditRecords: ").append(toIndentedString(auditRecords)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("audit_records");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdMaterialSuggestionV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdMaterialSuggestionV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdMaterialSuggestionV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdMaterialSuggestionV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdMaterialSuggestionV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdMaterialSuggestionV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdMaterialSuggestionV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdMaterialSuggestionV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdMaterialSuggestionV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdMaterialSuggestionV10ResponseDataListInner
  */
  public static QianchuanAdMaterialSuggestionV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdMaterialSuggestionV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdMaterialSuggestionV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

