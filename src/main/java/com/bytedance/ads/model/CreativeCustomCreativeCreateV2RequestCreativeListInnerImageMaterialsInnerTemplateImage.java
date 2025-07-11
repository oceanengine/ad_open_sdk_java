/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage {
  public static final String SERIALIZED_NAME_TEMPLATE_DATA_LIST = "template_data_list";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DATA_LIST)
  private List<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner> templateDataList = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Long templateId = null;

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage() {
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateDataList(List<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner> templateDataList) {
    
    this.templateDataList = templateDataList;
    return this;
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage addTemplateDataListItem(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner templateDataListItem) {
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
  public List<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner> getTemplateDataList() {
    return templateDataList;
  }


  public void setTemplateDataList(List<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImageTemplateDataListInner> templateDataList) {
    this.templateDataList = templateDataList;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 
   * @return templateId
  **/
  @javax.annotation.Nonnull
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
    CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage = (CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage) o;
    return Objects.equals(this.templateDataList, creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage.templateDataList) &&
        Objects.equals(this.templateId, creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateDataList, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage {\n");
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
    openapiFields.add("template_data_list");
    openapiFields.add("template_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage
  */
  public static CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

