/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons;
import com.bytedance.ads.model.ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateInvalidReasons;
import com.bytedance.ads.model.ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus;
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
 * ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner {
  public static final String SERIALIZED_NAME_COMPENSATE_AMOUNT = "compensate_amount";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_AMOUNT)
  private Double compensateAmount = null;

  public static final String SERIALIZED_NAME_COMPENSATE_END_REASONS = "compensate_end_reasons";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_END_REASONS)
  private List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons> compensateEndReasons = null;

  public static final String SERIALIZED_NAME_COMPENSATE_INVALID_REASONS = "compensate_invalid_reasons";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_INVALID_REASONS)
  private List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateInvalidReasons> compensateInvalidReasons = null;

  public static final String SERIALIZED_NAME_COMPENSATE_STATUS = "compensate_status";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_STATUS)
  private ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus compensateStatus = null;

  public static final String SERIALIZED_NAME_COMPENSATE_URL = "compensate_url";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_URL)
  private String compensateUrl = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner() {
  }

  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateAmount(Double compensateAmount) {
    
    this.compensateAmount = compensateAmount;
    return this;
  }

   /**
   * 赔付金额
   * @return compensateAmount
  **/
  @javax.annotation.Nullable
  public Double getCompensateAmount() {
    return compensateAmount;
  }


  public void setCompensateAmount(Double compensateAmount) {
    this.compensateAmount = compensateAmount;
  }


  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateEndReasons(List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons> compensateEndReasons) {
    
    this.compensateEndReasons = compensateEndReasons;
    return this;
  }

  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner addCompensateEndReasonsItem(ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons compensateEndReasonsItem) {
    if (this.compensateEndReasons == null) {
      this.compensateEndReasons = new ArrayList<>();
    }
    this.compensateEndReasons.add(compensateEndReasonsItem);
    return this;
  }

   /**
   * 成本保障结束原因
   * @return compensateEndReasons
  **/
  @javax.annotation.Nullable
  public List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons> getCompensateEndReasons() {
    return compensateEndReasons;
  }


  public void setCompensateEndReasons(List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateEndReasons> compensateEndReasons) {
    this.compensateEndReasons = compensateEndReasons;
  }


  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateInvalidReasons(List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateInvalidReasons> compensateInvalidReasons) {
    
    this.compensateInvalidReasons = compensateInvalidReasons;
    return this;
  }

  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner addCompensateInvalidReasonsItem(ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateInvalidReasons compensateInvalidReasonsItem) {
    if (this.compensateInvalidReasons == null) {
      this.compensateInvalidReasons = new ArrayList<>();
    }
    this.compensateInvalidReasons.add(compensateInvalidReasonsItem);
    return this;
  }

   /**
   * 成本保障失效原因
   * @return compensateInvalidReasons
  **/
  @javax.annotation.Nullable
  public List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateInvalidReasons> getCompensateInvalidReasons() {
    return compensateInvalidReasons;
  }


  public void setCompensateInvalidReasons(List<ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateInvalidReasons> compensateInvalidReasons) {
    this.compensateInvalidReasons = compensateInvalidReasons;
  }


  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateStatus(ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus compensateStatus) {
    
    this.compensateStatus = compensateStatus;
    return this;
  }

   /**
   * Get compensateStatus
   * @return compensateStatus
  **/
  @javax.annotation.Nullable
  public ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus getCompensateStatus() {
    return compensateStatus;
  }


  public void setCompensateStatus(ProjectCostProtectStatusGetV30DataCompensateStatusInfoListCompensateStatus compensateStatus) {
    this.compensateStatus = compensateStatus;
  }


  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner compensateUrl(String compensateUrl) {
    
    this.compensateUrl = compensateUrl;
    return this;
  }

   /**
   * 赔付规则链接
   * @return compensateUrl
  **/
  @javax.annotation.Nullable
  public String getCompensateUrl() {
    return compensateUrl;
  }


  public void setCompensateUrl(String compensateUrl) {
    this.compensateUrl = compensateUrl;
  }


  public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目id
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner projectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner = (ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner) o;
    return Objects.equals(this.compensateAmount, projectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.compensateAmount) &&
        Objects.equals(this.compensateEndReasons, projectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.compensateEndReasons) &&
        Objects.equals(this.compensateInvalidReasons, projectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.compensateInvalidReasons) &&
        Objects.equals(this.compensateStatus, projectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.compensateStatus) &&
        Objects.equals(this.compensateUrl, projectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.compensateUrl) &&
        Objects.equals(this.projectId, projectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.projectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(compensateAmount, compensateEndReasons, compensateInvalidReasons, compensateStatus, compensateUrl, projectId);
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
    sb.append("class ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner {\n");
    sb.append("    compensateAmount: ").append(toIndentedString(compensateAmount)).append("\n");
    sb.append("    compensateEndReasons: ").append(toIndentedString(compensateEndReasons)).append("\n");
    sb.append("    compensateInvalidReasons: ").append(toIndentedString(compensateInvalidReasons)).append("\n");
    sb.append("    compensateStatus: ").append(toIndentedString(compensateStatus)).append("\n");
    sb.append("    compensateUrl: ").append(toIndentedString(compensateUrl)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("compensate_amount");
    openapiFields.add("compensate_end_reasons");
    openapiFields.add("compensate_invalid_reasons");
    openapiFields.add("compensate_status");
    openapiFields.add("compensate_url");
    openapiFields.add("project_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner>() {
           @Override
           public void write(JsonWriter out, ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner
  * @throws IOException if the JSON string is invalid with respect to ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner
  */
  public static ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner.class);
  }

 /**
  * Convert an instance of ProjectCostProtectStatusGetV30ResponseDataCompensateStatusInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

