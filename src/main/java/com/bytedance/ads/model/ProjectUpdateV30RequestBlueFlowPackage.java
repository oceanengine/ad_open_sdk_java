/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ProjectUpdateV30RequestBlueFlowPackage {
  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME = "blue_flow_keyword_name";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME)
  private List<String> blueFlowKeywordName = null;

  public ProjectUpdateV30RequestBlueFlowPackage() {
  }

  public ProjectUpdateV30RequestBlueFlowPackage blueFlowKeywordName(List<String> blueFlowKeywordName) {
    
    this.blueFlowKeywordName = blueFlowKeywordName;
    return this;
  }

  public ProjectUpdateV30RequestBlueFlowPackage addBlueFlowKeywordNameItem(String blueFlowKeywordNameItem) {
    if (this.blueFlowKeywordName == null) {
      this.blueFlowKeywordName = new ArrayList<>();
    }
    this.blueFlowKeywordName.add(blueFlowKeywordNameItem);
    return this;
  }

   /**
   * 
   * @return blueFlowKeywordName
  **/
  @javax.annotation.Nullable
  public List<String> getBlueFlowKeywordName() {
    return blueFlowKeywordName;
  }


  public void setBlueFlowKeywordName(List<String> blueFlowKeywordName) {
    this.blueFlowKeywordName = blueFlowKeywordName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateV30RequestBlueFlowPackage projectUpdateV30RequestBlueFlowPackage = (ProjectUpdateV30RequestBlueFlowPackage) o;
    return Objects.equals(this.blueFlowKeywordName, projectUpdateV30RequestBlueFlowPackage.blueFlowKeywordName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowKeywordName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateV30RequestBlueFlowPackage {\n");
    sb.append("    blueFlowKeywordName: ").append(toIndentedString(blueFlowKeywordName)).append("\n");
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
    openapiFields.add("blue_flow_keyword_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUpdateV30RequestBlueFlowPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUpdateV30RequestBlueFlowPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUpdateV30RequestBlueFlowPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUpdateV30RequestBlueFlowPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUpdateV30RequestBlueFlowPackage>() {
           @Override
           public void write(JsonWriter out, ProjectUpdateV30RequestBlueFlowPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUpdateV30RequestBlueFlowPackage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectUpdateV30RequestBlueFlowPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectUpdateV30RequestBlueFlowPackage
  * @throws IOException if the JSON string is invalid with respect to ProjectUpdateV30RequestBlueFlowPackage
  */
  public static ProjectUpdateV30RequestBlueFlowPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUpdateV30RequestBlueFlowPackage.class);
  }

 /**
  * Convert an instance of ProjectUpdateV30RequestBlueFlowPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

