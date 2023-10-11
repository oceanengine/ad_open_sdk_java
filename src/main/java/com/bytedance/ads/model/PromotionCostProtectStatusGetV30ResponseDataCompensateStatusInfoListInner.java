/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus;
import com.bytedance.ads.model.PromotionCostProtectStatusGetV30DataCompensateStatusInfoListStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
 * PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner {
  public static final String SERIALIZED_NAME_COMPENSATE_AMOUNT = "compensate_amount";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_AMOUNT)
  private Double compensateAmount = null;

  public static final String SERIALIZED_NAME_COMPENSATE_STATUS = "compensate_status";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_STATUS)
  private PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus compensateStatus = null;

  public static final String SERIALIZED_NAME_END_REASONS = "end_reasons";
  @SerializedName(SERIALIZED_NAME_END_REASONS)
  private Map<String, String> endReasons = null;

  public static final String SERIALIZED_NAME_INVALID_REASONS = "invalid_reasons";
  @SerializedName(SERIALIZED_NAME_INVALID_REASONS)
  private Map<String, String> invalidReasons = null;

  public static final String SERIALIZED_NAME_QUERY_ID = "query_id";
  @SerializedName(SERIALIZED_NAME_QUERY_ID)
  private Long queryId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PromotionCostProtectStatusGetV30DataCompensateStatusInfoListStatus status = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner() {
  }

  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateAmount(Double compensateAmount) {
    
    this.compensateAmount = compensateAmount;
    return this;
  }

   /**
   * 赔付金额
   * @return compensateAmount
  **/
  @javax.annotation.Nullable
  public Double getCompensateAmount() {
    return compensateAmount;
  }


  public void setCompensateAmount(Double compensateAmount) {
    this.compensateAmount = compensateAmount;
  }


  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateStatus(PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus compensateStatus) {
    
    this.compensateStatus = compensateStatus;
    return this;
  }

   /**
   * Get compensateStatus
   * @return compensateStatus
  **/
  @javax.annotation.Nullable
  public PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus getCompensateStatus() {
    return compensateStatus;
  }


  public void setCompensateStatus(PromotionCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus compensateStatus) {
    this.compensateStatus = compensateStatus;
  }


  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner endReasons(Map<String, String> endReasons) {
    
    this.endReasons = endReasons;
    return this;
  }

  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner putEndReasonsItem(String key, String endReasonsItem) {
    if (this.endReasons == null) {
      this.endReasons = new HashMap<>();
    }
    this.endReasons.put(key, endReasonsItem);
    return this;
  }

   /**
   * 成本保障结束原因
   * @return endReasons
  **/
  @javax.annotation.Nullable
  public Map<String, String> getEndReasons() {
    return endReasons;
  }


  public void setEndReasons(Map<String, String> endReasons) {
    this.endReasons = endReasons;
  }


  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner invalidReasons(Map<String, String> invalidReasons) {
    
    this.invalidReasons = invalidReasons;
    return this;
  }

  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner putInvalidReasonsItem(String key, String invalidReasonsItem) {
    if (this.invalidReasons == null) {
      this.invalidReasons = new HashMap<>();
    }
    this.invalidReasons.put(key, invalidReasonsItem);
    return this;
  }

   /**
   * 成本保障失效原因
   * @return invalidReasons
  **/
  @javax.annotation.Nullable
  public Map<String, String> getInvalidReasons() {
    return invalidReasons;
  }


  public void setInvalidReasons(Map<String, String> invalidReasons) {
    this.invalidReasons = invalidReasons;
  }


  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner queryId(Long queryId) {
    
    this.queryId = queryId;
    return this;
  }

   /**
   * 请求计划id
   * @return queryId
  **/
  @javax.annotation.Nullable
  public Long getQueryId() {
    return queryId;
  }


  public void setQueryId(Long queryId) {
    this.queryId = queryId;
  }


  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner status(PromotionCostProtectStatusGetV30DataCompensateStatusInfoListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public PromotionCostProtectStatusGetV30DataCompensateStatusInfoListStatus getStatus() {
    return status;
  }


  public void setStatus(PromotionCostProtectStatusGetV30DataCompensateStatusInfoListStatus status) {
    this.status = status;
  }


  public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 赔付规则链接
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner = (PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner) o;
    return Objects.equals(this.compensateAmount, promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.compensateAmount) &&
        Objects.equals(this.compensateStatus, promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.compensateStatus) &&
        Objects.equals(this.endReasons, promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.endReasons) &&
        Objects.equals(this.invalidReasons, promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.invalidReasons) &&
        Objects.equals(this.queryId, promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.queryId) &&
        Objects.equals(this.status, promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.status) &&
        Objects.equals(this.url, promotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(compensateAmount, compensateStatus, endReasons, invalidReasons, queryId, status, url);
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
    sb.append("class PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner {\n");
    sb.append("    compensateAmount: ").append(toIndentedString(compensateAmount)).append("\n");
    sb.append("    compensateStatus: ").append(toIndentedString(compensateStatus)).append("\n");
    sb.append("    endReasons: ").append(toIndentedString(endReasons)).append("\n");
    sb.append("    invalidReasons: ").append(toIndentedString(invalidReasons)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("compensate_amount");
    openapiFields.add("compensate_status");
    openapiFields.add("end_reasons");
    openapiFields.add("invalid_reasons");
    openapiFields.add("query_id");
    openapiFields.add("status");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner>() {
           @Override
           public void write(JsonWriter out, PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner
  */
  public static PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.class);
  }

 /**
  * Convert an instance of PromotionCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

