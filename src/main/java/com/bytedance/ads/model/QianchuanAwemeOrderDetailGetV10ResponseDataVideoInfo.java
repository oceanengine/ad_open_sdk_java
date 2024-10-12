/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataVideoInfoItemType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo {
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
  private QianchuanAwemeOrderDetailGetV10DataVideoInfoItemType itemType = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo awemeItemCover(String awemeItemCover) {
    
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


  public QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo awemeItemId(Long awemeItemId) {
    
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


  public QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo awemeItemTitle(String awemeItemTitle) {
    
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


  public QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo itemType(QianchuanAwemeOrderDetailGetV10DataVideoInfoItemType itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataVideoInfoItemType getItemType() {
    return itemType;
  }


  public void setItemType(QianchuanAwemeOrderDetailGetV10DataVideoInfoItemType itemType) {
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
    QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo qianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo = (QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo) o;
    return Objects.equals(this.awemeItemCover, qianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo.awemeItemCover) &&
        Objects.equals(this.awemeItemId, qianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo.awemeItemId) &&
        Objects.equals(this.awemeItemTitle, qianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo.awemeItemTitle) &&
        Objects.equals(this.itemType, qianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo.itemType);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo {\n");
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
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

