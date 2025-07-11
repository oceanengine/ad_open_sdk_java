/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * 产出物制作要求
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarDemandCreateAssignV2RequestDemandInfoDemandRequirement {
  public static final String SERIALIZED_NAME_DETAIL_DEMAND = "detail_demand";
  @SerializedName(SERIALIZED_NAME_DETAIL_DEMAND)
  private String detailDemand = null;

  public static final String SERIALIZED_NAME_LIVESTREAM_DEMAND = "livestream_demand";
  @SerializedName(SERIALIZED_NAME_LIVESTREAM_DEMAND)
  private String livestreamDemand = null;

  public static final String SERIALIZED_NAME_MUSIC = "music";
  @SerializedName(SERIALIZED_NAME_MUSIC)
  private String music = null;

  public static final String SERIALIZED_NAME_OTHER_DEMAND = "other_demand";
  @SerializedName(SERIALIZED_NAME_OTHER_DEMAND)
  private String otherDemand = null;

  public static final String SERIALIZED_NAME_PROP_DEMAND = "prop_demand";
  @SerializedName(SERIALIZED_NAME_PROP_DEMAND)
  private String propDemand = null;

  public static final String SERIALIZED_NAME_SCENE_DEMAND = "scene_demand";
  @SerializedName(SERIALIZED_NAME_SCENE_DEMAND)
  private String sceneDemand = null;

  public static final String SERIALIZED_NAME_SCRIPT_DEMAND = "script_demand";
  @SerializedName(SERIALIZED_NAME_SCRIPT_DEMAND)
  private String scriptDemand = null;

  public static final String SERIALIZED_NAME_SPECIAL_TOPIC = "special_topic";
  @SerializedName(SERIALIZED_NAME_SPECIAL_TOPIC)
  private String specialTopic = null;

  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement() {
  }

  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement detailDemand(String detailDemand) {
    
    this.detailDemand = detailDemand;
    return this;
  }

   /**
   * 详细要求 500字内
   * @return detailDemand
  **/
  @javax.annotation.Nullable
  public String getDetailDemand() {
    return detailDemand;
  }


  public void setDetailDemand(String detailDemand) {
    this.detailDemand = detailDemand;
  }


  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement livestreamDemand(String livestreamDemand) {
    
    this.livestreamDemand = livestreamDemand;
    return this;
  }

   /**
   * 直播要求 500字内
   * @return livestreamDemand
  **/
  @javax.annotation.Nullable
  public String getLivestreamDemand() {
    return livestreamDemand;
  }


  public void setLivestreamDemand(String livestreamDemand) {
    this.livestreamDemand = livestreamDemand;
  }


  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement music(String music) {
    
    this.music = music;
    return this;
  }

   /**
   * 指定音乐 20字内
   * @return music
  **/
  @javax.annotation.Nullable
  public String getMusic() {
    return music;
  }


  public void setMusic(String music) {
    this.music = music;
  }


  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement otherDemand(String otherDemand) {
    
    this.otherDemand = otherDemand;
    return this;
  }

   /**
   * 其他要求 500字内
   * @return otherDemand
  **/
  @javax.annotation.Nullable
  public String getOtherDemand() {
    return otherDemand;
  }


  public void setOtherDemand(String otherDemand) {
    this.otherDemand = otherDemand;
  }


  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement propDemand(String propDemand) {
    
    this.propDemand = propDemand;
    return this;
  }

   /**
   * 场景要求 20字内
   * @return propDemand
  **/
  @javax.annotation.Nullable
  public String getPropDemand() {
    return propDemand;
  }


  public void setPropDemand(String propDemand) {
    this.propDemand = propDemand;
  }


  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement sceneDemand(String sceneDemand) {
    
    this.sceneDemand = sceneDemand;
    return this;
  }

   /**
   * 场景要求 20字内
   * @return sceneDemand
  **/
  @javax.annotation.Nullable
  public String getSceneDemand() {
    return sceneDemand;
  }


  public void setSceneDemand(String sceneDemand) {
    this.sceneDemand = sceneDemand;
  }


  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement scriptDemand(String scriptDemand) {
    
    this.scriptDemand = scriptDemand;
    return this;
  }

   /**
   * 文案要求 20字内
   * @return scriptDemand
  **/
  @javax.annotation.Nullable
  public String getScriptDemand() {
    return scriptDemand;
  }


  public void setScriptDemand(String scriptDemand) {
    this.scriptDemand = scriptDemand;
  }


  public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement specialTopic(String specialTopic) {
    
    this.specialTopic = specialTopic;
    return this;
  }

   /**
   * 指定话题 40字内
   * @return specialTopic
  **/
  @javax.annotation.Nullable
  public String getSpecialTopic() {
    return specialTopic;
  }


  public void setSpecialTopic(String specialTopic) {
    this.specialTopic = specialTopic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2RequestDemandInfoDemandRequirement starDemandCreateAssignV2RequestDemandInfoDemandRequirement = (StarDemandCreateAssignV2RequestDemandInfoDemandRequirement) o;
    return Objects.equals(this.detailDemand, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.detailDemand) &&
        Objects.equals(this.livestreamDemand, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.livestreamDemand) &&
        Objects.equals(this.music, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.music) &&
        Objects.equals(this.otherDemand, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.otherDemand) &&
        Objects.equals(this.propDemand, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.propDemand) &&
        Objects.equals(this.sceneDemand, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.sceneDemand) &&
        Objects.equals(this.scriptDemand, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.scriptDemand) &&
        Objects.equals(this.specialTopic, starDemandCreateAssignV2RequestDemandInfoDemandRequirement.specialTopic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailDemand, livestreamDemand, music, otherDemand, propDemand, sceneDemand, scriptDemand, specialTopic);
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
    sb.append("class StarDemandCreateAssignV2RequestDemandInfoDemandRequirement {\n");
    sb.append("    detailDemand: ").append(toIndentedString(detailDemand)).append("\n");
    sb.append("    livestreamDemand: ").append(toIndentedString(livestreamDemand)).append("\n");
    sb.append("    music: ").append(toIndentedString(music)).append("\n");
    sb.append("    otherDemand: ").append(toIndentedString(otherDemand)).append("\n");
    sb.append("    propDemand: ").append(toIndentedString(propDemand)).append("\n");
    sb.append("    sceneDemand: ").append(toIndentedString(sceneDemand)).append("\n");
    sb.append("    scriptDemand: ").append(toIndentedString(scriptDemand)).append("\n");
    sb.append("    specialTopic: ").append(toIndentedString(specialTopic)).append("\n");
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
    openapiFields.add("detail_demand");
    openapiFields.add("livestream_demand");
    openapiFields.add("music");
    openapiFields.add("other_demand");
    openapiFields.add("prop_demand");
    openapiFields.add("scene_demand");
    openapiFields.add("script_demand");
    openapiFields.add("special_topic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("detail_demand");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2RequestDemandInfoDemandRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2RequestDemandInfoDemandRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2RequestDemandInfoDemandRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2RequestDemandInfoDemandRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2RequestDemandInfoDemandRequirement>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2RequestDemandInfoDemandRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2RequestDemandInfoDemandRequirement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2RequestDemandInfoDemandRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2RequestDemandInfoDemandRequirement
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2RequestDemandInfoDemandRequirement
  */
  public static StarDemandCreateAssignV2RequestDemandInfoDemandRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2RequestDemandInfoDemandRequirement.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2RequestDemandInfoDemandRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

