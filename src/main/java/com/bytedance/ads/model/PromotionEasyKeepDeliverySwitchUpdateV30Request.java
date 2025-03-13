/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionEasyKeepDeliverySwitchUpdateV30KeepDeliverySwitch;
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
 * PromotionEasyKeepDeliverySwitchUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class PromotionEasyKeepDeliverySwitchUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_KEEP_DELIVERY_SWITCH = "keep_delivery_switch";
  @SerializedName(SERIALIZED_NAME_KEEP_DELIVERY_SWITCH)
  private PromotionEasyKeepDeliverySwitchUpdateV30KeepDeliverySwitch keepDeliverySwitch = null;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "project_ids";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = null;

  public PromotionEasyKeepDeliverySwitchUpdateV30Request() {
  }

  public PromotionEasyKeepDeliverySwitchUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public PromotionEasyKeepDeliverySwitchUpdateV30Request keepDeliverySwitch(PromotionEasyKeepDeliverySwitchUpdateV30KeepDeliverySwitch keepDeliverySwitch) {
    
    this.keepDeliverySwitch = keepDeliverySwitch;
    return this;
  }

   /**
   * Get keepDeliverySwitch
   * @return keepDeliverySwitch
  **/
  @javax.annotation.Nonnull
  public PromotionEasyKeepDeliverySwitchUpdateV30KeepDeliverySwitch getKeepDeliverySwitch() {
    return keepDeliverySwitch;
  }


  public void setKeepDeliverySwitch(PromotionEasyKeepDeliverySwitchUpdateV30KeepDeliverySwitch keepDeliverySwitch) {
    this.keepDeliverySwitch = keepDeliverySwitch;
  }


  public PromotionEasyKeepDeliverySwitchUpdateV30Request projectIds(List<Long> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public PromotionEasyKeepDeliverySwitchUpdateV30Request addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * 
   * @return projectIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionEasyKeepDeliverySwitchUpdateV30Request promotionEasyKeepDeliverySwitchUpdateV30Request = (PromotionEasyKeepDeliverySwitchUpdateV30Request) o;
    return Objects.equals(this.advertiserId, promotionEasyKeepDeliverySwitchUpdateV30Request.advertiserId) &&
        Objects.equals(this.keepDeliverySwitch, promotionEasyKeepDeliverySwitchUpdateV30Request.keepDeliverySwitch) &&
        Objects.equals(this.projectIds, promotionEasyKeepDeliverySwitchUpdateV30Request.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, keepDeliverySwitch, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionEasyKeepDeliverySwitchUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    keepDeliverySwitch: ").append(toIndentedString(keepDeliverySwitch)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("keep_delivery_switch");
    openapiFields.add("project_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("keep_delivery_switch");
    openapiRequiredFields.add("project_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionEasyKeepDeliverySwitchUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionEasyKeepDeliverySwitchUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionEasyKeepDeliverySwitchUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionEasyKeepDeliverySwitchUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionEasyKeepDeliverySwitchUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, PromotionEasyKeepDeliverySwitchUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionEasyKeepDeliverySwitchUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionEasyKeepDeliverySwitchUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionEasyKeepDeliverySwitchUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to PromotionEasyKeepDeliverySwitchUpdateV30Request
  */
  public static PromotionEasyKeepDeliverySwitchUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionEasyKeepDeliverySwitchUpdateV30Request.class);
  }

 /**
  * Convert an instance of PromotionEasyKeepDeliverySwitchUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

