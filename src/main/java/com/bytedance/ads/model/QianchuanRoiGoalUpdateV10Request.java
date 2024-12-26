/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner;
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
 * QianchuanRoiGoalUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class QianchuanRoiGoalUpdateV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ROI_GOAL_UPDATES = "roi_goal_updates";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL_UPDATES)
  private List<QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner> roiGoalUpdates = null;

  public QianchuanRoiGoalUpdateV10Request() {
  }

  public QianchuanRoiGoalUpdateV10Request advertiserId(Long advertiserId) {
    
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


  public QianchuanRoiGoalUpdateV10Request roiGoalUpdates(List<QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner> roiGoalUpdates) {
    
    this.roiGoalUpdates = roiGoalUpdates;
    return this;
  }

  public QianchuanRoiGoalUpdateV10Request addRoiGoalUpdatesItem(QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner roiGoalUpdatesItem) {
    if (this.roiGoalUpdates == null) {
      this.roiGoalUpdates = new ArrayList<>();
    }
    this.roiGoalUpdates.add(roiGoalUpdatesItem);
    return this;
  }

   /**
   * 
   * @return roiGoalUpdates
  **/
  @javax.annotation.Nonnull
  public List<QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner> getRoiGoalUpdates() {
    return roiGoalUpdates;
  }


  public void setRoiGoalUpdates(List<QianchuanRoiGoalUpdateV10RequestRoiGoalUpdatesInner> roiGoalUpdates) {
    this.roiGoalUpdates = roiGoalUpdates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanRoiGoalUpdateV10Request qianchuanRoiGoalUpdateV10Request = (QianchuanRoiGoalUpdateV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanRoiGoalUpdateV10Request.advertiserId) &&
        Objects.equals(this.roiGoalUpdates, qianchuanRoiGoalUpdateV10Request.roiGoalUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, roiGoalUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanRoiGoalUpdateV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    roiGoalUpdates: ").append(toIndentedString(roiGoalUpdates)).append("\n");
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
    openapiFields.add("roi_goal_updates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("roi_goal_updates");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanRoiGoalUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanRoiGoalUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanRoiGoalUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanRoiGoalUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanRoiGoalUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanRoiGoalUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanRoiGoalUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanRoiGoalUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanRoiGoalUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanRoiGoalUpdateV10Request
  */
  public static QianchuanRoiGoalUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanRoiGoalUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanRoiGoalUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

