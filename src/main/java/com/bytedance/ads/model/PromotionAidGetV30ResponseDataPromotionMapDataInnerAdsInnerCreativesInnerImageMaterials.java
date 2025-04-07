/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionAidGetV30DataPromotionMapDataAdsCreativesImageMaterialsImageMode;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionAidGetV30DataPromotionMapDataAdsCreativesImageMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IMAGE_URIS = "image_uris";
  @SerializedName(SERIALIZED_NAME_IMAGE_URIS)
  private List<String> imageUris = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials() {
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials imageMode(PromotionAidGetV30DataPromotionMapDataAdsCreativesImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public PromotionAidGetV30DataPromotionMapDataAdsCreativesImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionAidGetV30DataPromotionMapDataAdsCreativesImageMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials imageUris(List<String> imageUris) {
    
    this.imageUris = imageUris;
    return this;
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials addImageUrisItem(String imageUrisItem) {
    if (this.imageUris == null) {
      this.imageUris = new ArrayList<>();
    }
    this.imageUris.add(imageUrisItem);
    return this;
  }

   /**
   * 
   * @return imageUris
  **/
  @javax.annotation.Nullable
  public List<String> getImageUris() {
    return imageUris;
  }


  public void setImageUris(List<String> imageUris) {
    this.imageUris = imageUris;
  }


  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials = (PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials) o;
    return Objects.equals(this.imageMode, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials.imageMode) &&
        Objects.equals(this.imageUris, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials.imageUris) &&
        Objects.equals(this.materialId, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials.materialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, imageUris, materialId);
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
    sb.append("class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials {\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    imageUris: ").append(toIndentedString(imageUris)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("image_uris");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials>() {
           @Override
           public void write(JsonWriter out, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials
  * @throws IOException if the JSON string is invalid with respect to PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials
  */
  public static PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials.class);
  }

 /**
  * Convert an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerImageMaterials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

