/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorGetV30FilteringAnchorType;
import com.bytedance.ads.model.NativeAnchorGetV30FilteringExternalAction;
import com.bytedance.ads.model.NativeAnchorGetV30FilteringLandingType;
import com.bytedance.ads.model.NativeAnchorGetV30FilteringSource;
import com.bytedance.ads.model.NativeAnchorGetV30FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class NativeAnchorGetV30Filtering {
  public static final String SERIALIZED_NAME_ANCHOR_END_TIME = "anchor_end_time";
  @SerializedName(SERIALIZED_NAME_ANCHOR_END_TIME)
  private String anchorEndTime = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_NAME = "anchor_name";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NAME)
  private String anchorName = null;

  public static final String SERIALIZED_NAME_ANCHOR_START_TIME = "anchor_start_time";
  @SerializedName(SERIALIZED_NAME_ANCHOR_START_TIME)
  private String anchorStartTime = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private List<NativeAnchorGetV30FilteringAnchorType> anchorType = null;

  public static final String SERIALIZED_NAME_ANDROID_PACKAGE_NAME = "android_package_name";
  @SerializedName(SERIALIZED_NAME_ANDROID_PACKAGE_NAME)
  private String androidPackageName = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private NativeAnchorGetV30FilteringExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_IOS_PACKAGE_NAME = "ios_package_name";
  @SerializedName(SERIALIZED_NAME_IOS_PACKAGE_NAME)
  private String iosPackageName = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private NativeAnchorGetV30FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private List<NativeAnchorGetV30FilteringSource> source = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<NativeAnchorGetV30FilteringStatus> status = null;

  public NativeAnchorGetV30Filtering() {
  }

  public NativeAnchorGetV30Filtering anchorEndTime(String anchorEndTime) {
    
    this.anchorEndTime = anchorEndTime;
    return this;
  }

   /**
   * 锚点创建结束日期，格式：yyyy-MM-dd
   * @return anchorEndTime
  **/
  @javax.annotation.Nullable
  public String getAnchorEndTime() {
    return anchorEndTime;
  }


  public void setAnchorEndTime(String anchorEndTime) {
    this.anchorEndTime = anchorEndTime;
  }


  public NativeAnchorGetV30Filtering anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public NativeAnchorGetV30Filtering anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * 
   * @return anchorName
  **/
  @javax.annotation.Nullable
  public String getAnchorName() {
    return anchorName;
  }


  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }


  public NativeAnchorGetV30Filtering anchorStartTime(String anchorStartTime) {
    
    this.anchorStartTime = anchorStartTime;
    return this;
  }

   /**
   * 锚点创建开始日期，格式：yyyy-MM-dd
   * @return anchorStartTime
  **/
  @javax.annotation.Nullable
  public String getAnchorStartTime() {
    return anchorStartTime;
  }


  public void setAnchorStartTime(String anchorStartTime) {
    this.anchorStartTime = anchorStartTime;
  }


  public NativeAnchorGetV30Filtering anchorType(List<NativeAnchorGetV30FilteringAnchorType> anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

  public NativeAnchorGetV30Filtering addAnchorTypeItem(NativeAnchorGetV30FilteringAnchorType anchorTypeItem) {
    if (this.anchorType == null) {
      this.anchorType = new ArrayList<>();
    }
    this.anchorType.add(anchorTypeItem);
    return this;
  }

   /**
   * 锚点类型，允许值： - 应用下载-游戏：APP_GAME - 应用下载-网服：APP_INTERNET_SERVICE - 应用下载-电商：APP_SHOP - 高级在线预约：ONLINE_SUBSCRIBE
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetV30FilteringAnchorType> getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(List<NativeAnchorGetV30FilteringAnchorType> anchorType) {
    this.anchorType = anchorType;
  }


  public NativeAnchorGetV30Filtering androidPackageName(String androidPackageName) {
    
    this.androidPackageName = androidPackageName;
    return this;
  }

   /**
   * 
   * @return androidPackageName
  **/
  @javax.annotation.Nullable
  public String getAndroidPackageName() {
    return androidPackageName;
  }


  public void setAndroidPackageName(String androidPackageName) {
    this.androidPackageName = androidPackageName;
  }


  public NativeAnchorGetV30Filtering externalAction(NativeAnchorGetV30FilteringExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetV30FilteringExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(NativeAnchorGetV30FilteringExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public NativeAnchorGetV30Filtering iosPackageName(String iosPackageName) {
    
    this.iosPackageName = iosPackageName;
    return this;
  }

   /**
   * 
   * @return iosPackageName
  **/
  @javax.annotation.Nullable
  public String getIosPackageName() {
    return iosPackageName;
  }


  public void setIosPackageName(String iosPackageName) {
    this.iosPackageName = iosPackageName;
  }


  public NativeAnchorGetV30Filtering landingType(NativeAnchorGetV30FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetV30FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(NativeAnchorGetV30FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public NativeAnchorGetV30Filtering source(List<NativeAnchorGetV30FilteringSource> source) {
    
    this.source = source;
    return this;
  }

  public NativeAnchorGetV30Filtering addSourceItem(NativeAnchorGetV30FilteringSource sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetV30FilteringSource> getSource() {
    return source;
  }


  public void setSource(List<NativeAnchorGetV30FilteringSource> source) {
    this.source = source;
  }


  public NativeAnchorGetV30Filtering status(List<NativeAnchorGetV30FilteringStatus> status) {
    
    this.status = status;
    return this;
  }

  public NativeAnchorGetV30Filtering addStatusItem(NativeAnchorGetV30FilteringStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetV30FilteringStatus> getStatus() {
    return status;
  }


  public void setStatus(List<NativeAnchorGetV30FilteringStatus> status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorGetV30Filtering nativeAnchorGetV30Filtering = (NativeAnchorGetV30Filtering) o;
    return Objects.equals(this.anchorEndTime, nativeAnchorGetV30Filtering.anchorEndTime) &&
        Objects.equals(this.anchorId, nativeAnchorGetV30Filtering.anchorId) &&
        Objects.equals(this.anchorName, nativeAnchorGetV30Filtering.anchorName) &&
        Objects.equals(this.anchorStartTime, nativeAnchorGetV30Filtering.anchorStartTime) &&
        Objects.equals(this.anchorType, nativeAnchorGetV30Filtering.anchorType) &&
        Objects.equals(this.androidPackageName, nativeAnchorGetV30Filtering.androidPackageName) &&
        Objects.equals(this.externalAction, nativeAnchorGetV30Filtering.externalAction) &&
        Objects.equals(this.iosPackageName, nativeAnchorGetV30Filtering.iosPackageName) &&
        Objects.equals(this.landingType, nativeAnchorGetV30Filtering.landingType) &&
        Objects.equals(this.source, nativeAnchorGetV30Filtering.source) &&
        Objects.equals(this.status, nativeAnchorGetV30Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorEndTime, anchorId, anchorName, anchorStartTime, anchorType, androidPackageName, externalAction, iosPackageName, landingType, source, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorGetV30Filtering {\n");
    sb.append("    anchorEndTime: ").append(toIndentedString(anchorEndTime)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
    sb.append("    anchorStartTime: ").append(toIndentedString(anchorStartTime)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    androidPackageName: ").append(toIndentedString(androidPackageName)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    iosPackageName: ").append(toIndentedString(iosPackageName)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("anchor_end_time");
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_name");
    openapiFields.add("anchor_start_time");
    openapiFields.add("anchor_type");
    openapiFields.add("android_package_name");
    openapiFields.add("external_action");
    openapiFields.add("ios_package_name");
    openapiFields.add("landing_type");
    openapiFields.add("source");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetV30Filtering
  */
  public static NativeAnchorGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetV30Filtering.class);
  }

 /**
  * Convert an instance of NativeAnchorGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

