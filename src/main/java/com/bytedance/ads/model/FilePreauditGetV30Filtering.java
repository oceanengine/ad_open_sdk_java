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
import com.bytedance.ads.model.FilePreauditGetV30FilteringMaterialChannel;
import com.bytedance.ads.model.FilePreauditGetV30FilteringMaterialType;
import com.bytedance.ads.model.FilePreauditGetV30FilteringStatus;
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
public class FilePreauditGetV30Filtering {
  public static final String SERIALIZED_NAME_MATERIAL_CHANNEL = "material_channel";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CHANNEL)
  private FilePreauditGetV30FilteringMaterialChannel materialChannel = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private FilePreauditGetV30FilteringMaterialType materialType = null;

  public static final String SERIALIZED_NAME_PREAUDIT_IDS = "preaudit_ids";
  @SerializedName(SERIALIZED_NAME_PREAUDIT_IDS)
  private List<Long> preauditIds = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FilePreauditGetV30FilteringStatus status = null;

  public FilePreauditGetV30Filtering() {
  }

  public FilePreauditGetV30Filtering materialChannel(FilePreauditGetV30FilteringMaterialChannel materialChannel) {
    
    this.materialChannel = materialChannel;
    return this;
  }

   /**
   * Get materialChannel
   * @return materialChannel
  **/
  @javax.annotation.Nullable
  public FilePreauditGetV30FilteringMaterialChannel getMaterialChannel() {
    return materialChannel;
  }


  public void setMaterialChannel(FilePreauditGetV30FilteringMaterialChannel materialChannel) {
    this.materialChannel = materialChannel;
  }


  public FilePreauditGetV30Filtering materialType(FilePreauditGetV30FilteringMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public FilePreauditGetV30FilteringMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(FilePreauditGetV30FilteringMaterialType materialType) {
    this.materialType = materialType;
  }


  public FilePreauditGetV30Filtering preauditIds(List<Long> preauditIds) {
    
    this.preauditIds = preauditIds;
    return this;
  }

  public FilePreauditGetV30Filtering addPreauditIdsItem(Long preauditIdsItem) {
    if (this.preauditIds == null) {
      this.preauditIds = new ArrayList<>();
    }
    this.preauditIds.add(preauditIdsItem);
    return this;
  }

   /**
   * 
   * @return preauditIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPreauditIds() {
    return preauditIds;
  }


  public void setPreauditIds(List<Long> preauditIds) {
    this.preauditIds = preauditIds;
  }


  public FilePreauditGetV30Filtering status(FilePreauditGetV30FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public FilePreauditGetV30FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(FilePreauditGetV30FilteringStatus status) {
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
    FilePreauditGetV30Filtering filePreauditGetV30Filtering = (FilePreauditGetV30Filtering) o;
    return Objects.equals(this.materialChannel, filePreauditGetV30Filtering.materialChannel) &&
        Objects.equals(this.materialType, filePreauditGetV30Filtering.materialType) &&
        Objects.equals(this.preauditIds, filePreauditGetV30Filtering.preauditIds) &&
        Objects.equals(this.status, filePreauditGetV30Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialChannel, materialType, preauditIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePreauditGetV30Filtering {\n");
    sb.append("    materialChannel: ").append(toIndentedString(materialChannel)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    preauditIds: ").append(toIndentedString(preauditIds)).append("\n");
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
    openapiFields.add("material_channel");
    openapiFields.add("material_type");
    openapiFields.add("preaudit_ids");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilePreauditGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilePreauditGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilePreauditGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilePreauditGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FilePreauditGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, FilePreauditGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilePreauditGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilePreauditGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilePreauditGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to FilePreauditGetV30Filtering
  */
  public static FilePreauditGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilePreauditGetV30Filtering.class);
  }

 /**
  * Convert an instance of FilePreauditGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

