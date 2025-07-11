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
import com.bytedance.ads.model.ProjectBudgetUpdateV30DataBudgetMode;
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
 * ProjectBudgetUpdateV30RequestDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ProjectBudgetUpdateV30RequestDataInner {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private ProjectBudgetUpdateV30DataBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public ProjectBudgetUpdateV30RequestDataInner() {
  }

  public ProjectBudgetUpdateV30RequestDataInner budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public ProjectBudgetUpdateV30RequestDataInner budgetMode(ProjectBudgetUpdateV30DataBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nonnull
  public ProjectBudgetUpdateV30DataBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(ProjectBudgetUpdateV30DataBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public ProjectBudgetUpdateV30RequestDataInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return projectId
  **/
  @javax.annotation.Nonnull
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
    ProjectBudgetUpdateV30RequestDataInner projectBudgetUpdateV30RequestDataInner = (ProjectBudgetUpdateV30RequestDataInner) o;
    return Objects.equals(this.budget, projectBudgetUpdateV30RequestDataInner.budget) &&
        Objects.equals(this.budgetMode, projectBudgetUpdateV30RequestDataInner.budgetMode) &&
        Objects.equals(this.projectId, projectBudgetUpdateV30RequestDataInner.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetMode, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBudgetUpdateV30RequestDataInner {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("project_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget_mode");
    openapiRequiredFields.add("project_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectBudgetUpdateV30RequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectBudgetUpdateV30RequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectBudgetUpdateV30RequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectBudgetUpdateV30RequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectBudgetUpdateV30RequestDataInner>() {
           @Override
           public void write(JsonWriter out, ProjectBudgetUpdateV30RequestDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectBudgetUpdateV30RequestDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectBudgetUpdateV30RequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectBudgetUpdateV30RequestDataInner
  * @throws IOException if the JSON string is invalid with respect to ProjectBudgetUpdateV30RequestDataInner
  */
  public static ProjectBudgetUpdateV30RequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectBudgetUpdateV30RequestDataInner.class);
  }

 /**
  * Convert an instance of ProjectBudgetUpdateV30RequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

