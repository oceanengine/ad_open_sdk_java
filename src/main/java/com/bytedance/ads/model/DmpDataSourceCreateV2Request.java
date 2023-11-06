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
import com.bytedance.ads.model.DmpDataSourceCreateV2DataFormat;
import com.bytedance.ads.model.DmpDataSourceCreateV2DataSourceType;
import com.bytedance.ads.model.DmpDataSourceCreateV2FileStorageType;
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
 * DmpDataSourceCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-06T20:56:39.959100519+08:00[PRC]")
public class DmpDataSourceCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DATA_FORMAT = "data_format";
  @SerializedName(SERIALIZED_NAME_DATA_FORMAT)
  private DmpDataSourceCreateV2DataFormat dataFormat = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_NAME = "data_source_name";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_NAME)
  private String dataSourceName = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_TYPE = "data_source_type";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_TYPE)
  private DmpDataSourceCreateV2DataSourceType dataSourceType = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FILE_PATHS = "file_paths";
  @SerializedName(SERIALIZED_NAME_FILE_PATHS)
  private List<String> filePaths = null;

  public static final String SERIALIZED_NAME_FILE_STORAGE_TYPE = "file_storage_type";
  @SerializedName(SERIALIZED_NAME_FILE_STORAGE_TYPE)
  private DmpDataSourceCreateV2FileStorageType fileStorageType = null;

  public DmpDataSourceCreateV2Request() {
  }

  public DmpDataSourceCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DmpDataSourceCreateV2Request dataFormat(DmpDataSourceCreateV2DataFormat dataFormat) {
    
    this.dataFormat = dataFormat;
    return this;
  }

   /**
   * Get dataFormat
   * @return dataFormat
  **/
  @javax.annotation.Nonnull
  public DmpDataSourceCreateV2DataFormat getDataFormat() {
    return dataFormat;
  }


  public void setDataFormat(DmpDataSourceCreateV2DataFormat dataFormat) {
    this.dataFormat = dataFormat;
  }


  public DmpDataSourceCreateV2Request dataSourceName(String dataSourceName) {
    
    this.dataSourceName = dataSourceName;
    return this;
  }

   /**
   * 
   * @return dataSourceName
  **/
  @javax.annotation.Nonnull
  public String getDataSourceName() {
    return dataSourceName;
  }


  public void setDataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
  }


  public DmpDataSourceCreateV2Request dataSourceType(DmpDataSourceCreateV2DataSourceType dataSourceType) {
    
    this.dataSourceType = dataSourceType;
    return this;
  }

   /**
   * Get dataSourceType
   * @return dataSourceType
  **/
  @javax.annotation.Nullable
  public DmpDataSourceCreateV2DataSourceType getDataSourceType() {
    return dataSourceType;
  }


  public void setDataSourceType(DmpDataSourceCreateV2DataSourceType dataSourceType) {
    this.dataSourceType = dataSourceType;
  }


  public DmpDataSourceCreateV2Request description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DmpDataSourceCreateV2Request filePaths(List<String> filePaths) {
    
    this.filePaths = filePaths;
    return this;
  }

  public DmpDataSourceCreateV2Request addFilePathsItem(String filePathsItem) {
    if (this.filePaths == null) {
      this.filePaths = new ArrayList<>();
    }
    this.filePaths.add(filePathsItem);
    return this;
  }

   /**
   * 
   * @return filePaths
  **/
  @javax.annotation.Nonnull
  public List<String> getFilePaths() {
    return filePaths;
  }


  public void setFilePaths(List<String> filePaths) {
    this.filePaths = filePaths;
  }


  public DmpDataSourceCreateV2Request fileStorageType(DmpDataSourceCreateV2FileStorageType fileStorageType) {
    
    this.fileStorageType = fileStorageType;
    return this;
  }

   /**
   * Get fileStorageType
   * @return fileStorageType
  **/
  @javax.annotation.Nonnull
  public DmpDataSourceCreateV2FileStorageType getFileStorageType() {
    return fileStorageType;
  }


  public void setFileStorageType(DmpDataSourceCreateV2FileStorageType fileStorageType) {
    this.fileStorageType = fileStorageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpDataSourceCreateV2Request dmpDataSourceCreateV2Request = (DmpDataSourceCreateV2Request) o;
    return Objects.equals(this.advertiserId, dmpDataSourceCreateV2Request.advertiserId) &&
        Objects.equals(this.dataFormat, dmpDataSourceCreateV2Request.dataFormat) &&
        Objects.equals(this.dataSourceName, dmpDataSourceCreateV2Request.dataSourceName) &&
        Objects.equals(this.dataSourceType, dmpDataSourceCreateV2Request.dataSourceType) &&
        Objects.equals(this.description, dmpDataSourceCreateV2Request.description) &&
        Objects.equals(this.filePaths, dmpDataSourceCreateV2Request.filePaths) &&
        Objects.equals(this.fileStorageType, dmpDataSourceCreateV2Request.fileStorageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, dataFormat, dataSourceName, dataSourceType, description, filePaths, fileStorageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpDataSourceCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
    sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
    sb.append("    fileStorageType: ").append(toIndentedString(fileStorageType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("data_format");
    openapiFields.add("data_source_name");
    openapiFields.add("data_source_type");
    openapiFields.add("description");
    openapiFields.add("file_paths");
    openapiFields.add("file_storage_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("data_format");
    openapiRequiredFields.add("data_source_name");
    openapiRequiredFields.add("file_paths");
    openapiRequiredFields.add("file_storage_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpDataSourceCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpDataSourceCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpDataSourceCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpDataSourceCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpDataSourceCreateV2Request>() {
           @Override
           public void write(JsonWriter out, DmpDataSourceCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpDataSourceCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpDataSourceCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpDataSourceCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to DmpDataSourceCreateV2Request
  */
  public static DmpDataSourceCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpDataSourceCreateV2Request.class);
  }

 /**
  * Convert an instance of DmpDataSourceCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

