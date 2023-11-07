/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorCreateV30AnchorInfoAnchorType;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoGameAnchor;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoPrivateChat;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class NativeAnchorCreateV30RequestAnchorInfo {
  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private NativeAnchorCreateV30AnchorInfoAnchorType anchorType = null;

  public static final String SERIALIZED_NAME_APP_ECOMMERCE_ANCHOR = "app_ecommerce_anchor";
  @SerializedName(SERIALIZED_NAME_APP_ECOMMERCE_ANCHOR)
  private NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor appEcommerceAnchor = null;

  public static final String SERIALIZED_NAME_GAME_ANCHOR = "game_anchor";
  @SerializedName(SERIALIZED_NAME_GAME_ANCHOR)
  private NativeAnchorCreateV30RequestAnchorInfoGameAnchor gameAnchor = null;

  public static final String SERIALIZED_NAME_NET_SERVICE_ANCHOR = "net_service_anchor";
  @SerializedName(SERIALIZED_NAME_NET_SERVICE_ANCHOR)
  private NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor netServiceAnchor = null;

  public static final String SERIALIZED_NAME_PRIVATE_CHAT = "private_chat";
  @SerializedName(SERIALIZED_NAME_PRIVATE_CHAT)
  private NativeAnchorCreateV30RequestAnchorInfoPrivateChat privateChat = null;

  public static final String SERIALIZED_NAME_SHOPPING_CART_ANCHOR = "shopping_cart_anchor";
  @SerializedName(SERIALIZED_NAME_SHOPPING_CART_ANCHOR)
  private NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor shoppingCartAnchor = null;

  public static final String SERIALIZED_NAME_TOOL_TITLE = "tool_title";
  @SerializedName(SERIALIZED_NAME_TOOL_TITLE)
  private String toolTitle = null;

  public NativeAnchorCreateV30RequestAnchorInfo() {
  }

  public NativeAnchorCreateV30RequestAnchorInfo anchorType(NativeAnchorCreateV30AnchorInfoAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30AnchorInfoAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(NativeAnchorCreateV30AnchorInfoAnchorType anchorType) {
    this.anchorType = anchorType;
  }


  public NativeAnchorCreateV30RequestAnchorInfo appEcommerceAnchor(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor appEcommerceAnchor) {
    
    this.appEcommerceAnchor = appEcommerceAnchor;
    return this;
  }

   /**
   * Get appEcommerceAnchor
   * @return appEcommerceAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor getAppEcommerceAnchor() {
    return appEcommerceAnchor;
  }


  public void setAppEcommerceAnchor(NativeAnchorCreateV30RequestAnchorInfoAppEcommerceAnchor appEcommerceAnchor) {
    this.appEcommerceAnchor = appEcommerceAnchor;
  }


  public NativeAnchorCreateV30RequestAnchorInfo gameAnchor(NativeAnchorCreateV30RequestAnchorInfoGameAnchor gameAnchor) {
    
    this.gameAnchor = gameAnchor;
    return this;
  }

   /**
   * Get gameAnchor
   * @return gameAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoGameAnchor getGameAnchor() {
    return gameAnchor;
  }


  public void setGameAnchor(NativeAnchorCreateV30RequestAnchorInfoGameAnchor gameAnchor) {
    this.gameAnchor = gameAnchor;
  }


  public NativeAnchorCreateV30RequestAnchorInfo netServiceAnchor(NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor netServiceAnchor) {
    
    this.netServiceAnchor = netServiceAnchor;
    return this;
  }

   /**
   * Get netServiceAnchor
   * @return netServiceAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor getNetServiceAnchor() {
    return netServiceAnchor;
  }


  public void setNetServiceAnchor(NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor netServiceAnchor) {
    this.netServiceAnchor = netServiceAnchor;
  }


  public NativeAnchorCreateV30RequestAnchorInfo privateChat(NativeAnchorCreateV30RequestAnchorInfoPrivateChat privateChat) {
    
    this.privateChat = privateChat;
    return this;
  }

   /**
   * Get privateChat
   * @return privateChat
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoPrivateChat getPrivateChat() {
    return privateChat;
  }


  public void setPrivateChat(NativeAnchorCreateV30RequestAnchorInfoPrivateChat privateChat) {
    this.privateChat = privateChat;
  }


  public NativeAnchorCreateV30RequestAnchorInfo shoppingCartAnchor(NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor shoppingCartAnchor) {
    
    this.shoppingCartAnchor = shoppingCartAnchor;
    return this;
  }

   /**
   * Get shoppingCartAnchor
   * @return shoppingCartAnchor
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor getShoppingCartAnchor() {
    return shoppingCartAnchor;
  }


  public void setShoppingCartAnchor(NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor shoppingCartAnchor) {
    this.shoppingCartAnchor = shoppingCartAnchor;
  }


  public NativeAnchorCreateV30RequestAnchorInfo toolTitle(String toolTitle) {
    
    this.toolTitle = toolTitle;
    return this;
  }

   /**
   * 锚点工具名称（内部管理展示）
   * @return toolTitle
  **/
  @javax.annotation.Nullable
  public String getToolTitle() {
    return toolTitle;
  }


  public void setToolTitle(String toolTitle) {
    this.toolTitle = toolTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorCreateV30RequestAnchorInfo nativeAnchorCreateV30RequestAnchorInfo = (NativeAnchorCreateV30RequestAnchorInfo) o;
    return Objects.equals(this.anchorType, nativeAnchorCreateV30RequestAnchorInfo.anchorType) &&
        Objects.equals(this.appEcommerceAnchor, nativeAnchorCreateV30RequestAnchorInfo.appEcommerceAnchor) &&
        Objects.equals(this.gameAnchor, nativeAnchorCreateV30RequestAnchorInfo.gameAnchor) &&
        Objects.equals(this.netServiceAnchor, nativeAnchorCreateV30RequestAnchorInfo.netServiceAnchor) &&
        Objects.equals(this.privateChat, nativeAnchorCreateV30RequestAnchorInfo.privateChat) &&
        Objects.equals(this.shoppingCartAnchor, nativeAnchorCreateV30RequestAnchorInfo.shoppingCartAnchor) &&
        Objects.equals(this.toolTitle, nativeAnchorCreateV30RequestAnchorInfo.toolTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorType, appEcommerceAnchor, gameAnchor, netServiceAnchor, privateChat, shoppingCartAnchor, toolTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfo {\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    appEcommerceAnchor: ").append(toIndentedString(appEcommerceAnchor)).append("\n");
    sb.append("    gameAnchor: ").append(toIndentedString(gameAnchor)).append("\n");
    sb.append("    netServiceAnchor: ").append(toIndentedString(netServiceAnchor)).append("\n");
    sb.append("    privateChat: ").append(toIndentedString(privateChat)).append("\n");
    sb.append("    shoppingCartAnchor: ").append(toIndentedString(shoppingCartAnchor)).append("\n");
    sb.append("    toolTitle: ").append(toIndentedString(toolTitle)).append("\n");
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
    openapiFields.add("anchor_type");
    openapiFields.add("app_ecommerce_anchor");
    openapiFields.add("game_anchor");
    openapiFields.add("net_service_anchor");
    openapiFields.add("private_chat");
    openapiFields.add("shopping_cart_anchor");
    openapiFields.add("tool_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorCreateV30RequestAnchorInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfo>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfo
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfo
  */
  public static NativeAnchorCreateV30RequestAnchorInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfo.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

