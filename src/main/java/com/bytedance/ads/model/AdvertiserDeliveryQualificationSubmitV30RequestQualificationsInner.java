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
import com.bytedance.ads.model.AdvertiserDeliveryQualificationSubmitV30QualificationsQualificationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-12T21:46:42.940450772+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner {
  public static final String SERIALIZED_NAME_ATTACHMENT_IDS = "attachment_ids";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_IDS)
  private List<Long> attachmentIds = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE = "qualification_type";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE)
  private AdvertiserDeliveryQualificationSubmitV30QualificationsQualificationType qualificationType = null;

  public AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner() {
  }

  public AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner attachmentIds(List<Long> attachmentIds) {
    
    this.attachmentIds = attachmentIds;
    return this;
  }

  public AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner addAttachmentIdsItem(Long attachmentIdsItem) {
    if (this.attachmentIds == null) {
      this.attachmentIds = new ArrayList<>();
    }
    this.attachmentIds.add(attachmentIdsItem);
    return this;
  }

   /**
   * 
   * @return attachmentIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAttachmentIds() {
    return attachmentIds;
  }


  public void setAttachmentIds(List<Long> attachmentIds) {
    this.attachmentIds = attachmentIds;
  }


  public AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner qualificationType(AdvertiserDeliveryQualificationSubmitV30QualificationsQualificationType qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * Get qualificationType
   * @return qualificationType
  **/
  @javax.annotation.Nonnull
  public AdvertiserDeliveryQualificationSubmitV30QualificationsQualificationType getQualificationType() {
    return qualificationType;
  }


  public void setQualificationType(AdvertiserDeliveryQualificationSubmitV30QualificationsQualificationType qualificationType) {
    this.qualificationType = qualificationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner advertiserDeliveryQualificationSubmitV30RequestQualificationsInner = (AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner) o;
    return Objects.equals(this.attachmentIds, advertiserDeliveryQualificationSubmitV30RequestQualificationsInner.attachmentIds) &&
        Objects.equals(this.qualificationType, advertiserDeliveryQualificationSubmitV30RequestQualificationsInner.qualificationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentIds, qualificationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner {\n");
    sb.append("    attachmentIds: ").append(toIndentedString(attachmentIds)).append("\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
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
    openapiFields.add("attachment_ids");
    openapiFields.add("qualification_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachment_ids");
    openapiRequiredFields.add("qualification_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner
  */
  public static AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryQualificationSubmitV30RequestQualificationsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

