/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * 加热业务指标
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private Long comment = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_PV = "component_click_pv";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_PV)
  private Long componentClickPv = null;

  public static final String SERIALIZED_NAME_COMPONENT_CTR = "component_ctr";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CTR)
  private Long componentCtr = null;

  public static final String SERIALIZED_NAME_CONVERT_COUNT = "convert_count";
  @SerializedName(SERIALIZED_NAME_CONVERT_COUNT)
  private Long convertCount = null;

  public static final String SERIALIZED_NAME_FINISHED_WATCHER_UV = "finished_watcher_uv";
  @SerializedName(SERIALIZED_NAME_FINISHED_WATCHER_UV)
  private Long finishedWatcherUv = null;

  public static final String SERIALIZED_NAME_LIKE = "like";
  @SerializedName(SERIALIZED_NAME_LIKE)
  private Long like = null;

  public static final String SERIALIZED_NAME_PLAY = "play";
  @SerializedName(SERIALIZED_NAME_PLAY)
  private Long play = null;

  public static final String SERIALIZED_NAME_PLAY_RATE_WITH5S = "play_rate_with5s";
  @SerializedName(SERIALIZED_NAME_PLAY_RATE_WITH5S)
  private Long playRateWith5s = null;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Long share = null;

  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo() {
  }

  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo comment(Long comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * 评论数
   * @return comment
  **/
  @javax.annotation.Nullable
  public Long getComment() {
    return comment;
  }


  public void setComment(Long comment) {
    this.comment = comment;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo componentClickPv(Long componentClickPv) {
    
    this.componentClickPv = componentClickPv;
    return this;
  }

   /**
   * 组件点击数，仅BoostAction&#x3D;LINK_ACTION有效
   * @return componentClickPv
  **/
  @javax.annotation.Nullable
  public Long getComponentClickPv() {
    return componentClickPv;
  }


  public void setComponentClickPv(Long componentClickPv) {
    this.componentClickPv = componentClickPv;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo componentCtr(Long componentCtr) {
    
    this.componentCtr = componentCtr;
    return this;
  }

   /**
   * 组件CTR，百分数*100取整，如:1% -&gt; 100，仅BoostAction&#x3D;LINK_ACTION有效
   * @return componentCtr
  **/
  @javax.annotation.Nullable
  public Long getComponentCtr() {
    return componentCtr;
  }


  public void setComponentCtr(Long componentCtr) {
    this.componentCtr = componentCtr;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo convertCount(Long convertCount) {
    
    this.convertCount = convertCount;
    return this;
  }

   /**
   * 转化数，仅BoostAction&#x3D;LINK_ACTION有效
   * @return convertCount
  **/
  @javax.annotation.Nullable
  public Long getConvertCount() {
    return convertCount;
  }


  public void setConvertCount(Long convertCount) {
    this.convertCount = convertCount;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo finishedWatcherUv(Long finishedWatcherUv) {
    
    this.finishedWatcherUv = finishedWatcherUv;
    return this;
  }

   /**
   * 业务目标人群实际覆盖数，仅BoostType&#x3D;CUSTOM_PACKAGE&amp;&amp; BoostAction&#x3D;NATIVE_ACTION有效
   * @return finishedWatcherUv
  **/
  @javax.annotation.Nullable
  public Long getFinishedWatcherUv() {
    return finishedWatcherUv;
  }


  public void setFinishedWatcherUv(Long finishedWatcherUv) {
    this.finishedWatcherUv = finishedWatcherUv;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo like(Long like) {
    
    this.like = like;
    return this;
  }

   /**
   * 点赞数
   * @return like
  **/
  @javax.annotation.Nullable
  public Long getLike() {
    return like;
  }


  public void setLike(Long like) {
    this.like = like;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo play(Long play) {
    
    this.play = play;
    return this;
  }

   /**
   * 播放数
   * @return play
  **/
  @javax.annotation.Nullable
  public Long getPlay() {
    return play;
  }


  public void setPlay(Long play) {
    this.play = play;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo playRateWith5s(Long playRateWith5s) {
    
    this.playRateWith5s = playRateWith5s;
    return this;
  }

   /**
   * 五秒播放率
   * @return playRateWith5s
  **/
  @javax.annotation.Nullable
  public Long getPlayRateWith5s() {
    return playRateWith5s;
  }


  public void setPlayRateWith5s(Long playRateWith5s) {
    this.playRateWith5s = playRateWith5s;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo share(Long share) {
    
    this.share = share;
    return this;
  }

   /**
   * 分享数
   * @return share
  **/
  @javax.annotation.Nullable
  public Long getShare() {
    return share;
  }


  public void setShare(Long share) {
    this.share = share;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo = (StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo) o;
    return Objects.equals(this.comment, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.comment) &&
        Objects.equals(this.componentClickPv, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.componentClickPv) &&
        Objects.equals(this.componentCtr, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.componentCtr) &&
        Objects.equals(this.convertCount, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.convertCount) &&
        Objects.equals(this.finishedWatcherUv, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.finishedWatcherUv) &&
        Objects.equals(this.like, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.like) &&
        Objects.equals(this.play, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.play) &&
        Objects.equals(this.playRateWith5s, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.playRateWith5s) &&
        Objects.equals(this.share, starVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.share);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, componentClickPv, componentCtr, convertCount, finishedWatcherUv, like, play, playRateWith5s, share);
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
    sb.append("class StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    componentClickPv: ").append(toIndentedString(componentClickPv)).append("\n");
    sb.append("    componentCtr: ").append(toIndentedString(componentCtr)).append("\n");
    sb.append("    convertCount: ").append(toIndentedString(convertCount)).append("\n");
    sb.append("    finishedWatcherUv: ").append(toIndentedString(finishedWatcherUv)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    playRateWith5s: ").append(toIndentedString(playRateWith5s)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("component_click_pv");
    openapiFields.add("component_ctr");
    openapiFields.add("convert_count");
    openapiFields.add("finished_watcher_uv");
    openapiFields.add("like");
    openapiFields.add("play");
    openapiFields.add("play_rate_with5s");
    openapiFields.add("share");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("like");
    openapiRequiredFields.add("play");
    openapiRequiredFields.add("play_rate_with5s");
    openapiRequiredFields.add("share");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo>() {
           @Override
           public void write(JsonWriter out, StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo
  * @throws IOException if the JSON string is invalid with respect to StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo
  */
  public static StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo.class);
  }

 /**
  * Convert an instance of StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInnerBoostFlowStatInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

