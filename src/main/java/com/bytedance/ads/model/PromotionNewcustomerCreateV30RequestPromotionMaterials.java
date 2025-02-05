/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionNewcustomerCreateV30RequestPromotionMaterialsCarouselMaterialListInner;
import com.bytedance.ads.model.PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner;
import com.bytedance.ads.model.PromotionNewcustomerCreateV30RequestPromotionMaterialsTitleMaterialListInner;
import com.bytedance.ads.model.PromotionNewcustomerCreateV30RequestPromotionMaterialsVideoMaterialListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class PromotionNewcustomerCreateV30RequestPromotionMaterials {
  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST = "carousel_material_list";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL_LIST)
  private List<PromotionNewcustomerCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_MATERIAL_LIST = "external_url_material_list";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_MATERIAL_LIST)
  private List<PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner> externalUrlMaterialList = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL_LIST = "title_material_list";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL_LIST)
  private List<PromotionNewcustomerCreateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL_LIST = "video_material_list";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL_LIST)
  private List<PromotionNewcustomerCreateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList = null;

  public PromotionNewcustomerCreateV30RequestPromotionMaterials() {
  }

  public PromotionNewcustomerCreateV30RequestPromotionMaterials carouselMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    
    this.carouselMaterialList = carouselMaterialList;
    return this;
  }

  public PromotionNewcustomerCreateV30RequestPromotionMaterials addCarouselMaterialListItem(PromotionNewcustomerCreateV30RequestPromotionMaterialsCarouselMaterialListInner carouselMaterialListItem) {
    if (this.carouselMaterialList == null) {
      this.carouselMaterialList = new ArrayList<>();
    }
    this.carouselMaterialList.add(carouselMaterialListItem);
    return this;
  }

   /**
   * 
   * @return carouselMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionNewcustomerCreateV30RequestPromotionMaterialsCarouselMaterialListInner> getCarouselMaterialList() {
    return carouselMaterialList;
  }


  public void setCarouselMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsCarouselMaterialListInner> carouselMaterialList) {
    this.carouselMaterialList = carouselMaterialList;
  }


  public PromotionNewcustomerCreateV30RequestPromotionMaterials externalUrlMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner> externalUrlMaterialList) {
    
    this.externalUrlMaterialList = externalUrlMaterialList;
    return this;
  }

  public PromotionNewcustomerCreateV30RequestPromotionMaterials addExternalUrlMaterialListItem(PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner externalUrlMaterialListItem) {
    if (this.externalUrlMaterialList == null) {
      this.externalUrlMaterialList = new ArrayList<>();
    }
    this.externalUrlMaterialList.add(externalUrlMaterialListItem);
    return this;
  }

   /**
   * 落地页链接，仅支持传入橙子落地页，落地页数量上限为1
   * @return externalUrlMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner> getExternalUrlMaterialList() {
    return externalUrlMaterialList;
  }


  public void setExternalUrlMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsExternalUrlMaterialListInner> externalUrlMaterialList) {
    this.externalUrlMaterialList = externalUrlMaterialList;
  }


  public PromotionNewcustomerCreateV30RequestPromotionMaterials titleMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    
    this.titleMaterialList = titleMaterialList;
    return this;
  }

  public PromotionNewcustomerCreateV30RequestPromotionMaterials addTitleMaterialListItem(PromotionNewcustomerCreateV30RequestPromotionMaterialsTitleMaterialListInner titleMaterialListItem) {
    if (this.titleMaterialList == null) {
      this.titleMaterialList = new ArrayList<>();
    }
    this.titleMaterialList.add(titleMaterialListItem);
    return this;
  }

   /**
   * 标题，上限10个，单个标题字数限制[5-55]
   * @return titleMaterialList
  **/
  @javax.annotation.Nonnull
  public List<PromotionNewcustomerCreateV30RequestPromotionMaterialsTitleMaterialListInner> getTitleMaterialList() {
    return titleMaterialList;
  }


  public void setTitleMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsTitleMaterialListInner> titleMaterialList) {
    this.titleMaterialList = titleMaterialList;
  }


  public PromotionNewcustomerCreateV30RequestPromotionMaterials videoMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    
    this.videoMaterialList = videoMaterialList;
    return this;
  }

  public PromotionNewcustomerCreateV30RequestPromotionMaterials addVideoMaterialListItem(PromotionNewcustomerCreateV30RequestPromotionMaterialsVideoMaterialListInner videoMaterialListItem) {
    if (this.videoMaterialList == null) {
      this.videoMaterialList = new ArrayList<>();
    }
    this.videoMaterialList.add(videoMaterialListItem);
    return this;
  }

   /**
   * 
   * @return videoMaterialList
  **/
  @javax.annotation.Nullable
  public List<PromotionNewcustomerCreateV30RequestPromotionMaterialsVideoMaterialListInner> getVideoMaterialList() {
    return videoMaterialList;
  }


  public void setVideoMaterialList(List<PromotionNewcustomerCreateV30RequestPromotionMaterialsVideoMaterialListInner> videoMaterialList) {
    this.videoMaterialList = videoMaterialList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionNewcustomerCreateV30RequestPromotionMaterials promotionNewcustomerCreateV30RequestPromotionMaterials = (PromotionNewcustomerCreateV30RequestPromotionMaterials) o;
    return Objects.equals(this.carouselMaterialList, promotionNewcustomerCreateV30RequestPromotionMaterials.carouselMaterialList) &&
        Objects.equals(this.externalUrlMaterialList, promotionNewcustomerCreateV30RequestPromotionMaterials.externalUrlMaterialList) &&
        Objects.equals(this.titleMaterialList, promotionNewcustomerCreateV30RequestPromotionMaterials.titleMaterialList) &&
        Objects.equals(this.videoMaterialList, promotionNewcustomerCreateV30RequestPromotionMaterials.videoMaterialList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carouselMaterialList, externalUrlMaterialList, titleMaterialList, videoMaterialList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionNewcustomerCreateV30RequestPromotionMaterials {\n");
    sb.append("    carouselMaterialList: ").append(toIndentedString(carouselMaterialList)).append("\n");
    sb.append("    externalUrlMaterialList: ").append(toIndentedString(externalUrlMaterialList)).append("\n");
    sb.append("    titleMaterialList: ").append(toIndentedString(titleMaterialList)).append("\n");
    sb.append("    videoMaterialList: ").append(toIndentedString(videoMaterialList)).append("\n");
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
    openapiFields.add("carousel_material_list");
    openapiFields.add("external_url_material_list");
    openapiFields.add("title_material_list");
    openapiFields.add("video_material_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title_material_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionNewcustomerCreateV30RequestPromotionMaterials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionNewcustomerCreateV30RequestPromotionMaterials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionNewcustomerCreateV30RequestPromotionMaterials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionNewcustomerCreateV30RequestPromotionMaterials.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionNewcustomerCreateV30RequestPromotionMaterials>() {
           @Override
           public void write(JsonWriter out, PromotionNewcustomerCreateV30RequestPromotionMaterials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionNewcustomerCreateV30RequestPromotionMaterials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionNewcustomerCreateV30RequestPromotionMaterials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionNewcustomerCreateV30RequestPromotionMaterials
  * @throws IOException if the JSON string is invalid with respect to PromotionNewcustomerCreateV30RequestPromotionMaterials
  */
  public static PromotionNewcustomerCreateV30RequestPromotionMaterials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionNewcustomerCreateV30RequestPromotionMaterials.class);
  }

 /**
  * Convert an instance of PromotionNewcustomerCreateV30RequestPromotionMaterials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

