/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
 * 微信小游戏组件
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame {
  public static final String SERIALIZED_NAME_GAME_PATH = "game_path";
  @SerializedName(SERIALIZED_NAME_GAME_PATH)
  private String gamePath = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction = null;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<String> items = null;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo = null;

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame() {
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame gamePath(String gamePath) {
    
    this.gamePath = gamePath;
    return this;
  }

   /**
   * 小游戏路径
   * @return gamePath
  **/
  @javax.annotation.Nullable
  public String getGamePath() {
    return gamePath;
  }


  public void setGamePath(String gamePath) {
    this.gamePath = gamePath;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 微信小游戏组件ID
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 简介，长度不超过40；
   * @return introduction
  **/
  @javax.annotation.Nullable
  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame items(List<String> items) {
    
    this.items = items;
    return this;
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 标签，个数不超过2，字数不超过5
   * @return items
  **/
  @javax.annotation.Nullable
  public List<String> getItems() {
    return items;
  }


  public void setItems(List<String> items) {
    this.items = items;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * logo链接
   * @return logo
  **/
  @javax.annotation.Nullable
  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame toolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame = (ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame) o;
    return Objects.equals(this.gamePath, toolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.gamePath) &&
        Objects.equals(this.instanceId, toolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.instanceId) &&
        Objects.equals(this.introduction, toolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.introduction) &&
        Objects.equals(this.items, toolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.items) &&
        Objects.equals(this.logo, toolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.logo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gamePath, instanceId, introduction, items, logo);
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
    sb.append("class ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame {\n");
    sb.append("    gamePath: ").append(toIndentedString(gamePath)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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
    openapiFields.add("game_path");
    openapiFields.add("instance_id");
    openapiFields.add("introduction");
    openapiFields.add("items");
    openapiFields.add("logo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame
  */
  public static ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

