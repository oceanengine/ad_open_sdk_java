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
import com.bytedance.ads.model.ProjectCreateV30OptimizeGoalDeepExternalAction;
import com.bytedance.ads.model.ProjectCreateV30OptimizeGoalExternalAction;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ProjectCreateV30RequestOptimizeGoal {
  public static final String SERIALIZED_NAME_ASSET_IDS = "asset_ids";
  @SerializedName(SERIALIZED_NAME_ASSET_IDS)
  private List<Long> assetIds = null;

  public static final String SERIALIZED_NAME_CONVERT_ID = "convert_id";
  @SerializedName(SERIALIZED_NAME_CONVERT_ID)
  private Long convertId = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private ProjectCreateV30OptimizeGoalDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private ProjectCreateV30OptimizeGoalExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_PAID_SWITCH = "paid_switch";
  @SerializedName(SERIALIZED_NAME_PAID_SWITCH)
  private Long paidSwitch = null;

  public ProjectCreateV30RequestOptimizeGoal() {
  }

  public ProjectCreateV30RequestOptimizeGoal assetIds(List<Long> assetIds) {
    
    this.assetIds = assetIds;
    return this;
  }

  public ProjectCreateV30RequestOptimizeGoal addAssetIdsItem(Long assetIdsItem) {
    if (this.assetIds == null) {
      this.assetIds = new ArrayList<>();
    }
    this.assetIds.add(assetIdsItem);
    return this;
  }

   /**
   * 
   * @return assetIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAssetIds() {
    return assetIds;
  }


  public void setAssetIds(List<Long> assetIds) {
    this.assetIds = assetIds;
  }


  public ProjectCreateV30RequestOptimizeGoal convertId(Long convertId) {
    
    this.convertId = convertId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return convertId
  **/
  @javax.annotation.Nullable
  public Long getConvertId() {
    return convertId;
  }


  public void setConvertId(Long convertId) {
    this.convertId = convertId;
  }


  public ProjectCreateV30RequestOptimizeGoal deepExternalAction(ProjectCreateV30OptimizeGoalDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30OptimizeGoalDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(ProjectCreateV30OptimizeGoalDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public ProjectCreateV30RequestOptimizeGoal externalAction(ProjectCreateV30OptimizeGoalExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30OptimizeGoalExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(ProjectCreateV30OptimizeGoalExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public ProjectCreateV30RequestOptimizeGoal paidSwitch(Long paidSwitch) {
    
    this.paidSwitch = paidSwitch;
    return this;
  }

   /**
   * paid启用开关
   * @return paidSwitch
  **/
  @javax.annotation.Nullable
  public Long getPaidSwitch() {
    return paidSwitch;
  }


  public void setPaidSwitch(Long paidSwitch) {
    this.paidSwitch = paidSwitch;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateV30RequestOptimizeGoal projectCreateV30RequestOptimizeGoal = (ProjectCreateV30RequestOptimizeGoal) o;
    return Objects.equals(this.assetIds, projectCreateV30RequestOptimizeGoal.assetIds) &&
        Objects.equals(this.convertId, projectCreateV30RequestOptimizeGoal.convertId) &&
        Objects.equals(this.deepExternalAction, projectCreateV30RequestOptimizeGoal.deepExternalAction) &&
        Objects.equals(this.externalAction, projectCreateV30RequestOptimizeGoal.externalAction) &&
        Objects.equals(this.paidSwitch, projectCreateV30RequestOptimizeGoal.paidSwitch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, convertId, deepExternalAction, externalAction, paidSwitch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateV30RequestOptimizeGoal {\n");
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    convertId: ").append(toIndentedString(convertId)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    paidSwitch: ").append(toIndentedString(paidSwitch)).append("\n");
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
    openapiFields.add("asset_ids");
    openapiFields.add("convert_id");
    openapiFields.add("deep_external_action");
    openapiFields.add("external_action");
    openapiFields.add("paid_switch");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCreateV30RequestOptimizeGoal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreateV30RequestOptimizeGoal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreateV30RequestOptimizeGoal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreateV30RequestOptimizeGoal.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreateV30RequestOptimizeGoal>() {
           @Override
           public void write(JsonWriter out, ProjectCreateV30RequestOptimizeGoal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreateV30RequestOptimizeGoal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreateV30RequestOptimizeGoal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreateV30RequestOptimizeGoal
  * @throws IOException if the JSON string is invalid with respect to ProjectCreateV30RequestOptimizeGoal
  */
  public static ProjectCreateV30RequestOptimizeGoal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreateV30RequestOptimizeGoal.class);
  }

 /**
  * Convert an instance of ProjectCreateV30RequestOptimizeGoal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

