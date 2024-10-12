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
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2CreativeListImageMode;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerComponentMaterialsInner;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerDecorationMaterial;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerPlayableMaterial;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerSubTitleMaterial;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerTitleMaterial;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerVideoMaterial;
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
 * CreativeCustomCreativeUpdateV2RequestCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeUpdateV2RequestCreativeListInner {
  public static final String SERIALIZED_NAME_ABSTRACT_MATERIALS = "abstract_materials";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_MATERIALS)
  private List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner> abstractMaterials = null;

  public static final String SERIALIZED_NAME_COMPONENT_MATERIALS = "component_materials";
  @SerializedName(SERIALIZED_NAME_COMPONENT_MATERIALS)
  private List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerComponentMaterialsInner> componentMaterials = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_DECORATION_MATERIAL = "decoration_material";
  @SerializedName(SERIALIZED_NAME_DECORATION_MATERIAL)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerDecorationMaterial decorationMaterial = null;

  public static final String SERIALIZED_NAME_DERIVE_POSTER_CID = "derive_poster_cid";
  @SerializedName(SERIALIZED_NAME_DERIVE_POSTER_CID)
  private CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid derivePosterCid = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIALS = "image_materials";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIALS)
  private List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner> imageMaterials = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeCustomCreativeUpdateV2CreativeListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_INTERACTIVE_MATERIAL = "interactive_material";
  @SerializedName(SERIALIZED_NAME_INTERACTIVE_MATERIAL)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial interactiveMaterial = null;

  public static final String SERIALIZED_NAME_PLAYABLE_MATERIAL = "playable_material";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_MATERIAL)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerPlayableMaterial playableMaterial = null;

  public static final String SERIALIZED_NAME_SUB_TITLE_MATERIAL = "sub_title_material";
  @SerializedName(SERIALIZED_NAME_SUB_TITLE_MATERIAL)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerSubTitleMaterial subTitleMaterial = null;

  public static final String SERIALIZED_NAME_THIRD_PARTY_ID = "third_party_id";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_ID)
  private String thirdPartyId = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerVideoMaterial videoMaterial = null;

  public CreativeCustomCreativeUpdateV2RequestCreativeListInner() {
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInner abstractMaterials(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner> abstractMaterials) {
    
    this.abstractMaterials = abstractMaterials;
    return this;
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInner addAbstractMaterialsItem(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner abstractMaterialsItem) {
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
  public List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner> getAbstractMaterials() {
    return abstractMaterials;
  }


  public void setAbstractMaterials(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner> abstractMaterials) {
    this.abstractMaterials = abstractMaterials;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner componentMaterials(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerComponentMaterialsInner> componentMaterials) {
    
    this.componentMaterials = componentMaterials;
    return this;
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInner addComponentMaterialsItem(CreativeCustomCreativeUpdateV2RequestCreativeListInnerComponentMaterialsInner componentMaterialsItem) {
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
  public List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerComponentMaterialsInner> getComponentMaterials() {
    return componentMaterials;
  }


  public void setComponentMaterials(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerComponentMaterialsInner> componentMaterials) {
    this.componentMaterials = componentMaterials;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner decorationMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerDecorationMaterial decorationMaterial) {
    
    this.decorationMaterial = decorationMaterial;
    return this;
  }

   /**
   * Get decorationMaterial
   * @return decorationMaterial
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerDecorationMaterial getDecorationMaterial() {
    return decorationMaterial;
  }


  public void setDecorationMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerDecorationMaterial decorationMaterial) {
    this.decorationMaterial = decorationMaterial;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner derivePosterCid(CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid derivePosterCid) {
    
    this.derivePosterCid = derivePosterCid;
    return this;
  }

   /**
   * Get derivePosterCid
   * @return derivePosterCid
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid getDerivePosterCid() {
    return derivePosterCid;
  }


  public void setDerivePosterCid(CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid derivePosterCid) {
    this.derivePosterCid = derivePosterCid;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner imageMaterials(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner> imageMaterials) {
    
    this.imageMaterials = imageMaterials;
    return this;
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInner addImageMaterialsItem(CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner imageMaterialsItem) {
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
  public List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner> getImageMaterials() {
    return imageMaterials;
  }


  public void setImageMaterials(List<CreativeCustomCreativeUpdateV2RequestCreativeListInnerImageMaterialsInner> imageMaterials) {
    this.imageMaterials = imageMaterials;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner imageMode(CreativeCustomCreativeUpdateV2CreativeListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public CreativeCustomCreativeUpdateV2CreativeListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeCustomCreativeUpdateV2CreativeListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner interactiveMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial interactiveMaterial) {
    
    this.interactiveMaterial = interactiveMaterial;
    return this;
  }

   /**
   * Get interactiveMaterial
   * @return interactiveMaterial
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial getInteractiveMaterial() {
    return interactiveMaterial;
  }


  public void setInteractiveMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerInteractiveMaterial interactiveMaterial) {
    this.interactiveMaterial = interactiveMaterial;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner playableMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerPlayableMaterial playableMaterial) {
    
    this.playableMaterial = playableMaterial;
    return this;
  }

   /**
   * Get playableMaterial
   * @return playableMaterial
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerPlayableMaterial getPlayableMaterial() {
    return playableMaterial;
  }


  public void setPlayableMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerPlayableMaterial playableMaterial) {
    this.playableMaterial = playableMaterial;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner subTitleMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerSubTitleMaterial subTitleMaterial) {
    
    this.subTitleMaterial = subTitleMaterial;
    return this;
  }

   /**
   * Get subTitleMaterial
   * @return subTitleMaterial
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerSubTitleMaterial getSubTitleMaterial() {
    return subTitleMaterial;
  }


  public void setSubTitleMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerSubTitleMaterial subTitleMaterial) {
    this.subTitleMaterial = subTitleMaterial;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner thirdPartyId(String thirdPartyId) {
    
    this.thirdPartyId = thirdPartyId;
    return this;
  }

   /**
   * 
   * @return thirdPartyId
  **/
  @javax.annotation.Nullable
  public String getThirdPartyId() {
    return thirdPartyId;
  }


  public void setThirdPartyId(String thirdPartyId) {
    this.thirdPartyId = thirdPartyId;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner titleMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInner videoMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(CreativeCustomCreativeUpdateV2RequestCreativeListInnerVideoMaterial videoMaterial) {
    this.videoMaterial = videoMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeUpdateV2RequestCreativeListInner creativeCustomCreativeUpdateV2RequestCreativeListInner = (CreativeCustomCreativeUpdateV2RequestCreativeListInner) o;
    return Objects.equals(this.abstractMaterials, creativeCustomCreativeUpdateV2RequestCreativeListInner.abstractMaterials) &&
        Objects.equals(this.componentMaterials, creativeCustomCreativeUpdateV2RequestCreativeListInner.componentMaterials) &&
        Objects.equals(this.creativeId, creativeCustomCreativeUpdateV2RequestCreativeListInner.creativeId) &&
        Objects.equals(this.decorationMaterial, creativeCustomCreativeUpdateV2RequestCreativeListInner.decorationMaterial) &&
        Objects.equals(this.derivePosterCid, creativeCustomCreativeUpdateV2RequestCreativeListInner.derivePosterCid) &&
        Objects.equals(this.imageMaterials, creativeCustomCreativeUpdateV2RequestCreativeListInner.imageMaterials) &&
        Objects.equals(this.imageMode, creativeCustomCreativeUpdateV2RequestCreativeListInner.imageMode) &&
        Objects.equals(this.interactiveMaterial, creativeCustomCreativeUpdateV2RequestCreativeListInner.interactiveMaterial) &&
        Objects.equals(this.playableMaterial, creativeCustomCreativeUpdateV2RequestCreativeListInner.playableMaterial) &&
        Objects.equals(this.subTitleMaterial, creativeCustomCreativeUpdateV2RequestCreativeListInner.subTitleMaterial) &&
        Objects.equals(this.thirdPartyId, creativeCustomCreativeUpdateV2RequestCreativeListInner.thirdPartyId) &&
        Objects.equals(this.titleMaterial, creativeCustomCreativeUpdateV2RequestCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, creativeCustomCreativeUpdateV2RequestCreativeListInner.videoMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractMaterials, componentMaterials, creativeId, decorationMaterial, derivePosterCid, imageMaterials, imageMode, interactiveMaterial, playableMaterial, subTitleMaterial, thirdPartyId, titleMaterial, videoMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeUpdateV2RequestCreativeListInner {\n");
    sb.append("    abstractMaterials: ").append(toIndentedString(abstractMaterials)).append("\n");
    sb.append("    componentMaterials: ").append(toIndentedString(componentMaterials)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    decorationMaterial: ").append(toIndentedString(decorationMaterial)).append("\n");
    sb.append("    derivePosterCid: ").append(toIndentedString(derivePosterCid)).append("\n");
    sb.append("    imageMaterials: ").append(toIndentedString(imageMaterials)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    interactiveMaterial: ").append(toIndentedString(interactiveMaterial)).append("\n");
    sb.append("    playableMaterial: ").append(toIndentedString(playableMaterial)).append("\n");
    sb.append("    subTitleMaterial: ").append(toIndentedString(subTitleMaterial)).append("\n");
    sb.append("    thirdPartyId: ").append(toIndentedString(thirdPartyId)).append("\n");
    sb.append("    titleMaterial: ").append(toIndentedString(titleMaterial)).append("\n");
    sb.append("    videoMaterial: ").append(toIndentedString(videoMaterial)).append("\n");
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
    openapiFields.add("creative_id");
    openapiFields.add("decoration_material");
    openapiFields.add("derive_poster_cid");
    openapiFields.add("image_materials");
    openapiFields.add("image_mode");
    openapiFields.add("interactive_material");
    openapiFields.add("playable_material");
    openapiFields.add("sub_title_material");
    openapiFields.add("third_party_id");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeUpdateV2RequestCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeUpdateV2RequestCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeUpdateV2RequestCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeUpdateV2RequestCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeUpdateV2RequestCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeUpdateV2RequestCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeUpdateV2RequestCreativeListInner
  */
  public static CreativeCustomCreativeUpdateV2RequestCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeUpdateV2RequestCreativeListInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

