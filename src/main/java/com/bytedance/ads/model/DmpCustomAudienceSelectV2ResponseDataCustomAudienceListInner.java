/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus;
import com.bytedance.ads.model.DmpCustomAudienceSelectV2DataCustomAudienceListSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner {
  public static final String SERIALIZED_NAME_COVER_NUM = "cover_num";
  @SerializedName(SERIALIZED_NAME_COVER_NUM)
  private Long coverNum = null;

  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_ID = "custom_audience_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_ID)
  private Long customAudienceId = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "data_source_id";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private String dataSourceId = null;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "delivery_status";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus deliveryStatus = null;

  public static final String SERIALIZED_NAME_ISDEL = "isdel";
  @SerializedName(SERIALIZED_NAME_ISDEL)
  private Long isdel = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private DmpCustomAudienceSelectV2DataCustomAudienceListSource source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag = null;

  public static final String SERIALIZED_NAME_UPLOAD_NUM = "upload_num";
  @SerializedName(SERIALIZED_NAME_UPLOAD_NUM)
  private Long uploadNum = null;

  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner() {
  }

  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner coverNum(Long coverNum) {
    
    this.coverNum = coverNum;
    return this;
  }

   /**
   * 
   * @return coverNum
  **/
  @javax.annotation.Nullable
  public Long getCoverNum() {
    return coverNum;
  }


  public void setCoverNum(Long coverNum) {
    this.coverNum = coverNum;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner customAudienceId(Long customAudienceId) {
    
    this.customAudienceId = customAudienceId;
    return this;
  }

   /**
   * 
   * @return customAudienceId
  **/
  @javax.annotation.Nullable
  public Long getCustomAudienceId() {
    return customAudienceId;
  }


  public void setCustomAudienceId(Long customAudienceId) {
    this.customAudienceId = customAudienceId;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner dataSourceId(String dataSourceId) {
    
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * 
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  public String getDataSourceId() {
    return dataSourceId;
  }


  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner deliveryStatus(DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  public DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(DmpCustomAudienceSelectV2DataCustomAudienceListDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner isdel(Long isdel) {
    
    this.isdel = isdel;
    return this;
  }

   /**
   * 
   * @return isdel
  **/
  @javax.annotation.Nullable
  public Long getIsdel() {
    return isdel;
  }


  public void setIsdel(Long isdel) {
    this.isdel = isdel;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner source(DmpCustomAudienceSelectV2DataCustomAudienceListSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public DmpCustomAudienceSelectV2DataCustomAudienceListSource getSource() {
    return source;
  }


  public void setSource(DmpCustomAudienceSelectV2DataCustomAudienceListSource source) {
    this.source = source;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 
   * @return tag
  **/
  @javax.annotation.Nullable
  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner uploadNum(Long uploadNum) {
    
    this.uploadNum = uploadNum;
    return this;
  }

   /**
   * 
   * @return uploadNum
  **/
  @javax.annotation.Nullable
  public Long getUploadNum() {
    return uploadNum;
  }


  public void setUploadNum(Long uploadNum) {
    this.uploadNum = uploadNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner = (DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner) o;
    return Objects.equals(this.coverNum, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.coverNum) &&
        Objects.equals(this.customAudienceId, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.customAudienceId) &&
        Objects.equals(this.dataSourceId, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.dataSourceId) &&
        Objects.equals(this.deliveryStatus, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.deliveryStatus) &&
        Objects.equals(this.isdel, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.isdel) &&
        Objects.equals(this.name, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.name) &&
        Objects.equals(this.source, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.source) &&
        Objects.equals(this.status, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.status) &&
        Objects.equals(this.tag, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.tag) &&
        Objects.equals(this.uploadNum, dmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.uploadNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverNum, customAudienceId, dataSourceId, deliveryStatus, isdel, name, source, status, tag, uploadNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner {\n");
    sb.append("    coverNum: ").append(toIndentedString(coverNum)).append("\n");
    sb.append("    customAudienceId: ").append(toIndentedString(customAudienceId)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    isdel: ").append(toIndentedString(isdel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    uploadNum: ").append(toIndentedString(uploadNum)).append("\n");
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
    openapiFields.add("cover_num");
    openapiFields.add("custom_audience_id");
    openapiFields.add("data_source_id");
    openapiFields.add("delivery_status");
    openapiFields.add("isdel");
    openapiFields.add("name");
    openapiFields.add("source");
    openapiFields.add("status");
    openapiFields.add("tag");
    openapiFields.add("upload_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner>() {
           @Override
           public void write(JsonWriter out, DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner
  * @throws IOException if the JSON string is invalid with respect to DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner
  */
  public static DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner.class);
  }

 /**
  * Convert an instance of DmpCustomAudienceSelectV2ResponseDataCustomAudienceListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

