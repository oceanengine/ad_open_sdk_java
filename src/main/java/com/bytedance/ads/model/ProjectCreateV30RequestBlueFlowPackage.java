/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectCreateV30BlueFlowPackageBlueFlowPackageSetting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class ProjectCreateV30RequestBlueFlowPackage {
  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID = "blue_flow_package_id";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_ID)
  private Long blueFlowPackageId = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_PACKAGE_SETTING = "blue_flow_package_setting";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_PACKAGE_SETTING)
  private ProjectCreateV30BlueFlowPackageBlueFlowPackageSetting blueFlowPackageSetting = null;

  public ProjectCreateV30RequestBlueFlowPackage() {
  }

  public ProjectCreateV30RequestBlueFlowPackage blueFlowPackageId(Long blueFlowPackageId) {
    
    this.blueFlowPackageId = blueFlowPackageId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return blueFlowPackageId
  **/
  @javax.annotation.Nullable
  public Long getBlueFlowPackageId() {
    return blueFlowPackageId;
  }


  public void setBlueFlowPackageId(Long blueFlowPackageId) {
    this.blueFlowPackageId = blueFlowPackageId;
  }


  public ProjectCreateV30RequestBlueFlowPackage blueFlowPackageSetting(ProjectCreateV30BlueFlowPackageBlueFlowPackageSetting blueFlowPackageSetting) {
    
    this.blueFlowPackageSetting = blueFlowPackageSetting;
    return this;
  }

   /**
   * Get blueFlowPackageSetting
   * @return blueFlowPackageSetting
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30BlueFlowPackageBlueFlowPackageSetting getBlueFlowPackageSetting() {
    return blueFlowPackageSetting;
  }


  public void setBlueFlowPackageSetting(ProjectCreateV30BlueFlowPackageBlueFlowPackageSetting blueFlowPackageSetting) {
    this.blueFlowPackageSetting = blueFlowPackageSetting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateV30RequestBlueFlowPackage projectCreateV30RequestBlueFlowPackage = (ProjectCreateV30RequestBlueFlowPackage) o;
    return Objects.equals(this.blueFlowPackageId, projectCreateV30RequestBlueFlowPackage.blueFlowPackageId) &&
        Objects.equals(this.blueFlowPackageSetting, projectCreateV30RequestBlueFlowPackage.blueFlowPackageSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowPackageId, blueFlowPackageSetting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateV30RequestBlueFlowPackage {\n");
    sb.append("    blueFlowPackageId: ").append(toIndentedString(blueFlowPackageId)).append("\n");
    sb.append("    blueFlowPackageSetting: ").append(toIndentedString(blueFlowPackageSetting)).append("\n");
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
    openapiFields.add("blue_flow_package_id");
    openapiFields.add("blue_flow_package_setting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCreateV30RequestBlueFlowPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreateV30RequestBlueFlowPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreateV30RequestBlueFlowPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreateV30RequestBlueFlowPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreateV30RequestBlueFlowPackage>() {
           @Override
           public void write(JsonWriter out, ProjectCreateV30RequestBlueFlowPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreateV30RequestBlueFlowPackage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreateV30RequestBlueFlowPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreateV30RequestBlueFlowPackage
  * @throws IOException if the JSON string is invalid with respect to ProjectCreateV30RequestBlueFlowPackage
  */
  public static ProjectCreateV30RequestBlueFlowPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreateV30RequestBlueFlowPackage.class);
  }

 /**
  * Convert an instance of ProjectCreateV30RequestBlueFlowPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

