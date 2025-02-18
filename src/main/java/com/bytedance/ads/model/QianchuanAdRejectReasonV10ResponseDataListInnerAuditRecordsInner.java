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
import com.bytedance.ads.model.QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform;
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
 * QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner {
  public static final String SERIALIZED_NAME_AUDIT_PLATFORM = "audit_platform";
  @SerializedName(SERIALIZED_NAME_AUDIT_PLATFORM)
  private QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform auditPlatform = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private List<String> rejectReason = null;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private List<String> suggestion = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner() {
  }

  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner auditPlatform(QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform auditPlatform) {
    
    this.auditPlatform = auditPlatform;
    return this;
  }

   /**
   * Get auditPlatform
   * @return auditPlatform
  **/
  @javax.annotation.Nullable
  public QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform getAuditPlatform() {
    return auditPlatform;
  }


  public void setAuditPlatform(QianchuanAdRejectReasonV10DataListAuditRecordsAuditPlatform auditPlatform) {
    this.auditPlatform = auditPlatform;
  }


  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 
   * @return desc
  **/
  @javax.annotation.Nullable
  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner rejectReason(List<String> rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner addRejectReasonItem(String rejectReasonItem) {
    if (this.rejectReason == null) {
      this.rejectReason = new ArrayList<>();
    }
    this.rejectReason.add(rejectReasonItem);
    return this;
  }

   /**
   * 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public List<String> getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(List<String> rejectReason) {
    this.rejectReason = rejectReason;
  }


  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner suggestion(List<String> suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner addSuggestionItem(String suggestionItem) {
    if (this.suggestion == null) {
      this.suggestion = new ArrayList<>();
    }
    this.suggestion.add(suggestionItem);
    return this;
  }

   /**
   * 
   * @return suggestion
  **/
  @javax.annotation.Nullable
  public List<String> getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(List<String> suggestion) {
    this.suggestion = suggestion;
  }


  public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner = (QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner) o;
    return Objects.equals(this.auditPlatform, qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.auditPlatform) &&
        Objects.equals(this.content, qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.content) &&
        Objects.equals(this.desc, qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.desc) &&
        Objects.equals(this.imageId, qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.imageId) &&
        Objects.equals(this.rejectReason, qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.rejectReason) &&
        Objects.equals(this.suggestion, qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.suggestion) &&
        Objects.equals(this.videoId, qianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditPlatform, content, desc, imageId, rejectReason, suggestion, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner {\n");
    sb.append("    auditPlatform: ").append(toIndentedString(auditPlatform)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("desc");
    openapiFields.add("image_id");
    openapiFields.add("reject_reason");
    openapiFields.add("suggestion");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner
  */
  public static QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdRejectReasonV10ResponseDataListInnerAuditRecordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

