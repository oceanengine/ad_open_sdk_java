/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * AicMaterialGetV30ResponseDataMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AicMaterialGetV30ResponseDataMaterialsInner {
  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_NAME = "material_name";
  @SerializedName(SERIALIZED_NAME_MATERIAL_NAME)
  private String materialName = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo videoInfo = null;

  public AicMaterialGetV30ResponseDataMaterialsInner() {
  }

  public AicMaterialGetV30ResponseDataMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public AicMaterialGetV30ResponseDataMaterialsInner materialName(String materialName) {
    
    this.materialName = materialName;
    return this;
  }

   /**
   * 素材名称 
   * @return materialName
  **/
  @javax.annotation.Nullable
  public String getMaterialName() {
    return materialName;
  }


  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }


  public AicMaterialGetV30ResponseDataMaterialsInner videoInfo(AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicMaterialGetV30ResponseDataMaterialsInner aicMaterialGetV30ResponseDataMaterialsInner = (AicMaterialGetV30ResponseDataMaterialsInner) o;
    return Objects.equals(this.materialId, aicMaterialGetV30ResponseDataMaterialsInner.materialId) &&
        Objects.equals(this.materialName, aicMaterialGetV30ResponseDataMaterialsInner.materialName) &&
        Objects.equals(this.videoInfo, aicMaterialGetV30ResponseDataMaterialsInner.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, materialName, videoInfo);
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
    sb.append("class AicMaterialGetV30ResponseDataMaterialsInner {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialName: ").append(toIndentedString(materialName)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("material_id");
    openapiFields.add("material_name");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicMaterialGetV30ResponseDataMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMaterialGetV30ResponseDataMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMaterialGetV30ResponseDataMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMaterialGetV30ResponseDataMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMaterialGetV30ResponseDataMaterialsInner>() {
           @Override
           public void write(JsonWriter out, AicMaterialGetV30ResponseDataMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMaterialGetV30ResponseDataMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMaterialGetV30ResponseDataMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMaterialGetV30ResponseDataMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to AicMaterialGetV30ResponseDataMaterialsInner
  */
  public static AicMaterialGetV30ResponseDataMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMaterialGetV30ResponseDataMaterialsInner.class);
  }

 /**
  * Convert an instance of AicMaterialGetV30ResponseDataMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

