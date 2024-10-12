/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsAppManagementUploadTaskListV2Filtering {
  public static final String SERIALIZED_NAME_UPLOAD_IDS = "upload_ids";
  @SerializedName(SERIALIZED_NAME_UPLOAD_IDS)
  private List<Long> uploadIds = null;

  public ToolsAppManagementUploadTaskListV2Filtering() {
  }

  public ToolsAppManagementUploadTaskListV2Filtering uploadIds(List<Long> uploadIds) {
    
    this.uploadIds = uploadIds;
    return this;
  }

  public ToolsAppManagementUploadTaskListV2Filtering addUploadIdsItem(Long uploadIdsItem) {
    if (this.uploadIds == null) {
      this.uploadIds = new ArrayList<>();
    }
    this.uploadIds.add(uploadIdsItem);
    return this;
  }

   /**
   * 上传文件id，通过CreateUploadTask获得
   * @return uploadIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getUploadIds() {
    return uploadIds;
  }


  public void setUploadIds(List<Long> uploadIds) {
    this.uploadIds = uploadIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementUploadTaskListV2Filtering toolsAppManagementUploadTaskListV2Filtering = (ToolsAppManagementUploadTaskListV2Filtering) o;
    return Objects.equals(this.uploadIds, toolsAppManagementUploadTaskListV2Filtering.uploadIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementUploadTaskListV2Filtering {\n");
    sb.append("    uploadIds: ").append(toIndentedString(uploadIds)).append("\n");
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
    openapiFields.add("upload_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("upload_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementUploadTaskListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementUploadTaskListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementUploadTaskListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementUploadTaskListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementUploadTaskListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementUploadTaskListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementUploadTaskListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementUploadTaskListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementUploadTaskListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementUploadTaskListV2Filtering
  */
  public static ToolsAppManagementUploadTaskListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementUploadTaskListV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsAppManagementUploadTaskListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

