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
 * 产出物制作要求
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement {
  public static final String SERIALIZED_NAME_BOON_LIST = "boon_list";
  @SerializedName(SERIALIZED_NAME_BOON_LIST)
  private List<Long> boonList = null;

  public static final String SERIALIZED_NAME_BROADCAST_DEMAND = "broadcast_demand";
  @SerializedName(SERIALIZED_NAME_BROADCAST_DEMAND)
  private String broadcastDemand = null;

  public static final String SERIALIZED_NAME_BROADCAST_NUM = "broadcast_num";
  @SerializedName(SERIALIZED_NAME_BROADCAST_NUM)
  private Long broadcastNum = null;

  public static final String SERIALIZED_NAME_EXTRA_DEMAND = "extra_demand";
  @SerializedName(SERIALIZED_NAME_EXTRA_DEMAND)
  private String extraDemand = null;

  public static final String SERIALIZED_NAME_LIVE_SCEEN_TYPE = "live_sceen_type";
  @SerializedName(SERIALIZED_NAME_LIVE_SCEEN_TYPE)
  private Long liveSceenType = null;

  public static final String SERIALIZED_NAME_ORAL_DEMAND = "oral_demand";
  @SerializedName(SERIALIZED_NAME_ORAL_DEMAND)
  private String oralDemand = null;

  public static final String SERIALIZED_NAME_OTHER_BOON = "other_boon";
  @SerializedName(SERIALIZED_NAME_OTHER_BOON)
  private String otherBoon = null;

  public static final String SERIALIZED_NAME_OTHER_DEMAND = "other_demand";
  @SerializedName(SERIALIZED_NAME_OTHER_DEMAND)
  private List<String> otherDemand = null;

  public static final String SERIALIZED_NAME_SCENE_DEMAND = "scene_demand";
  @SerializedName(SERIALIZED_NAME_SCENE_DEMAND)
  private String sceneDemand = null;

  public static final String SERIALIZED_NAME_STRONG_REQUIREMENTS = "strong_requirements";
  @SerializedName(SERIALIZED_NAME_STRONG_REQUIREMENTS)
  private List<String> strongRequirements = null;

  public static final String SERIALIZED_NAME_TITLE_DEMAND = "title_demand";
  @SerializedName(SERIALIZED_NAME_TITLE_DEMAND)
  private String titleDemand = null;

  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement() {
  }

  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement boonList(List<Long> boonList) {
    
    this.boonList = boonList;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement addBoonListItem(Long boonListItem) {
    if (this.boonList == null) {
      this.boonList = new ArrayList<>();
    }
    this.boonList.add(boonListItem);
    return this;
  }

   /**
   * 福利相关（直播必选一个）
   * @return boonList
  **/
  @javax.annotation.Nullable
  public List<Long> getBoonList() {
    return boonList;
  }


  public void setBoonList(List<Long> boonList) {
    this.boonList = boonList;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement broadcastDemand(String broadcastDemand) {
    
    this.broadcastDemand = broadcastDemand;
    return this;
  }

   /**
   * 口播要求
   * @return broadcastDemand
  **/
  @javax.annotation.Nullable
  public String getBroadcastDemand() {
    return broadcastDemand;
  }


  public void setBroadcastDemand(String broadcastDemand) {
    this.broadcastDemand = broadcastDemand;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement broadcastNum(Long broadcastNum) {
    
    this.broadcastNum = broadcastNum;
    return this;
  }

   /**
   * 口播次数
   * @return broadcastNum
  **/
  @javax.annotation.Nullable
  public Long getBroadcastNum() {
    return broadcastNum;
  }


  public void setBroadcastNum(Long broadcastNum) {
    this.broadcastNum = broadcastNum;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement extraDemand(String extraDemand) {
    
    this.extraDemand = extraDemand;
    return this;
  }

   /**
   * 补充要求
   * @return extraDemand
  **/
  @javax.annotation.Nullable
  public String getExtraDemand() {
    return extraDemand;
  }


  public void setExtraDemand(String extraDemand) {
    this.extraDemand = extraDemand;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement liveSceenType(Long liveSceenType) {
    
    this.liveSceenType = liveSceenType;
    return this;
  }

   /**
   * 直播画面
   * @return liveSceenType
  **/
  @javax.annotation.Nullable
  public Long getLiveSceenType() {
    return liveSceenType;
  }


  public void setLiveSceenType(Long liveSceenType) {
    this.liveSceenType = liveSceenType;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement oralDemand(String oralDemand) {
    
    this.oralDemand = oralDemand;
    return this;
  }

   /**
   * 口播要求 60字内
   * @return oralDemand
  **/
  @javax.annotation.Nullable
  public String getOralDemand() {
    return oralDemand;
  }


  public void setOralDemand(String oralDemand) {
    this.oralDemand = oralDemand;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement otherBoon(String otherBoon) {
    
    this.otherBoon = otherBoon;
    return this;
  }

   /**
   * 其他福利
   * @return otherBoon
  **/
  @javax.annotation.Nullable
  public String getOtherBoon() {
    return otherBoon;
  }


  public void setOtherBoon(String otherBoon) {
    this.otherBoon = otherBoon;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement otherDemand(List<String> otherDemand) {
    
    this.otherDemand = otherDemand;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement addOtherDemandItem(String otherDemandItem) {
    if (this.otherDemand == null) {
      this.otherDemand = new ArrayList<>();
    }
    this.otherDemand.add(otherDemandItem);
    return this;
  }

   /**
   * 其他要求 60字内
   * @return otherDemand
  **/
  @javax.annotation.Nullable
  public List<String> getOtherDemand() {
    return otherDemand;
  }


  public void setOtherDemand(List<String> otherDemand) {
    this.otherDemand = otherDemand;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement sceneDemand(String sceneDemand) {
    
    this.sceneDemand = sceneDemand;
    return this;
  }

   /**
   * 镜头要求 60字内
   * @return sceneDemand
  **/
  @javax.annotation.Nonnull
  public String getSceneDemand() {
    return sceneDemand;
  }


  public void setSceneDemand(String sceneDemand) {
    this.sceneDemand = sceneDemand;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement strongRequirements(List<String> strongRequirements) {
    
    this.strongRequirements = strongRequirements;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement addStrongRequirementsItem(String strongRequirementsItem) {
    if (this.strongRequirements == null) {
      this.strongRequirements = new ArrayList<>();
    }
    this.strongRequirements.add(strongRequirementsItem);
    return this;
  }

   /**
   * 
   * @return strongRequirements
  **/
  @javax.annotation.Nullable
  public List<String> getStrongRequirements() {
    return strongRequirements;
  }


  public void setStrongRequirements(List<String> strongRequirements) {
    this.strongRequirements = strongRequirements;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement titleDemand(String titleDemand) {
    
    this.titleDemand = titleDemand;
    return this;
  }

   /**
   * 标题要求 80字内
   * @return titleDemand
  **/
  @javax.annotation.Nullable
  public String getTitleDemand() {
    return titleDemand;
  }


  public void setTitleDemand(String titleDemand) {
    this.titleDemand = titleDemand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement = (StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement) o;
    return Objects.equals(this.boonList, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.boonList) &&
        Objects.equals(this.broadcastDemand, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.broadcastDemand) &&
        Objects.equals(this.broadcastNum, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.broadcastNum) &&
        Objects.equals(this.extraDemand, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.extraDemand) &&
        Objects.equals(this.liveSceenType, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.liveSceenType) &&
        Objects.equals(this.oralDemand, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.oralDemand) &&
        Objects.equals(this.otherBoon, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.otherBoon) &&
        Objects.equals(this.otherDemand, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.otherDemand) &&
        Objects.equals(this.sceneDemand, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.sceneDemand) &&
        Objects.equals(this.strongRequirements, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.strongRequirements) &&
        Objects.equals(this.titleDemand, starDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.titleDemand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boonList, broadcastDemand, broadcastNum, extraDemand, liveSceenType, oralDemand, otherBoon, otherDemand, sceneDemand, strongRequirements, titleDemand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement {\n");
    sb.append("    boonList: ").append(toIndentedString(boonList)).append("\n");
    sb.append("    broadcastDemand: ").append(toIndentedString(broadcastDemand)).append("\n");
    sb.append("    broadcastNum: ").append(toIndentedString(broadcastNum)).append("\n");
    sb.append("    extraDemand: ").append(toIndentedString(extraDemand)).append("\n");
    sb.append("    liveSceenType: ").append(toIndentedString(liveSceenType)).append("\n");
    sb.append("    oralDemand: ").append(toIndentedString(oralDemand)).append("\n");
    sb.append("    otherBoon: ").append(toIndentedString(otherBoon)).append("\n");
    sb.append("    otherDemand: ").append(toIndentedString(otherDemand)).append("\n");
    sb.append("    sceneDemand: ").append(toIndentedString(sceneDemand)).append("\n");
    sb.append("    strongRequirements: ").append(toIndentedString(strongRequirements)).append("\n");
    sb.append("    titleDemand: ").append(toIndentedString(titleDemand)).append("\n");
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
    openapiFields.add("boon_list");
    openapiFields.add("broadcast_demand");
    openapiFields.add("broadcast_num");
    openapiFields.add("extra_demand");
    openapiFields.add("live_sceen_type");
    openapiFields.add("oral_demand");
    openapiFields.add("other_boon");
    openapiFields.add("other_demand");
    openapiFields.add("scene_demand");
    openapiFields.add("strong_requirements");
    openapiFields.add("title_demand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scene_demand");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement
  */
  public static StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

