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
import com.bytedance.ads.model.FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes;
import com.bytedance.ads.model.FileVideoMaterialClearTaskResultGetV2DataClearResultClearResult;
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
 * FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner {
  public static final String SERIALIZED_NAME_CLEAR_MATERIAL_TYPES = "clear_material_types";
  @SerializedName(SERIALIZED_NAME_CLEAR_MATERIAL_TYPES)
  private List<FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes> clearMaterialTypes = null;

  public static final String SERIALIZED_NAME_CLEAR_RESULT = "clear_result";
  @SerializedName(SERIALIZED_NAME_CLEAR_RESULT)
  private FileVideoMaterialClearTaskResultGetV2DataClearResultClearResult clearResult = null;

  public static final String SERIALIZED_NAME_CREATIVE_FAIL_COUNT = "creative_fail_count";
  @SerializedName(SERIALIZED_NAME_CREATIVE_FAIL_COUNT)
  private Long creativeFailCount = null;

  public static final String SERIALIZED_NAME_CREATIVE_SUCCESS_COUNT = "creative_success_count";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SUCCESS_COUNT)
  private Long creativeSuccessCount = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_PROMOTION_FAIL_COUNT = "promotion_fail_count";
  @SerializedName(SERIALIZED_NAME_PROMOTION_FAIL_COUNT)
  private Long promotionFailCount = null;

  public static final String SERIALIZED_NAME_PROMOTION_SUCCESS_COUNT = "promotion_success_count";
  @SerializedName(SERIALIZED_NAME_PROMOTION_SUCCESS_COUNT)
  private Long promotionSuccessCount = null;

  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner() {
  }

  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner clearMaterialTypes(List<FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes> clearMaterialTypes) {
    
    this.clearMaterialTypes = clearMaterialTypes;
    return this;
  }

  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner addClearMaterialTypesItem(FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes clearMaterialTypesItem) {
    if (this.clearMaterialTypes == null) {
      this.clearMaterialTypes = new ArrayList<>();
    }
    this.clearMaterialTypes.add(clearMaterialTypesItem);
    return this;
  }

   /**
   * 
   * @return clearMaterialTypes
  **/
  @javax.annotation.Nullable
  public List<FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes> getClearMaterialTypes() {
    return clearMaterialTypes;
  }


  public void setClearMaterialTypes(List<FileVideoMaterialClearTaskResultGetV2DataClearResultClearMaterialTypes> clearMaterialTypes) {
    this.clearMaterialTypes = clearMaterialTypes;
  }


  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner clearResult(FileVideoMaterialClearTaskResultGetV2DataClearResultClearResult clearResult) {
    
    this.clearResult = clearResult;
    return this;
  }

   /**
   * Get clearResult
   * @return clearResult
  **/
  @javax.annotation.Nullable
  public FileVideoMaterialClearTaskResultGetV2DataClearResultClearResult getClearResult() {
    return clearResult;
  }


  public void setClearResult(FileVideoMaterialClearTaskResultGetV2DataClearResultClearResult clearResult) {
    this.clearResult = clearResult;
  }


  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner creativeFailCount(Long creativeFailCount) {
    
    this.creativeFailCount = creativeFailCount;
    return this;
  }

   /**
   * 
   * @return creativeFailCount
  **/
  @javax.annotation.Nullable
  public Long getCreativeFailCount() {
    return creativeFailCount;
  }


  public void setCreativeFailCount(Long creativeFailCount) {
    this.creativeFailCount = creativeFailCount;
  }


  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner creativeSuccessCount(Long creativeSuccessCount) {
    
    this.creativeSuccessCount = creativeSuccessCount;
    return this;
  }

   /**
   * 
   * @return creativeSuccessCount
  **/
  @javax.annotation.Nullable
  public Long getCreativeSuccessCount() {
    return creativeSuccessCount;
  }


  public void setCreativeSuccessCount(Long creativeSuccessCount) {
    this.creativeSuccessCount = creativeSuccessCount;
  }


  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner materialId(Long materialId) {
    
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


  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner promotionFailCount(Long promotionFailCount) {
    
    this.promotionFailCount = promotionFailCount;
    return this;
  }

   /**
   * 
   * @return promotionFailCount
  **/
  @javax.annotation.Nullable
  public Long getPromotionFailCount() {
    return promotionFailCount;
  }


  public void setPromotionFailCount(Long promotionFailCount) {
    this.promotionFailCount = promotionFailCount;
  }


  public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner promotionSuccessCount(Long promotionSuccessCount) {
    
    this.promotionSuccessCount = promotionSuccessCount;
    return this;
  }

   /**
   * 
   * @return promotionSuccessCount
  **/
  @javax.annotation.Nullable
  public Long getPromotionSuccessCount() {
    return promotionSuccessCount;
  }


  public void setPromotionSuccessCount(Long promotionSuccessCount) {
    this.promotionSuccessCount = promotionSuccessCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner = (FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner) o;
    return Objects.equals(this.clearMaterialTypes, fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.clearMaterialTypes) &&
        Objects.equals(this.clearResult, fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.clearResult) &&
        Objects.equals(this.creativeFailCount, fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.creativeFailCount) &&
        Objects.equals(this.creativeSuccessCount, fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.creativeSuccessCount) &&
        Objects.equals(this.materialId, fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.materialId) &&
        Objects.equals(this.promotionFailCount, fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.promotionFailCount) &&
        Objects.equals(this.promotionSuccessCount, fileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.promotionSuccessCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearMaterialTypes, clearResult, creativeFailCount, creativeSuccessCount, materialId, promotionFailCount, promotionSuccessCount);
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
    sb.append("class FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner {\n");
    sb.append("    clearMaterialTypes: ").append(toIndentedString(clearMaterialTypes)).append("\n");
    sb.append("    clearResult: ").append(toIndentedString(clearResult)).append("\n");
    sb.append("    creativeFailCount: ").append(toIndentedString(creativeFailCount)).append("\n");
    sb.append("    creativeSuccessCount: ").append(toIndentedString(creativeSuccessCount)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    promotionFailCount: ").append(toIndentedString(promotionFailCount)).append("\n");
    sb.append("    promotionSuccessCount: ").append(toIndentedString(promotionSuccessCount)).append("\n");
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
    openapiFields.add("clear_material_types");
    openapiFields.add("clear_result");
    openapiFields.add("creative_fail_count");
    openapiFields.add("creative_success_count");
    openapiFields.add("material_id");
    openapiFields.add("promotion_fail_count");
    openapiFields.add("promotion_success_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner>() {
           @Override
           public void write(JsonWriter out, FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner
  * @throws IOException if the JSON string is invalid with respect to FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner
  */
  public static FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner.class);
  }

 /**
  * Convert an instance of FileVideoMaterialClearTaskResultGetV2ResponseDataClearResultInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

