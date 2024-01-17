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
import com.bytedance.ads.model.ToolsSiteTemplateGetV2DataListBricksType;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerCoupon;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerForm;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPicture;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroup;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerText;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatApplet;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatGame;
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
 * ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner {
  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton button = null;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerCoupon coupon = null;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerForm form = null;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index = null;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPicture picture = null;

  public static final String SERIALIZED_NAME_PICTURE_GROUP = "picture_group";
  @SerializedName(SERIALIZED_NAME_PICTURE_GROUP)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroup pictureGroup = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerText text = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ToolsSiteTemplateGetV2DataListBricksType type = null;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo video = null;

  public static final String SERIALIZED_NAME_WECHAT_APPLET = "wechat_applet";
  @SerializedName(SERIALIZED_NAME_WECHAT_APPLET)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatApplet wechatApplet = null;

  public static final String SERIALIZED_NAME_WECHAT_GAME = "wechat_game";
  @SerializedName(SERIALIZED_NAME_WECHAT_GAME)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatGame wechatGame = null;

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner() {
  }

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner button(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton getButton() {
    return button;
  }


  public void setButton(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerButton button) {
    this.button = button;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner coupon(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerCoupon coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerCoupon getCoupon() {
    return coupon;
  }


  public void setCoupon(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerCoupon coupon) {
    this.coupon = coupon;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner form(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerForm form) {
    
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerForm getForm() {
    return form;
  }


  public void setForm(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerForm form) {
    this.form = form;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner index(String index) {
    
    this.index = index;
    return this;
  }

   /**
   * 组件在模板中的位置描述
   * @return index
  **/
  @javax.annotation.Nullable
  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner picture(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPicture picture) {
    
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPicture getPicture() {
    return picture;
  }


  public void setPicture(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPicture picture) {
    this.picture = picture;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner pictureGroup(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroup pictureGroup) {
    
    this.pictureGroup = pictureGroup;
    return this;
  }

   /**
   * Get pictureGroup
   * @return pictureGroup
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroup getPictureGroup() {
    return pictureGroup;
  }


  public void setPictureGroup(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerPictureGroup pictureGroup) {
    this.pictureGroup = pictureGroup;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner text(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerText text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerText getText() {
    return text;
  }


  public void setText(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerText text) {
    this.text = text;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner type(ToolsSiteTemplateGetV2DataListBricksType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2DataListBricksType getType() {
    return type;
  }


  public void setType(ToolsSiteTemplateGetV2DataListBricksType type) {
    this.type = type;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner video(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo getVideo() {
    return video;
  }


  public void setVideo(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo video) {
    this.video = video;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner wechatApplet(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatApplet wechatApplet) {
    
    this.wechatApplet = wechatApplet;
    return this;
  }

   /**
   * Get wechatApplet
   * @return wechatApplet
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatApplet getWechatApplet() {
    return wechatApplet;
  }


  public void setWechatApplet(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatApplet wechatApplet) {
    this.wechatApplet = wechatApplet;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner wechatGame(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatGame wechatGame) {
    
    this.wechatGame = wechatGame;
    return this;
  }

   /**
   * Get wechatGame
   * @return wechatGame
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatGame getWechatGame() {
    return wechatGame;
  }


  public void setWechatGame(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerWechatGame wechatGame) {
    this.wechatGame = wechatGame;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner toolsSiteTemplateGetV2ResponseDataListInnerBricksInner = (ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner) o;
    return Objects.equals(this.button, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.button) &&
        Objects.equals(this.coupon, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.coupon) &&
        Objects.equals(this.form, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.form) &&
        Objects.equals(this.index, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.index) &&
        Objects.equals(this.picture, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.picture) &&
        Objects.equals(this.pictureGroup, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.pictureGroup) &&
        Objects.equals(this.text, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.text) &&
        Objects.equals(this.type, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.type) &&
        Objects.equals(this.video, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.video) &&
        Objects.equals(this.wechatApplet, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.wechatApplet) &&
        Objects.equals(this.wechatGame, toolsSiteTemplateGetV2ResponseDataListInnerBricksInner.wechatGame);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, coupon, form, index, picture, pictureGroup, text, type, video, wechatApplet, wechatGame);
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
    sb.append("class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner {\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    pictureGroup: ").append(toIndentedString(pictureGroup)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    wechatApplet: ").append(toIndentedString(wechatApplet)).append("\n");
    sb.append("    wechatGame: ").append(toIndentedString(wechatGame)).append("\n");
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
    openapiFields.add("button");
    openapiFields.add("coupon");
    openapiFields.add("form");
    openapiFields.add("index");
    openapiFields.add("picture");
    openapiFields.add("picture_group");
    openapiFields.add("text");
    openapiFields.add("type");
    openapiFields.add("video");
    openapiFields.add("wechat_applet");
    openapiFields.add("wechat_game");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner
  */
  public static ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

