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
import com.bytedance.ads.model.StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner;
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
 * 传播价值指标
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat {
  public static final String SERIALIZED_NAME_AVG_PLAY_TIME = "avg_play_time";
  @SerializedName(SERIALIZED_NAME_AVG_PLAY_TIME)
  private Double avgPlayTime = null;

  public static final String SERIALIZED_NAME_CPE = "cpe";
  @SerializedName(SERIALIZED_NAME_CPE)
  private Double cpe = null;

  public static final String SERIALIZED_NAME_CPM = "cpm";
  @SerializedName(SERIALIZED_NAME_CPM)
  private Double cpm = null;

  public static final String SERIALIZED_NAME_FINISH_RATE = "finish_rate";
  @SerializedName(SERIALIZED_NAME_FINISH_RATE)
  private Double finishRate = null;

  public static final String SERIALIZED_NAME_FREQUENCY_STATS = "frequency_stats";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_STATS)
  private List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner> frequencyStats = null;

  public static final String SERIALIZED_NAME_INTERACT_RATE = "interact_rate";
  @SerializedName(SERIALIZED_NAME_INTERACT_RATE)
  private Double interactRate = null;

  public static final String SERIALIZED_NAME_ITEM_COMMENT_CNT = "item_comment_cnt";
  @SerializedName(SERIALIZED_NAME_ITEM_COMMENT_CNT)
  private Long itemCommentCnt = null;

  public static final String SERIALIZED_NAME_ITEM_LIKE_CNT = "item_like_cnt";
  @SerializedName(SERIALIZED_NAME_ITEM_LIKE_CNT)
  private Long itemLikeCnt = null;

  public static final String SERIALIZED_NAME_ITEM_PLAY_CNT = "item_play_cnt";
  @SerializedName(SERIALIZED_NAME_ITEM_PLAY_CNT)
  private Long itemPlayCnt = null;

  public static final String SERIALIZED_NAME_ITEM_SHARE_CNT = "item_share_cnt";
  @SerializedName(SERIALIZED_NAME_ITEM_SHARE_CNT)
  private Long itemShareCnt = null;

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat() {
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat avgPlayTime(Double avgPlayTime) {
    
    this.avgPlayTime = avgPlayTime;
    return this;
  }

   /**
   * 评论播放时长
   * @return avgPlayTime
  **/
  @javax.annotation.Nullable
  public Double getAvgPlayTime() {
    return avgPlayTime;
  }


  public void setAvgPlayTime(Double avgPlayTime) {
    this.avgPlayTime = avgPlayTime;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat cpe(Double cpe) {
    
    this.cpe = cpe;
    return this;
  }

   /**
   * 互动成本
   * @return cpe
  **/
  @javax.annotation.Nullable
  public Double getCpe() {
    return cpe;
  }


  public void setCpe(Double cpe) {
    this.cpe = cpe;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat cpm(Double cpm) {
    
    this.cpm = cpm;
    return this;
  }

   /**
   * 千次播放成本
   * @return cpm
  **/
  @javax.annotation.Nullable
  public Double getCpm() {
    return cpm;
  }


  public void setCpm(Double cpm) {
    this.cpm = cpm;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat finishRate(Double finishRate) {
    
    this.finishRate = finishRate;
    return this;
  }

   /**
   * 完播率
   * @return finishRate
  **/
  @javax.annotation.Nullable
  public Double getFinishRate() {
    return finishRate;
  }


  public void setFinishRate(Double finishRate) {
    this.finishRate = finishRate;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat frequencyStats(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner> frequencyStats) {
    
    this.frequencyStats = frequencyStats;
    return this;
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat addFrequencyStatsItem(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner frequencyStatsItem) {
    if (this.frequencyStats == null) {
      this.frequencyStats = new ArrayList<>();
    }
    this.frequencyStats.add(frequencyStatsItem);
    return this;
  }

   /**
   * 触达频次
   * @return frequencyStats
  **/
  @javax.annotation.Nullable
  public List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner> getFrequencyStats() {
    return frequencyStats;
  }


  public void setFrequencyStats(List<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner> frequencyStats) {
    this.frequencyStats = frequencyStats;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat interactRate(Double interactRate) {
    
    this.interactRate = interactRate;
    return this;
  }

   /**
   * 互动率
   * @return interactRate
  **/
  @javax.annotation.Nullable
  public Double getInteractRate() {
    return interactRate;
  }


  public void setInteractRate(Double interactRate) {
    this.interactRate = interactRate;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat itemCommentCnt(Long itemCommentCnt) {
    
    this.itemCommentCnt = itemCommentCnt;
    return this;
  }

   /**
   * 评论量
   * @return itemCommentCnt
  **/
  @javax.annotation.Nullable
  public Long getItemCommentCnt() {
    return itemCommentCnt;
  }


  public void setItemCommentCnt(Long itemCommentCnt) {
    this.itemCommentCnt = itemCommentCnt;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat itemLikeCnt(Long itemLikeCnt) {
    
    this.itemLikeCnt = itemLikeCnt;
    return this;
  }

   /**
   * 点赞量
   * @return itemLikeCnt
  **/
  @javax.annotation.Nullable
  public Long getItemLikeCnt() {
    return itemLikeCnt;
  }


  public void setItemLikeCnt(Long itemLikeCnt) {
    this.itemLikeCnt = itemLikeCnt;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat itemPlayCnt(Long itemPlayCnt) {
    
    this.itemPlayCnt = itemPlayCnt;
    return this;
  }

   /**
   * 播放量
   * @return itemPlayCnt
  **/
  @javax.annotation.Nullable
  public Long getItemPlayCnt() {
    return itemPlayCnt;
  }


  public void setItemPlayCnt(Long itemPlayCnt) {
    this.itemPlayCnt = itemPlayCnt;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat itemShareCnt(Long itemShareCnt) {
    
    this.itemShareCnt = itemShareCnt;
    return this;
  }

   /**
   * 分享量
   * @return itemShareCnt
  **/
  @javax.annotation.Nullable
  public Long getItemShareCnt() {
    return itemShareCnt;
  }


  public void setItemShareCnt(Long itemShareCnt) {
    this.itemShareCnt = itemShareCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat = (StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat) o;
    return Objects.equals(this.avgPlayTime, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.avgPlayTime) &&
        Objects.equals(this.cpe, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.cpe) &&
        Objects.equals(this.cpm, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.cpm) &&
        Objects.equals(this.finishRate, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.finishRate) &&
        Objects.equals(this.frequencyStats, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.frequencyStats) &&
        Objects.equals(this.interactRate, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.interactRate) &&
        Objects.equals(this.itemCommentCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.itemCommentCnt) &&
        Objects.equals(this.itemLikeCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.itemLikeCnt) &&
        Objects.equals(this.itemPlayCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.itemPlayCnt) &&
        Objects.equals(this.itemShareCnt, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.itemShareCnt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgPlayTime, cpe, cpm, finishRate, frequencyStats, interactRate, itemCommentCnt, itemLikeCnt, itemPlayCnt, itemShareCnt);
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
    sb.append("class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat {\n");
    sb.append("    avgPlayTime: ").append(toIndentedString(avgPlayTime)).append("\n");
    sb.append("    cpe: ").append(toIndentedString(cpe)).append("\n");
    sb.append("    cpm: ").append(toIndentedString(cpm)).append("\n");
    sb.append("    finishRate: ").append(toIndentedString(finishRate)).append("\n");
    sb.append("    frequencyStats: ").append(toIndentedString(frequencyStats)).append("\n");
    sb.append("    interactRate: ").append(toIndentedString(interactRate)).append("\n");
    sb.append("    itemCommentCnt: ").append(toIndentedString(itemCommentCnt)).append("\n");
    sb.append("    itemLikeCnt: ").append(toIndentedString(itemLikeCnt)).append("\n");
    sb.append("    itemPlayCnt: ").append(toIndentedString(itemPlayCnt)).append("\n");
    sb.append("    itemShareCnt: ").append(toIndentedString(itemShareCnt)).append("\n");
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
    openapiFields.add("avg_play_time");
    openapiFields.add("cpe");
    openapiFields.add("cpm");
    openapiFields.add("finish_rate");
    openapiFields.add("frequency_stats");
    openapiFields.add("interact_rate");
    openapiFields.add("item_comment_cnt");
    openapiFields.add("item_like_cnt");
    openapiFields.add("item_play_cnt");
    openapiFields.add("item_share_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat
  */
  public static StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

