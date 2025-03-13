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
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2AdDataSupplementsSupplementType;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner;
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
 * CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner {
  public static final String SERIALIZED_NAME_GAMES = "games";
  @SerializedName(SERIALIZED_NAME_GAMES)
  private List<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner> games = null;

  public static final String SERIALIZED_NAME_SUPPLEMENT_TYPE = "supplement_type";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENT_TYPE)
  private CreativeProceduralCreativeUpdateV2AdDataSupplementsSupplementType supplementType = null;

  public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner() {
  }

  public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner games(List<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner> games) {
    
    this.games = games;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner addGamesItem(CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner gamesItem) {
    if (this.games == null) {
      this.games = new ArrayList<>();
    }
    this.games.add(gamesItem);
    return this;
  }

   /**
   * 
   * @return games
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner> getGames() {
    return games;
  }


  public void setGames(List<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner> games) {
    this.games = games;
  }


  public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner supplementType(CreativeProceduralCreativeUpdateV2AdDataSupplementsSupplementType supplementType) {
    
    this.supplementType = supplementType;
    return this;
  }

   /**
   * Get supplementType
   * @return supplementType
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeUpdateV2AdDataSupplementsSupplementType getSupplementType() {
    return supplementType;
  }


  public void setSupplementType(CreativeProceduralCreativeUpdateV2AdDataSupplementsSupplementType supplementType) {
    this.supplementType = supplementType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner creativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner = (CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner) o;
    return Objects.equals(this.games, creativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner.games) &&
        Objects.equals(this.supplementType, creativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner.supplementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(games, supplementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner {\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    supplementType: ").append(toIndentedString(supplementType)).append("\n");
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
    openapiFields.add("games");
    openapiFields.add("supplement_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner
  */
  public static CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

