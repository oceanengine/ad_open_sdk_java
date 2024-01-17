/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEventLink;
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
 * appointEvent事件行为描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent {
  public static final String SERIALIZED_NAME_GAME_ID = "game_id";
  @SerializedName(SERIALIZED_NAME_GAME_ID)
  private String gameId = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEventLink link = null;

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent() {
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent gameId(String gameId) {
    
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏站ID
   * @return gameId
  **/
  @javax.annotation.Nullable
  public String getGameId() {
    return gameId;
  }


  public void setGameId(String gameId) {
    this.gameId = gameId;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent link(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEventLink link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEventLink getLink() {
    return link;
  }


  public void setLink(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEventLink link) {
    this.link = link;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent = (ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent) o;
    return Objects.equals(this.gameId, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent.gameId) &&
        Objects.equals(this.link, toolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent.link);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameId, link);
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
    sb.append("class ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent {\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("game_id");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent
  */
  public static ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInnerButtonAppointEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

