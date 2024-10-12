/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag;
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
 * 投稿达人范围
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange {
  public static final String SERIALIZED_NAME_AUTHOR_UIDS = "author_uids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_UIDS)
  private List<Long> authorUids = null;

  public static final String SERIALIZED_NAME_AUTHOR_WATCHER_TAG = "author_watcher_tag";
  @SerializedName(SERIALIZED_NAME_AUTHOR_WATCHER_TAG)
  private StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag = null;

  public static final String SERIALIZED_NAME_CONTENT_TAGS = "content_tags";
  @SerializedName(SERIALIZED_NAME_CONTENT_TAGS)
  private List<Long> contentTags = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private List<String> gender = null;

  public static final String SERIALIZED_NAME_MAX_FOLLOWER = "max_follower";
  @SerializedName(SERIALIZED_NAME_MAX_FOLLOWER)
  private Long maxFollower = null;

  public static final String SERIALIZED_NAME_MIN_FOLLOWER = "min_follower";
  @SerializedName(SERIALIZED_NAME_MIN_FOLLOWER)
  private Long minFollower = null;

  public static final String SERIALIZED_NAME_PROVINCES = "provinces";
  @SerializedName(SERIALIZED_NAME_PROVINCES)
  private List<String> provinces = null;

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange() {
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange authorUids(List<Long> authorUids) {
    
    this.authorUids = authorUids;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange addAuthorUidsItem(Long authorUidsItem) {
    if (this.authorUids == null) {
      this.authorUids = new ArrayList<>();
    }
    this.authorUids.add(authorUidsItem);
    return this;
  }

   /**
   * 达人ID列表 达人的抖音uid（仅自定义结算可用）
   * @return authorUids
  **/
  @javax.annotation.Nullable
  public List<Long> getAuthorUids() {
    return authorUids;
  }


  public void setAuthorUids(List<Long> authorUids) {
    this.authorUids = authorUids;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange authorWatcherTag(StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag) {
    
    this.authorWatcherTag = authorWatcherTag;
    return this;
  }

   /**
   * Get authorWatcherTag
   * @return authorWatcherTag
  **/
  @javax.annotation.Nullable
  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag getAuthorWatcherTag() {
    return authorWatcherTag;
  }


  public void setAuthorWatcherTag(StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRangeAuthorWatcherTag authorWatcherTag) {
    this.authorWatcherTag = authorWatcherTag;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange contentTags(List<Long> contentTags) {
    
    this.contentTags = contentTags;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange addContentTagsItem(Long contentTagsItem) {
    if (this.contentTags == null) {
      this.contentTags = new ArrayList<>();
    }
    this.contentTags.add(contentTagsItem);
    return this;
  }

   /**
   * 达人内容类型标签列表 「投稿任务创建数据字典」返回的content_tags中标签的tag_value值构成的列表
   * @return contentTags
  **/
  @javax.annotation.Nullable
  public List<Long> getContentTags() {
    return contentTags;
  }


  public void setContentTags(List<Long> contentTags) {
    this.contentTags = contentTags;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange gender(List<String> gender) {
    
    this.gender = gender;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<>();
    }
    this.gender.add(genderItem);
    return this;
  }

   /**
   * 达人性别 “男”，“女”
   * @return gender
  **/
  @javax.annotation.Nullable
  public List<String> getGender() {
    return gender;
  }


  public void setGender(List<String> gender) {
    this.gender = gender;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange maxFollower(Long maxFollower) {
    
    this.maxFollower = maxFollower;
    return this;
  }

   /**
   * 达人粉丝量范围最大值 不得小于min_follower(如有)
   * @return maxFollower
  **/
  @javax.annotation.Nullable
  public Long getMaxFollower() {
    return maxFollower;
  }


  public void setMaxFollower(Long maxFollower) {
    this.maxFollower = maxFollower;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange minFollower(Long minFollower) {
    
    this.minFollower = minFollower;
    return this;
  }

   /**
   * 达人粉丝量范围最小值 非负整数
   * @return minFollower
  **/
  @javax.annotation.Nullable
  public Long getMinFollower() {
    return minFollower;
  }


  public void setMinFollower(Long minFollower) {
    this.minFollower = minFollower;
  }


  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange provinces(List<String> provinces) {
    
    this.provinces = provinces;
    return this;
  }

  public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange addProvincesItem(String provincesItem) {
    if (this.provinces == null) {
      this.provinces = new ArrayList<>();
    }
    this.provinces.add(provincesItem);
    return this;
  }

   /**
   * 达人省份 「投稿任务创建数据字典」返回的provinces中的项 形如“北京市”、“江苏省”
   * @return provinces
  **/
  @javax.annotation.Nullable
  public List<String> getProvinces() {
    return provinces;
  }


  public void setProvinces(List<String> provinces) {
    this.provinces = provinces;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange = (StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange) o;
    return Objects.equals(this.authorUids, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.authorUids) &&
        Objects.equals(this.authorWatcherTag, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.authorWatcherTag) &&
        Objects.equals(this.contentTags, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.contentTags) &&
        Objects.equals(this.gender, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.gender) &&
        Objects.equals(this.maxFollower, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.maxFollower) &&
        Objects.equals(this.minFollower, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.minFollower) &&
        Objects.equals(this.provinces, starDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.provinces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorUids, authorWatcherTag, contentTags, gender, maxFollower, minFollower, provinces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange {\n");
    sb.append("    authorUids: ").append(toIndentedString(authorUids)).append("\n");
    sb.append("    authorWatcherTag: ").append(toIndentedString(authorWatcherTag)).append("\n");
    sb.append("    contentTags: ").append(toIndentedString(contentTags)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maxFollower: ").append(toIndentedString(maxFollower)).append("\n");
    sb.append("    minFollower: ").append(toIndentedString(minFollower)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
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
    openapiFields.add("author_uids");
    openapiFields.add("author_watcher_tag");
    openapiFields.add("content_tags");
    openapiFields.add("gender");
    openapiFields.add("max_follower");
    openapiFields.add("min_follower");
    openapiFields.add("provinces");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange
  */
  public static StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestChallengeInfoParticipateAuthorRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

