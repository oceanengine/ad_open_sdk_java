/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.33
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskDetailV30DataAudienceSettingsGender;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class StardeliveryTaskDetailV30ResponseDataAudienceSettings {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<String> age = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private StardeliveryTaskDetailV30DataAudienceSettingsGender gender = null;

  public static final String SERIALIZED_NAME_SIMILAR_GAMES = "similar_games";
  @SerializedName(SERIALIZED_NAME_SIMILAR_GAMES)
  private List<String> similarGames = null;

  public StardeliveryTaskDetailV30ResponseDataAudienceSettings() {
  }

  public StardeliveryTaskDetailV30ResponseDataAudienceSettings age(List<String> age) {
    
    this.age = age;
    return this;
  }

  public StardeliveryTaskDetailV30ResponseDataAudienceSettings addAgeItem(String ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<String> getAge() {
    return age;
  }


  public void setAge(List<String> age) {
    this.age = age;
  }


  public StardeliveryTaskDetailV30ResponseDataAudienceSettings gender(StardeliveryTaskDetailV30DataAudienceSettingsGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30DataAudienceSettingsGender getGender() {
    return gender;
  }


  public void setGender(StardeliveryTaskDetailV30DataAudienceSettingsGender gender) {
    this.gender = gender;
  }


  public StardeliveryTaskDetailV30ResponseDataAudienceSettings similarGames(List<String> similarGames) {
    
    this.similarGames = similarGames;
    return this;
  }

  public StardeliveryTaskDetailV30ResponseDataAudienceSettings addSimilarGamesItem(String similarGamesItem) {
    if (this.similarGames == null) {
      this.similarGames = new ArrayList<>();
    }
    this.similarGames.add(similarGamesItem);
    return this;
  }

   /**
   * 
   * @return similarGames
  **/
  @javax.annotation.Nullable
  public List<String> getSimilarGames() {
    return similarGames;
  }


  public void setSimilarGames(List<String> similarGames) {
    this.similarGames = similarGames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskDetailV30ResponseDataAudienceSettings stardeliveryTaskDetailV30ResponseDataAudienceSettings = (StardeliveryTaskDetailV30ResponseDataAudienceSettings) o;
    return Objects.equals(this.age, stardeliveryTaskDetailV30ResponseDataAudienceSettings.age) &&
        Objects.equals(this.gender, stardeliveryTaskDetailV30ResponseDataAudienceSettings.gender) &&
        Objects.equals(this.similarGames, stardeliveryTaskDetailV30ResponseDataAudienceSettings.similarGames);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, gender, similarGames);
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
    sb.append("class StardeliveryTaskDetailV30ResponseDataAudienceSettings {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    similarGames: ").append(toIndentedString(similarGames)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("gender");
    openapiFields.add("similar_games");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskDetailV30ResponseDataAudienceSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskDetailV30ResponseDataAudienceSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskDetailV30ResponseDataAudienceSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskDetailV30ResponseDataAudienceSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskDetailV30ResponseDataAudienceSettings>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskDetailV30ResponseDataAudienceSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskDetailV30ResponseDataAudienceSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskDetailV30ResponseDataAudienceSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskDetailV30ResponseDataAudienceSettings
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskDetailV30ResponseDataAudienceSettings
  */
  public static StardeliveryTaskDetailV30ResponseDataAudienceSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskDetailV30ResponseDataAudienceSettings.class);
  }

 /**
  * Convert an instance of StardeliveryTaskDetailV30ResponseDataAudienceSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
