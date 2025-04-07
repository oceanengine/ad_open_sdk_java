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
import com.bytedance.ads.model.FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes;
import com.bytedance.ads.model.FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource;
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
 * 任务的参数
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams {
  public static final String SERIALIZED_NAME_CLEAR_MATERIAL_TYPES = "clear_material_types";
  @SerializedName(SERIALIZED_NAME_CLEAR_MATERIAL_TYPES)
  private List<FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes> clearMaterialTypes = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_UPPER = "create_time_upper";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_UPPER)
  private String createTimeUpper = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_SOURCE = "material_source";
  @SerializedName(SERIALIZED_NAME_MATERIAL_SOURCE)
  private FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource materialSource = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams() {
  }

  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams clearMaterialTypes(List<FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes> clearMaterialTypes) {
    
    this.clearMaterialTypes = clearMaterialTypes;
    return this;
  }

  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams addClearMaterialTypesItem(FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes clearMaterialTypesItem) {
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
  public List<FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes> getClearMaterialTypes() {
    return clearMaterialTypes;
  }


  public void setClearMaterialTypes(List<FileVideoMaterialClearTaskGetV2DataListClearTaskParamsClearMaterialTypes> clearMaterialTypes) {
    this.clearMaterialTypes = clearMaterialTypes;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams convert(Long convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * 
   * @return convert
  **/
  @javax.annotation.Nullable
  public Long getConvert() {
    return convert;
  }


  public void setConvert(Long convert) {
    this.convert = convert;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams createTimeUpper(String createTimeUpper) {
    
    this.createTimeUpper = createTimeUpper;
    return this;
  }

   /**
   * 
   * @return createTimeUpper
  **/
  @javax.annotation.Nullable
  public String getCreateTimeUpper() {
    return createTimeUpper;
  }


  public void setCreateTimeUpper(String createTimeUpper) {
    this.createTimeUpper = createTimeUpper;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams endTime(String endTime) {
    
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


  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 待清理的素材列表
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams materialSource(FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource materialSource) {
    
    this.materialSource = materialSource;
    return this;
  }

   /**
   * Get materialSource
   * @return materialSource
  **/
  @javax.annotation.Nullable
  public FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource getMaterialSource() {
    return materialSource;
  }


  public void setMaterialSource(FileVideoMaterialClearTaskGetV2DataListClearTaskParamsMaterialSource materialSource) {
    this.materialSource = materialSource;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams startTime(String startTime) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams = (FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams) o;
    return Objects.equals(this.clearMaterialTypes, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.clearMaterialTypes) &&
        Objects.equals(this.convert, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.convert) &&
        Objects.equals(this.cost, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.cost) &&
        Objects.equals(this.createTimeUpper, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.createTimeUpper) &&
        Objects.equals(this.endTime, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.endTime) &&
        Objects.equals(this.materialIds, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.materialIds) &&
        Objects.equals(this.materialSource, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.materialSource) &&
        Objects.equals(this.startTime, fileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearMaterialTypes, convert, cost, createTimeUpper, endTime, materialIds, materialSource, startTime);
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
    sb.append("class FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams {\n");
    sb.append("    clearMaterialTypes: ").append(toIndentedString(clearMaterialTypes)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    createTimeUpper: ").append(toIndentedString(createTimeUpper)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    materialSource: ").append(toIndentedString(materialSource)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("convert");
    openapiFields.add("cost");
    openapiFields.add("create_time_upper");
    openapiFields.add("end_time");
    openapiFields.add("material_ids");
    openapiFields.add("material_source");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams>() {
           @Override
           public void write(JsonWriter out, FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams
  * @throws IOException if the JSON string is invalid with respect to FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams
  */
  public static FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams.class);
  }

 /**
  * Convert an instance of FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

