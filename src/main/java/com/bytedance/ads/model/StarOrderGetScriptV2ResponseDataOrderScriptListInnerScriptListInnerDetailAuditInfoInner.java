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
 * StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner {
  public static final String SERIALIZED_NAME_AUDIT_BAN_REASON = "audit_ban_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_BAN_REASON)
  private String auditBanReason = null;

  public static final String SERIALIZED_NAME_AUDIT_SOURCE = "audit_source";
  @SerializedName(SERIALIZED_NAME_AUDIT_SOURCE)
  private Long auditSource = null;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private Long auditStatus = null;

  public static final String SERIALIZED_NAME_AUDIT_TIME = "audit_time";
  @SerializedName(SERIALIZED_NAME_AUDIT_TIME)
  private Long auditTime = null;

  public StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner() {
  }

  public StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner auditBanReason(String auditBanReason) {
    
    this.auditBanReason = auditBanReason;
    return this;
  }

   /**
   * 审核拒绝原因
   * @return auditBanReason
  **/
  @javax.annotation.Nullable
  public String getAuditBanReason() {
    return auditBanReason;
  }


  public void setAuditBanReason(String auditBanReason) {
    this.auditBanReason = auditBanReason;
  }


  public StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner auditSource(Long auditSource) {
    
    this.auditSource = auditSource;
    return this;
  }

   /**
   * 审核渠道 1 &#x3D; 抖音内容审核 7 &#x3D; 广告素材审核
   * @return auditSource
  **/
  @javax.annotation.Nullable
  public Long getAuditSource() {
    return auditSource;
  }


  public void setAuditSource(Long auditSource) {
    this.auditSource = auditSource;
  }


  public StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner auditStatus(Long auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * 审核状态 0 &#x3D; 审核不通过 99 &#x3D; 审核中 1 &#x3D; 审核通过 3 &#x3D; 作者删除 4 &#x3D; 跳过审核
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public Long getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(Long auditStatus) {
    this.auditStatus = auditStatus;
  }


  public StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner auditTime(Long auditTime) {
    
    this.auditTime = auditTime;
    return this;
  }

   /**
   * 审核时间  unix timestamp
   * @return auditTime
  **/
  @javax.annotation.Nullable
  public Long getAuditTime() {
    return auditTime;
  }


  public void setAuditTime(Long auditTime) {
    this.auditTime = auditTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner starOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner = (StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner) o;
    return Objects.equals(this.auditBanReason, starOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner.auditBanReason) &&
        Objects.equals(this.auditSource, starOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner.auditSource) &&
        Objects.equals(this.auditStatus, starOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner.auditStatus) &&
        Objects.equals(this.auditTime, starOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner.auditTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditBanReason, auditSource, auditStatus, auditTime);
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
    sb.append("class StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner {\n");
    sb.append("    auditBanReason: ").append(toIndentedString(auditBanReason)).append("\n");
    sb.append("    auditSource: ").append(toIndentedString(auditSource)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
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
    openapiFields.add("audit_ban_reason");
    openapiFields.add("audit_source");
    openapiFields.add("audit_status");
    openapiFields.add("audit_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner>() {
           @Override
           public void write(JsonWriter out, StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner
  */
  public static StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner.class);
  }

 /**
  * Convert an instance of StarOrderGetScriptV2ResponseDataOrderScriptListInnerScriptListInnerDetailAuditInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

