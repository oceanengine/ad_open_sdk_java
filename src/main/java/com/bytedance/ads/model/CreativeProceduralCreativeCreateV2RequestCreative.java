/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeComponentMaterialsInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeDecorationMaterial;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeSubTitleMaterial;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class CreativeProceduralCreativeCreateV2RequestCreative {
  public static final String SERIALIZED_NAME_ABSTRACT_MATERIALS = "abstract_materials";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_MATERIALS)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInner> abstractMaterials = null;

  public static final String SERIALIZED_NAME_COMPONENT_MATERIALS = "component_materials";
  @SerializedName(SERIALIZED_NAME_COMPONENT_MATERIALS)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeComponentMaterialsInner> componentMaterials = null;

  public static final String SERIALIZED_NAME_DECORATION_MATERIAL = "decoration_material";
  @SerializedName(SERIALIZED_NAME_DECORATION_MATERIAL)
  private CreativeProceduralCreativeCreateV2RequestCreativeDecorationMaterial decorationMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIALS = "image_materials";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIALS)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner> imageMaterials = null;

  public static final String SERIALIZED_NAME_SUB_TITLE_MATERIAL = "sub_title_material";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE_MATERIAL)
  private CreativeProceduralCreativeCreateV2RequestCreativeSubTitleMaterial subTitleMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIALS = "title_materials";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIALS)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner> titleMaterials = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIALS = "video_materials";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIALS)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner> videoMaterials = null;

  public CreativeProceduralCreativeCreateV2RequestCreative() {
  }

  public CreativeProceduralCreativeCreateV2RequestCreative abstractMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInner> abstractMaterials) {
    
    this.abstractMaterials = abstractMaterials;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreative addAbstractMaterialsItem(CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInner abstractMaterialsItem) {
    if (this.abstractMaterials == null) {
      this.abstractMaterials = new ArrayList<>();
    }
    this.abstractMaterials.add(abstractMaterialsItem);
    return this;
  }

   /**
   * 
   * @return abstractMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInner> getAbstractMaterials() {
    return abstractMaterials;
  }


  public void setAbstractMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInner> abstractMaterials) {
    this.abstractMaterials = abstractMaterials;
  }


  public CreativeProceduralCreativeCreateV2RequestCreative componentMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeComponentMaterialsInner> componentMaterials) {
    
    this.componentMaterials = componentMaterials;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreative addComponentMaterialsItem(CreativeProceduralCreativeCreateV2RequestCreativeComponentMaterialsInner componentMaterialsItem) {
    if (this.componentMaterials == null) {
      this.componentMaterials = new ArrayList<>();
    }
    this.componentMaterials.add(componentMaterialsItem);
    return this;
  }

   /**
   * 
   * @return componentMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeCreateV2RequestCreativeComponentMaterialsInner> getComponentMaterials() {
    return componentMaterials;
  }


  public void setComponentMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeComponentMaterialsInner> componentMaterials) {
    this.componentMaterials = componentMaterials;
  }


  public CreativeProceduralCreativeCreateV2RequestCreative decorationMaterial(CreativeProceduralCreativeCreateV2RequestCreativeDecorationMaterial decorationMaterial) {
    
    this.decorationMaterial = decorationMaterial;
    return this;
  }

   /**
   * Get decorationMaterial
   * @return decorationMaterial
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2RequestCreativeDecorationMaterial getDecorationMaterial() {
    return decorationMaterial;
  }


  public void setDecorationMaterial(CreativeProceduralCreativeCreateV2RequestCreativeDecorationMaterial decorationMaterial) {
    this.decorationMaterial = decorationMaterial;
  }


  public CreativeProceduralCreativeCreateV2RequestCreative imageMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner> imageMaterials) {
    
    this.imageMaterials = imageMaterials;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreative addImageMaterialsItem(CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner imageMaterialsItem) {
    if (this.imageMaterials == null) {
      this.imageMaterials = new ArrayList<>();
    }
    this.imageMaterials.add(imageMaterialsItem);
    return this;
  }

   /**
   * 
   * @return imageMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner> getImageMaterials() {
    return imageMaterials;
  }


  public void setImageMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner> imageMaterials) {
    this.imageMaterials = imageMaterials;
  }


  public CreativeProceduralCreativeCreateV2RequestCreative subTitleMaterial(CreativeProceduralCreativeCreateV2RequestCreativeSubTitleMaterial subTitleMaterial) {
    
    this.subTitleMaterial = subTitleMaterial;
    return this;
  }

   /**
   * Get subTitleMaterial
   * @return subTitleMaterial
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2RequestCreativeSubTitleMaterial getSubTitleMaterial() {
    return subTitleMaterial;
  }


  public void setSubTitleMaterial(CreativeProceduralCreativeCreateV2RequestCreativeSubTitleMaterial subTitleMaterial) {
    this.subTitleMaterial = subTitleMaterial;
  }


  public CreativeProceduralCreativeCreateV2RequestCreative titleMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner> titleMaterials) {
    
    this.titleMaterials = titleMaterials;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreative addTitleMaterialsItem(CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner titleMaterialsItem) {
    if (this.titleMaterials == null) {
      this.titleMaterials = new ArrayList<>();
    }
    this.titleMaterials.add(titleMaterialsItem);
    return this;
  }

   /**
   * 
   * @return titleMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner> getTitleMaterials() {
    return titleMaterials;
  }


  public void setTitleMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeTitleMaterialsInner> titleMaterials) {
    this.titleMaterials = titleMaterials;
  }


  public CreativeProceduralCreativeCreateV2RequestCreative videoMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner> videoMaterials) {
    
    this.videoMaterials = videoMaterials;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreative addVideoMaterialsItem(CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner videoMaterialsItem) {
    if (this.videoMaterials == null) {
      this.videoMaterials = new ArrayList<>();
    }
    this.videoMaterials.add(videoMaterialsItem);
    return this;
  }

   /**
   * 
   * @return videoMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner> getVideoMaterials() {
    return videoMaterials;
  }


  public void setVideoMaterials(List<CreativeProceduralCreativeCreateV2RequestCreativeVideoMaterialsInner> videoMaterials) {
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
    CreativeProceduralCreativeCreateV2RequestCreative creativeProceduralCreativeCreateV2RequestCreative = (CreativeProceduralCreativeCreateV2RequestCreative) o;
    return Objects.equals(this.abstractMaterials, creativeProceduralCreativeCreateV2RequestCreative.abstractMaterials) &&
        Objects.equals(this.componentMaterials, creativeProceduralCreativeCreateV2RequestCreative.componentMaterials) &&
        Objects.equals(this.decorationMaterial, creativeProceduralCreativeCreateV2RequestCreative.decorationMaterial) &&
        Objects.equals(this.imageMaterials, creativeProceduralCreativeCreateV2RequestCreative.imageMaterials) &&
        Objects.equals(this.subTitleMaterial, creativeProceduralCreativeCreateV2RequestCreative.subTitleMaterial) &&
        Objects.equals(this.titleMaterials, creativeProceduralCreativeCreateV2RequestCreative.titleMaterials) &&
        Objects.equals(this.videoMaterials, creativeProceduralCreativeCreateV2RequestCreative.videoMaterials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractMaterials, componentMaterials, decorationMaterial, imageMaterials, subTitleMaterial, titleMaterials, videoMaterials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeCreateV2RequestCreative {\n");
    sb.append("    abstractMaterials: ").append(toIndentedString(abstractMaterials)).append("\n");
    sb.append("    componentMaterials: ").append(toIndentedString(componentMaterials)).append("\n");
    sb.append("    decorationMaterial: ").append(toIndentedString(decorationMaterial)).append("\n");
    sb.append("    imageMaterials: ").append(toIndentedString(imageMaterials)).append("\n");
    sb.append("    subTitleMaterial: ").append(toIndentedString(subTitleMaterial)).append("\n");
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
    openapiFields.add("abstract_materials");
    openapiFields.add("component_materials");
    openapiFields.add("decoration_material");
    openapiFields.add("image_materials");
    openapiFields.add("sub_title_material");
    openapiFields.add("title_materials");
    openapiFields.add("video_materials");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeCreateV2RequestCreative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeCreateV2RequestCreative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeCreateV2RequestCreative.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreative>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeCreateV2RequestCreative value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeCreateV2RequestCreative read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeCreateV2RequestCreative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeCreateV2RequestCreative
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeCreateV2RequestCreative
  */
  public static CreativeProceduralCreativeCreateV2RequestCreative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeCreateV2RequestCreative.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeCreateV2RequestCreative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

