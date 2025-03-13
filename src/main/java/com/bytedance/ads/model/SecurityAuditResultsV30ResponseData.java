/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SecurityAuditResultsV30DataStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class SecurityAuditResultsV30ResponseData {
  public static final String SERIALIZED_NAME_REASON_TEXT = "reason_text";
  @SerializedName(SERIALIZED_NAME_REASON_TEXT)
  private String reasonText = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SecurityAuditResultsV30DataStatus status = null;

  public SecurityAuditResultsV30ResponseData() {
  }

  public SecurityAuditResultsV30ResponseData reasonText(String reasonText) {
    
    this.reasonText = reasonText;
    return this;
  }

   /**
   * 审核建议文案
   * @return reasonText
  **/
  @javax.annotation.Nullable
  public String getReasonText() {
    return reasonText;
  }


  public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
  }


  public SecurityAuditResultsV30ResponseData status(SecurityAuditResultsV30DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public SecurityAuditResultsV30DataStatus getStatus() {
    return status;
  }


  public void setStatus(SecurityAuditResultsV30DataStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityAuditResultsV30ResponseData securityAuditResultsV30ResponseData = (SecurityAuditResultsV30ResponseData) o;
    return Objects.equals(this.reasonText, securityAuditResultsV30ResponseData.reasonText) &&
        Objects.equals(this.status, securityAuditResultsV30ResponseData.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonText, status);
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
    sb.append("class SecurityAuditResultsV30ResponseData {\n");
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("reason_text");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityAuditResultsV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityAuditResultsV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityAuditResultsV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityAuditResultsV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityAuditResultsV30ResponseData>() {
           @Override
           public void write(JsonWriter out, SecurityAuditResultsV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityAuditResultsV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityAuditResultsV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityAuditResultsV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to SecurityAuditResultsV30ResponseData
  */
  public static SecurityAuditResultsV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityAuditResultsV30ResponseData.class);
  }

 /**
  * Convert an instance of SecurityAuditResultsV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

