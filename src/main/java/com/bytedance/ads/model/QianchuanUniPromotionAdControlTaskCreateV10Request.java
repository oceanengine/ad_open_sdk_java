/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanUniPromotionAdControlTaskCreateV10Scene;
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
 * QianchuanUniPromotionAdControlTaskCreateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdControlTaskCreateV10Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private QianchuanUniPromotionAdControlTaskCreateV10Scene scene = null;

  public QianchuanUniPromotionAdControlTaskCreateV10Request() {
  }

  public QianchuanUniPromotionAdControlTaskCreateV10Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 调控的目标全域控计划ID
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanUniPromotionAdControlTaskCreateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 千川广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanUniPromotionAdControlTaskCreateV10Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 调控预算，单位元，小数点后两位，注意：不得超过全域计划预算，注意：调控类型为SMART_BOOST时必填
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public QianchuanUniPromotionAdControlTaskCreateV10Request duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 调控时长，0.5h～24.0h，步进0.5h，注意：调控类型为SMART_BOOST时必填
   * minimum: 0.5
   * maximum: 24.0
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public QianchuanUniPromotionAdControlTaskCreateV10Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 任务名称，1-50个字
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanUniPromotionAdControlTaskCreateV10Request scene(QianchuanUniPromotionAdControlTaskCreateV10Scene scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * Get scene
   * @return scene
  **/
  @javax.annotation.Nonnull
  public QianchuanUniPromotionAdControlTaskCreateV10Scene getScene() {
    return scene;
  }


  public void setScene(QianchuanUniPromotionAdControlTaskCreateV10Scene scene) {
    this.scene = scene;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdControlTaskCreateV10Request qianchuanUniPromotionAdControlTaskCreateV10Request = (QianchuanUniPromotionAdControlTaskCreateV10Request) o;
    return Objects.equals(this.adId, qianchuanUniPromotionAdControlTaskCreateV10Request.adId) &&
        Objects.equals(this.advertiserId, qianchuanUniPromotionAdControlTaskCreateV10Request.advertiserId) &&
        Objects.equals(this.budget, qianchuanUniPromotionAdControlTaskCreateV10Request.budget) &&
        Objects.equals(this.duration, qianchuanUniPromotionAdControlTaskCreateV10Request.duration) &&
        Objects.equals(this.name, qianchuanUniPromotionAdControlTaskCreateV10Request.name) &&
        Objects.equals(this.scene, qianchuanUniPromotionAdControlTaskCreateV10Request.scene);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, budget, duration, name, scene);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniPromotionAdControlTaskCreateV10Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("budget");
    openapiFields.add("duration");
    openapiFields.add("name");
    openapiFields.add("scene");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("scene");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdControlTaskCreateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdControlTaskCreateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdControlTaskCreateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdControlTaskCreateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdControlTaskCreateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdControlTaskCreateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdControlTaskCreateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdControlTaskCreateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdControlTaskCreateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdControlTaskCreateV10Request
  */
  public static QianchuanUniPromotionAdControlTaskCreateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdControlTaskCreateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdControlTaskCreateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

