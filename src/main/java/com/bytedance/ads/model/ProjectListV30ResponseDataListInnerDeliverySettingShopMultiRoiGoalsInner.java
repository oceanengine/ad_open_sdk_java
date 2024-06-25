/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform;
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
 * ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner {
  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SHOP_PLATFORM = "shop_platform";
  @SerializedName(SERIALIZED_NAME_SHOP_PLATFORM)
  private ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform shopPlatform = null;

  public ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner() {
  }

  public ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner roiGoal(Double roiGoal) {
    
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


  public ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner shopPlatform(ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform shopPlatform) {
    
    this.shopPlatform = shopPlatform;
    return this;
  }

   /**
   * Get shopPlatform
   * @return shopPlatform
  **/
  @javax.annotation.Nullable
  public ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform getShopPlatform() {
    return shopPlatform;
  }


  public void setShopPlatform(ProjectListV30DataListDeliverySettingShopMultiRoiGoalsShopPlatform shopPlatform) {
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
    ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner projectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner = (ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner) o;
    return Objects.equals(this.roiGoal, projectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner.roiGoal) &&
        Objects.equals(this.shopPlatform, projectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner.shopPlatform);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roiGoal, shopPlatform);
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
    sb.append("class ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner {\n");
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
       if (!ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner>() {
           @Override
           public void write(JsonWriter out, ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner
  * @throws IOException if the JSON string is invalid with respect to ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner
  */
  public static ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner.class);
  }

 /**
  * Convert an instance of ProjectListV30ResponseDataListInnerDeliverySettingShopMultiRoiGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

