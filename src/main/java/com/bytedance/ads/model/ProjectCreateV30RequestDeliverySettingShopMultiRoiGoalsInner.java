/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform;
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
 * ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:36:04.545962331+08:00[Asia/Shanghai]")
public class ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner {
  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SHOP_PLATFORM = "shop_platform";
  @SerializedName(SERIALIZED_NAME_SHOP_PLATFORM)
  private ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform shopPlatform = null;

  public ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner() {
  }

  public ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner roiGoal(Double roiGoal) {
    
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


  public ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner shopPlatform(ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform shopPlatform) {
    
    this.shopPlatform = shopPlatform;
    return this;
  }

   /**
   * Get shopPlatform
   * @return shopPlatform
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform getShopPlatform() {
    return shopPlatform;
  }


  public void setShopPlatform(ProjectCreateV30DeliverySettingShopMultiRoiGoalsShopPlatform shopPlatform) {
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
    ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner projectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner = (ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner) o;
    return Objects.equals(this.roiGoal, projectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner.roiGoal) &&
        Objects.equals(this.shopPlatform, projectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner.shopPlatform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roiGoal, shopPlatform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner {\n");
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
       if (!ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner>() {
           @Override
           public void write(JsonWriter out, ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner
  * @throws IOException if the JSON string is invalid with respect to ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner
  */
  public static ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner.class);
  }

 /**
  * Convert an instance of ProjectCreateV30RequestDeliverySettingShopMultiRoiGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

