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
import com.bytedance.ads.model.QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-11T18:54:06.224549627+08:00[PRC]")
public class QianchuanDmpAudiencesGetV10ResponseData {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS = "retargeting_tags";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS)
  private List<QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner> retargetingTags = null;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Long totalNum = null;

  public QianchuanDmpAudiencesGetV10ResponseData() {
  }

  public QianchuanDmpAudiencesGetV10ResponseData offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * 
   * @return offset
  **/
  @javax.annotation.Nullable
  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }


  public QianchuanDmpAudiencesGetV10ResponseData retargetingTags(List<QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner> retargetingTags) {
    
    this.retargetingTags = retargetingTags;
    return this;
  }

  public QianchuanDmpAudiencesGetV10ResponseData addRetargetingTagsItem(QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner retargetingTagsItem) {
    if (this.retargetingTags == null) {
      this.retargetingTags = new ArrayList<>();
    }
    this.retargetingTags.add(retargetingTagsItem);
    return this;
  }

   /**
   * 
   * @return retargetingTags
  **/
  @javax.annotation.Nullable
  public List<QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner> getRetargetingTags() {
    return retargetingTags;
  }


  public void setRetargetingTags(List<QianchuanDmpAudiencesGetV10ResponseDataRetargetingTagsInner> retargetingTags) {
    this.retargetingTags = retargetingTags;
  }


  public QianchuanDmpAudiencesGetV10ResponseData totalNum(Long totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 
   * @return totalNum
  **/
  @javax.annotation.Nullable
  public Long getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanDmpAudiencesGetV10ResponseData qianchuanDmpAudiencesGetV10ResponseData = (QianchuanDmpAudiencesGetV10ResponseData) o;
    return Objects.equals(this.offset, qianchuanDmpAudiencesGetV10ResponseData.offset) &&
        Objects.equals(this.retargetingTags, qianchuanDmpAudiencesGetV10ResponseData.retargetingTags) &&
        Objects.equals(this.totalNum, qianchuanDmpAudiencesGetV10ResponseData.totalNum);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, retargetingTags, totalNum);
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
    sb.append("class QianchuanDmpAudiencesGetV10ResponseData {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    retargetingTags: ").append(toIndentedString(retargetingTags)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
    openapiFields.add("offset");
    openapiFields.add("retargeting_tags");
    openapiFields.add("total_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanDmpAudiencesGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanDmpAudiencesGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanDmpAudiencesGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanDmpAudiencesGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanDmpAudiencesGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanDmpAudiencesGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanDmpAudiencesGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanDmpAudiencesGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanDmpAudiencesGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanDmpAudiencesGetV10ResponseData
  */
  public static QianchuanDmpAudiencesGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanDmpAudiencesGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanDmpAudiencesGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

