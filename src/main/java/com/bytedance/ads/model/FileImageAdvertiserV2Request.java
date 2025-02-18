/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileImageAdvertiserV2UploadTo;
import com.bytedance.ads.model.FileImageAdvertiserV2UploadType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.IOException;

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
 * FileImageAdvertiserV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class FileImageAdvertiserV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_IMAGE_FILE = "image_file";
  @SerializedName(SERIALIZED_NAME_IMAGE_FILE)
  private File imageFile = null;

  public static final String SERIALIZED_NAME_IMAGE_SIGNATURE = "image_signature";
  @SerializedName(SERIALIZED_NAME_IMAGE_SIGNATURE)
  private String imageSignature = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_UPLOAD_TO = "upload_to";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TO)
  private FileImageAdvertiserV2UploadTo uploadTo = null;

  public static final String SERIALIZED_NAME_UPLOAD_TYPE = "upload_type";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TYPE)
  private FileImageAdvertiserV2UploadType uploadType = null;

  public FileImageAdvertiserV2Request() {
  }

  public FileImageAdvertiserV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public FileImageAdvertiserV2Request imageFile(File imageFile) {
    
    this.imageFile = imageFile;
    return this;
  }

   /**
   * 
   * @return imageFile
  **/
  @javax.annotation.Nullable
  public File getImageFile() {
    return imageFile;
  }


  public void setImageFile(File imageFile) {
    this.imageFile = imageFile;
  }


  public FileImageAdvertiserV2Request imageSignature(String imageSignature) {
    
    this.imageSignature = imageSignature;
    return this;
  }

   /**
   * 
   * @return imageSignature
  **/
  @javax.annotation.Nullable
  public String getImageSignature() {
    return imageSignature;
  }


  public void setImageSignature(String imageSignature) {
    this.imageSignature = imageSignature;
  }


  public FileImageAdvertiserV2Request imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public FileImageAdvertiserV2Request uploadTo(FileImageAdvertiserV2UploadTo uploadTo) {
    
    this.uploadTo = uploadTo;
    return this;
  }

   /**
   * Get uploadTo
   * @return uploadTo
  **/
  @javax.annotation.Nonnull
  public FileImageAdvertiserV2UploadTo getUploadTo() {
    return uploadTo;
  }


  public void setUploadTo(FileImageAdvertiserV2UploadTo uploadTo) {
    this.uploadTo = uploadTo;
  }


  public FileImageAdvertiserV2Request uploadType(FileImageAdvertiserV2UploadType uploadType) {
    
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @javax.annotation.Nonnull
  public FileImageAdvertiserV2UploadType getUploadType() {
    return uploadType;
  }


  public void setUploadType(FileImageAdvertiserV2UploadType uploadType) {
    this.uploadType = uploadType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileImageAdvertiserV2Request fileImageAdvertiserV2Request = (FileImageAdvertiserV2Request) o;
    return Objects.equals(this.advertiserId, fileImageAdvertiserV2Request.advertiserId) &&
        Objects.equals(this.imageFile, fileImageAdvertiserV2Request.imageFile) &&
        Objects.equals(this.imageSignature, fileImageAdvertiserV2Request.imageSignature) &&
        Objects.equals(this.imageUrl, fileImageAdvertiserV2Request.imageUrl) &&
        Objects.equals(this.uploadTo, fileImageAdvertiserV2Request.uploadTo) &&
        Objects.equals(this.uploadType, fileImageAdvertiserV2Request.uploadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, imageFile, imageSignature, imageUrl, uploadTo, uploadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileImageAdvertiserV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageSignature: ").append(toIndentedString(imageSignature)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    uploadTo: ").append(toIndentedString(uploadTo)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
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
    openapiFields.add("image_file");
    openapiFields.add("image_signature");
    openapiFields.add("image_url");
    openapiFields.add("upload_to");
    openapiFields.add("upload_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("upload_to");
    openapiRequiredFields.add("upload_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileImageAdvertiserV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileImageAdvertiserV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileImageAdvertiserV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileImageAdvertiserV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileImageAdvertiserV2Request>() {
           @Override
           public void write(JsonWriter out, FileImageAdvertiserV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileImageAdvertiserV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileImageAdvertiserV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileImageAdvertiserV2Request
  * @throws IOException if the JSON string is invalid with respect to FileImageAdvertiserV2Request
  */
  public static FileImageAdvertiserV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileImageAdvertiserV2Request.class);
  }

 /**
  * Convert an instance of FileImageAdvertiserV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

