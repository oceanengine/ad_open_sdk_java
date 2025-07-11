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
import com.bytedance.ads.model.ToolsPreAuditGetV2DataListMaterialType;
import com.bytedance.ads.model.ToolsPreAuditGetV2DataListStatus;
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
 * ToolsPreAuditGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPreAuditGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private ToolsPreAuditGetV2DataListMaterialType materialType = null;

  public static final String SERIALIZED_NAME_PRE_AUDIT_ID = "pre_audit_id";
  @SerializedName(SERIALIZED_NAME_PRE_AUDIT_ID)
  private Long preAuditId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsPreAuditGetV2DataListStatus status = null;

  public ToolsPreAuditGetV2ResponseDataListInner() {
  }

  public ToolsPreAuditGetV2ResponseDataListInner content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 物料内容
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public ToolsPreAuditGetV2ResponseDataListInner materialType(ToolsPreAuditGetV2DataListMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public ToolsPreAuditGetV2DataListMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(ToolsPreAuditGetV2DataListMaterialType materialType) {
    this.materialType = materialType;
  }


  public ToolsPreAuditGetV2ResponseDataListInner preAuditId(Long preAuditId) {
    
    this.preAuditId = preAuditId;
    return this;
  }

   /**
   * 预审物料 - 文本物料：用户上传 - 图片物料：用户上传图片链接或图片ID - 视频物料：用户上传的视频云ID
   * @return preAuditId
  **/
  @javax.annotation.Nullable
  public Long getPreAuditId() {
    return preAuditId;
  }


  public void setPreAuditId(Long preAuditId) {
    this.preAuditId = preAuditId;
  }


  public ToolsPreAuditGetV2ResponseDataListInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 拒绝理由
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public ToolsPreAuditGetV2ResponseDataListInner status(ToolsPreAuditGetV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsPreAuditGetV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsPreAuditGetV2DataListStatus status) {
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
    ToolsPreAuditGetV2ResponseDataListInner toolsPreAuditGetV2ResponseDataListInner = (ToolsPreAuditGetV2ResponseDataListInner) o;
    return Objects.equals(this.content, toolsPreAuditGetV2ResponseDataListInner.content) &&
        Objects.equals(this.materialType, toolsPreAuditGetV2ResponseDataListInner.materialType) &&
        Objects.equals(this.preAuditId, toolsPreAuditGetV2ResponseDataListInner.preAuditId) &&
        Objects.equals(this.rejectReason, toolsPreAuditGetV2ResponseDataListInner.rejectReason) &&
        Objects.equals(this.status, toolsPreAuditGetV2ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, materialType, preAuditId, rejectReason, status);
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
    sb.append("class ToolsPreAuditGetV2ResponseDataListInner {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    preAuditId: ").append(toIndentedString(preAuditId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("material_type");
    openapiFields.add("pre_audit_id");
    openapiFields.add("reject_reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPreAuditGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPreAuditGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPreAuditGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPreAuditGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPreAuditGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPreAuditGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPreAuditGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPreAuditGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPreAuditGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPreAuditGetV2ResponseDataListInner
  */
  public static ToolsPreAuditGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPreAuditGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsPreAuditGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

