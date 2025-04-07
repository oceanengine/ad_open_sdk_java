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
import com.bytedance.ads.model.FileVideoPauseV2ResponseDataMaterialClearResultValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class FileVideoPauseV2ResponseData {
  public static final String SERIALIZED_NAME_FAIL_MATERIAL_IDS = "fail_material_ids";
  @SerializedName(SERIALIZED_NAME_FAIL_MATERIAL_IDS)
  private List<Long> failMaterialIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_CLEAR_RESULT = "material_clear_result";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CLEAR_RESULT)
  private Map<String, FileVideoPauseV2ResponseDataMaterialClearResultValue> materialClearResult = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public FileVideoPauseV2ResponseData() {
  }

  public FileVideoPauseV2ResponseData failMaterialIds(List<Long> failMaterialIds) {
    
    this.failMaterialIds = failMaterialIds;
    return this;
  }

  public FileVideoPauseV2ResponseData addFailMaterialIdsItem(Long failMaterialIdsItem) {
    if (this.failMaterialIds == null) {
      this.failMaterialIds = new ArrayList<>();
    }
    this.failMaterialIds.add(failMaterialIdsItem);
    return this;
  }

   /**
   * 删除失败的素材id明细(素材id下仍然有至少一个的可投创意)
   * @return failMaterialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getFailMaterialIds() {
    return failMaterialIds;
  }


  public void setFailMaterialIds(List<Long> failMaterialIds) {
    this.failMaterialIds = failMaterialIds;
  }


  public FileVideoPauseV2ResponseData materialClearResult(Map<String, FileVideoPauseV2ResponseDataMaterialClearResultValue> materialClearResult) {
    
    this.materialClearResult = materialClearResult;
    return this;
  }

  public FileVideoPauseV2ResponseData putMaterialClearResultItem(String key, FileVideoPauseV2ResponseDataMaterialClearResultValue materialClearResultItem) {
    if (this.materialClearResult == null) {
      this.materialClearResult = new HashMap<>();
    }
    this.materialClearResult.put(key, materialClearResultItem);
    return this;
  }

   /**
   * 清理结果明细
   * @return materialClearResult
  **/
  @javax.annotation.Nullable
  public Map<String, FileVideoPauseV2ResponseDataMaterialClearResultValue> getMaterialClearResult() {
    return materialClearResult;
  }


  public void setMaterialClearResult(Map<String, FileVideoPauseV2ResponseDataMaterialClearResultValue> materialClearResult) {
    this.materialClearResult = materialClearResult;
  }


  public FileVideoPauseV2ResponseData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 清理结果 允许值： SUCCESS 成功 PART_SUCCESS 部分成功 FAIL 失败
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoPauseV2ResponseData fileVideoPauseV2ResponseData = (FileVideoPauseV2ResponseData) o;
    return Objects.equals(this.failMaterialIds, fileVideoPauseV2ResponseData.failMaterialIds) &&
        Objects.equals(this.materialClearResult, fileVideoPauseV2ResponseData.materialClearResult) &&
        Objects.equals(this.status, fileVideoPauseV2ResponseData.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failMaterialIds, materialClearResult, status);
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
    sb.append("class FileVideoPauseV2ResponseData {\n");
    sb.append("    failMaterialIds: ").append(toIndentedString(failMaterialIds)).append("\n");
    sb.append("    materialClearResult: ").append(toIndentedString(materialClearResult)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("material_clear_result");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoPauseV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoPauseV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoPauseV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoPauseV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoPauseV2ResponseData>() {
           @Override
           public void write(JsonWriter out, FileVideoPauseV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoPauseV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoPauseV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoPauseV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to FileVideoPauseV2ResponseData
  */
  public static FileVideoPauseV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoPauseV2ResponseData.class);
  }

 /**
  * Convert an instance of FileVideoPauseV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

