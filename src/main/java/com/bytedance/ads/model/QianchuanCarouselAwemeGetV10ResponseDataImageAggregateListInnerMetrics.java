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
public class QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics {
  public static final String SERIALIZED_NAME_COMMENT_CNT = "comment_cnt";
  @SerializedName(SERIALIZED_NAME_COMMENT_CNT)
  private Long commentCnt = null;

  public static final String SERIALIZED_NAME_LIKE_CNT = "like_cnt";
  @SerializedName(SERIALIZED_NAME_LIKE_CNT)
  private Long likeCnt = null;

  public static final String SERIALIZED_NAME_SHARE_CNT = "share_cnt";
  @SerializedName(SERIALIZED_NAME_SHARE_CNT)
  private Long shareCnt = null;

  public static final String SERIALIZED_NAME_VIEW_CNT = "view_cnt";
  @SerializedName(SERIALIZED_NAME_VIEW_CNT)
  private Long viewCnt = null;

  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics() {
  }

  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics commentCnt(Long commentCnt) {
    
    this.commentCnt = commentCnt;
    return this;
  }

   /**
   * 
   * @return commentCnt
  **/
  @javax.annotation.Nullable
  public Long getCommentCnt() {
    return commentCnt;
  }


  public void setCommentCnt(Long commentCnt) {
    this.commentCnt = commentCnt;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics likeCnt(Long likeCnt) {
    
    this.likeCnt = likeCnt;
    return this;
  }

   /**
   * 
   * @return likeCnt
  **/
  @javax.annotation.Nullable
  public Long getLikeCnt() {
    return likeCnt;
  }


  public void setLikeCnt(Long likeCnt) {
    this.likeCnt = likeCnt;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics shareCnt(Long shareCnt) {
    
    this.shareCnt = shareCnt;
    return this;
  }

   /**
   * 
   * @return shareCnt
  **/
  @javax.annotation.Nullable
  public Long getShareCnt() {
    return shareCnt;
  }


  public void setShareCnt(Long shareCnt) {
    this.shareCnt = shareCnt;
  }


  public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics viewCnt(Long viewCnt) {
    
    this.viewCnt = viewCnt;
    return this;
  }

   /**
   * 
   * @return viewCnt
  **/
  @javax.annotation.Nullable
  public Long getViewCnt() {
    return viewCnt;
  }


  public void setViewCnt(Long viewCnt) {
    this.viewCnt = viewCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics = (QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics) o;
    return Objects.equals(this.commentCnt, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics.commentCnt) &&
        Objects.equals(this.likeCnt, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics.likeCnt) &&
        Objects.equals(this.shareCnt, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics.shareCnt) &&
        Objects.equals(this.viewCnt, qianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics.viewCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentCnt, likeCnt, shareCnt, viewCnt);
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
    sb.append("class QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics {\n");
    sb.append("    commentCnt: ").append(toIndentedString(commentCnt)).append("\n");
    sb.append("    likeCnt: ").append(toIndentedString(likeCnt)).append("\n");
    sb.append("    shareCnt: ").append(toIndentedString(shareCnt)).append("\n");
    sb.append("    viewCnt: ").append(toIndentedString(viewCnt)).append("\n");
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
    openapiFields.add("comment_cnt");
    openapiFields.add("like_cnt");
    openapiFields.add("share_cnt");
    openapiFields.add("view_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics
  */
  public static QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics.class);
  }

 /**
  * Convert an instance of QianchuanCarouselAwemeGetV10ResponseDataImageAggregateListInnerMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

