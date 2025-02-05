/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
 * ToolsClueRefundInfoQueryV2ResponseDataInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ToolsClueRefundInfoQueryV2ResponseDataInfoInner {
  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private Long clueId = null;

  public static final String SERIALIZED_NAME_HAS_QUALIFICATION = "has_qualification";
  @SerializedName(SERIALIZED_NAME_HAS_QUALIFICATION)
  private Integer hasQualification = null;

  public static final String SERIALIZED_NAME_IS_FINISHED = "is_finished";
  @SerializedName(SERIALIZED_NAME_IS_FINISHED)
  private Integer isFinished = null;

  public static final String SERIALIZED_NAME_OVERDUE_TIMESTAMPS = "overdue_timestamps";
  @SerializedName(SERIALIZED_NAME_OVERDUE_TIMESTAMPS)
  private List<Long> overdueTimestamps = null;

  public static final String SERIALIZED_NAME_TOTAL_CALL_CNT = "total_call_cnt";
  @SerializedName(SERIALIZED_NAME_TOTAL_CALL_CNT)
  private Integer totalCallCnt = null;

  public static final String SERIALIZED_NAME_VALID_CALL_CNT = "valid_call_cnt";
  @SerializedName(SERIALIZED_NAME_VALID_CALL_CNT)
  private Integer validCallCnt = null;

  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner() {
  }

  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner clueId(Long clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 线索ID
   * @return clueId
  **/
  @javax.annotation.Nullable
  public Long getClueId() {
    return clueId;
  }


  public void setClueId(Long clueId) {
    this.clueId = clueId;
  }


  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner hasQualification(Integer hasQualification) {
    
    this.hasQualification = hasQualification;
    return this;
  }

   /**
   * 线索是否参与返款标识
   * @return hasQualification
  **/
  @javax.annotation.Nullable
  public Integer getHasQualification() {
    return hasQualification;
  }


  public void setHasQualification(Integer hasQualification) {
    this.hasQualification = hasQualification;
  }


  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner isFinished(Integer isFinished) {
    
    this.isFinished = isFinished;
    return this;
  }

   /**
   * 返款进度是否结束标识
   * @return isFinished
  **/
  @javax.annotation.Nullable
  public Integer getIsFinished() {
    return isFinished;
  }


  public void setIsFinished(Integer isFinished) {
    this.isFinished = isFinished;
  }


  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner overdueTimestamps(List<Long> overdueTimestamps) {
    
    this.overdueTimestamps = overdueTimestamps;
    return this;
  }

  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner addOverdueTimestampsItem(Long overdueTimestampsItem) {
    if (this.overdueTimestamps == null) {
      this.overdueTimestamps = new ArrayList<>();
    }
    this.overdueTimestamps.add(overdueTimestampsItem);
    return this;
  }

   /**
   * 返款小阶段过期时间，单位为毫秒级unix timestamp。
   * @return overdueTimestamps
  **/
  @javax.annotation.Nullable
  public List<Long> getOverdueTimestamps() {
    return overdueTimestamps;
  }


  public void setOverdueTimestamps(List<Long> overdueTimestamps) {
    this.overdueTimestamps = overdueTimestamps;
  }


  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner totalCallCnt(Integer totalCallCnt) {
    
    this.totalCallCnt = totalCallCnt;
    return this;
  }

   /**
   * 返款规定合规呼叫总次数
   * @return totalCallCnt
  **/
  @javax.annotation.Nullable
  public Integer getTotalCallCnt() {
    return totalCallCnt;
  }


  public void setTotalCallCnt(Integer totalCallCnt) {
    this.totalCallCnt = totalCallCnt;
  }


  public ToolsClueRefundInfoQueryV2ResponseDataInfoInner validCallCnt(Integer validCallCnt) {
    
    this.validCallCnt = validCallCnt;
    return this;
  }

   /**
   * 符合返款要求呼叫次数
   * @return validCallCnt
  **/
  @javax.annotation.Nullable
  public Integer getValidCallCnt() {
    return validCallCnt;
  }


  public void setValidCallCnt(Integer validCallCnt) {
    this.validCallCnt = validCallCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundInfoQueryV2ResponseDataInfoInner toolsClueRefundInfoQueryV2ResponseDataInfoInner = (ToolsClueRefundInfoQueryV2ResponseDataInfoInner) o;
    return Objects.equals(this.clueId, toolsClueRefundInfoQueryV2ResponseDataInfoInner.clueId) &&
        Objects.equals(this.hasQualification, toolsClueRefundInfoQueryV2ResponseDataInfoInner.hasQualification) &&
        Objects.equals(this.isFinished, toolsClueRefundInfoQueryV2ResponseDataInfoInner.isFinished) &&
        Objects.equals(this.overdueTimestamps, toolsClueRefundInfoQueryV2ResponseDataInfoInner.overdueTimestamps) &&
        Objects.equals(this.totalCallCnt, toolsClueRefundInfoQueryV2ResponseDataInfoInner.totalCallCnt) &&
        Objects.equals(this.validCallCnt, toolsClueRefundInfoQueryV2ResponseDataInfoInner.validCallCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clueId, hasQualification, isFinished, overdueTimestamps, totalCallCnt, validCallCnt);
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
    sb.append("class ToolsClueRefundInfoQueryV2ResponseDataInfoInner {\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    hasQualification: ").append(toIndentedString(hasQualification)).append("\n");
    sb.append("    isFinished: ").append(toIndentedString(isFinished)).append("\n");
    sb.append("    overdueTimestamps: ").append(toIndentedString(overdueTimestamps)).append("\n");
    sb.append("    totalCallCnt: ").append(toIndentedString(totalCallCnt)).append("\n");
    sb.append("    validCallCnt: ").append(toIndentedString(validCallCnt)).append("\n");
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
    openapiFields.add("clue_id");
    openapiFields.add("has_qualification");
    openapiFields.add("is_finished");
    openapiFields.add("overdue_timestamps");
    openapiFields.add("total_call_cnt");
    openapiFields.add("valid_call_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundInfoQueryV2ResponseDataInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundInfoQueryV2ResponseDataInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundInfoQueryV2ResponseDataInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundInfoQueryV2ResponseDataInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundInfoQueryV2ResponseDataInfoInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundInfoQueryV2ResponseDataInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundInfoQueryV2ResponseDataInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundInfoQueryV2ResponseDataInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundInfoQueryV2ResponseDataInfoInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundInfoQueryV2ResponseDataInfoInner
  */
  public static ToolsClueRefundInfoQueryV2ResponseDataInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundInfoQueryV2ResponseDataInfoInner.class);
  }

 /**
  * Convert an instance of ToolsClueRefundInfoQueryV2ResponseDataInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

