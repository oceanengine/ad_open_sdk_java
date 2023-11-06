/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner;
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
 * PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner {
  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_DATA_LIST = "template_data_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DATA_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner> templateDataList = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner() {
  }

  public PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner templateDataList(List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner> templateDataList) {
    
    this.templateDataList = templateDataList;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner addTemplateDataListItem(PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner templateDataListItem) {
    if (this.templateDataList == null) {
      this.templateDataList = new ArrayList<>();
    }
    this.templateDataList.add(templateDataListItem);
    return this;
  }

   /**
   * 
   * @return templateDataList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner> getTemplateDataList() {
    return templateDataList;
  }


  public void setTemplateDataList(List<PromotionCreateV30RequestPromotionMaterialsImageMaterialListInnerImagesInnerTemplateDataListInner> templateDataList) {
    this.templateDataList = templateDataList;
  }


  public PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nullable
  public Long getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner promotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner = (PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner) o;
    return Objects.equals(this.imageId, promotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner.imageId) &&
        Objects.equals(this.templateDataList, promotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner.templateDataList) &&
        Objects.equals(this.templateId, promotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, templateDataList, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    templateDataList: ").append(toIndentedString(templateDataList)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("image_id");
    openapiFields.add("template_data_list");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner
  */
  public static PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterialsImageMaterialListInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

