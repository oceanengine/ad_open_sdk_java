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
import com.bytedance.ads.model.ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform;
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
 * ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner {
  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SHOP_PLATFORM = "shop_platform";
  @SerializedName(SERIALIZED_NAME_SHOP_PLATFORM)
  private ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform shopPlatform = null;

  public ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner() {
  }

  public ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner shopPlatform(ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform shopPlatform) {
    
    this.shopPlatform = shopPlatform;
    return this;
  }

   /**
   * Get shopPlatform
   * @return shopPlatform
  **/
  @javax.annotation.Nullable
  public ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform getShopPlatform() {
    return shopPlatform;
  }


  public void setShopPlatform(ProjectRoigoalUpdateV30DataShopMultiRoiGoalsShopPlatform shopPlatform) {
    this.shopPlatform = shopPlatform;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner projectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner = (ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner) o;
    return Objects.equals(this.roiGoal, projectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner.roiGoal) &&
        Objects.equals(this.shopPlatform, projectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner.shopPlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roiGoal, shopPlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner {\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    shopPlatform: ").append(toIndentedString(shopPlatform)).append("\n");
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
    openapiFields.add("roi_goal");
    openapiFields.add("shop_platform");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner>() {
           @Override
           public void write(JsonWriter out, ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner
  * @throws IOException if the JSON string is invalid with respect to ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner
  */
  public static ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner.class);
  }

 /**
  * Convert an instance of ProjectRoigoalUpdateV30RequestDataInnerShopMultiRoiGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

