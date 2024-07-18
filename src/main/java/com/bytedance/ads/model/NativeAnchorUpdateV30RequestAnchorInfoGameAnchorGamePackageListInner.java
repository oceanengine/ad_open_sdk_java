/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner;
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
 * NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner {
  public static final String SERIALIZED_NAME_ANDROID_PACKAGE_CODE = "android_package_code";
  @SerializedName(SERIALIZED_NAME_ANDROID_PACKAGE_CODE)
  private String androidPackageCode = null;

  public static final String SERIALIZED_NAME_GAME_PACKAGE_NAME = "game_package_name";
  @SerializedName(SERIALIZED_NAME_GAME_PACKAGE_NAME)
  private String gamePackageName = null;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner> gift = null;

  public static final String SERIALIZED_NAME_GIFT_END_DATE = "gift_end_date";
  @SerializedName(SERIALIZED_NAME_GIFT_END_DATE)
  private String giftEndDate = null;

  public static final String SERIALIZED_NAME_GIFT_REGULATION = "gift_regulation";
  @SerializedName(SERIALIZED_NAME_GIFT_REGULATION)
  private String giftRegulation = null;

  public static final String SERIALIZED_NAME_GIFT_START_DATE = "gift_start_date";
  @SerializedName(SERIALIZED_NAME_GIFT_START_DATE)
  private String giftStartDate = null;

  public static final String SERIALIZED_NAME_IOS_PACKAGE_CODE = "ios_package_code";
  @SerializedName(SERIALIZED_NAME_IOS_PACKAGE_CODE)
  private String iosPackageCode = null;

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner androidPackageCode(String androidPackageCode) {
    
    this.androidPackageCode = androidPackageCode;
    return this;
  }

   /**
   * 安卓礼包码，字符限制0～20
   * @return androidPackageCode
  **/
  @javax.annotation.Nullable
  public String getAndroidPackageCode() {
    return androidPackageCode;
  }


  public void setAndroidPackageCode(String androidPackageCode) {
    this.androidPackageCode = androidPackageCode;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner gamePackageName(String gamePackageName) {
    
    this.gamePackageName = gamePackageName;
    return this;
  }

   /**
   * 游戏礼包名称，字符限制0～14
   * @return gamePackageName
  **/
  @javax.annotation.Nullable
  public String getGamePackageName() {
    return gamePackageName;
  }


  public void setGamePackageName(String gamePackageName) {
    this.gamePackageName = gamePackageName;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner gift(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner> gift) {
    
    this.gift = gift;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner addGiftItem(NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner giftItem) {
    if (this.gift == null) {
      this.gift = new ArrayList<>();
    }
    this.gift.add(giftItem);
    return this;
  }

   /**
   * 礼包内的礼品配置，数量限制0～8
   * @return gift
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner> getGift() {
    return gift;
  }


  public void setGift(List<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInnerGiftInner> gift) {
    this.gift = gift;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner giftEndDate(String giftEndDate) {
    
    this.giftEndDate = giftEndDate;
    return this;
  }

   /**
   * 礼包使用结束期限，格式 yyyy.MM.dd
   * @return giftEndDate
  **/
  @javax.annotation.Nullable
  public String getGiftEndDate() {
    return giftEndDate;
  }


  public void setGiftEndDate(String giftEndDate) {
    this.giftEndDate = giftEndDate;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner giftRegulation(String giftRegulation) {
    
    this.giftRegulation = giftRegulation;
    return this;
  }

   /**
   * 礼包使用规则，字符限制0～30
   * @return giftRegulation
  **/
  @javax.annotation.Nullable
  public String getGiftRegulation() {
    return giftRegulation;
  }


  public void setGiftRegulation(String giftRegulation) {
    this.giftRegulation = giftRegulation;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner giftStartDate(String giftStartDate) {
    
    this.giftStartDate = giftStartDate;
    return this;
  }

   /**
   * 礼包使用开始期限，格式 yyyy.MM.dd
   * @return giftStartDate
  **/
  @javax.annotation.Nullable
  public String getGiftStartDate() {
    return giftStartDate;
  }


  public void setGiftStartDate(String giftStartDate) {
    this.giftStartDate = giftStartDate;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner iosPackageCode(String iosPackageCode) {
    
    this.iosPackageCode = iosPackageCode;
    return this;
  }

   /**
   * ios礼包码，字符限制0～20
   * @return iosPackageCode
  **/
  @javax.annotation.Nullable
  public String getIosPackageCode() {
    return iosPackageCode;
  }


  public void setIosPackageCode(String iosPackageCode) {
    this.iosPackageCode = iosPackageCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner = (NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner) o;
    return Objects.equals(this.androidPackageCode, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.androidPackageCode) &&
        Objects.equals(this.gamePackageName, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.gamePackageName) &&
        Objects.equals(this.gift, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.gift) &&
        Objects.equals(this.giftEndDate, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.giftEndDate) &&
        Objects.equals(this.giftRegulation, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.giftRegulation) &&
        Objects.equals(this.giftStartDate, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.giftStartDate) &&
        Objects.equals(this.iosPackageCode, nativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.iosPackageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidPackageCode, gamePackageName, gift, giftEndDate, giftRegulation, giftStartDate, iosPackageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner {\n");
    sb.append("    androidPackageCode: ").append(toIndentedString(androidPackageCode)).append("\n");
    sb.append("    gamePackageName: ").append(toIndentedString(gamePackageName)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    giftEndDate: ").append(toIndentedString(giftEndDate)).append("\n");
    sb.append("    giftRegulation: ").append(toIndentedString(giftRegulation)).append("\n");
    sb.append("    giftStartDate: ").append(toIndentedString(giftStartDate)).append("\n");
    sb.append("    iosPackageCode: ").append(toIndentedString(iosPackageCode)).append("\n");
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
    openapiFields.add("android_package_code");
    openapiFields.add("game_package_name");
    openapiFields.add("gift");
    openapiFields.add("gift_end_date");
    openapiFields.add("gift_regulation");
    openapiFields.add("gift_start_date");
    openapiFields.add("ios_package_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner
  */
  public static NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfoGameAnchorGamePackageListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

