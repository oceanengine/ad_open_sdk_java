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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ToolsRubeexGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsRubeexGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_COVER = "cover";
  @SerializedName(SERIALIZED_NAME_COVER)
  private String cover = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_RATE = "custom_finish_play_playable_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_RATE)
  private Double customFinishPlayPlayableRate = null;

  public static final String SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_RATE = "custom_start_play_playable_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_RATE)
  private Double customStartPlayPlayableRate = null;

  public static final String SERIALIZED_NAME_ORIGIN_ID = "origin_id";
  @SerializedName(SERIALIZED_NAME_ORIGIN_ID)
  private Long originId = null;

  public static final String SERIALIZED_NAME_PLATFORM_NAME = "platform_name";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NAME)
  private String platformName = null;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl = null;

  public static final String SERIALIZED_NAME_PROJECT_DATA = "project_data";
  @SerializedName(SERIALIZED_NAME_PROJECT_DATA)
  private String projectData = null;

  public static final String SERIALIZED_NAME_PROJECT_DESCRIPTION = "project_description";
  @SerializedName(SERIALIZED_NAME_PROJECT_DESCRIPTION)
  private String projectDescription = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROJECT_LIFECYCLE = "project_lifecycle";
  @SerializedName(SERIALIZED_NAME_PROJECT_LIFECYCLE)
  private String projectLifecycle = null;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS = "project_status";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS)
  private String projectStatus = null;

  public static final String SERIALIZED_NAME_SKIN_ID = "skin_id";
  @SerializedName(SERIALIZED_NAME_SKIN_ID)
  private Long skinId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public ToolsRubeexGetV2ResponseDataListInner() {
  }

  public ToolsRubeexGetV2ResponseDataListInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public ToolsRubeexGetV2ResponseDataListInner cover(String cover) {
    
    this.cover = cover;
    return this;
  }

   /**
   * 
   * @return cover
  **/
  @javax.annotation.Nullable
  public String getCover() {
    return cover;
  }


  public void setCover(String cover) {
    this.cover = cover;
  }


  public ToolsRubeexGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsRubeexGetV2ResponseDataListInner customFinishPlayPlayableRate(Double customFinishPlayPlayableRate) {
    
    this.customFinishPlayPlayableRate = customFinishPlayPlayableRate;
    return this;
  }

   /**
   * 
   * @return customFinishPlayPlayableRate
  **/
  @javax.annotation.Nullable
  public Double getCustomFinishPlayPlayableRate() {
    return customFinishPlayPlayableRate;
  }


  public void setCustomFinishPlayPlayableRate(Double customFinishPlayPlayableRate) {
    this.customFinishPlayPlayableRate = customFinishPlayPlayableRate;
  }


  public ToolsRubeexGetV2ResponseDataListInner customStartPlayPlayableRate(Double customStartPlayPlayableRate) {
    
    this.customStartPlayPlayableRate = customStartPlayPlayableRate;
    return this;
  }

   /**
   * 
   * @return customStartPlayPlayableRate
  **/
  @javax.annotation.Nullable
  public Double getCustomStartPlayPlayableRate() {
    return customStartPlayPlayableRate;
  }


  public void setCustomStartPlayPlayableRate(Double customStartPlayPlayableRate) {
    this.customStartPlayPlayableRate = customStartPlayPlayableRate;
  }


  public ToolsRubeexGetV2ResponseDataListInner originId(Long originId) {
    
    this.originId = originId;
    return this;
  }

   /**
   * 
   * @return originId
  **/
  @javax.annotation.Nullable
  public Long getOriginId() {
    return originId;
  }


  public void setOriginId(Long originId) {
    this.originId = originId;
  }


  public ToolsRubeexGetV2ResponseDataListInner platformName(String platformName) {
    
    this.platformName = platformName;
    return this;
  }

   /**
   * 
   * @return platformName
  **/
  @javax.annotation.Nullable
  public String getPlatformName() {
    return platformName;
  }


  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }


  public ToolsRubeexGetV2ResponseDataListInner previewUrl(String previewUrl) {
    
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


  public ToolsRubeexGetV2ResponseDataListInner projectData(String projectData) {
    
    this.projectData = projectData;
    return this;
  }

   /**
   * 
   * @return projectData
  **/
  @javax.annotation.Nullable
  public String getProjectData() {
    return projectData;
  }


  public void setProjectData(String projectData) {
    this.projectData = projectData;
  }


  public ToolsRubeexGetV2ResponseDataListInner projectDescription(String projectDescription) {
    
    this.projectDescription = projectDescription;
    return this;
  }

   /**
   * 
   * @return projectDescription
  **/
  @javax.annotation.Nullable
  public String getProjectDescription() {
    return projectDescription;
  }


  public void setProjectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
  }


  public ToolsRubeexGetV2ResponseDataListInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public ToolsRubeexGetV2ResponseDataListInner projectLifecycle(String projectLifecycle) {
    
    this.projectLifecycle = projectLifecycle;
    return this;
  }

   /**
   * 
   * @return projectLifecycle
  **/
  @javax.annotation.Nullable
  public String getProjectLifecycle() {
    return projectLifecycle;
  }


  public void setProjectLifecycle(String projectLifecycle) {
    this.projectLifecycle = projectLifecycle;
  }


  public ToolsRubeexGetV2ResponseDataListInner projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * 
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public ToolsRubeexGetV2ResponseDataListInner projectStatus(String projectStatus) {
    
    this.projectStatus = projectStatus;
    return this;
  }

   /**
   * 
   * @return projectStatus
  **/
  @javax.annotation.Nullable
  public String getProjectStatus() {
    return projectStatus;
  }


  public void setProjectStatus(String projectStatus) {
    this.projectStatus = projectStatus;
  }


  public ToolsRubeexGetV2ResponseDataListInner skinId(Long skinId) {
    
    this.skinId = skinId;
    return this;
  }

   /**
   * 
   * @return skinId
  **/
  @javax.annotation.Nullable
  public Long getSkinId() {
    return skinId;
  }


  public void setSkinId(Long skinId) {
    this.skinId = skinId;
  }


  public ToolsRubeexGetV2ResponseDataListInner templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }


  public ToolsRubeexGetV2ResponseDataListInner updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRubeexGetV2ResponseDataListInner toolsRubeexGetV2ResponseDataListInner = (ToolsRubeexGetV2ResponseDataListInner) o;
    return Objects.equals(this.authorId, toolsRubeexGetV2ResponseDataListInner.authorId) &&
        Objects.equals(this.cover, toolsRubeexGetV2ResponseDataListInner.cover) &&
        Objects.equals(this.createTime, toolsRubeexGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.customFinishPlayPlayableRate, toolsRubeexGetV2ResponseDataListInner.customFinishPlayPlayableRate) &&
        Objects.equals(this.customStartPlayPlayableRate, toolsRubeexGetV2ResponseDataListInner.customStartPlayPlayableRate) &&
        Objects.equals(this.originId, toolsRubeexGetV2ResponseDataListInner.originId) &&
        Objects.equals(this.platformName, toolsRubeexGetV2ResponseDataListInner.platformName) &&
        Objects.equals(this.previewUrl, toolsRubeexGetV2ResponseDataListInner.previewUrl) &&
        Objects.equals(this.projectData, toolsRubeexGetV2ResponseDataListInner.projectData) &&
        Objects.equals(this.projectDescription, toolsRubeexGetV2ResponseDataListInner.projectDescription) &&
        Objects.equals(this.projectId, toolsRubeexGetV2ResponseDataListInner.projectId) &&
        Objects.equals(this.projectLifecycle, toolsRubeexGetV2ResponseDataListInner.projectLifecycle) &&
        Objects.equals(this.projectName, toolsRubeexGetV2ResponseDataListInner.projectName) &&
        Objects.equals(this.projectStatus, toolsRubeexGetV2ResponseDataListInner.projectStatus) &&
        Objects.equals(this.skinId, toolsRubeexGetV2ResponseDataListInner.skinId) &&
        Objects.equals(this.templateId, toolsRubeexGetV2ResponseDataListInner.templateId) &&
        Objects.equals(this.updateTime, toolsRubeexGetV2ResponseDataListInner.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, cover, createTime, customFinishPlayPlayableRate, customStartPlayPlayableRate, originId, platformName, previewUrl, projectData, projectDescription, projectId, projectLifecycle, projectName, projectStatus, skinId, templateId, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsRubeexGetV2ResponseDataListInner {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    customFinishPlayPlayableRate: ").append(toIndentedString(customFinishPlayPlayableRate)).append("\n");
    sb.append("    customStartPlayPlayableRate: ").append(toIndentedString(customStartPlayPlayableRate)).append("\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    projectData: ").append(toIndentedString(projectData)).append("\n");
    sb.append("    projectDescription: ").append(toIndentedString(projectDescription)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectLifecycle: ").append(toIndentedString(projectLifecycle)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectStatus: ").append(toIndentedString(projectStatus)).append("\n");
    sb.append("    skinId: ").append(toIndentedString(skinId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("cover");
    openapiFields.add("create_time");
    openapiFields.add("custom_finish_play_playable_rate");
    openapiFields.add("custom_start_play_playable_rate");
    openapiFields.add("origin_id");
    openapiFields.add("platform_name");
    openapiFields.add("preview_url");
    openapiFields.add("project_data");
    openapiFields.add("project_description");
    openapiFields.add("project_id");
    openapiFields.add("project_lifecycle");
    openapiFields.add("project_name");
    openapiFields.add("project_status");
    openapiFields.add("skin_id");
    openapiFields.add("template_id");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRubeexGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRubeexGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRubeexGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRubeexGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRubeexGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsRubeexGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRubeexGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRubeexGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRubeexGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsRubeexGetV2ResponseDataListInner
  */
  public static ToolsRubeexGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRubeexGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsRubeexGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

