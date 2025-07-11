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
import com.bytedance.ads.model.BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner;
import com.bytedance.ads.model.BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo;
import com.bytedance.ads.model.BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoSubjectInfo;
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
 * 认证信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo {
  public static final String SERIALIZED_NAME_ACCESSORY = "accessory";
  @SerializedName(SERIALIZED_NAME_ACCESSORY)
  private List<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner> accessory = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId = null;

  public static final String SERIALIZED_NAME_PROJECT_INFO = "project_info";
  @SerializedName(SERIALIZED_NAME_PROJECT_INFO)
  private BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo projectInfo = null;

  public static final String SERIALIZED_NAME_SUBJECT_ID = "subject_id";
  @SerializedName(SERIALIZED_NAME_SUBJECT_ID)
  private String subjectId = null;

  public static final String SERIALIZED_NAME_SUBJECT_INFO = "subject_info";
  @SerializedName(SERIALIZED_NAME_SUBJECT_INFO)
  private BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoSubjectInfo subjectInfo = null;

  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo() {
  }

  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo accessory(List<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner> accessory) {
    
    this.accessory = accessory;
    return this;
  }

  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo addAccessoryItem(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner accessoryItem) {
    if (this.accessory == null) {
      this.accessory = new ArrayList<>();
    }
    this.accessory.add(accessoryItem);
    return this;
  }

   /**
   * 附件信息
   * @return accessory
  **/
  @javax.annotation.Nullable
  public List<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner> getAccessory() {
    return accessory;
  }


  public void setAccessory(List<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner> accessory) {
    this.accessory = accessory;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 关联合同
   * @return projectId
  **/
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo projectInfo(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo projectInfo) {
    
    this.projectInfo = projectInfo;
    return this;
  }

   /**
   * Get projectInfo
   * @return projectInfo
  **/
  @javax.annotation.Nullable
  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo getProjectInfo() {
    return projectInfo;
  }


  public void setProjectInfo(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo projectInfo) {
    this.projectInfo = projectInfo;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo subjectId(String subjectId) {
    
    this.subjectId = subjectId;
    return this;
  }

   /**
   * 内广签约主体ID
   * @return subjectId
  **/
  @javax.annotation.Nullable
  public String getSubjectId() {
    return subjectId;
  }


  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo subjectInfo(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoSubjectInfo subjectInfo) {
    
    this.subjectInfo = subjectInfo;
    return this;
  }

   /**
   * Get subjectInfo
   * @return subjectInfo
  **/
  @javax.annotation.Nullable
  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoSubjectInfo getSubjectInfo() {
    return subjectInfo;
  }


  public void setSubjectInfo(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoSubjectInfo subjectInfo) {
    this.subjectInfo = subjectInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo = (BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo) o;
    return Objects.equals(this.accessory, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.accessory) &&
        Objects.equals(this.projectId, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.projectId) &&
        Objects.equals(this.projectInfo, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.projectInfo) &&
        Objects.equals(this.subjectId, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.subjectId) &&
        Objects.equals(this.subjectInfo, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.subjectInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessory, projectId, projectInfo, subjectId, subjectInfo);
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
    sb.append("class BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo {\n");
    sb.append("    accessory: ").append(toIndentedString(accessory)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectInfo: ").append(toIndentedString(projectInfo)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectInfo: ").append(toIndentedString(subjectInfo)).append("\n");
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
    openapiFields.add("accessory");
    openapiFields.add("project_id");
    openapiFields.add("project_info");
    openapiFields.add("subject_id");
    openapiFields.add("subject_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo>() {
           @Override
           public void write(JsonWriter out, BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo
  */
  public static BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo.class);
  }

 /**
  * Convert an instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

