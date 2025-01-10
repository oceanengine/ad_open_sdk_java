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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-01-10T18:43:14.581253177+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement {
  public static final String SERIALIZED_NAME_DETAIL_DEMAND = "detail_demand";
  @SerializedName(SERIALIZED_NAME_DETAIL_DEMAND)
  private String detailDemand = null;

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

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement detailDemand(String detailDemand) {
    
    this.detailDemand = detailDemand;
    return this;
  }

   /**
   * 详细要求
   * @return detailDemand
  **/
  @javax.annotation.Nullable
  public String getDetailDemand() {
    return detailDemand;
  }


  public void setDetailDemand(String detailDemand) {
    this.detailDemand = detailDemand;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement music(String music) {
    
    this.music = music;
    return this;
  }

   /**
   * 指定音乐
   * @return music
  **/
  @javax.annotation.Nullable
  public String getMusic() {
    return music;
  }


  public void setMusic(String music) {
    this.music = music;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement otherDemand(String otherDemand) {
    
    this.otherDemand = otherDemand;
    return this;
  }

   /**
   * 其他要求
   * @return otherDemand
  **/
  @javax.annotation.Nullable
  public String getOtherDemand() {
    return otherDemand;
  }


  public void setOtherDemand(String otherDemand) {
    this.otherDemand = otherDemand;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement propDemand(String propDemand) {
    
    this.propDemand = propDemand;
    return this;
  }

   /**
   * 道具要求
   * @return propDemand
  **/
  @javax.annotation.Nullable
  public String getPropDemand() {
    return propDemand;
  }


  public void setPropDemand(String propDemand) {
    this.propDemand = propDemand;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement sceneDemand(String sceneDemand) {
    
    this.sceneDemand = sceneDemand;
    return this;
  }

   /**
   * 场景要求
   * @return sceneDemand
  **/
  @javax.annotation.Nullable
  public String getSceneDemand() {
    return sceneDemand;
  }


  public void setSceneDemand(String sceneDemand) {
    this.sceneDemand = sceneDemand;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement scriptDemand(String scriptDemand) {
    
    this.scriptDemand = scriptDemand;
    return this;
  }

   /**
   * 文案要求
   * @return scriptDemand
  **/
  @javax.annotation.Nullable
  public String getScriptDemand() {
    return scriptDemand;
  }


  public void setScriptDemand(String scriptDemand) {
    this.scriptDemand = scriptDemand;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement specialTopic(String specialTopic) {
    
    this.specialTopic = specialTopic;
    return this;
  }

   /**
   * 指定话题
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
    StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement = (StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement) o;
    return Objects.equals(this.detailDemand, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.detailDemand) &&
        Objects.equals(this.music, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.music) &&
        Objects.equals(this.otherDemand, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.otherDemand) &&
        Objects.equals(this.propDemand, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.propDemand) &&
        Objects.equals(this.sceneDemand, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.sceneDemand) &&
        Objects.equals(this.scriptDemand, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.scriptDemand) &&
        Objects.equals(this.specialTopic, starOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.specialTopic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detailDemand, music, otherDemand, propDemand, sceneDemand, scriptDemand, specialTopic);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement {\n");
    sb.append("    detailDemand: ").append(toIndentedString(detailDemand)).append("\n");
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
    openapiFields.add("music");
    openapiFields.add("other_demand");
    openapiFields.add("prop_demand");
    openapiFields.add("scene_demand");
    openapiFields.add("script_demand");
    openapiFields.add("special_topic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerDemandInfoDemandRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
