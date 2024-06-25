/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields {
  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Long clickCnt = null;

  public static final String SERIALIZED_NAME_DY_COMMENT = "dy_comment";
  @SerializedName(SERIALIZED_NAME_DY_COMMENT)
  private Long dyComment = null;

  public static final String SERIALIZED_NAME_DY_FOLLOW = "dy_follow";
  @SerializedName(SERIALIZED_NAME_DY_FOLLOW)
  private Long dyFollow = null;

  public static final String SERIALIZED_NAME_DY_LIKE = "dy_like";
  @SerializedName(SERIALIZED_NAME_DY_LIKE)
  private Long dyLike = null;

  public static final String SERIALIZED_NAME_USER_LOSE_CNT = "user_lose_cnt";
  @SerializedName(SERIALIZED_NAME_USER_LOSE_CNT)
  private Long userLoseCnt = null;

  public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields() {
  }

  public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields clickCnt(Long clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public Long getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
  }


  public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields dyComment(Long dyComment) {
    
    this.dyComment = dyComment;
    return this;
  }

   /**
   * 
   * @return dyComment
  **/
  @javax.annotation.Nullable
  public Long getDyComment() {
    return dyComment;
  }


  public void setDyComment(Long dyComment) {
    this.dyComment = dyComment;
  }


  public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields dyFollow(Long dyFollow) {
    
    this.dyFollow = dyFollow;
    return this;
  }

   /**
   * 
   * @return dyFollow
  **/
  @javax.annotation.Nullable
  public Long getDyFollow() {
    return dyFollow;
  }


  public void setDyFollow(Long dyFollow) {
    this.dyFollow = dyFollow;
  }


  public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields dyLike(Long dyLike) {
    
    this.dyLike = dyLike;
    return this;
  }

   /**
   * 
   * @return dyLike
  **/
  @javax.annotation.Nullable
  public Long getDyLike() {
    return dyLike;
  }


  public void setDyLike(Long dyLike) {
    this.dyLike = dyLike;
  }


  public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields userLoseCnt(Long userLoseCnt) {
    
    this.userLoseCnt = userLoseCnt;
    return this;
  }

   /**
   * 
   * @return userLoseCnt
  **/
  @javax.annotation.Nullable
  public Long getUserLoseCnt() {
    return userLoseCnt;
  }


  public void setUserLoseCnt(Long userLoseCnt) {
    this.userLoseCnt = userLoseCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields qianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields = (QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields) o;
    return Objects.equals(this.clickCnt, qianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.clickCnt) &&
        Objects.equals(this.dyComment, qianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.dyComment) &&
        Objects.equals(this.dyFollow, qianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.dyFollow) &&
        Objects.equals(this.dyLike, qianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.dyLike) &&
        Objects.equals(this.userLoseCnt, qianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.userLoseCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCnt, dyComment, dyFollow, dyLike, userLoseCnt);
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
    sb.append("class QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields {\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    dyComment: ").append(toIndentedString(dyComment)).append("\n");
    sb.append("    dyFollow: ").append(toIndentedString(dyFollow)).append("\n");
    sb.append("    dyLike: ").append(toIndentedString(dyLike)).append("\n");
    sb.append("    userLoseCnt: ").append(toIndentedString(userLoseCnt)).append("\n");
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
    openapiFields.add("click_cnt");
    openapiFields.add("dy_comment");
    openapiFields.add("dy_follow");
    openapiFields.add("dy_like");
    openapiFields.add("user_lose_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields>() {
           @Override
           public void write(JsonWriter out, QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields
  */
  public static QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields.class);
  }

 /**
  * Convert an instance of QianchuanReportVideoUserLoseGetV10ResponseDataListInnerFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

