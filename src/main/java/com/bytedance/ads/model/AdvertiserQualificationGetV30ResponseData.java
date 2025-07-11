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
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataIndustryQuaStatus;
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataStatus;
import com.bytedance.ads.model.AdvertiserQualificationGetV30ResponseDataIndustriesInner;
import com.bytedance.ads.model.AdvertiserQualificationGetV30ResponseDataSubject;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class AdvertiserQualificationGetV30ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_INDUSTRIES = "industries";
  @SerializedName(SERIALIZED_NAME_INDUSTRIES)
  private List<AdvertiserQualificationGetV30ResponseDataIndustriesInner> industries = null;

  public static final String SERIALIZED_NAME_INDUSTRY_QUA_STATUS = "industry_qua_status";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_QUA_STATUS)
  private AdvertiserQualificationGetV30DataIndustryQuaStatus industryQuaStatus = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserQualificationGetV30DataStatus status = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private AdvertiserQualificationGetV30ResponseDataSubject subject = null;

  public AdvertiserQualificationGetV30ResponseData() {
  }

  public AdvertiserQualificationGetV30ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserQualificationGetV30ResponseData industries(List<AdvertiserQualificationGetV30ResponseDataIndustriesInner> industries) {
    
    this.industries = industries;
    return this;
  }

  public AdvertiserQualificationGetV30ResponseData addIndustriesItem(AdvertiserQualificationGetV30ResponseDataIndustriesInner industriesItem) {
    if (this.industries == null) {
      this.industries = new ArrayList<>();
    }
    this.industries.add(industriesItem);
    return this;
  }

   /**
   * 行业资质
   * @return industries
  **/
  @javax.annotation.Nullable
  public List<AdvertiserQualificationGetV30ResponseDataIndustriesInner> getIndustries() {
    return industries;
  }


  public void setIndustries(List<AdvertiserQualificationGetV30ResponseDataIndustriesInner> industries) {
    this.industries = industries;
  }


  public AdvertiserQualificationGetV30ResponseData industryQuaStatus(AdvertiserQualificationGetV30DataIndustryQuaStatus industryQuaStatus) {
    
    this.industryQuaStatus = industryQuaStatus;
    return this;
  }

   /**
   * Get industryQuaStatus
   * @return industryQuaStatus
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataIndustryQuaStatus getIndustryQuaStatus() {
    return industryQuaStatus;
  }


  public void setIndustryQuaStatus(AdvertiserQualificationGetV30DataIndustryQuaStatus industryQuaStatus) {
    this.industryQuaStatus = industryQuaStatus;
  }


  public AdvertiserQualificationGetV30ResponseData rejectReason(String rejectReason) {
    
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


  public AdvertiserQualificationGetV30ResponseData status(AdvertiserQualificationGetV30DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserQualificationGetV30DataStatus status) {
    this.status = status;
  }


  public AdvertiserQualificationGetV30ResponseData subject(AdvertiserQualificationGetV30ResponseDataSubject subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30ResponseDataSubject getSubject() {
    return subject;
  }


  public void setSubject(AdvertiserQualificationGetV30ResponseDataSubject subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserQualificationGetV30ResponseData advertiserQualificationGetV30ResponseData = (AdvertiserQualificationGetV30ResponseData) o;
    return Objects.equals(this.advertiserId, advertiserQualificationGetV30ResponseData.advertiserId) &&
        Objects.equals(this.industries, advertiserQualificationGetV30ResponseData.industries) &&
        Objects.equals(this.industryQuaStatus, advertiserQualificationGetV30ResponseData.industryQuaStatus) &&
        Objects.equals(this.rejectReason, advertiserQualificationGetV30ResponseData.rejectReason) &&
        Objects.equals(this.status, advertiserQualificationGetV30ResponseData.status) &&
        Objects.equals(this.subject, advertiserQualificationGetV30ResponseData.subject);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, industries, industryQuaStatus, rejectReason, status, subject);
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
    sb.append("class AdvertiserQualificationGetV30ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    industries: ").append(toIndentedString(industries)).append("\n");
    sb.append("    industryQuaStatus: ").append(toIndentedString(industryQuaStatus)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("industries");
    openapiFields.add("industry_qua_status");
    openapiFields.add("reject_reason");
    openapiFields.add("status");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationGetV30ResponseData
  */
  public static AdvertiserQualificationGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationGetV30ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

