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
import com.bytedance.ads.model.AdGetV2DataAudienceActionActionScene;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class AdGetV2ResponseDataAudienceAction {
  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private Long actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<AdGetV2DataAudienceActionActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_ACTION_WORDS = "action_words";
  @SerializedName(SERIALIZED_NAME_ACTION_WORDS)
  private List<Long> actionWords = null;

  public AdGetV2ResponseDataAudienceAction() {
  }

  public AdGetV2ResponseDataAudienceAction actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public AdGetV2ResponseDataAudienceAction addActionCategoriesItem(Long actionCategoriesItem) {
    if (this.actionCategories == null) {
      this.actionCategories = new ArrayList<>();
    }
    this.actionCategories.add(actionCategoriesItem);
    return this;
  }

   /**
   * 
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
  }


  public AdGetV2ResponseDataAudienceAction actionDays(Long actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * 
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public Long getActionDays() {
    return actionDays;
  }


  public void setActionDays(Long actionDays) {
    this.actionDays = actionDays;
  }


  public AdGetV2ResponseDataAudienceAction actionScene(List<AdGetV2DataAudienceActionActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public AdGetV2ResponseDataAudienceAction addActionSceneItem(AdGetV2DataAudienceActionActionScene actionSceneItem) {
    if (this.actionScene == null) {
      this.actionScene = new ArrayList<>();
    }
    this.actionScene.add(actionSceneItem);
    return this;
  }

   /**
   * 
   * @return actionScene
  **/
  @javax.annotation.Nullable
  public List<AdGetV2DataAudienceActionActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<AdGetV2DataAudienceActionActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public AdGetV2ResponseDataAudienceAction actionWords(List<Long> actionWords) {
    
    this.actionWords = actionWords;
    return this;
  }

  public AdGetV2ResponseDataAudienceAction addActionWordsItem(Long actionWordsItem) {
    if (this.actionWords == null) {
      this.actionWords = new ArrayList<>();
    }
    this.actionWords.add(actionWordsItem);
    return this;
  }

   /**
   * 
   * @return actionWords
  **/
  @javax.annotation.Nullable
  public List<Long> getActionWords() {
    return actionWords;
  }


  public void setActionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGetV2ResponseDataAudienceAction adGetV2ResponseDataAudienceAction = (AdGetV2ResponseDataAudienceAction) o;
    return Objects.equals(this.actionCategories, adGetV2ResponseDataAudienceAction.actionCategories) &&
        Objects.equals(this.actionDays, adGetV2ResponseDataAudienceAction.actionDays) &&
        Objects.equals(this.actionScene, adGetV2ResponseDataAudienceAction.actionScene) &&
        Objects.equals(this.actionWords, adGetV2ResponseDataAudienceAction.actionWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionCategories, actionDays, actionScene, actionWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGetV2ResponseDataAudienceAction {\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    actionDays: ").append(toIndentedString(actionDays)).append("\n");
    sb.append("    actionScene: ").append(toIndentedString(actionScene)).append("\n");
    sb.append("    actionWords: ").append(toIndentedString(actionWords)).append("\n");
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
    openapiFields.add("action_categories");
    openapiFields.add("action_days");
    openapiFields.add("action_scene");
    openapiFields.add("action_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdGetV2ResponseDataAudienceAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdGetV2ResponseDataAudienceAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdGetV2ResponseDataAudienceAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdGetV2ResponseDataAudienceAction.class));

       return (TypeAdapter<T>) new TypeAdapter<AdGetV2ResponseDataAudienceAction>() {
           @Override
           public void write(JsonWriter out, AdGetV2ResponseDataAudienceAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdGetV2ResponseDataAudienceAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdGetV2ResponseDataAudienceAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdGetV2ResponseDataAudienceAction
  * @throws IOException if the JSON string is invalid with respect to AdGetV2ResponseDataAudienceAction
  */
  public static AdGetV2ResponseDataAudienceAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdGetV2ResponseDataAudienceAction.class);
  }

 /**
  * Convert an instance of AdGetV2ResponseDataAudienceAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

