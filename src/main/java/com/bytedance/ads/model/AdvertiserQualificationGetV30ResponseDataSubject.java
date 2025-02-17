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
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataSubjectCheckType;
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataSubjectCompanyType;
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataSubjectQualificationType;
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataSubjectStatus;
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
 * 主体资质，相关字段见下: 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class AdvertiserQualificationGetV30ResponseDataSubject {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private String attachmentId = null;

  public static final String SERIALIZED_NAME_CHECK_TYPE = "check_type";
  @SerializedName(SERIALIZED_NAME_CHECK_TYPE)
  private AdvertiserQualificationGetV30DataSubjectCheckType checkType = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_COMPANY_TYPE = "company_type";
  @SerializedName(SERIALIZED_NAME_COMPANY_TYPE)
  private AdvertiserQualificationGetV30DataSubjectCompanyType companyType = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effective_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate = null;

  public static final String SERIALIZED_NAME_HAS_EFFECTIVE_DATE = "has_effective_date";
  @SerializedName(SERIALIZED_NAME_HAS_EFFECTIVE_DATE)
  private Boolean hasEffectiveDate = null;

  public static final String SERIALIZED_NAME_PICTURE_URL = "picture_url";
  @SerializedName(SERIALIZED_NAME_PICTURE_URL)
  private String pictureUrl = null;

  public static final String SERIALIZED_NAME_PROPRIETOR_NAME = "proprietor_name";
  @SerializedName(SERIALIZED_NAME_PROPRIETOR_NAME)
  private String proprietorName = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_CODE = "qualification_code";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_CODE)
  private String qualificationCode = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE = "qualification_type";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE)
  private AdvertiserQualificationGetV30DataSubjectQualificationType qualificationType = null;

  public static final String SERIALIZED_NAME_REGISTERED_CITY_NAME = "registered_city_name";
  @SerializedName(SERIALIZED_NAME_REGISTERED_CITY_NAME)
  private String registeredCityName = null;

  public static final String SERIALIZED_NAME_REGISTERED_NATION_NAME = "registered_nation_name";
  @SerializedName(SERIALIZED_NAME_REGISTERED_NATION_NAME)
  private String registeredNationName = null;

  public static final String SERIALIZED_NAME_REGISTERED_PROVINCE_NAME = "registered_province_name";
  @SerializedName(SERIALIZED_NAME_REGISTERED_PROVINCE_NAME)
  private String registeredProvinceName = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserQualificationGetV30DataSubjectStatus status = null;

  public AdvertiserQualificationGetV30ResponseDataSubject() {
  }

  public AdvertiserQualificationGetV30ResponseDataSubject address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址 
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject attachmentId(String attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 资质图片附件id 
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  public String getAttachmentId() {
    return attachmentId;
  }


  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject checkType(AdvertiserQualificationGetV30DataSubjectCheckType checkType) {
    
    this.checkType = checkType;
    return this;
  }

   /**
   * Get checkType
   * @return checkType
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataSubjectCheckType getCheckType() {
    return checkType;
  }


  public void setCheckType(AdvertiserQualificationGetV30DataSubjectCheckType checkType) {
    this.checkType = checkType;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 公司名称 
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject companyType(AdvertiserQualificationGetV30DataSubjectCompanyType companyType) {
    
    this.companyType = companyType;
    return this;
  }

   /**
   * Get companyType
   * @return companyType
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataSubjectCompanyType getCompanyType() {
    return companyType;
  }


  public void setCompanyType(AdvertiserQualificationGetV30DataSubjectCompanyType companyType) {
    this.companyType = companyType;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject effectiveDate(String effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * 过期时间，格式yyyy-mm-dd 
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  public String getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject hasEffectiveDate(Boolean hasEffectiveDate) {
    
    this.hasEffectiveDate = hasEffectiveDate;
    return this;
  }

   /**
   * 是否有有效日期 
   * @return hasEffectiveDate
  **/
  @javax.annotation.Nullable
  public Boolean getHasEffectiveDate() {
    return hasEffectiveDate;
  }


  public void setHasEffectiveDate(Boolean hasEffectiveDate) {
    this.hasEffectiveDate = hasEffectiveDate;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject pictureUrl(String pictureUrl) {
    
    this.pictureUrl = pictureUrl;
    return this;
  }

   /**
   * 资质图片地址 
   * @return pictureUrl
  **/
  @javax.annotation.Nullable
  public String getPictureUrl() {
    return pictureUrl;
  }


  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject proprietorName(String proprietorName) {
    
    this.proprietorName = proprietorName;
    return this;
  }

   /**
   * 法人 
   * @return proprietorName
  **/
  @javax.annotation.Nullable
  public String getProprietorName() {
    return proprietorName;
  }


  public void setProprietorName(String proprietorName) {
    this.proprietorName = proprietorName;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject qualificationCode(String qualificationCode) {
    
    this.qualificationCode = qualificationCode;
    return this;
  }

   /**
   * 资质编号 
   * @return qualificationCode
  **/
  @javax.annotation.Nullable
  public String getQualificationCode() {
    return qualificationCode;
  }


  public void setQualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject qualificationId(Long qualificationId) {
    
    this.qualificationId = qualificationId;
    return this;
  }

   /**
   * 资质id 
   * @return qualificationId
  **/
  @javax.annotation.Nullable
  public Long getQualificationId() {
    return qualificationId;
  }


  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject qualificationType(AdvertiserQualificationGetV30DataSubjectQualificationType qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * Get qualificationType
   * @return qualificationType
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataSubjectQualificationType getQualificationType() {
    return qualificationType;
  }


  public void setQualificationType(AdvertiserQualificationGetV30DataSubjectQualificationType qualificationType) {
    this.qualificationType = qualificationType;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject registeredCityName(String registeredCityName) {
    
    this.registeredCityName = registeredCityName;
    return this;
  }

   /**
   * 注册城市
   * @return registeredCityName
  **/
  @javax.annotation.Nullable
  public String getRegisteredCityName() {
    return registeredCityName;
  }


  public void setRegisteredCityName(String registeredCityName) {
    this.registeredCityName = registeredCityName;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject registeredNationName(String registeredNationName) {
    
    this.registeredNationName = registeredNationName;
    return this;
  }

   /**
   * 注册国家 
   * @return registeredNationName
  **/
  @javax.annotation.Nullable
  public String getRegisteredNationName() {
    return registeredNationName;
  }


  public void setRegisteredNationName(String registeredNationName) {
    this.registeredNationName = registeredNationName;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject registeredProvinceName(String registeredProvinceName) {
    
    this.registeredProvinceName = registeredProvinceName;
    return this;
  }

   /**
   * 注册省份
   * @return registeredProvinceName
  **/
  @javax.annotation.Nullable
  public String getRegisteredProvinceName() {
    return registeredProvinceName;
  }


  public void setRegisteredProvinceName(String registeredProvinceName) {
    this.registeredProvinceName = registeredProvinceName;
  }


  public AdvertiserQualificationGetV30ResponseDataSubject rejectReason(String rejectReason) {
    
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


  public AdvertiserQualificationGetV30ResponseDataSubject status(AdvertiserQualificationGetV30DataSubjectStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataSubjectStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserQualificationGetV30DataSubjectStatus status) {
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
    AdvertiserQualificationGetV30ResponseDataSubject advertiserQualificationGetV30ResponseDataSubject = (AdvertiserQualificationGetV30ResponseDataSubject) o;
    return Objects.equals(this.address, advertiserQualificationGetV30ResponseDataSubject.address) &&
        Objects.equals(this.attachmentId, advertiserQualificationGetV30ResponseDataSubject.attachmentId) &&
        Objects.equals(this.checkType, advertiserQualificationGetV30ResponseDataSubject.checkType) &&
        Objects.equals(this.companyName, advertiserQualificationGetV30ResponseDataSubject.companyName) &&
        Objects.equals(this.companyType, advertiserQualificationGetV30ResponseDataSubject.companyType) &&
        Objects.equals(this.effectiveDate, advertiserQualificationGetV30ResponseDataSubject.effectiveDate) &&
        Objects.equals(this.hasEffectiveDate, advertiserQualificationGetV30ResponseDataSubject.hasEffectiveDate) &&
        Objects.equals(this.pictureUrl, advertiserQualificationGetV30ResponseDataSubject.pictureUrl) &&
        Objects.equals(this.proprietorName, advertiserQualificationGetV30ResponseDataSubject.proprietorName) &&
        Objects.equals(this.qualificationCode, advertiserQualificationGetV30ResponseDataSubject.qualificationCode) &&
        Objects.equals(this.qualificationId, advertiserQualificationGetV30ResponseDataSubject.qualificationId) &&
        Objects.equals(this.qualificationType, advertiserQualificationGetV30ResponseDataSubject.qualificationType) &&
        Objects.equals(this.registeredCityName, advertiserQualificationGetV30ResponseDataSubject.registeredCityName) &&
        Objects.equals(this.registeredNationName, advertiserQualificationGetV30ResponseDataSubject.registeredNationName) &&
        Objects.equals(this.registeredProvinceName, advertiserQualificationGetV30ResponseDataSubject.registeredProvinceName) &&
        Objects.equals(this.rejectReason, advertiserQualificationGetV30ResponseDataSubject.rejectReason) &&
        Objects.equals(this.status, advertiserQualificationGetV30ResponseDataSubject.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, attachmentId, checkType, companyName, companyType, effectiveDate, hasEffectiveDate, pictureUrl, proprietorName, qualificationCode, qualificationId, qualificationType, registeredCityName, registeredNationName, registeredProvinceName, rejectReason, status);
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
    sb.append("class AdvertiserQualificationGetV30ResponseDataSubject {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyType: ").append(toIndentedString(companyType)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    hasEffectiveDate: ").append(toIndentedString(hasEffectiveDate)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
    sb.append("    proprietorName: ").append(toIndentedString(proprietorName)).append("\n");
    sb.append("    qualificationCode: ").append(toIndentedString(qualificationCode)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    registeredCityName: ").append(toIndentedString(registeredCityName)).append("\n");
    sb.append("    registeredNationName: ").append(toIndentedString(registeredNationName)).append("\n");
    sb.append("    registeredProvinceName: ").append(toIndentedString(registeredProvinceName)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("attachment_id");
    openapiFields.add("check_type");
    openapiFields.add("company_name");
    openapiFields.add("company_type");
    openapiFields.add("effective_date");
    openapiFields.add("has_effective_date");
    openapiFields.add("picture_url");
    openapiFields.add("proprietor_name");
    openapiFields.add("qualification_code");
    openapiFields.add("qualification_id");
    openapiFields.add("qualification_type");
    openapiFields.add("registered_city_name");
    openapiFields.add("registered_nation_name");
    openapiFields.add("registered_province_name");
    openapiFields.add("reject_reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationGetV30ResponseDataSubject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationGetV30ResponseDataSubject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationGetV30ResponseDataSubject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationGetV30ResponseDataSubject.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationGetV30ResponseDataSubject>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationGetV30ResponseDataSubject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationGetV30ResponseDataSubject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationGetV30ResponseDataSubject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationGetV30ResponseDataSubject
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationGetV30ResponseDataSubject
  */
  public static AdvertiserQualificationGetV30ResponseDataSubject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationGetV30ResponseDataSubject.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationGetV30ResponseDataSubject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

