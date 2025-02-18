/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
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
 * AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Long> attachments = null;

  public static final String SERIALIZED_NAME_QUAL_TYPE = "qual_type";
  @SerializedName(SERIALIZED_NAME_QUAL_TYPE)
  private Long qualType = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner() {
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner attachments(List<Long> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner addAttachmentsItem(Long attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 资质图片附件，数组长度1~50
   * @return attachments
  **/
  @javax.annotation.Nonnull
  public List<Long> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Long> attachments) {
    this.attachments = attachments;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner qualType(Long qualType) {
    
    this.qualType = qualType;
    return this;
  }

   /**
   * 资质类型id，来自【推广产品资质规则配置查询接口】
   * @return qualType
  **/
  @javax.annotation.Nonnull
  public Long getQualType() {
    return qualType;
  }


  public void setQualType(Long qualType) {
    this.qualType = qualType;
  }


  public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner qualificationId(Long qualificationId) {
    
    this.qualificationId = qualificationId;
    return this;
  }

   /**
   * 新增时传0；编辑时传入前置查询到的资质id
   * @return qualificationId
  **/
  @javax.annotation.Nonnull
  public Long getQualificationId() {
    return qualificationId;
  }


  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner = (AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner) o;
    return Objects.equals(this.attachments, advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner.attachments) &&
        Objects.equals(this.qualType, advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner.qualType) &&
        Objects.equals(this.qualificationId, advertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner.qualificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, qualType, qualificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    qualType: ").append(toIndentedString(qualType)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("qual_type");
    openapiFields.add("qualification_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachments");
    openapiRequiredFields.add("qual_type");
    openapiRequiredFields.add("qualification_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner
  */
  public static AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgSubmitV30RequestDeliveryPkgNecessaryCombineDeliveryRulesInnerDeliveriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

