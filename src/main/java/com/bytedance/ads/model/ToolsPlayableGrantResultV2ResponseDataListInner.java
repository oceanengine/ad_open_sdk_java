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
import com.bytedance.ads.model.ToolsPlayableGrantResultV2DataListStatus;
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
 * ToolsPlayableGrantResultV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsPlayableGrantResultV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_GRANTED_ID = "granted_id";
  @SerializedName(SERIALIZED_NAME_GRANTED_ID)
  private Long grantedId = null;

  public static final String SERIALIZED_NAME_NEW_PLAYABLE_ID = "new_playable_id";
  @SerializedName(SERIALIZED_NAME_NEW_PLAYABLE_ID)
  private Long newPlayableId = null;

  public static final String SERIALIZED_NAME_NEW_PLAYABLE_URL = "new_playable_url";
  @SerializedName(SERIALIZED_NAME_NEW_PLAYABLE_URL)
  private String newPlayableUrl = null;

  public static final String SERIALIZED_NAME_PLAYABLE_ID = "playable_id";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_ID)
  private Long playableId = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsPlayableGrantResultV2DataListStatus status = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public ToolsPlayableGrantResultV2ResponseDataListInner() {
  }

  public ToolsPlayableGrantResultV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 推送任务创建的时间，格式：2020-06-03 16:08:47
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsPlayableGrantResultV2ResponseDataListInner grantedId(Long grantedId) {
    
    this.grantedId = grantedId;
    return this;
  }

   /**
   * 推送目标（广告主id）
   * @return grantedId
  **/
  @javax.annotation.Nullable
  public Long getGrantedId() {
    return grantedId;
  }


  public void setGrantedId(Long grantedId) {
    this.grantedId = grantedId;
  }


  public ToolsPlayableGrantResultV2ResponseDataListInner newPlayableId(Long newPlayableId) {
    
    this.newPlayableId = newPlayableId;
    return this;
  }

   /**
   * 推送成功后新生成的试玩素材ID
   * @return newPlayableId
  **/
  @javax.annotation.Nullable
  public Long getNewPlayableId() {
    return newPlayableId;
  }


  public void setNewPlayableId(Long newPlayableId) {
    this.newPlayableId = newPlayableId;
  }


  public ToolsPlayableGrantResultV2ResponseDataListInner newPlayableUrl(String newPlayableUrl) {
    
    this.newPlayableUrl = newPlayableUrl;
    return this;
  }

   /**
   * 推送成功后新生成的试玩素材url
   * @return newPlayableUrl
  **/
  @javax.annotation.Nullable
  public String getNewPlayableUrl() {
    return newPlayableUrl;
  }


  public void setNewPlayableUrl(String newPlayableUrl) {
    this.newPlayableUrl = newPlayableUrl;
  }


  public ToolsPlayableGrantResultV2ResponseDataListInner playableId(Long playableId) {
    
    this.playableId = playableId;
    return this;
  }

   /**
   * 被推送的试玩素材id
   * @return playableId
  **/
  @javax.annotation.Nullable
  public Long getPlayableId() {
    return playableId;
  }


  public void setPlayableId(Long playableId) {
    this.playableId = playableId;
  }


  public ToolsPlayableGrantResultV2ResponseDataListInner playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 被推送的试玩素材url
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public ToolsPlayableGrantResultV2ResponseDataListInner status(ToolsPlayableGrantResultV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsPlayableGrantResultV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsPlayableGrantResultV2DataListStatus status) {
    this.status = status;
  }


  public ToolsPlayableGrantResultV2ResponseDataListInner taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 任务id
   * @return taskId
  **/
  @javax.annotation.Nullable
  public Long getTaskId() {
    return taskId;
  }


  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPlayableGrantResultV2ResponseDataListInner toolsPlayableGrantResultV2ResponseDataListInner = (ToolsPlayableGrantResultV2ResponseDataListInner) o;
    return Objects.equals(this.createTime, toolsPlayableGrantResultV2ResponseDataListInner.createTime) &&
        Objects.equals(this.grantedId, toolsPlayableGrantResultV2ResponseDataListInner.grantedId) &&
        Objects.equals(this.newPlayableId, toolsPlayableGrantResultV2ResponseDataListInner.newPlayableId) &&
        Objects.equals(this.newPlayableUrl, toolsPlayableGrantResultV2ResponseDataListInner.newPlayableUrl) &&
        Objects.equals(this.playableId, toolsPlayableGrantResultV2ResponseDataListInner.playableId) &&
        Objects.equals(this.playableUrl, toolsPlayableGrantResultV2ResponseDataListInner.playableUrl) &&
        Objects.equals(this.status, toolsPlayableGrantResultV2ResponseDataListInner.status) &&
        Objects.equals(this.taskId, toolsPlayableGrantResultV2ResponseDataListInner.taskId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, grantedId, newPlayableId, newPlayableUrl, playableId, playableUrl, status, taskId);
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
    sb.append("class ToolsPlayableGrantResultV2ResponseDataListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    grantedId: ").append(toIndentedString(grantedId)).append("\n");
    sb.append("    newPlayableId: ").append(toIndentedString(newPlayableId)).append("\n");
    sb.append("    newPlayableUrl: ").append(toIndentedString(newPlayableUrl)).append("\n");
    sb.append("    playableId: ").append(toIndentedString(playableId)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("granted_id");
    openapiFields.add("new_playable_id");
    openapiFields.add("new_playable_url");
    openapiFields.add("playable_id");
    openapiFields.add("playable_url");
    openapiFields.add("status");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPlayableGrantResultV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPlayableGrantResultV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPlayableGrantResultV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPlayableGrantResultV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPlayableGrantResultV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPlayableGrantResultV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPlayableGrantResultV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPlayableGrantResultV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPlayableGrantResultV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPlayableGrantResultV2ResponseDataListInner
  */
  public static ToolsPlayableGrantResultV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPlayableGrantResultV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsPlayableGrantResultV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

