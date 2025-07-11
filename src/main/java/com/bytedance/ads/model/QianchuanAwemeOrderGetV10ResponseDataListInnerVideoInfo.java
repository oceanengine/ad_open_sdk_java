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
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10DataListVideoInfoItemType;
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
 * 视频信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo {
  public static final String SERIALIZED_NAME_AWEME_ITEM_COVER = "aweme_item_cover";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_COVER)
  private String awemeItemCover = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_TITLE = "aweme_item_title";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_TITLE)
  private String awemeItemTitle = null;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "item_type";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private QianchuanAwemeOrderGetV10DataListVideoInfoItemType itemType = null;

  public QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo() {
  }

  public QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo awemeItemCover(String awemeItemCover) {
    
    this.awemeItemCover = awemeItemCover;
    return this;
  }

   /**
   * 视频封面
   * @return awemeItemCover
  **/
  @javax.annotation.Nullable
  public String getAwemeItemCover() {
    return awemeItemCover;
  }


  public void setAwemeItemCover(String awemeItemCover) {
    this.awemeItemCover = awemeItemCover;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 视频id
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo awemeItemTitle(String awemeItemTitle) {
    
    this.awemeItemTitle = awemeItemTitle;
    return this;
  }

   /**
   * 视频标题
   * @return awemeItemTitle
  **/
  @javax.annotation.Nullable
  public String getAwemeItemTitle() {
    return awemeItemTitle;
  }


  public void setAwemeItemTitle(String awemeItemTitle) {
    this.awemeItemTitle = awemeItemTitle;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo itemType(QianchuanAwemeOrderGetV10DataListVideoInfoItemType itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10DataListVideoInfoItemType getItemType() {
    return itemType;
  }


  public void setItemType(QianchuanAwemeOrderGetV10DataListVideoInfoItemType itemType) {
    this.itemType = itemType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo qianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo = (QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo) o;
    return Objects.equals(this.awemeItemCover, qianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo.awemeItemCover) &&
        Objects.equals(this.awemeItemId, qianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo.awemeItemId) &&
        Objects.equals(this.awemeItemTitle, qianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo.awemeItemTitle) &&
        Objects.equals(this.itemType, qianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo.itemType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemCover, awemeItemId, awemeItemTitle, itemType);
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
    sb.append("class QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo {\n");
    sb.append("    awemeItemCover: ").append(toIndentedString(awemeItemCover)).append("\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    awemeItemTitle: ").append(toIndentedString(awemeItemTitle)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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
    openapiFields.add("aweme_item_cover");
    openapiFields.add("aweme_item_id");
    openapiFields.add("aweme_item_title");
    openapiFields.add("item_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo
  */
  public static QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

