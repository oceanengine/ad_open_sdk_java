/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
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
 * 结算状态
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData {
  public static final String SERIALIZED_NAME_FOLLOW_UV = "follow_uv";
  @SerializedName(SERIALIZED_NAME_FOLLOW_UV)
  private Long followUv = null;

  public static final String SERIALIZED_NAME_SHARE_RATE = "share_rate";
  @SerializedName(SERIALIZED_NAME_SHARE_RATE)
  private Long shareRate = null;

  public static final String SERIALIZED_NAME_WATCH_CNT = "watch_cnt";
  @SerializedName(SERIALIZED_NAME_WATCH_CNT)
  private Long watchCnt = null;

  public static final String SERIALIZED_NAME_WATCH_DURATION_AVG_S = "watch_duration_avg_s";
  @SerializedName(SERIALIZED_NAME_WATCH_DURATION_AVG_S)
  private Double watchDurationAvgS = null;

  public static final String SERIALIZED_NAME_WATCH_UV = "watch_uv";
  @SerializedName(SERIALIZED_NAME_WATCH_UV)
  private Long watchUv = null;

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData() {
  }

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData followUv(Long followUv) {
    
    this.followUv = followUv;
    return this;
  }

   /**
   * 涨粉人数(只看点击关注的人数，不关心取关)
   * @return followUv
  **/
  @javax.annotation.Nullable
  public Long getFollowUv() {
    return followUv;
  }


  public void setFollowUv(Long followUv) {
    this.followUv = followUv;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData shareRate(Long shareRate) {
    
    this.shareRate = shareRate;
    return this;
  }

   /**
   * 分享率(0.XXXX)
   * @return shareRate
  **/
  @javax.annotation.Nullable
  public Long getShareRate() {
    return shareRate;
  }


  public void setShareRate(Long shareRate) {
    this.shareRate = shareRate;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData watchCnt(Long watchCnt) {
    
    this.watchCnt = watchCnt;
    return this;
  }

   /**
   * 直播观看次数
   * @return watchCnt
  **/
  @javax.annotation.Nullable
  public Long getWatchCnt() {
    return watchCnt;
  }


  public void setWatchCnt(Long watchCnt) {
    this.watchCnt = watchCnt;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData watchDurationAvgS(Double watchDurationAvgS) {
    
    this.watchDurationAvgS = watchDurationAvgS;
    return this;
  }

   /**
   * #直播平均观看时长-s (总观看时长/观看人数)
   * @return watchDurationAvgS
  **/
  @javax.annotation.Nullable
  public Double getWatchDurationAvgS() {
    return watchDurationAvgS;
  }


  public void setWatchDurationAvgS(Double watchDurationAvgS) {
    this.watchDurationAvgS = watchDurationAvgS;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData watchUv(Long watchUv) {
    
    this.watchUv = watchUv;
    return this;
  }

   /**
   * 直播观看人数
   * @return watchUv
  **/
  @javax.annotation.Nullable
  public Long getWatchUv() {
    return watchUv;
  }


  public void setWatchUv(Long watchUv) {
    this.watchUv = watchUv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData = (StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData) o;
    return Objects.equals(this.followUv, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.followUv) &&
        Objects.equals(this.shareRate, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.shareRate) &&
        Objects.equals(this.watchCnt, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.watchCnt) &&
        Objects.equals(this.watchDurationAvgS, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.watchDurationAvgS) &&
        Objects.equals(this.watchUv, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.watchUv);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(followUv, shareRate, watchCnt, watchDurationAvgS, watchUv);
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
    sb.append("class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData {\n");
    sb.append("    followUv: ").append(toIndentedString(followUv)).append("\n");
    sb.append("    shareRate: ").append(toIndentedString(shareRate)).append("\n");
    sb.append("    watchCnt: ").append(toIndentedString(watchCnt)).append("\n");
    sb.append("    watchDurationAvgS: ").append(toIndentedString(watchDurationAvgS)).append("\n");
    sb.append("    watchUv: ").append(toIndentedString(watchUv)).append("\n");
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
    openapiFields.add("follow_uv");
    openapiFields.add("share_rate");
    openapiFields.add("watch_cnt");
    openapiFields.add("watch_duration_avg_s");
    openapiFields.add("watch_uv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData>() {
           @Override
           public void write(JsonWriter out, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData
  */
  public static StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData.class);
  }

 /**
  * Convert an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerLiveEffectData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
