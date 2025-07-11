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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class FileVideoDeleteV2ResponseData {
  public static final String SERIALIZED_NAME_FAIL_MATERIAL_IDS = "fail_material_ids";
  @SerializedName(SERIALIZED_NAME_FAIL_MATERIAL_IDS)
  private List<Long> failMaterialIds = null;

  public static final String SERIALIZED_NAME_FAIL_VIDEO_IDS = "fail_video_ids";
  @SerializedName(SERIALIZED_NAME_FAIL_VIDEO_IDS)
  private List<String> failVideoIds = null;

  public FileVideoDeleteV2ResponseData() {
  }

  public FileVideoDeleteV2ResponseData failMaterialIds(List<Long> failMaterialIds) {
    
    this.failMaterialIds = failMaterialIds;
    return this;
  }

  public FileVideoDeleteV2ResponseData addFailMaterialIdsItem(Long failMaterialIdsItem) {
    if (this.failMaterialIds == null) {
      this.failMaterialIds = new ArrayList<>();
    }
    this.failMaterialIds.add(failMaterialIdsItem);
    return this;
  }

   /**
   * 操作失败的视频ID列表，不在此列表内的素材表示删除成功
   * @return failMaterialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getFailMaterialIds() {
    return failMaterialIds;
  }


  public void setFailMaterialIds(List<Long> failMaterialIds) {
    this.failMaterialIds = failMaterialIds;
  }


  public FileVideoDeleteV2ResponseData failVideoIds(List<String> failVideoIds) {
    
    this.failVideoIds = failVideoIds;
    return this;
  }

  public FileVideoDeleteV2ResponseData addFailVideoIdsItem(String failVideoIdsItem) {
    if (this.failVideoIds == null) {
      this.failVideoIds = new ArrayList<>();
    }
    this.failVideoIds.add(failVideoIdsItem);
    return this;
  }

   /**
   * 操作失败的素材ID列表，不在此列表内的素材表示删除成功
   * @return failVideoIds
  **/
  @javax.annotation.Nullable
  public List<String> getFailVideoIds() {
    return failVideoIds;
  }


  public void setFailVideoIds(List<String> failVideoIds) {
    this.failVideoIds = failVideoIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoDeleteV2ResponseData fileVideoDeleteV2ResponseData = (FileVideoDeleteV2ResponseData) o;
    return Objects.equals(this.failMaterialIds, fileVideoDeleteV2ResponseData.failMaterialIds) &&
        Objects.equals(this.failVideoIds, fileVideoDeleteV2ResponseData.failVideoIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failMaterialIds, failVideoIds);
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
    sb.append("class FileVideoDeleteV2ResponseData {\n");
    sb.append("    failMaterialIds: ").append(toIndentedString(failMaterialIds)).append("\n");
    sb.append("    failVideoIds: ").append(toIndentedString(failVideoIds)).append("\n");
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
    openapiFields.add("fail_material_ids");
    openapiFields.add("fail_video_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoDeleteV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoDeleteV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoDeleteV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoDeleteV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoDeleteV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileVideoDeleteV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoDeleteV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoDeleteV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoDeleteV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileVideoDeleteV2ResponseData
  */
  public static FileVideoDeleteV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoDeleteV2ResponseData.class);
  }

 /**
  * Convert an instance of FileVideoDeleteV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

