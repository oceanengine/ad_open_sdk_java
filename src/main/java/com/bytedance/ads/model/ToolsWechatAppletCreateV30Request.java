/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
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
 * ToolsWechatAppletCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsWechatAppletCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_GUIDE_TEXT = "guide_text";
  @SerializedName(SERIALIZED_NAME_GUIDE_TEXT)
  private String guideText = null;

  public static final String SERIALIZED_NAME_HEADER_IMAGE_URL = "header_image_url";
  @SerializedName(SERIALIZED_NAME_HEADER_IMAGE_URL)
  private String headerImageUrl = null;

  public static final String SERIALIZED_NAME_ICON_IMAGE_URL = "icon_image_url";
  @SerializedName(SERIALIZED_NAME_ICON_IMAGE_URL)
  private String iconImageUrl = null;

  public static final String SERIALIZED_NAME_IMAGES_HORIZONTAL_URL = "images_horizontal_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_HORIZONTAL_URL)
  private List<String> imagesHorizontalUrl = null;

  public static final String SERIALIZED_NAME_IMAGES_VERTICAL_URL = "images_vertical_url";
  @SerializedName(SERIALIZED_NAME_IMAGES_VERTICAL_URL)
  private List<String> imagesVerticalUrl = null;

  public static final String SERIALIZED_NAME_INTRODUCTION = "introduction";
  @SerializedName(SERIALIZED_NAME_INTRODUCTION)
  private String introduction = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path = null;

  public static final String SERIALIZED_NAME_REMARK_MESSAGE = "remark_message";
  @SerializedName(SERIALIZED_NAME_REMARK_MESSAGE)
  private String remarkMessage = null;

  public static final String SERIALIZED_NAME_USER_NAME = "user_name";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName = null;

  public ToolsWechatAppletCreateV30Request() {
  }

  public ToolsWechatAppletCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsWechatAppletCreateV30Request guideText(String guideText) {
    
    this.guideText = guideText;
    return this;
  }

   /**
   * 
   * @return guideText
  **/
  @javax.annotation.Nullable
  public String getGuideText() {
    return guideText;
  }


  public void setGuideText(String guideText) {
    this.guideText = guideText;
  }


  public ToolsWechatAppletCreateV30Request headerImageUrl(String headerImageUrl) {
    
    this.headerImageUrl = headerImageUrl;
    return this;
  }

   /**
   * 
   * @return headerImageUrl
  **/
  @javax.annotation.Nullable
  public String getHeaderImageUrl() {
    return headerImageUrl;
  }


  public void setHeaderImageUrl(String headerImageUrl) {
    this.headerImageUrl = headerImageUrl;
  }


  public ToolsWechatAppletCreateV30Request iconImageUrl(String iconImageUrl) {
    
    this.iconImageUrl = iconImageUrl;
    return this;
  }

   /**
   * 
   * @return iconImageUrl
  **/
  @javax.annotation.Nullable
  public String getIconImageUrl() {
    return iconImageUrl;
  }


  public void setIconImageUrl(String iconImageUrl) {
    this.iconImageUrl = iconImageUrl;
  }


  public ToolsWechatAppletCreateV30Request imagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    
    this.imagesHorizontalUrl = imagesHorizontalUrl;
    return this;
  }

  public ToolsWechatAppletCreateV30Request addImagesHorizontalUrlItem(String imagesHorizontalUrlItem) {
    if (this.imagesHorizontalUrl == null) {
      this.imagesHorizontalUrl = new ArrayList<>();
    }
    this.imagesHorizontalUrl.add(imagesHorizontalUrlItem);
    return this;
  }

   /**
   * 
   * @return imagesHorizontalUrl
  **/
  @javax.annotation.Nullable
  public List<String> getImagesHorizontalUrl() {
    return imagesHorizontalUrl;
  }


  public void setImagesHorizontalUrl(List<String> imagesHorizontalUrl) {
    this.imagesHorizontalUrl = imagesHorizontalUrl;
  }


  public ToolsWechatAppletCreateV30Request imagesVerticalUrl(List<String> imagesVerticalUrl) {
    
    this.imagesVerticalUrl = imagesVerticalUrl;
    return this;
  }

  public ToolsWechatAppletCreateV30Request addImagesVerticalUrlItem(String imagesVerticalUrlItem) {
    if (this.imagesVerticalUrl == null) {
      this.imagesVerticalUrl = new ArrayList<>();
    }
    this.imagesVerticalUrl.add(imagesVerticalUrlItem);
    return this;
  }

   /**
   * 
   * @return imagesVerticalUrl
  **/
  @javax.annotation.Nullable
  public List<String> getImagesVerticalUrl() {
    return imagesVerticalUrl;
  }


  public void setImagesVerticalUrl(List<String> imagesVerticalUrl) {
    this.imagesVerticalUrl = imagesVerticalUrl;
  }


  public ToolsWechatAppletCreateV30Request introduction(String introduction) {
    
    this.introduction = introduction;
    return this;
  }

   /**
   * 
   * @return introduction
  **/
  @javax.annotation.Nullable
  public String getIntroduction() {
    return introduction;
  }


  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }


  public ToolsWechatAppletCreateV30Request labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ToolsWechatAppletCreateV30Request addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * 
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public ToolsWechatAppletCreateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsWechatAppletCreateV30Request path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * 
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ToolsWechatAppletCreateV30Request remarkMessage(String remarkMessage) {
    
    this.remarkMessage = remarkMessage;
    return this;
  }

   /**
   * 
   * @return remarkMessage
  **/
  @javax.annotation.Nullable
  public String getRemarkMessage() {
    return remarkMessage;
  }


  public void setRemarkMessage(String remarkMessage) {
    this.remarkMessage = remarkMessage;
  }


  public ToolsWechatAppletCreateV30Request userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * 
   * @return userName
  **/
  @javax.annotation.Nonnull
  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsWechatAppletCreateV30Request toolsWechatAppletCreateV30Request = (ToolsWechatAppletCreateV30Request) o;
    return Objects.equals(this.advertiserId, toolsWechatAppletCreateV30Request.advertiserId) &&
        Objects.equals(this.guideText, toolsWechatAppletCreateV30Request.guideText) &&
        Objects.equals(this.headerImageUrl, toolsWechatAppletCreateV30Request.headerImageUrl) &&
        Objects.equals(this.iconImageUrl, toolsWechatAppletCreateV30Request.iconImageUrl) &&
        Objects.equals(this.imagesHorizontalUrl, toolsWechatAppletCreateV30Request.imagesHorizontalUrl) &&
        Objects.equals(this.imagesVerticalUrl, toolsWechatAppletCreateV30Request.imagesVerticalUrl) &&
        Objects.equals(this.introduction, toolsWechatAppletCreateV30Request.introduction) &&
        Objects.equals(this.labels, toolsWechatAppletCreateV30Request.labels) &&
        Objects.equals(this.name, toolsWechatAppletCreateV30Request.name) &&
        Objects.equals(this.path, toolsWechatAppletCreateV30Request.path) &&
        Objects.equals(this.remarkMessage, toolsWechatAppletCreateV30Request.remarkMessage) &&
        Objects.equals(this.userName, toolsWechatAppletCreateV30Request.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, guideText, headerImageUrl, iconImageUrl, imagesHorizontalUrl, imagesVerticalUrl, introduction, labels, name, path, remarkMessage, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsWechatAppletCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    headerImageUrl: ").append(toIndentedString(headerImageUrl)).append("\n");
    sb.append("    iconImageUrl: ").append(toIndentedString(iconImageUrl)).append("\n");
    sb.append("    imagesHorizontalUrl: ").append(toIndentedString(imagesHorizontalUrl)).append("\n");
    sb.append("    imagesVerticalUrl: ").append(toIndentedString(imagesVerticalUrl)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    remarkMessage: ").append(toIndentedString(remarkMessage)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("guide_text");
    openapiFields.add("header_image_url");
    openapiFields.add("icon_image_url");
    openapiFields.add("images_horizontal_url");
    openapiFields.add("images_vertical_url");
    openapiFields.add("introduction");
    openapiFields.add("labels");
    openapiFields.add("name");
    openapiFields.add("path");
    openapiFields.add("remark_message");
    openapiFields.add("user_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("user_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatAppletCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatAppletCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatAppletCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatAppletCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatAppletCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsWechatAppletCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatAppletCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatAppletCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatAppletCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatAppletCreateV30Request
  */
  public static ToolsWechatAppletCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatAppletCreateV30Request.class);
  }

 /**
  * Convert an instance of ToolsWechatAppletCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

