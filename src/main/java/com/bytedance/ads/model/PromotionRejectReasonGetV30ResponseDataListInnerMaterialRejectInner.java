/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform;
import com.bytedance.ads.model.PromotionRejectReasonGetV30DataListMaterialRejectType;
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
 * PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner {
  public static final String SERIALIZED_NAME_AUDIT_PLATFORM = "audit_platform";
  @SerializedName(SERIALIZED_NAME_AUDIT_PLATFORM)
  private PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform auditPlatform = null;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private String item = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private List<String> rejectReason = null;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private List<String> suggestion = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PromotionRejectReasonGetV30DataListMaterialRejectType type = null;

  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner() {
  }

  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner auditPlatform(PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform auditPlatform) {
    
    this.auditPlatform = auditPlatform;
    return this;
  }

   /**
   * Get auditPlatform
   * @return auditPlatform
  **/
  @javax.annotation.Nullable
  public PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform getAuditPlatform() {
    return auditPlatform;
  }


  public void setAuditPlatform(PromotionRejectReasonGetV30DataListMaterialRejectAuditPlatform auditPlatform) {
    this.auditPlatform = auditPlatform;
  }


  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner item(String item) {
    
    this.item = item;
    return this;
  }

   /**
   * 
   * @return item
  **/
  @javax.annotation.Nullable
  public String getItem() {
    return item;
  }


  public void setItem(String item) {
    this.item = item;
  }


  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner rejectReason(List<String> rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner addRejectReasonItem(String rejectReasonItem) {
    if (this.rejectReason == null) {
      this.rejectReason = new ArrayList<>();
    }
    this.rejectReason.add(rejectReasonItem);
    return this;
  }

   /**
   * 拒绝建议
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public List<String> getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(List<String> rejectReason) {
    this.rejectReason = rejectReason;
  }


  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner suggestion(List<String> suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner addSuggestionItem(String suggestionItem) {
    if (this.suggestion == null) {
      this.suggestion = new ArrayList<>();
    }
    this.suggestion.add(suggestionItem);
    return this;
  }

   /**
   * 审核建议
   * @return suggestion
  **/
  @javax.annotation.Nullable
  public List<String> getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(List<String> suggestion) {
    this.suggestion = suggestion;
  }


  public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner type(PromotionRejectReasonGetV30DataListMaterialRejectType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public PromotionRejectReasonGetV30DataListMaterialRejectType getType() {
    return type;
  }


  public void setType(PromotionRejectReasonGetV30DataListMaterialRejectType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner promotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner = (PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner) o;
    return Objects.equals(this.auditPlatform, promotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.auditPlatform) &&
        Objects.equals(this.item, promotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.item) &&
        Objects.equals(this.rejectReason, promotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.rejectReason) &&
        Objects.equals(this.suggestion, promotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.suggestion) &&
        Objects.equals(this.type, promotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditPlatform, item, rejectReason, suggestion, type);
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
    sb.append("class PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner {\n");
    sb.append("    auditPlatform: ").append(toIndentedString(auditPlatform)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("audit_platform");
    openapiFields.add("item");
    openapiFields.add("reject_reason");
    openapiFields.add("suggestion");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner>() {
           @Override
           public void write(JsonWriter out, PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner
  * @throws IOException if the JSON string is invalid with respect to PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner
  */
  public static PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner.class);
  }

 /**
  * Convert an instance of PromotionRejectReasonGetV30ResponseDataListInnerMaterialRejectInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

