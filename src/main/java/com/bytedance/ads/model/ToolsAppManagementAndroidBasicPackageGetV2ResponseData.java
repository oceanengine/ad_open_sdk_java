/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-11-07T15:15:45.195843649+08:00[PRC]")
public class ToolsAppManagementAndroidBasicPackageGetV2ResponseData {
  public static final String SERIALIZED_NAME_CURRENT_VERSION = "current_version";
  @SerializedName(SERIALIZED_NAME_CURRENT_VERSION)
  private ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion currentVersion = null;

  public static final String SERIALIZED_NAME_NEXT_VERSION = "next_version";
  @SerializedName(SERIALIZED_NAME_NEXT_VERSION)
  private ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion nextVersion = null;

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseData() {
  }

  public ToolsAppManagementAndroidBasicPackageGetV2ResponseData currentVersion(ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion currentVersion) {
    
    this.currentVersion = currentVersion;
    return this;
  }

   /**
   * Get currentVersion
   * @return currentVersion
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion getCurrentVersion() {
    return currentVersion;
  }


  public void setCurrentVersion(ToolsAppManagementAndroidBasicPackageGetV2ResponseDataCurrentVersion currentVersion) {
    this.currentVersion = currentVersion;
  }


  public ToolsAppManagementAndroidBasicPackageGetV2ResponseData nextVersion(ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion nextVersion) {
    
    this.nextVersion = nextVersion;
    return this;
  }

   /**
   * Get nextVersion
   * @return nextVersion
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion getNextVersion() {
    return nextVersion;
  }


  public void setNextVersion(ToolsAppManagementAndroidBasicPackageGetV2ResponseDataNextVersion nextVersion) {
    this.nextVersion = nextVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementAndroidBasicPackageGetV2ResponseData toolsAppManagementAndroidBasicPackageGetV2ResponseData = (ToolsAppManagementAndroidBasicPackageGetV2ResponseData) o;
    return Objects.equals(this.currentVersion, toolsAppManagementAndroidBasicPackageGetV2ResponseData.currentVersion) &&
        Objects.equals(this.nextVersion, toolsAppManagementAndroidBasicPackageGetV2ResponseData.nextVersion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentVersion, nextVersion);
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
    sb.append("class ToolsAppManagementAndroidBasicPackageGetV2ResponseData {\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    nextVersion: ").append(toIndentedString(nextVersion)).append("\n");
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
    openapiFields.add("current_version");
    openapiFields.add("next_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementAndroidBasicPackageGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAndroidBasicPackageGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAndroidBasicPackageGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAndroidBasicPackageGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAndroidBasicPackageGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAndroidBasicPackageGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAndroidBasicPackageGetV2ResponseData
  */
  public static ToolsAppManagementAndroidBasicPackageGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAndroidBasicPackageGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAndroidBasicPackageGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

