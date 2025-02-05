/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.GameAddictionIdGetV30DataGameAddictionListSuggestion;
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
 * GameAddictionIdGetV30ResponseDataGameAddictionListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class GameAddictionIdGetV30ResponseDataGameAddictionListInner {
  public static final String SERIALIZED_NAME_GAME_ADDICTION_ID = "game_addiction_id";
  @SerializedName(SERIALIZED_NAME_GAME_ADDICTION_ID)
  private String gameAddictionId = null;

  public static final String SERIALIZED_NAME_GAME_ADDICTION_NAME = "game_addiction_name";
  @SerializedName(SERIALIZED_NAME_GAME_ADDICTION_NAME)
  private String gameAddictionName = null;

  public static final String SERIALIZED_NAME_ORIGIN_EVENT = "origin_event";
  @SerializedName(SERIALIZED_NAME_ORIGIN_EVENT)
  private String originEvent = null;

  public static final String SERIALIZED_NAME_SUGGESTION = "suggestion";
  @SerializedName(SERIALIZED_NAME_SUGGESTION)
  private GameAddictionIdGetV30DataGameAddictionListSuggestion suggestion = null;

  public GameAddictionIdGetV30ResponseDataGameAddictionListInner() {
  }

  public GameAddictionIdGetV30ResponseDataGameAddictionListInner gameAddictionId(String gameAddictionId) {
    
    this.gameAddictionId = gameAddictionId;
    return this;
  }

   /**
   * 
   * @return gameAddictionId
  **/
  @javax.annotation.Nullable
  public String getGameAddictionId() {
    return gameAddictionId;
  }


  public void setGameAddictionId(String gameAddictionId) {
    this.gameAddictionId = gameAddictionId;
  }


  public GameAddictionIdGetV30ResponseDataGameAddictionListInner gameAddictionName(String gameAddictionName) {
    
    this.gameAddictionName = gameAddictionName;
    return this;
  }

   /**
   * 
   * @return gameAddictionName
  **/
  @javax.annotation.Nullable
  public String getGameAddictionName() {
    return gameAddictionName;
  }


  public void setGameAddictionName(String gameAddictionName) {
    this.gameAddictionName = gameAddictionName;
  }


  public GameAddictionIdGetV30ResponseDataGameAddictionListInner originEvent(String originEvent) {
    
    this.originEvent = originEvent;
    return this;
  }

   /**
   * 
   * @return originEvent
  **/
  @javax.annotation.Nullable
  public String getOriginEvent() {
    return originEvent;
  }


  public void setOriginEvent(String originEvent) {
    this.originEvent = originEvent;
  }


  public GameAddictionIdGetV30ResponseDataGameAddictionListInner suggestion(GameAddictionIdGetV30DataGameAddictionListSuggestion suggestion) {
    
    this.suggestion = suggestion;
    return this;
  }

   /**
   * Get suggestion
   * @return suggestion
  **/
  @javax.annotation.Nullable
  public GameAddictionIdGetV30DataGameAddictionListSuggestion getSuggestion() {
    return suggestion;
  }


  public void setSuggestion(GameAddictionIdGetV30DataGameAddictionListSuggestion suggestion) {
    this.suggestion = suggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameAddictionIdGetV30ResponseDataGameAddictionListInner gameAddictionIdGetV30ResponseDataGameAddictionListInner = (GameAddictionIdGetV30ResponseDataGameAddictionListInner) o;
    return Objects.equals(this.gameAddictionId, gameAddictionIdGetV30ResponseDataGameAddictionListInner.gameAddictionId) &&
        Objects.equals(this.gameAddictionName, gameAddictionIdGetV30ResponseDataGameAddictionListInner.gameAddictionName) &&
        Objects.equals(this.originEvent, gameAddictionIdGetV30ResponseDataGameAddictionListInner.originEvent) &&
        Objects.equals(this.suggestion, gameAddictionIdGetV30ResponseDataGameAddictionListInner.suggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameAddictionId, gameAddictionName, originEvent, suggestion);
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
    sb.append("class GameAddictionIdGetV30ResponseDataGameAddictionListInner {\n");
    sb.append("    gameAddictionId: ").append(toIndentedString(gameAddictionId)).append("\n");
    sb.append("    gameAddictionName: ").append(toIndentedString(gameAddictionName)).append("\n");
    sb.append("    originEvent: ").append(toIndentedString(originEvent)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
    openapiFields.add("game_addiction_id");
    openapiFields.add("game_addiction_name");
    openapiFields.add("origin_event");
    openapiFields.add("suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GameAddictionIdGetV30ResponseDataGameAddictionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GameAddictionIdGetV30ResponseDataGameAddictionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GameAddictionIdGetV30ResponseDataGameAddictionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GameAddictionIdGetV30ResponseDataGameAddictionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GameAddictionIdGetV30ResponseDataGameAddictionListInner>() {
           @Override
           public void write(JsonWriter out, GameAddictionIdGetV30ResponseDataGameAddictionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GameAddictionIdGetV30ResponseDataGameAddictionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GameAddictionIdGetV30ResponseDataGameAddictionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GameAddictionIdGetV30ResponseDataGameAddictionListInner
  * @throws IOException if the JSON string is invalid with respect to GameAddictionIdGetV30ResponseDataGameAddictionListInner
  */
  public static GameAddictionIdGetV30ResponseDataGameAddictionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GameAddictionIdGetV30ResponseDataGameAddictionListInner.class);
  }

 /**
  * Convert an instance of GameAddictionIdGetV30ResponseDataGameAddictionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

