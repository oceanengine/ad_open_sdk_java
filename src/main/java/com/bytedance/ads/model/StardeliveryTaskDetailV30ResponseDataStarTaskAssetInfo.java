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
 * 事件资产&amp;监测链接信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private String actionTrackUrl = null;

  public static final String SERIALIZED_NAME_ANDROID_ACTION_TRACK_URL = "android_action_track_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_ACTION_TRACK_URL)
  private String androidActionTrackUrl = null;

  public static final String SERIALIZED_NAME_ANDROID_ASSET_ID = "android_asset_id";
  @SerializedName(SERIALIZED_NAME_ANDROID_ASSET_ID)
  private Long androidAssetId = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_IOS_ACTION_TRACK_URL = "ios_action_track_url";
  @SerializedName(SERIALIZED_NAME_IOS_ACTION_TRACK_URL)
  private String iosActionTrackUrl = null;

  public static final String SERIALIZED_NAME_IOS_ASSET_ID = "ios_asset_id";
  @SerializedName(SERIALIZED_NAME_IOS_ASSET_ID)
  private Long iosAssetId = null;

  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo() {
  }

  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo actionTrackUrl(String actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

   /**
   * 有效触点监测链接，此处监测链接仅用于达人流量，有效触点仅包括点击，任务创建后不支持修改，因此请在下单前确保监测链接准确性 本监测链接仅用于星广联投任务使用，对应宏参和广告投放的监测链接宏参有差异（如支持DEMANDID等），请参考文档配置点击查看
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public String getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(String actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo androidActionTrackUrl(String androidActionTrackUrl) {
    
    this.androidActionTrackUrl = androidActionTrackUrl;
    return this;
  }

   /**
   * 任务使用的安卓应用点击监测链接，返回的是新建任务时选择的监测链接组ID下的点击监测链接
   * @return androidActionTrackUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidActionTrackUrl() {
    return androidActionTrackUrl;
  }


  public void setAndroidActionTrackUrl(String androidActionTrackUrl) {
    this.androidActionTrackUrl = androidActionTrackUrl;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo androidAssetId(Long androidAssetId) {
    
    this.androidAssetId = androidAssetId;
    return this;
  }

   /**
   * 安卓应用资产id
   * @return androidAssetId
  **/
  @javax.annotation.Nullable
  public Long getAndroidAssetId() {
    return androidAssetId;
  }


  public void setAndroidAssetId(Long androidAssetId) {
    this.androidAssetId = androidAssetId;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 资产id，仅当投放字节小程序/字节小游戏时返回该字段资产id
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo iosActionTrackUrl(String iosActionTrackUrl) {
    
    this.iosActionTrackUrl = iosActionTrackUrl;
    return this;
  }

   /**
   * 任务使用的iOS应用点击监测链接，返回的是新建任务时选择的监测链接组ID下的点击监测链接
   * @return iosActionTrackUrl
  **/
  @javax.annotation.Nullable
  public String getIosActionTrackUrl() {
    return iosActionTrackUrl;
  }


  public void setIosActionTrackUrl(String iosActionTrackUrl) {
    this.iosActionTrackUrl = iosActionTrackUrl;
  }


  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo iosAssetId(Long iosAssetId) {
    
    this.iosAssetId = iosAssetId;
    return this;
  }

   /**
   * iOS应用资产id
   * @return iosAssetId
  **/
  @javax.annotation.Nullable
  public Long getIosAssetId() {
    return iosAssetId;
  }


  public void setIosAssetId(Long iosAssetId) {
    this.iosAssetId = iosAssetId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo stardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo = (StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo) o;
    return Objects.equals(this.actionTrackUrl, stardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.actionTrackUrl) &&
        Objects.equals(this.androidActionTrackUrl, stardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.androidActionTrackUrl) &&
        Objects.equals(this.androidAssetId, stardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.androidAssetId) &&
        Objects.equals(this.assetId, stardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.assetId) &&
        Objects.equals(this.iosActionTrackUrl, stardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.iosActionTrackUrl) &&
        Objects.equals(this.iosAssetId, stardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.iosAssetId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, androidActionTrackUrl, androidAssetId, assetId, iosActionTrackUrl, iosAssetId);
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
    sb.append("class StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    androidActionTrackUrl: ").append(toIndentedString(androidActionTrackUrl)).append("\n");
    sb.append("    androidAssetId: ").append(toIndentedString(androidAssetId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    iosActionTrackUrl: ").append(toIndentedString(iosActionTrackUrl)).append("\n");
    sb.append("    iosAssetId: ").append(toIndentedString(iosAssetId)).append("\n");
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
    openapiFields.add("action_track_url");
    openapiFields.add("android_action_track_url");
    openapiFields.add("android_asset_id");
    openapiFields.add("asset_id");
    openapiFields.add("ios_action_track_url");
    openapiFields.add("ios_asset_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo
  */
  public static StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo.class);
  }

 /**
  * Convert an instance of StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

