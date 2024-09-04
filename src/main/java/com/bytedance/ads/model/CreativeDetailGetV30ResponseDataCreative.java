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
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeComponentMaterialsInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeDecorationMaterial;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeSubTitleMaterial;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 程序化素材信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class CreativeDetailGetV30ResponseDataCreative {
  public static final String SERIALIZED_NAME_ABSTRACT_MATERIALS = "abstract_materials";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_MATERIALS)
  private List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner> abstractMaterials = null;

  public static final String SERIALIZED_NAME_COMPONENT_MATERIALS = "component_materials";
  @SerializedName(SERIALIZED_NAME_COMPONENT_MATERIALS)
  private List<CreativeDetailGetV30ResponseDataCreativeComponentMaterialsInner> componentMaterials = null;

  public static final String SERIALIZED_NAME_DECORATION_MATERIAL = "decoration_material";
  @SerializedName(SERIALIZED_NAME_DECORATION_MATERIAL)
  private CreativeDetailGetV30ResponseDataCreativeDecorationMaterial decorationMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIALS = "image_materials";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIALS)
  private List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner> imageMaterials = null;

  public static final String SERIALIZED_NAME_SUB_TITLE_MATERIAL = "sub_title_material";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE_MATERIAL)
  private CreativeDetailGetV30ResponseDataCreativeSubTitleMaterial subTitleMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIALS = "title_materials";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIALS)
  private List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner> titleMaterials = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIALS = "video_materials";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIALS)
  private List<CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner> videoMaterials = null;

  public CreativeDetailGetV30ResponseDataCreative() {
  }

  public CreativeDetailGetV30ResponseDataCreative abstractMaterials(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner> abstractMaterials) {
    
    this.abstractMaterials = abstractMaterials;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreative addAbstractMaterialsItem(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner abstractMaterialsItem) {
    if (this.abstractMaterials == null) {
      this.abstractMaterials = new ArrayList<>();
    }
    this.abstractMaterials.add(abstractMaterialsItem);
    return this;
  }

   /**
   * 摘要素材
   * @return abstractMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner> getAbstractMaterials() {
    return abstractMaterials;
  }


  public void setAbstractMaterials(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner> abstractMaterials) {
    this.abstractMaterials = abstractMaterials;
  }


  public CreativeDetailGetV30ResponseDataCreative componentMaterials(List<CreativeDetailGetV30ResponseDataCreativeComponentMaterialsInner> componentMaterials) {
    
    this.componentMaterials = componentMaterials;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreative addComponentMaterialsItem(CreativeDetailGetV30ResponseDataCreativeComponentMaterialsInner componentMaterialsItem) {
    if (this.componentMaterials == null) {
      this.componentMaterials = new ArrayList<>();
    }
    this.componentMaterials.add(componentMaterialsItem);
    return this;
  }

   /**
   * 组件信息
   * @return componentMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeComponentMaterialsInner> getComponentMaterials() {
    return componentMaterials;
  }


  public void setComponentMaterials(List<CreativeDetailGetV30ResponseDataCreativeComponentMaterialsInner> componentMaterials) {
    this.componentMaterials = componentMaterials;
  }


  public CreativeDetailGetV30ResponseDataCreative decorationMaterial(CreativeDetailGetV30ResponseDataCreativeDecorationMaterial decorationMaterial) {
    
    this.decorationMaterial = decorationMaterial;
    return this;
  }

   /**
   * Get decorationMaterial
   * @return decorationMaterial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeDecorationMaterial getDecorationMaterial() {
    return decorationMaterial;
  }


  public void setDecorationMaterial(CreativeDetailGetV30ResponseDataCreativeDecorationMaterial decorationMaterial) {
    this.decorationMaterial = decorationMaterial;
  }


  public CreativeDetailGetV30ResponseDataCreative imageMaterials(List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner> imageMaterials) {
    
    this.imageMaterials = imageMaterials;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreative addImageMaterialsItem(CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner imageMaterialsItem) {
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
  public List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner> getImageMaterials() {
    return imageMaterials;
  }


  public void setImageMaterials(List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner> imageMaterials) {
    this.imageMaterials = imageMaterials;
  }


  public CreativeDetailGetV30ResponseDataCreative subTitleMaterial(CreativeDetailGetV30ResponseDataCreativeSubTitleMaterial subTitleMaterial) {
    
    this.subTitleMaterial = subTitleMaterial;
    return this;
  }

   /**
   * Get subTitleMaterial
   * @return subTitleMaterial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeSubTitleMaterial getSubTitleMaterial() {
    return subTitleMaterial;
  }


  public void setSubTitleMaterial(CreativeDetailGetV30ResponseDataCreativeSubTitleMaterial subTitleMaterial) {
    this.subTitleMaterial = subTitleMaterial;
  }


  public CreativeDetailGetV30ResponseDataCreative titleMaterials(List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner> titleMaterials) {
    
    this.titleMaterials = titleMaterials;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreative addTitleMaterialsItem(CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner titleMaterialsItem) {
    if (this.titleMaterials == null) {
      this.titleMaterials = new ArrayList<>();
    }
    this.titleMaterials.add(titleMaterialsItem);
    return this;
  }

   /**
   * 创意标题素材
   * @return titleMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner> getTitleMaterials() {
    return titleMaterials;
  }


  public void setTitleMaterials(List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner> titleMaterials) {
    this.titleMaterials = titleMaterials;
  }


  public CreativeDetailGetV30ResponseDataCreative videoMaterials(List<CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner> videoMaterials) {
    
    this.videoMaterials = videoMaterials;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreative addVideoMaterialsItem(CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner videoMaterialsItem) {
    if (this.videoMaterials == null) {
      this.videoMaterials = new ArrayList<>();
    }
    this.videoMaterials.add(videoMaterialsItem);
    return this;
  }

   /**
   * 视频素材信息
   * @return videoMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner> getVideoMaterials() {
    return videoMaterials;
  }


  public void setVideoMaterials(List<CreativeDetailGetV30ResponseDataCreativeVideoMaterialsInner> videoMaterials) {
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
    CreativeDetailGetV30ResponseDataCreative creativeDetailGetV30ResponseDataCreative = (CreativeDetailGetV30ResponseDataCreative) o;
    return Objects.equals(this.abstractMaterials, creativeDetailGetV30ResponseDataCreative.abstractMaterials) &&
        Objects.equals(this.componentMaterials, creativeDetailGetV30ResponseDataCreative.componentMaterials) &&
        Objects.equals(this.decorationMaterial, creativeDetailGetV30ResponseDataCreative.decorationMaterial) &&
        Objects.equals(this.imageMaterials, creativeDetailGetV30ResponseDataCreative.imageMaterials) &&
        Objects.equals(this.subTitleMaterial, creativeDetailGetV30ResponseDataCreative.subTitleMaterial) &&
        Objects.equals(this.titleMaterials, creativeDetailGetV30ResponseDataCreative.titleMaterials) &&
        Objects.equals(this.videoMaterials, creativeDetailGetV30ResponseDataCreative.videoMaterials);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractMaterials, componentMaterials, decorationMaterial, imageMaterials, subTitleMaterial, titleMaterials, videoMaterials);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreative {\n");
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
       if (!CreativeDetailGetV30ResponseDataCreative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreative.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreative>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreative value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreative read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreative
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreative
  */
  public static CreativeDetailGetV30ResponseDataCreative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreative.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

