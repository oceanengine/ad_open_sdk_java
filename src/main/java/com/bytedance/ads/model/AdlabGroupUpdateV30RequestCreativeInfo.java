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
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestCreativeInfoTitleMaterialsInner;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestCreativeInfoVideoMaterialsInner;
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
 * 创意维度信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class AdlabGroupUpdateV30RequestCreativeInfo {
  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH = "creative_auto_generate_switch";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH)
  private Long creativeAutoGenerateSwitch = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIALS = "image_materials";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIALS)
  private List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner> imageMaterials = null;

  public static final String SERIALIZED_NAME_INDUSTRY_V3 = "industry_v3";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_V3)
  private Long industryV3 = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private Long isCommentDisable = null;

  public static final String SERIALIZED_NAME_IS_FOLLOW_MATERIAL = "is_follow_material";
  @SerializedName(SERIALIZED_NAME_IS_FOLLOW_MATERIAL)
  private Long isFollowMaterial = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIALS = "title_materials";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIALS)
  private List<AdlabGroupUpdateV30RequestCreativeInfoTitleMaterialsInner> titleMaterials = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIALS = "video_materials";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIALS)
  private List<AdlabGroupUpdateV30RequestCreativeInfoVideoMaterialsInner> videoMaterials = null;

  public AdlabGroupUpdateV30RequestCreativeInfo() {
  }

  public AdlabGroupUpdateV30RequestCreativeInfo adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public AdlabGroupUpdateV30RequestCreativeInfo addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 创意标签（最多20个标签,且每个标签长度不超过10个字符）
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名，当ad_type&#x3D; ANDROID或者IOS时必填 ，且必须与计划维度传入的应用名称一致
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo creativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

   /**
   * 是否开启自动派生创意
   * @return creativeAutoGenerateSwitch
  **/
  @javax.annotation.Nullable
  public Long getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }


  public void setCreativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo imageMaterials(List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner> imageMaterials) {
    
    this.imageMaterials = imageMaterials;
    return this;
  }

  public AdlabGroupUpdateV30RequestCreativeInfo addImageMaterialsItem(AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner imageMaterialsItem) {
    if (this.imageMaterials == null) {
      this.imageMaterials = new ArrayList<>();
    }
    this.imageMaterials.add(imageMaterialsItem);
    return this;
  }

   /**
   * 图片素材 最多使用50张图片，当通投场景下只选择图片不选择视频时至少选择5张图片，如果视频和图片都选择则要保证一个横版视频+一个竖版视频+一张大图横图。非通投场景至少传入1张图片或1个视频
   * @return imageMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner> getImageMaterials() {
    return imageMaterials;
  }


  public void setImageMaterials(List<AdlabGroupUpdateV30RequestCreativeInfoImageMaterialsInner> imageMaterials) {
    this.imageMaterials = imageMaterials;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo industryV3(Long industryV3) {
    
    this.industryV3 = industryV3;
    return this;
  }

   /**
   * 创意分类-三级行业，填写三级行业ID
   * @return industryV3
  **/
  @javax.annotation.Nullable
  public Long getIndustryV3() {
    return industryV3;
  }


  public void setIndustryV3(Long industryV3) {
    this.industryV3 = industryV3;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo isCommentDisable(Long isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * 是否开启评论
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public Long getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(Long isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo isFollowMaterial(Long isFollowMaterial) {
    
    this.isFollowMaterial = isFollowMaterial;
    return this;
  }

   /**
   * 是否跟随素材
   * @return isFollowMaterial
  **/
  @javax.annotation.Nullable
  public Long getIsFollowMaterial() {
    return isFollowMaterial;
  }


  public void setIsFollowMaterial(Long isFollowMaterial) {
    this.isFollowMaterial = isFollowMaterial;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 搭配试玩素材url 可使用搭配试玩场景： 推广目的（landing_type）为APP，投放范围（delivery_range）为UNION穿山甲，且union_video_type &#x3D; REWARDED_VIDEO激励视频
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 广告来源，2-10个字符，当推广目的为APP时字符限制为1-20，当推广目的为应用下载且download_type为EXTERNAL_URL时必填
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo titleMaterials(List<AdlabGroupUpdateV30RequestCreativeInfoTitleMaterialsInner> titleMaterials) {
    
    this.titleMaterials = titleMaterials;
    return this;
  }

  public AdlabGroupUpdateV30RequestCreativeInfo addTitleMaterialsItem(AdlabGroupUpdateV30RequestCreativeInfoTitleMaterialsInner titleMaterialsItem) {
    if (this.titleMaterials == null) {
      this.titleMaterials = new ArrayList<>();
    }
    this.titleMaterials.add(titleMaterialsItem);
    return this;
  }

   /**
   * 标题素材 最多50个，当广告位选择通投智选时最少3个，其余场景下最少1个
   * @return titleMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupUpdateV30RequestCreativeInfoTitleMaterialsInner> getTitleMaterials() {
    return titleMaterials;
  }


  public void setTitleMaterials(List<AdlabGroupUpdateV30RequestCreativeInfoTitleMaterialsInner> titleMaterials) {
    this.titleMaterials = titleMaterials;
  }


  public AdlabGroupUpdateV30RequestCreativeInfo videoMaterials(List<AdlabGroupUpdateV30RequestCreativeInfoVideoMaterialsInner> videoMaterials) {
    
    this.videoMaterials = videoMaterials;
    return this;
  }

  public AdlabGroupUpdateV30RequestCreativeInfo addVideoMaterialsItem(AdlabGroupUpdateV30RequestCreativeInfoVideoMaterialsInner videoMaterialsItem) {
    if (this.videoMaterials == null) {
      this.videoMaterials = new ArrayList<>();
    }
    this.videoMaterials.add(videoMaterialsItem);
    return this;
  }

   /**
   * 视频素材 最多使用50个视频，当通投场景下只选择视频不选择图片时至少选择3个视频，如果视频和图片都选择则要保证一个横版视频+一个竖版视频+一张大图横图。非通投场景至少传入1张图片或1个视频
   * @return videoMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupUpdateV30RequestCreativeInfoVideoMaterialsInner> getVideoMaterials() {
    return videoMaterials;
  }


  public void setVideoMaterials(List<AdlabGroupUpdateV30RequestCreativeInfoVideoMaterialsInner> videoMaterials) {
    this.videoMaterials = videoMaterials;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupUpdateV30RequestCreativeInfo adlabGroupUpdateV30RequestCreativeInfo = (AdlabGroupUpdateV30RequestCreativeInfo) o;
    return Objects.equals(this.adKeywords, adlabGroupUpdateV30RequestCreativeInfo.adKeywords) &&
        Objects.equals(this.appName, adlabGroupUpdateV30RequestCreativeInfo.appName) &&
        Objects.equals(this.creativeAutoGenerateSwitch, adlabGroupUpdateV30RequestCreativeInfo.creativeAutoGenerateSwitch) &&
        Objects.equals(this.imageMaterials, adlabGroupUpdateV30RequestCreativeInfo.imageMaterials) &&
        Objects.equals(this.industryV3, adlabGroupUpdateV30RequestCreativeInfo.industryV3) &&
        Objects.equals(this.isCommentDisable, adlabGroupUpdateV30RequestCreativeInfo.isCommentDisable) &&
        Objects.equals(this.isFollowMaterial, adlabGroupUpdateV30RequestCreativeInfo.isFollowMaterial) &&
        Objects.equals(this.playableUrl, adlabGroupUpdateV30RequestCreativeInfo.playableUrl) &&
        Objects.equals(this.source, adlabGroupUpdateV30RequestCreativeInfo.source) &&
        Objects.equals(this.titleMaterials, adlabGroupUpdateV30RequestCreativeInfo.titleMaterials) &&
        Objects.equals(this.videoMaterials, adlabGroupUpdateV30RequestCreativeInfo.videoMaterials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeywords, appName, creativeAutoGenerateSwitch, imageMaterials, industryV3, isCommentDisable, isFollowMaterial, playableUrl, source, titleMaterials, videoMaterials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateV30RequestCreativeInfo {\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    creativeAutoGenerateSwitch: ").append(toIndentedString(creativeAutoGenerateSwitch)).append("\n");
    sb.append("    imageMaterials: ").append(toIndentedString(imageMaterials)).append("\n");
    sb.append("    industryV3: ").append(toIndentedString(industryV3)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    isFollowMaterial: ").append(toIndentedString(isFollowMaterial)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    titleMaterials: ").append(toIndentedString(titleMaterials)).append("\n");
    sb.append("    videoMaterials: ").append(toIndentedString(videoMaterials)).append("\n");
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
    openapiFields.add("ad_keywords");
    openapiFields.add("app_name");
    openapiFields.add("creative_auto_generate_switch");
    openapiFields.add("image_materials");
    openapiFields.add("industry_v3");
    openapiFields.add("is_comment_disable");
    openapiFields.add("is_follow_material");
    openapiFields.add("playable_url");
    openapiFields.add("source");
    openapiFields.add("title_materials");
    openapiFields.add("video_materials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateV30RequestCreativeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateV30RequestCreativeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateV30RequestCreativeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateV30RequestCreativeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateV30RequestCreativeInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateV30RequestCreativeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateV30RequestCreativeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateV30RequestCreativeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateV30RequestCreativeInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateV30RequestCreativeInfo
  */
  public static AdlabGroupUpdateV30RequestCreativeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateV30RequestCreativeInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateV30RequestCreativeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

