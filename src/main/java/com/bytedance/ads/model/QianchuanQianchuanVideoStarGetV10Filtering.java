/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class QianchuanQianchuanVideoStarGetV10Filtering {
  public static final String SERIALIZED_NAME_AWEME_IDS = "aweme_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_IDS)
  private List<Long> awemeIds = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_IDS = "aweme_item_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_IDS)
  private List<Long> awemeItemIds = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_TITLE_URL = "aweme_item_title_url";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_TITLE_URL)
  private String awemeItemTitleUrl = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public QianchuanQianchuanVideoStarGetV10Filtering() {
  }

  public QianchuanQianchuanVideoStarGetV10Filtering awemeIds(List<Long> awemeIds) {
    
    this.awemeIds = awemeIds;
    return this;
  }

  public QianchuanQianchuanVideoStarGetV10Filtering addAwemeIdsItem(Long awemeIdsItem) {
    if (this.awemeIds == null) {
      this.awemeIds = new ArrayList<>();
    }
    this.awemeIds.add(awemeIdsItem);
    return this;
  }

   /**
   * 需拉取视频的抖音号，默认查询全部，数量限制xxx个 注意：这里的抖音号为在星图侧adv绑定的抖音号
   * @return awemeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeIds() {
    return awemeIds;
  }


  public void setAwemeIds(List<Long> awemeIds) {
    this.awemeIds = awemeIds;
  }


  public QianchuanQianchuanVideoStarGetV10Filtering awemeItemIds(List<Long> awemeItemIds) {
    
    this.awemeItemIds = awemeItemIds;
    return this;
  }

  public QianchuanQianchuanVideoStarGetV10Filtering addAwemeItemIdsItem(Long awemeItemIdsItem) {
    if (this.awemeItemIds == null) {
      this.awemeItemIds = new ArrayList<>();
    }
    this.awemeItemIds.add(awemeItemIdsItem);
    return this;
  }

   /**
   * 抖音主页视频id，限制0-50 注意：material_ids、aweme_item_id、aweme_item_title_url只能选择一个进行过滤，否则可能会查询不到数据
   * @return awemeItemIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeItemIds() {
    return awemeItemIds;
  }


  public void setAwemeItemIds(List<Long> awemeItemIds) {
    this.awemeItemIds = awemeItemIds;
  }


  public QianchuanQianchuanVideoStarGetV10Filtering awemeItemTitleUrl(String awemeItemTitleUrl) {
    
    this.awemeItemTitleUrl = awemeItemTitleUrl;
    return this;
  }

   /**
   * 抖音主页视频id，限制0-50 注意：material_ids、aweme_item_id、aweme_item_title_url只能选择一个进行过滤，否则可能会查询不到数据
   * @return awemeItemTitleUrl
  **/
  @javax.annotation.Nullable
  public String getAwemeItemTitleUrl() {
    return awemeItemTitleUrl;
  }


  public void setAwemeItemTitleUrl(String awemeItemTitleUrl) {
    this.awemeItemTitleUrl = awemeItemTitleUrl;
  }


  public QianchuanQianchuanVideoStarGetV10Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public QianchuanQianchuanVideoStarGetV10Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 素材id，抖音主页视频用来投放才会有，限制0-50 注意：material_ids、aweme_item_id、aweme_item_title_url只能选择一个进行过滤，否则可能会查询不到数据
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanQianchuanVideoStarGetV10Filtering qianchuanQianchuanVideoStarGetV10Filtering = (QianchuanQianchuanVideoStarGetV10Filtering) o;
    return Objects.equals(this.awemeIds, qianchuanQianchuanVideoStarGetV10Filtering.awemeIds) &&
        Objects.equals(this.awemeItemIds, qianchuanQianchuanVideoStarGetV10Filtering.awemeItemIds) &&
        Objects.equals(this.awemeItemTitleUrl, qianchuanQianchuanVideoStarGetV10Filtering.awemeItemTitleUrl) &&
        Objects.equals(this.materialIds, qianchuanQianchuanVideoStarGetV10Filtering.materialIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeIds, awemeItemIds, awemeItemTitleUrl, materialIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanQianchuanVideoStarGetV10Filtering {\n");
    sb.append("    awemeIds: ").append(toIndentedString(awemeIds)).append("\n");
    sb.append("    awemeItemIds: ").append(toIndentedString(awemeItemIds)).append("\n");
    sb.append("    awemeItemTitleUrl: ").append(toIndentedString(awemeItemTitleUrl)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
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
    openapiFields.add("aweme_ids");
    openapiFields.add("aweme_item_ids");
    openapiFields.add("aweme_item_title_url");
    openapiFields.add("material_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanQianchuanVideoStarGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanQianchuanVideoStarGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanQianchuanVideoStarGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanQianchuanVideoStarGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanQianchuanVideoStarGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanQianchuanVideoStarGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanQianchuanVideoStarGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanQianchuanVideoStarGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanQianchuanVideoStarGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanQianchuanVideoStarGetV10Filtering
  */
  public static QianchuanQianchuanVideoStarGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanQianchuanVideoStarGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanQianchuanVideoStarGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

