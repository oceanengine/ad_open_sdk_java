/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements {
  public static final String SERIALIZED_NAME_ADDITIONAL_INFORMATION = "additional_information";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFORMATION)
  private String additionalInformation = null;

  public static final String SERIALIZED_NAME_ON_CAMERA_REQUIREMENT = "on_camera_requirement";
  @SerializedName(SERIALIZED_NAME_ON_CAMERA_REQUIREMENT)
  private String onCameraRequirement = null;

  public static final String SERIALIZED_NAME_OTHER_REQUIREMENTS = "other_requirements";
  @SerializedName(SERIALIZED_NAME_OTHER_REQUIREMENTS)
  private List<String> otherRequirements = null;

  public static final String SERIALIZED_NAME_SAMPLE_MATERIAL_IDS = "sample_material_ids";
  @SerializedName(SERIALIZED_NAME_SAMPLE_MATERIAL_IDS)
  private List<String> sampleMaterialIds = null;

  public static final String SERIALIZED_NAME_SAMPLE_VIDEO_URLS = "sample_video_urls";
  @SerializedName(SERIALIZED_NAME_SAMPLE_VIDEO_URLS)
  private List<String> sampleVideoUrls = null;

  public static final String SERIALIZED_NAME_TITLE_MENTIONS_AWEME_ID = "title_mentions_aweme_id";
  @SerializedName(SERIALIZED_NAME_TITLE_MENTIONS_AWEME_ID)
  private String titleMentionsAwemeId = null;

  public static final String SERIALIZED_NAME_TITLE_REQUIREMENT = "title_requirement";
  @SerializedName(SERIALIZED_NAME_TITLE_REQUIREMENT)
  private String titleRequirement = null;

  public static final String SERIALIZED_NAME_TITLE_SPECIFIES_TOPIC_IDS = "title_specifies_topic_ids";
  @SerializedName(SERIALIZED_NAME_TITLE_SPECIFIES_TOPIC_IDS)
  private List<Long> titleSpecifiesTopicIds = null;

  public static final String SERIALIZED_NAME_VO_REQUIREMENT = "vo_requirement";
  @SerializedName(SERIALIZED_NAME_VO_REQUIREMENT)
  private String voRequirement = null;

  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements() {
  }

  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements additionalInformation(String additionalInformation) {
    
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * 
   * @return additionalInformation
  **/
  @javax.annotation.Nullable
  public String getAdditionalInformation() {
    return additionalInformation;
  }


  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements onCameraRequirement(String onCameraRequirement) {
    
    this.onCameraRequirement = onCameraRequirement;
    return this;
  }

   /**
   * 
   * @return onCameraRequirement
  **/
  @javax.annotation.Nonnull
  public String getOnCameraRequirement() {
    return onCameraRequirement;
  }


  public void setOnCameraRequirement(String onCameraRequirement) {
    this.onCameraRequirement = onCameraRequirement;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements otherRequirements(List<String> otherRequirements) {
    
    this.otherRequirements = otherRequirements;
    return this;
  }

  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements addOtherRequirementsItem(String otherRequirementsItem) {
    if (this.otherRequirements == null) {
      this.otherRequirements = new ArrayList<>();
    }
    this.otherRequirements.add(otherRequirementsItem);
    return this;
  }

   /**
   * 
   * @return otherRequirements
  **/
  @javax.annotation.Nullable
  public List<String> getOtherRequirements() {
    return otherRequirements;
  }


  public void setOtherRequirements(List<String> otherRequirements) {
    this.otherRequirements = otherRequirements;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements sampleMaterialIds(List<String> sampleMaterialIds) {
    
    this.sampleMaterialIds = sampleMaterialIds;
    return this;
  }

  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements addSampleMaterialIdsItem(String sampleMaterialIdsItem) {
    if (this.sampleMaterialIds == null) {
      this.sampleMaterialIds = new ArrayList<>();
    }
    this.sampleMaterialIds.add(sampleMaterialIdsItem);
    return this;
  }

   /**
   * 参考素材 uri
   * @return sampleMaterialIds
  **/
  @javax.annotation.Nonnull
  public List<String> getSampleMaterialIds() {
    return sampleMaterialIds;
  }


  public void setSampleMaterialIds(List<String> sampleMaterialIds) {
    this.sampleMaterialIds = sampleMaterialIds;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements sampleVideoUrls(List<String> sampleVideoUrls) {
    
    this.sampleVideoUrls = sampleVideoUrls;
    return this;
  }

  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements addSampleVideoUrlsItem(String sampleVideoUrlsItem) {
    if (this.sampleVideoUrls == null) {
      this.sampleVideoUrls = new ArrayList<>();
    }
    this.sampleVideoUrls.add(sampleVideoUrlsItem);
    return this;
  }

   /**
   * 示例视频
   * @return sampleVideoUrls
  **/
  @javax.annotation.Nullable
  public List<String> getSampleVideoUrls() {
    return sampleVideoUrls;
  }


  public void setSampleVideoUrls(List<String> sampleVideoUrls) {
    this.sampleVideoUrls = sampleVideoUrls;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements titleMentionsAwemeId(String titleMentionsAwemeId) {
    
    this.titleMentionsAwemeId = titleMentionsAwemeId;
    return this;
  }

   /**
   * 
   * @return titleMentionsAwemeId
  **/
  @javax.annotation.Nullable
  public String getTitleMentionsAwemeId() {
    return titleMentionsAwemeId;
  }


  public void setTitleMentionsAwemeId(String titleMentionsAwemeId) {
    this.titleMentionsAwemeId = titleMentionsAwemeId;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements titleRequirement(String titleRequirement) {
    
    this.titleRequirement = titleRequirement;
    return this;
  }

   /**
   * 
   * @return titleRequirement
  **/
  @javax.annotation.Nonnull
  public String getTitleRequirement() {
    return titleRequirement;
  }


  public void setTitleRequirement(String titleRequirement) {
    this.titleRequirement = titleRequirement;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements titleSpecifiesTopicIds(List<Long> titleSpecifiesTopicIds) {
    
    this.titleSpecifiesTopicIds = titleSpecifiesTopicIds;
    return this;
  }

  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements addTitleSpecifiesTopicIdsItem(Long titleSpecifiesTopicIdsItem) {
    if (this.titleSpecifiesTopicIds == null) {
      this.titleSpecifiesTopicIds = new ArrayList<>();
    }
    this.titleSpecifiesTopicIds.add(titleSpecifiesTopicIdsItem);
    return this;
  }

   /**
   * 
   * @return titleSpecifiesTopicIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTitleSpecifiesTopicIds() {
    return titleSpecifiesTopicIds;
  }


  public void setTitleSpecifiesTopicIds(List<Long> titleSpecifiesTopicIds) {
    this.titleSpecifiesTopicIds = titleSpecifiesTopicIds;
  }


  public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements voRequirement(String voRequirement) {
    
    this.voRequirement = voRequirement;
    return this;
  }

   /**
   * 
   * @return voRequirement
  **/
  @javax.annotation.Nonnull
  public String getVoRequirement() {
    return voRequirement;
  }


  public void setVoRequirement(String voRequirement) {
    this.voRequirement = voRequirement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements = (StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements) o;
    return Objects.equals(this.additionalInformation, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.additionalInformation) &&
        Objects.equals(this.onCameraRequirement, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.onCameraRequirement) &&
        Objects.equals(this.otherRequirements, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.otherRequirements) &&
        Objects.equals(this.sampleMaterialIds, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.sampleMaterialIds) &&
        Objects.equals(this.sampleVideoUrls, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.sampleVideoUrls) &&
        Objects.equals(this.titleMentionsAwemeId, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.titleMentionsAwemeId) &&
        Objects.equals(this.titleRequirement, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.titleRequirement) &&
        Objects.equals(this.titleSpecifiesTopicIds, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.titleSpecifiesTopicIds) &&
        Objects.equals(this.voRequirement, stardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.voRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, onCameraRequirement, otherRequirements, sampleMaterialIds, sampleVideoUrls, titleMentionsAwemeId, titleRequirement, titleSpecifiesTopicIds, voRequirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements {\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    onCameraRequirement: ").append(toIndentedString(onCameraRequirement)).append("\n");
    sb.append("    otherRequirements: ").append(toIndentedString(otherRequirements)).append("\n");
    sb.append("    sampleMaterialIds: ").append(toIndentedString(sampleMaterialIds)).append("\n");
    sb.append("    sampleVideoUrls: ").append(toIndentedString(sampleVideoUrls)).append("\n");
    sb.append("    titleMentionsAwemeId: ").append(toIndentedString(titleMentionsAwemeId)).append("\n");
    sb.append("    titleRequirement: ").append(toIndentedString(titleRequirement)).append("\n");
    sb.append("    titleSpecifiesTopicIds: ").append(toIndentedString(titleSpecifiesTopicIds)).append("\n");
    sb.append("    voRequirement: ").append(toIndentedString(voRequirement)).append("\n");
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
    openapiFields.add("additional_information");
    openapiFields.add("on_camera_requirement");
    openapiFields.add("other_requirements");
    openapiFields.add("sample_material_ids");
    openapiFields.add("sample_video_urls");
    openapiFields.add("title_mentions_aweme_id");
    openapiFields.add("title_requirement");
    openapiFields.add("title_specifies_topic_ids");
    openapiFields.add("vo_requirement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("on_camera_requirement");
    openapiRequiredFields.add("sample_material_ids");
    openapiRequiredFields.add("title_requirement");
    openapiRequiredFields.add("vo_requirement");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements
  */
  public static StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements.class);
  }

 /**
  * Convert an instance of StardeliveryTaskUpdateV30RequestStarTaskMaterialsRequirements to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

