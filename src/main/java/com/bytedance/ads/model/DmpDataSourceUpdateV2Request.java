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
import com.bytedance.ads.model.DmpDataSourceUpdateV2DataFormat;
import com.bytedance.ads.model.DmpDataSourceUpdateV2FileStorageType;
import com.bytedance.ads.model.DmpDataSourceUpdateV2OperationType;
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
 * DmpDataSourceUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class DmpDataSourceUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DATA_FORMAT = "data_format";
  @SerializedName(SERIALIZED_NAME_DATA_FORMAT)
  private DmpDataSourceUpdateV2DataFormat dataFormat = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "data_source_id";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private String dataSourceId = null;

  public static final String SERIALIZED_NAME_FILE_PATHS = "file_paths";
  @SerializedName(SERIALIZED_NAME_FILE_PATHS)
  private List<String> filePaths = null;

  public static final String SERIALIZED_NAME_FILE_STORAGE_TYPE = "file_storage_type";
  @SerializedName(SERIALIZED_NAME_FILE_STORAGE_TYPE)
  private DmpDataSourceUpdateV2FileStorageType fileStorageType = null;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private DmpDataSourceUpdateV2OperationType operationType = null;

  public DmpDataSourceUpdateV2Request() {
  }

  public DmpDataSourceUpdateV2Request advertiserId(Long advertiserId) {
    
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


  public DmpDataSourceUpdateV2Request dataFormat(DmpDataSourceUpdateV2DataFormat dataFormat) {
    
    this.dataFormat = dataFormat;
    return this;
  }

   /**
   * Get dataFormat
   * @return dataFormat
  **/
  @javax.annotation.Nonnull
  public DmpDataSourceUpdateV2DataFormat getDataFormat() {
    return dataFormat;
  }


  public void setDataFormat(DmpDataSourceUpdateV2DataFormat dataFormat) {
    this.dataFormat = dataFormat;
  }


  public DmpDataSourceUpdateV2Request dataSourceId(String dataSourceId) {
    
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * 
   * @return dataSourceId
  **/
  @javax.annotation.Nonnull
  public String getDataSourceId() {
    return dataSourceId;
  }


  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public DmpDataSourceUpdateV2Request filePaths(List<String> filePaths) {
    
    this.filePaths = filePaths;
    return this;
  }

  public DmpDataSourceUpdateV2Request addFilePathsItem(String filePathsItem) {
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


  public DmpDataSourceUpdateV2Request fileStorageType(DmpDataSourceUpdateV2FileStorageType fileStorageType) {
    
    this.fileStorageType = fileStorageType;
    return this;
  }

   /**
   * Get fileStorageType
   * @return fileStorageType
  **/
  @javax.annotation.Nonnull
  public DmpDataSourceUpdateV2FileStorageType getFileStorageType() {
    return fileStorageType;
  }


  public void setFileStorageType(DmpDataSourceUpdateV2FileStorageType fileStorageType) {
    this.fileStorageType = fileStorageType;
  }


  public DmpDataSourceUpdateV2Request operationType(DmpDataSourceUpdateV2OperationType operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nonnull
  public DmpDataSourceUpdateV2OperationType getOperationType() {
    return operationType;
  }


  public void setOperationType(DmpDataSourceUpdateV2OperationType operationType) {
    this.operationType = operationType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpDataSourceUpdateV2Request dmpDataSourceUpdateV2Request = (DmpDataSourceUpdateV2Request) o;
    return Objects.equals(this.advertiserId, dmpDataSourceUpdateV2Request.advertiserId) &&
        Objects.equals(this.dataFormat, dmpDataSourceUpdateV2Request.dataFormat) &&
        Objects.equals(this.dataSourceId, dmpDataSourceUpdateV2Request.dataSourceId) &&
        Objects.equals(this.filePaths, dmpDataSourceUpdateV2Request.filePaths) &&
        Objects.equals(this.fileStorageType, dmpDataSourceUpdateV2Request.fileStorageType) &&
        Objects.equals(this.operationType, dmpDataSourceUpdateV2Request.operationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, dataFormat, dataSourceId, filePaths, fileStorageType, operationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpDataSourceUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    filePaths: ").append(toIndentedString(filePaths)).append("\n");
    sb.append("    fileStorageType: ").append(toIndentedString(fileStorageType)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
    openapiFields.add("data_source_id");
    openapiFields.add("file_paths");
    openapiFields.add("file_storage_type");
    openapiFields.add("operation_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("data_format");
    openapiRequiredFields.add("data_source_id");
    openapiRequiredFields.add("file_paths");
    openapiRequiredFields.add("file_storage_type");
    openapiRequiredFields.add("operation_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpDataSourceUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpDataSourceUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpDataSourceUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpDataSourceUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpDataSourceUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, DmpDataSourceUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpDataSourceUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpDataSourceUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpDataSourceUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to DmpDataSourceUpdateV2Request
  */
  public static DmpDataSourceUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpDataSourceUpdateV2Request.class);
  }

 /**
  * Convert an instance of DmpDataSourceUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

