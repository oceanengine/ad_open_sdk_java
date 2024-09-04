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
import com.bytedance.ads.model.QianchuanImageGetV10FilteringImageMode;
import com.bytedance.ads.model.QianchuanImageGetV10FilteringSources;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class QianchuanImageGetV10Filtering {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private List<QianchuanImageGetV10FilteringImageMode> imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<String> signatures = null;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<QianchuanImageGetV10FilteringSources> sources = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public QianchuanImageGetV10Filtering() {
  }

  public QianchuanImageGetV10Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanImageGetV10Filtering imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public QianchuanImageGetV10Filtering addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public QianchuanImageGetV10Filtering imageMode(List<QianchuanImageGetV10FilteringImageMode> imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

  public QianchuanImageGetV10Filtering addImageModeItem(QianchuanImageGetV10FilteringImageMode imageModeItem) {
    if (this.imageMode == null) {
      this.imageMode = new ArrayList<>();
    }
    this.imageMode.add(imageModeItem);
    return this;
  }

   /**
   * 
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public List<QianchuanImageGetV10FilteringImageMode> getImageMode() {
    return imageMode;
  }


  public void setImageMode(List<QianchuanImageGetV10FilteringImageMode> imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanImageGetV10Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public QianchuanImageGetV10Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public QianchuanImageGetV10Filtering signatures(List<String> signatures) {
    
    this.signatures = signatures;
    return this;
  }

  public QianchuanImageGetV10Filtering addSignaturesItem(String signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * 
   * @return signatures
  **/
  @javax.annotation.Nullable
  public List<String> getSignatures() {
    return signatures;
  }


  public void setSignatures(List<String> signatures) {
    this.signatures = signatures;
  }


  public QianchuanImageGetV10Filtering sources(List<QianchuanImageGetV10FilteringSources> sources) {
    
    this.sources = sources;
    return this;
  }

  public QianchuanImageGetV10Filtering addSourcesItem(QianchuanImageGetV10FilteringSources sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * 
   * @return sources
  **/
  @javax.annotation.Nullable
  public List<QianchuanImageGetV10FilteringSources> getSources() {
    return sources;
  }


  public void setSources(List<QianchuanImageGetV10FilteringSources> sources) {
    this.sources = sources;
  }


  public QianchuanImageGetV10Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public QianchuanImageGetV10Filtering tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public QianchuanImageGetV10Filtering addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * 
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanImageGetV10Filtering qianchuanImageGetV10Filtering = (QianchuanImageGetV10Filtering) o;
    return Objects.equals(this.endTime, qianchuanImageGetV10Filtering.endTime) &&
        Objects.equals(this.imageIds, qianchuanImageGetV10Filtering.imageIds) &&
        Objects.equals(this.imageMode, qianchuanImageGetV10Filtering.imageMode) &&
        Objects.equals(this.materialIds, qianchuanImageGetV10Filtering.materialIds) &&
        Objects.equals(this.signatures, qianchuanImageGetV10Filtering.signatures) &&
        Objects.equals(this.sources, qianchuanImageGetV10Filtering.sources) &&
        Objects.equals(this.startTime, qianchuanImageGetV10Filtering.startTime) &&
        Objects.equals(this.tags, qianchuanImageGetV10Filtering.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, imageIds, imageMode, materialIds, signatures, sources, startTime, tags);
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
    sb.append("class QianchuanImageGetV10Filtering {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("image_ids");
    openapiFields.add("image_mode");
    openapiFields.add("material_ids");
    openapiFields.add("signatures");
    openapiFields.add("sources");
    openapiFields.add("start_time");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanImageGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanImageGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanImageGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanImageGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanImageGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanImageGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanImageGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanImageGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanImageGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanImageGetV10Filtering
  */
  public static QianchuanImageGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanImageGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanImageGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

