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
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataIndustriesOthersStatus;
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
 * AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner {
  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private String attachmentId = null;

  public static final String SERIALIZED_NAME_PICTURE_URL = "picture_url";
  @SerializedName(SERIALIZED_NAME_PICTURE_URL)
  private String pictureUrl = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserQualificationGetV30DataIndustriesOthersStatus status = null;

  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner() {
  }

  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner attachmentId(String attachmentId) {
    
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


  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner pictureUrl(String pictureUrl) {
    
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


  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner qualificationId(Long qualificationId) {
    
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


  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner rejectReason(String rejectReason) {
    
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


  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner status(AdvertiserQualificationGetV30DataIndustriesOthersStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataIndustriesOthersStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserQualificationGetV30DataIndustriesOthersStatus status) {
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
    AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner advertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner = (AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner) o;
    return Objects.equals(this.attachmentId, advertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.attachmentId) &&
        Objects.equals(this.pictureUrl, advertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.pictureUrl) &&
        Objects.equals(this.qualificationId, advertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.qualificationId) &&
        Objects.equals(this.rejectReason, advertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.rejectReason) &&
        Objects.equals(this.status, advertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, pictureUrl, qualificationId, rejectReason, status);
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
    sb.append("class AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner {\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
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
    openapiFields.add("attachment_id");
    openapiFields.add("picture_url");
    openapiFields.add("qualification_id");
    openapiFields.add("reject_reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner
  */
  public static AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationGetV30ResponseDataIndustriesInnerOthersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

