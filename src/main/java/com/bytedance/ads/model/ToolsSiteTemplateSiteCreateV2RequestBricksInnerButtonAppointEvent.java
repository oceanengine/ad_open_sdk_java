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
import com.bytedance.ads.model.ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEventLink;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent {
  public static final String SERIALIZED_NAME_GAME_ID = "game_id";
  @SerializedName(SERIALIZED_NAME_GAME_ID)
  private String gameId = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEventLink link = null;

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent() {
  }

  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent gameId(String gameId) {
    
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏ID
   * @return gameId
  **/
  @javax.annotation.Nullable
  public String getGameId() {
    return gameId;
  }


  public void setGameId(String gameId) {
    this.gameId = gameId;
  }


  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent link(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEventLink link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEventLink getLink() {
    return link;
  }


  public void setLink(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEventLink link) {
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
    ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent toolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent = (ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent) o;
    return Objects.equals(this.gameId, toolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent.gameId) &&
        Objects.equals(this.link, toolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent.link);
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
    sb.append("class ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent {\n");
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
       if (!ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent
  */
  public static ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateSiteCreateV2RequestBricksInnerButtonAppointEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

