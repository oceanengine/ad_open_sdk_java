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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo {
  public static final String SERIALIZED_NAME_IS_AUDIT = "is_audit";
  @SerializedName(SERIALIZED_NAME_IS_AUDIT)
  private Boolean isAudit = null;

  public static final String SERIALIZED_NAME_IS_REACHED_RISE_FANS_COUNT = "is_reached_rise_fans_count";
  @SerializedName(SERIALIZED_NAME_IS_REACHED_RISE_FANS_COUNT)
  private Boolean isReachedRiseFansCount = null;

  public static final String SERIALIZED_NAME_IS_REAL_NAME_CERT = "is_real_name_cert";
  @SerializedName(SERIALIZED_NAME_IS_REAL_NAME_CERT)
  private Boolean isRealNameCert = null;

  public static final String SERIALIZED_NAME_IS_SERIOUS_VIOLATION = "is_serious_violation";
  @SerializedName(SERIALIZED_NAME_IS_SERIOUS_VIOLATION)
  private Boolean isSeriousViolation = null;

  public ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo() {
  }

  public ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo isAudit(Boolean isAudit) {
    
    this.isAudit = isAudit;
    return this;
  }

   /**
   * 是否已成年
   * @return isAudit
  **/
  @javax.annotation.Nullable
  public Boolean getIsAudit() {
    return isAudit;
  }


  public void setIsAudit(Boolean isAudit) {
    this.isAudit = isAudit;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo isReachedRiseFansCount(Boolean isReachedRiseFansCount) {
    
    this.isReachedRiseFansCount = isReachedRiseFansCount;
    return this;
  }

   /**
   * 有效涨粉数是否达到要求
   * @return isReachedRiseFansCount
  **/
  @javax.annotation.Nullable
  public Boolean getIsReachedRiseFansCount() {
    return isReachedRiseFansCount;
  }


  public void setIsReachedRiseFansCount(Boolean isReachedRiseFansCount) {
    this.isReachedRiseFansCount = isReachedRiseFansCount;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo isRealNameCert(Boolean isRealNameCert) {
    
    this.isRealNameCert = isRealNameCert;
    return this;
  }

   /**
   * 是否已实名
   * @return isRealNameCert
  **/
  @javax.annotation.Nullable
  public Boolean getIsRealNameCert() {
    return isRealNameCert;
  }


  public void setIsRealNameCert(Boolean isRealNameCert) {
    this.isRealNameCert = isRealNameCert;
  }


  public ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo isSeriousViolation(Boolean isSeriousViolation) {
    
    this.isSeriousViolation = isSeriousViolation;
    return this;
  }

   /**
   * 是否严重违规
   * @return isSeriousViolation
  **/
  @javax.annotation.Nullable
  public Boolean getIsSeriousViolation() {
    return isSeriousViolation;
  }


  public void setIsSeriousViolation(Boolean isSeriousViolation) {
    this.isSeriousViolation = isSeriousViolation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo toolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo = (ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo) o;
    return Objects.equals(this.isAudit, toolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo.isAudit) &&
        Objects.equals(this.isReachedRiseFansCount, toolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo.isReachedRiseFansCount) &&
        Objects.equals(this.isRealNameCert, toolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo.isRealNameCert) &&
        Objects.equals(this.isSeriousViolation, toolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo.isSeriousViolation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAudit, isReachedRiseFansCount, isRealNameCert, isSeriousViolation);
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
    sb.append("class ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo {\n");
    sb.append("    isAudit: ").append(toIndentedString(isAudit)).append("\n");
    sb.append("    isReachedRiseFansCount: ").append(toIndentedString(isReachedRiseFansCount)).append("\n");
    sb.append("    isRealNameCert: ").append(toIndentedString(isRealNameCert)).append("\n");
    sb.append("    isSeriousViolation: ").append(toIndentedString(isSeriousViolation)).append("\n");
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
    openapiFields.add("is_audit");
    openapiFields.add("is_reached_rise_fans_count");
    openapiFields.add("is_real_name_cert");
    openapiFields.add("is_serious_violation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo
  */
  public static ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo.class);
  }

 /**
  * Convert an instance of ToolsAwemeAuthListV2ResponseDataListInnerAuthThresholdInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

