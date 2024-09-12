/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerSettingAvatar;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerSettingBackground;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerSettingButton;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerSettingLabel;
import com.bytedance.ads.model.ToolsSiteUpdateV2RequestBricksInnerSettingTitle;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ToolsSiteUpdateV2RequestBricksInnerSetting {
  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private ToolsSiteUpdateV2RequestBricksInnerSettingAvatar avatar = null;

  public static final String SERIALIZED_NAME_BACKGROUND = "background";
  @SerializedName(SERIALIZED_NAME_BACKGROUND)
  private ToolsSiteUpdateV2RequestBricksInnerSettingBackground background = null;

  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private ToolsSiteUpdateV2RequestBricksInnerSettingButton button = null;

  public static final String SERIALIZED_NAME_INTRODUCE_TYPE = "introduce_type";
  @SerializedName(SERIALIZED_NAME_INTRODUCE_TYPE)
  private String introduceType = null;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<String> items = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private ToolsSiteUpdateV2RequestBricksInnerSettingLabel label = null;

  public static final String SERIALIZED_NAME_STYLE_TYPE = "style_type";
  @SerializedName(SERIALIZED_NAME_STYLE_TYPE)
  private Long styleType = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private ToolsSiteUpdateV2RequestBricksInnerSettingTitle title = null;

  public ToolsSiteUpdateV2RequestBricksInnerSetting() {
  }

  public ToolsSiteUpdateV2RequestBricksInnerSetting avatar(ToolsSiteUpdateV2RequestBricksInnerSettingAvatar avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerSettingAvatar getAvatar() {
    return avatar;
  }


  public void setAvatar(ToolsSiteUpdateV2RequestBricksInnerSettingAvatar avatar) {
    this.avatar = avatar;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSetting background(ToolsSiteUpdateV2RequestBricksInnerSettingBackground background) {
    
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerSettingBackground getBackground() {
    return background;
  }


  public void setBackground(ToolsSiteUpdateV2RequestBricksInnerSettingBackground background) {
    this.background = background;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSetting button(ToolsSiteUpdateV2RequestBricksInnerSettingButton button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerSettingButton getButton() {
    return button;
  }


  public void setButton(ToolsSiteUpdateV2RequestBricksInnerSettingButton button) {
    this.button = button;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSetting introduceType(String introduceType) {
    
    this.introduceType = introduceType;
    return this;
  }

   /**
   * 
   * @return introduceType
  **/
  @javax.annotation.Nullable
  public String getIntroduceType() {
    return introduceType;
  }


  public void setIntroduceType(String introduceType) {
    this.introduceType = introduceType;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSetting items(List<String> items) {
    
    this.items = items;
    return this;
  }

  public ToolsSiteUpdateV2RequestBricksInnerSetting addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 
   * @return items
  **/
  @javax.annotation.Nullable
  public List<String> getItems() {
    return items;
  }


  public void setItems(List<String> items) {
    this.items = items;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSetting label(ToolsSiteUpdateV2RequestBricksInnerSettingLabel label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerSettingLabel getLabel() {
    return label;
  }


  public void setLabel(ToolsSiteUpdateV2RequestBricksInnerSettingLabel label) {
    this.label = label;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSetting styleType(Long styleType) {
    
    this.styleType = styleType;
    return this;
  }

   /**
   * 
   * @return styleType
  **/
  @javax.annotation.Nullable
  public Long getStyleType() {
    return styleType;
  }


  public void setStyleType(Long styleType) {
    this.styleType = styleType;
  }


  public ToolsSiteUpdateV2RequestBricksInnerSetting title(ToolsSiteUpdateV2RequestBricksInnerSettingTitle title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public ToolsSiteUpdateV2RequestBricksInnerSettingTitle getTitle() {
    return title;
  }


  public void setTitle(ToolsSiteUpdateV2RequestBricksInnerSettingTitle title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteUpdateV2RequestBricksInnerSetting toolsSiteUpdateV2RequestBricksInnerSetting = (ToolsSiteUpdateV2RequestBricksInnerSetting) o;
    return Objects.equals(this.avatar, toolsSiteUpdateV2RequestBricksInnerSetting.avatar) &&
        Objects.equals(this.background, toolsSiteUpdateV2RequestBricksInnerSetting.background) &&
        Objects.equals(this.button, toolsSiteUpdateV2RequestBricksInnerSetting.button) &&
        Objects.equals(this.introduceType, toolsSiteUpdateV2RequestBricksInnerSetting.introduceType) &&
        Objects.equals(this.items, toolsSiteUpdateV2RequestBricksInnerSetting.items) &&
        Objects.equals(this.label, toolsSiteUpdateV2RequestBricksInnerSetting.label) &&
        Objects.equals(this.styleType, toolsSiteUpdateV2RequestBricksInnerSetting.styleType) &&
        Objects.equals(this.title, toolsSiteUpdateV2RequestBricksInnerSetting.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, background, button, introduceType, items, label, styleType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteUpdateV2RequestBricksInnerSetting {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    introduceType: ").append(toIndentedString(introduceType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    styleType: ").append(toIndentedString(styleType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("avatar");
    openapiFields.add("background");
    openapiFields.add("button");
    openapiFields.add("introduce_type");
    openapiFields.add("items");
    openapiFields.add("label");
    openapiFields.add("style_type");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteUpdateV2RequestBricksInnerSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteUpdateV2RequestBricksInnerSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteUpdateV2RequestBricksInnerSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteUpdateV2RequestBricksInnerSetting>() {
           @Override
           public void write(JsonWriter out, ToolsSiteUpdateV2RequestBricksInnerSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteUpdateV2RequestBricksInnerSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteUpdateV2RequestBricksInnerSetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteUpdateV2RequestBricksInnerSetting
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteUpdateV2RequestBricksInnerSetting
  */
  public static ToolsSiteUpdateV2RequestBricksInnerSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteUpdateV2RequestBricksInnerSetting.class);
  }

 /**
  * Convert an instance of ToolsSiteUpdateV2RequestBricksInnerSetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
