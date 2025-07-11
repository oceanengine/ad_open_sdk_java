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
import com.bytedance.ads.model.ToolsRubeexPlayableListV2DataListAdStatus;
import com.bytedance.ads.model.ToolsRubeexPlayableListV2DataListPlayableOrientation;
import com.bytedance.ads.model.ToolsRubeexPlayableListV2DataListStatus;
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
 * ToolsRubeexPlayableListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsRubeexPlayableListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_STATUS = "ad_status";
  @SerializedName(SERIALIZED_NAME_AD_STATUS)
  private ToolsRubeexPlayableListV2DataListAdStatus adStatus = null;

  public static final String SERIALIZED_NAME_DATA_MD5 = "data_md5";
  @SerializedName(SERIALIZED_NAME_DATA_MD5)
  private String dataMd5 = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_NAME = "playable_name";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_NAME)
  private String playableName = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ORIENTATION = "playable_orientation";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ORIENTATION)
  private ToolsRubeexPlayableListV2DataListPlayableOrientation playableOrientation = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsRubeexPlayableListV2DataListStatus status = null;

  public ToolsRubeexPlayableListV2ResponseDataListInner() {
  }

  public ToolsRubeexPlayableListV2ResponseDataListInner adStatus(ToolsRubeexPlayableListV2DataListAdStatus adStatus) {
    
    this.adStatus = adStatus;
    return this;
  }

   /**
   * Get adStatus
   * @return adStatus
  **/
  @javax.annotation.Nullable
  public ToolsRubeexPlayableListV2DataListAdStatus getAdStatus() {
    return adStatus;
  }


  public void setAdStatus(ToolsRubeexPlayableListV2DataListAdStatus adStatus) {
    this.adStatus = adStatus;
  }


  public ToolsRubeexPlayableListV2ResponseDataListInner dataMd5(String dataMd5) {
    
    this.dataMd5 = dataMd5;
    return this;
  }

   /**
   * 
   * @return dataMd5
  **/
  @javax.annotation.Nullable
  public String getDataMd5() {
    return dataMd5;
  }


  public void setDataMd5(String dataMd5) {
    this.dataMd5 = dataMd5;
  }


  public ToolsRubeexPlayableListV2ResponseDataListInner playableId(Long playableId) {
    
    this.playableId = playableId;
    return this;
  }

   /**
   * 
   * @return playableId
  **/
  @javax.annotation.Nullable
  public Long getPlayableId() {
    return playableId;
  }


  public void setPlayableId(Long playableId) {
    this.playableId = playableId;
  }


  public ToolsRubeexPlayableListV2ResponseDataListInner playableName(String playableName) {
    
    this.playableName = playableName;
    return this;
  }

   /**
   * 
   * @return playableName
  **/
  @javax.annotation.Nullable
  public String getPlayableName() {
    return playableName;
  }


  public void setPlayableName(String playableName) {
    this.playableName = playableName;
  }


  public ToolsRubeexPlayableListV2ResponseDataListInner playableOrientation(ToolsRubeexPlayableListV2DataListPlayableOrientation playableOrientation) {
    
    this.playableOrientation = playableOrientation;
    return this;
  }

   /**
   * Get playableOrientation
   * @return playableOrientation
  **/
  @javax.annotation.Nullable
  public ToolsRubeexPlayableListV2DataListPlayableOrientation getPlayableOrientation() {
    return playableOrientation;
  }


  public void setPlayableOrientation(ToolsRubeexPlayableListV2DataListPlayableOrientation playableOrientation) {
    this.playableOrientation = playableOrientation;
  }


  public ToolsRubeexPlayableListV2ResponseDataListInner playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public ToolsRubeexPlayableListV2ResponseDataListInner previewUrl(String previewUrl) {
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * 
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  public String getPreviewUrl() {
    return previewUrl;
  }


  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  public ToolsRubeexPlayableListV2ResponseDataListInner status(ToolsRubeexPlayableListV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsRubeexPlayableListV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsRubeexPlayableListV2DataListStatus status) {
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
    ToolsRubeexPlayableListV2ResponseDataListInner toolsRubeexPlayableListV2ResponseDataListInner = (ToolsRubeexPlayableListV2ResponseDataListInner) o;
    return Objects.equals(this.adStatus, toolsRubeexPlayableListV2ResponseDataListInner.adStatus) &&
        Objects.equals(this.dataMd5, toolsRubeexPlayableListV2ResponseDataListInner.dataMd5) &&
        Objects.equals(this.playableId, toolsRubeexPlayableListV2ResponseDataListInner.playableId) &&
        Objects.equals(this.playableName, toolsRubeexPlayableListV2ResponseDataListInner.playableName) &&
        Objects.equals(this.playableOrientation, toolsRubeexPlayableListV2ResponseDataListInner.playableOrientation) &&
        Objects.equals(this.playableUrl, toolsRubeexPlayableListV2ResponseDataListInner.playableUrl) &&
        Objects.equals(this.previewUrl, toolsRubeexPlayableListV2ResponseDataListInner.previewUrl) &&
        Objects.equals(this.status, toolsRubeexPlayableListV2ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adStatus, dataMd5, playableId, playableName, playableOrientation, playableUrl, previewUrl, status);
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
    sb.append("class ToolsRubeexPlayableListV2ResponseDataListInner {\n");
    sb.append("    adStatus: ").append(toIndentedString(adStatus)).append("\n");
    sb.append("    dataMd5: ").append(toIndentedString(dataMd5)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
    sb.append("    playableName: ").append(toIndentedString(playableName)).append("\n");
    sb.append("    playableOrientation: ").append(toIndentedString(playableOrientation)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
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
    openapiFields.add("ad_status");
    openapiFields.add("data_md5");
    openapiFields.add("playable_id");
    openapiFields.add("playable_name");
    openapiFields.add("playable_orientation");
    openapiFields.add("playable_url");
    openapiFields.add("preview_url");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRubeexPlayableListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRubeexPlayableListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRubeexPlayableListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRubeexPlayableListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRubeexPlayableListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsRubeexPlayableListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRubeexPlayableListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRubeexPlayableListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRubeexPlayableListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsRubeexPlayableListV2ResponseDataListInner
  */
  public static ToolsRubeexPlayableListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRubeexPlayableListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsRubeexPlayableListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

