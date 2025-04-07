/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag;
import com.bytedance.ads.model.QianchuanDmpAudiencesGetV10DataRetargetingTagsIsCommon;
import com.bytedance.ads.model.QianchuanDmpAudiencesGetV10DataRetargetingTagsRetargetingTagsOp;
import com.bytedance.ads.model.QianchuanDmpAudiencesGetV10DataRetargetingTagsSource;
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
 * QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner {
  public static final String SERIALIZED_NAME_COVER_NUM = "cover_num";
  @SerializedName(SERIALIZED_NAME_COVER_NUM)
  private Long coverNum = null;

  public static final String SERIALIZED_NAME_HAS_OFFLINE_TAG = "has_offline_tag";
  @SerializedName(SERIALIZED_NAME_HAS_OFFLINE_TAG)
  private QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag hasOfflineTag = null;

  public static final String SERIALIZED_NAME_IS_COMMON = "is_common";
  @SerializedName(SERIALIZED_NAME_IS_COMMON)
  private QianchuanDmpAudiencesGetV10DataRetargetingTagsIsCommon isCommon = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_ID = "retargeting_tags_id";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_ID)
  private Long retargetingTagsId = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_OP = "retargeting_tags_op";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_OP)
  private QianchuanDmpAudiencesGetV10DataRetargetingTagsRetargetingTagsOp retargetingTagsOp = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_TIP = "retargeting_tags_tip";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_TIP)
  private String retargetingTagsTip = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private QianchuanDmpAudiencesGetV10DataRetargetingTagsSource source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner() {
  }

  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner coverNum(Long coverNum) {
    
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


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner hasOfflineTag(QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag hasOfflineTag) {
    
    this.hasOfflineTag = hasOfflineTag;
    return this;
  }

   /**
   * Get hasOfflineTag
   * @return hasOfflineTag
  **/
  @javax.annotation.Nullable
  public QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag getHasOfflineTag() {
    return hasOfflineTag;
  }


  public void setHasOfflineTag(QianchuanDmpAudiencesGetV10DataRetargetingTagsHasOfflineTag hasOfflineTag) {
    this.hasOfflineTag = hasOfflineTag;
  }


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner isCommon(QianchuanDmpAudiencesGetV10DataRetargetingTagsIsCommon isCommon) {
    
    this.isCommon = isCommon;
    return this;
  }

   /**
   * Get isCommon
   * @return isCommon
  **/
  @javax.annotation.Nullable
  public QianchuanDmpAudiencesGetV10DataRetargetingTagsIsCommon getIsCommon() {
    return isCommon;
  }


  public void setIsCommon(QianchuanDmpAudiencesGetV10DataRetargetingTagsIsCommon isCommon) {
    this.isCommon = isCommon;
  }


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner name(String name) {
    
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


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner retargetingTagsId(Long retargetingTagsId) {
    
    this.retargetingTagsId = retargetingTagsId;
    return this;
  }

   /**
   * 
   * @return retargetingTagsId
  **/
  @javax.annotation.Nullable
  public Long getRetargetingTagsId() {
    return retargetingTagsId;
  }


  public void setRetargetingTagsId(Long retargetingTagsId) {
    this.retargetingTagsId = retargetingTagsId;
  }


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner retargetingTagsOp(QianchuanDmpAudiencesGetV10DataRetargetingTagsRetargetingTagsOp retargetingTagsOp) {
    
    this.retargetingTagsOp = retargetingTagsOp;
    return this;
  }

   /**
   * Get retargetingTagsOp
   * @return retargetingTagsOp
  **/
  @javax.annotation.Nullable
  public QianchuanDmpAudiencesGetV10DataRetargetingTagsRetargetingTagsOp getRetargetingTagsOp() {
    return retargetingTagsOp;
  }


  public void setRetargetingTagsOp(QianchuanDmpAudiencesGetV10DataRetargetingTagsRetargetingTagsOp retargetingTagsOp) {
    this.retargetingTagsOp = retargetingTagsOp;
  }


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner retargetingTagsTip(String retargetingTagsTip) {
    
    this.retargetingTagsTip = retargetingTagsTip;
    return this;
  }

   /**
   * 
   * @return retargetingTagsTip
  **/
  @javax.annotation.Nullable
  public String getRetargetingTagsTip() {
    return retargetingTagsTip;
  }


  public void setRetargetingTagsTip(String retargetingTagsTip) {
    this.retargetingTagsTip = retargetingTagsTip;
  }


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner source(QianchuanDmpAudiencesGetV10DataRetargetingTagsSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public QianchuanDmpAudiencesGetV10DataRetargetingTagsSource getSource() {
    return source;
  }


  public void setSource(QianchuanDmpAudiencesGetV10DataRetargetingTagsSource source) {
    this.source = source;
  }


  public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
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
    QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner = (QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner) o;
    return Objects.equals(this.coverNum, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.coverNum) &&
        Objects.equals(this.hasOfflineTag, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.hasOfflineTag) &&
        Objects.equals(this.isCommon, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.isCommon) &&
        Objects.equals(this.name, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.name) &&
        Objects.equals(this.retargetingTagsId, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.retargetingTagsId) &&
        Objects.equals(this.retargetingTagsOp, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.retargetingTagsOp) &&
        Objects.equals(this.retargetingTagsTip, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.retargetingTagsTip) &&
        Objects.equals(this.source, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.source) &&
        Objects.equals(this.status, qianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverNum, hasOfflineTag, isCommon, name, retargetingTagsId, retargetingTagsOp, retargetingTagsTip, source, status);
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
    sb.append("class QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner {\n");
    sb.append("    coverNum: ").append(toIndentedString(coverNum)).append("\n");
    sb.append("    hasOfflineTag: ").append(toIndentedString(hasOfflineTag)).append("\n");
    sb.append("    isCommon: ").append(toIndentedString(isCommon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retargetingTagsId: ").append(toIndentedString(retargetingTagsId)).append("\n");
    sb.append("    retargetingTagsOp: ").append(toIndentedString(retargetingTagsOp)).append("\n");
    sb.append("    retargetingTagsTip: ").append(toIndentedString(retargetingTagsTip)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
    openapiFields.add("cover_num");
    openapiFields.add("has_offline_tag");
    openapiFields.add("is_common");
    openapiFields.add("name");
    openapiFields.add("retargeting_tags_id");
    openapiFields.add("retargeting_tags_op");
    openapiFields.add("retargeting_tags_tip");
    openapiFields.add("source");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner
  */
  public static QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner.class);
  }

 /**
  * Convert an instance of QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

