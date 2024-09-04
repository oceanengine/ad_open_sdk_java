/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2DataBricksType;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerButton;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerForm;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerPicture;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerPictureGroup;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerText;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideo;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatApplet;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame;
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
 * ToolsSiteTemplateCreateV2ResponseDataBricksInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsSiteTemplateCreateV2ResponseDataBricksInner {
  public static final String SERIALIZED_NAME_BUTTON = "button";
  @SerializedName(SERIALIZED_NAME_BUTTON)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerButton button = null;

  public static final String SERIALIZED_NAME_COUPON = "coupon";
  @SerializedName(SERIALIZED_NAME_COUPON)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon coupon = null;

  public static final String SERIALIZED_NAME_FORM = "form";
  @SerializedName(SERIALIZED_NAME_FORM)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerForm form = null;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index = null;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerPicture picture = null;

  public static final String SERIALIZED_NAME_PICTURE_GROUP = "picture_group";
  @SerializedName(SERIALIZED_NAME_PICTURE_GROUP)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerPictureGroup pictureGroup = null;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerText text = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ToolsSiteTemplateCreateV2DataBricksType type = null;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideo video = null;

  public static final String SERIALIZED_NAME_WECHAT_APPLET = "wechat_applet";
  @SerializedName(SERIALIZED_NAME_WECHAT_APPLET)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatApplet wechatApplet = null;

  public static final String SERIALIZED_NAME_WECHAT_GAME = "wechat_game";
  @SerializedName(SERIALIZED_NAME_WECHAT_GAME)
  private ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame wechatGame = null;

  public ToolsSiteTemplateCreateV2ResponseDataBricksInner() {
  }

  public ToolsSiteTemplateCreateV2ResponseDataBricksInner button(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButton button) {
    
    this.button = button;
    return this;
  }

   /**
   * Get button
   * @return button
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerButton getButton() {
    return button;
  }


  public void setButton(ToolsSiteTemplateCreateV2ResponseDataBricksInnerButton button) {
    this.button = button;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner coupon(ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon getCoupon() {
    return coupon;
  }


  public void setCoupon(ToolsSiteTemplateCreateV2ResponseDataBricksInnerCoupon coupon) {
    this.coupon = coupon;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner form(ToolsSiteTemplateCreateV2ResponseDataBricksInnerForm form) {
    
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerForm getForm() {
    return form;
  }


  public void setForm(ToolsSiteTemplateCreateV2ResponseDataBricksInnerForm form) {
    this.form = form;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner index(String index) {
    
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


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner picture(ToolsSiteTemplateCreateV2ResponseDataBricksInnerPicture picture) {
    
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerPicture getPicture() {
    return picture;
  }


  public void setPicture(ToolsSiteTemplateCreateV2ResponseDataBricksInnerPicture picture) {
    this.picture = picture;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner pictureGroup(ToolsSiteTemplateCreateV2ResponseDataBricksInnerPictureGroup pictureGroup) {
    
    this.pictureGroup = pictureGroup;
    return this;
  }

   /**
   * Get pictureGroup
   * @return pictureGroup
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerPictureGroup getPictureGroup() {
    return pictureGroup;
  }


  public void setPictureGroup(ToolsSiteTemplateCreateV2ResponseDataBricksInnerPictureGroup pictureGroup) {
    this.pictureGroup = pictureGroup;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner text(ToolsSiteTemplateCreateV2ResponseDataBricksInnerText text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerText getText() {
    return text;
  }


  public void setText(ToolsSiteTemplateCreateV2ResponseDataBricksInnerText text) {
    this.text = text;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner type(ToolsSiteTemplateCreateV2DataBricksType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2DataBricksType getType() {
    return type;
  }


  public void setType(ToolsSiteTemplateCreateV2DataBricksType type) {
    this.type = type;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner video(ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideo video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideo getVideo() {
    return video;
  }


  public void setVideo(ToolsSiteTemplateCreateV2ResponseDataBricksInnerVideo video) {
    this.video = video;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner wechatApplet(ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatApplet wechatApplet) {
    
    this.wechatApplet = wechatApplet;
    return this;
  }

   /**
   * Get wechatApplet
   * @return wechatApplet
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatApplet getWechatApplet() {
    return wechatApplet;
  }


  public void setWechatApplet(ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatApplet wechatApplet) {
    this.wechatApplet = wechatApplet;
  }


  public ToolsSiteTemplateCreateV2ResponseDataBricksInner wechatGame(ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame wechatGame) {
    
    this.wechatGame = wechatGame;
    return this;
  }

   /**
   * Get wechatGame
   * @return wechatGame
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame getWechatGame() {
    return wechatGame;
  }


  public void setWechatGame(ToolsSiteTemplateCreateV2ResponseDataBricksInnerWechatGame wechatGame) {
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
    ToolsSiteTemplateCreateV2ResponseDataBricksInner toolsSiteTemplateCreateV2ResponseDataBricksInner = (ToolsSiteTemplateCreateV2ResponseDataBricksInner) o;
    return Objects.equals(this.button, toolsSiteTemplateCreateV2ResponseDataBricksInner.button) &&
        Objects.equals(this.coupon, toolsSiteTemplateCreateV2ResponseDataBricksInner.coupon) &&
        Objects.equals(this.form, toolsSiteTemplateCreateV2ResponseDataBricksInner.form) &&
        Objects.equals(this.index, toolsSiteTemplateCreateV2ResponseDataBricksInner.index) &&
        Objects.equals(this.picture, toolsSiteTemplateCreateV2ResponseDataBricksInner.picture) &&
        Objects.equals(this.pictureGroup, toolsSiteTemplateCreateV2ResponseDataBricksInner.pictureGroup) &&
        Objects.equals(this.text, toolsSiteTemplateCreateV2ResponseDataBricksInner.text) &&
        Objects.equals(this.type, toolsSiteTemplateCreateV2ResponseDataBricksInner.type) &&
        Objects.equals(this.video, toolsSiteTemplateCreateV2ResponseDataBricksInner.video) &&
        Objects.equals(this.wechatApplet, toolsSiteTemplateCreateV2ResponseDataBricksInner.wechatApplet) &&
        Objects.equals(this.wechatGame, toolsSiteTemplateCreateV2ResponseDataBricksInner.wechatGame);
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
    sb.append("class ToolsSiteTemplateCreateV2ResponseDataBricksInner {\n");
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
       if (!ToolsSiteTemplateCreateV2ResponseDataBricksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateCreateV2ResponseDataBricksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateCreateV2ResponseDataBricksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateCreateV2ResponseDataBricksInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateCreateV2ResponseDataBricksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateCreateV2ResponseDataBricksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateCreateV2ResponseDataBricksInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateCreateV2ResponseDataBricksInner
  */
  public static ToolsSiteTemplateCreateV2ResponseDataBricksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateCreateV2ResponseDataBricksInner.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateCreateV2ResponseDataBricksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

