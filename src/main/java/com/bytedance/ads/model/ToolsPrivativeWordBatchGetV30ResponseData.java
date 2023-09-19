/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordBatchGetV30ResponseDataProjectsPrivativeInner;
import com.bytedance.ads.model.ToolsPrivativeWordBatchGetV30ResponseDataPromotionsPrivativeInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-19T16:35:40.289311957+08:00[PRC]")
public class ToolsPrivativeWordBatchGetV30ResponseData {
  public static final String SERIALIZED_NAME_PROJECTS_PRIVATIVE = "projects_privative";
  @SerializedName(SERIALIZED_NAME_PROJECTS_PRIVATIVE)
  private List<ToolsPrivativeWordBatchGetV30ResponseDataProjectsPrivativeInner> projectsPrivative = null;

  public static final String SERIALIZED_NAME_PROMOTIONS_PRIVATIVE = "promotions_privative";
  @SerializedName(SERIALIZED_NAME_PROMOTIONS_PRIVATIVE)
  private List<ToolsPrivativeWordBatchGetV30ResponseDataPromotionsPrivativeInner> promotionsPrivative = null;

  public ToolsPrivativeWordBatchGetV30ResponseData() {
  }

  public ToolsPrivativeWordBatchGetV30ResponseData projectsPrivative(List<ToolsPrivativeWordBatchGetV30ResponseDataProjectsPrivativeInner> projectsPrivative) {
    
    this.projectsPrivative = projectsPrivative;
    return this;
  }

  public ToolsPrivativeWordBatchGetV30ResponseData addProjectsPrivativeItem(ToolsPrivativeWordBatchGetV30ResponseDataProjectsPrivativeInner projectsPrivativeItem) {
    if (this.projectsPrivative == null) {
      this.projectsPrivative = new ArrayList<>();
    }
    this.projectsPrivative.add(projectsPrivativeItem);
    return this;
  }

   /**
   * 
   * @return projectsPrivative
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordBatchGetV30ResponseDataProjectsPrivativeInner> getProjectsPrivative() {
    return projectsPrivative;
  }


  public void setProjectsPrivative(List<ToolsPrivativeWordBatchGetV30ResponseDataProjectsPrivativeInner> projectsPrivative) {
    this.projectsPrivative = projectsPrivative;
  }


  public ToolsPrivativeWordBatchGetV30ResponseData promotionsPrivative(List<ToolsPrivativeWordBatchGetV30ResponseDataPromotionsPrivativeInner> promotionsPrivative) {
    
    this.promotionsPrivative = promotionsPrivative;
    return this;
  }

  public ToolsPrivativeWordBatchGetV30ResponseData addPromotionsPrivativeItem(ToolsPrivativeWordBatchGetV30ResponseDataPromotionsPrivativeInner promotionsPrivativeItem) {
    if (this.promotionsPrivative == null) {
      this.promotionsPrivative = new ArrayList<>();
    }
    this.promotionsPrivative.add(promotionsPrivativeItem);
    return this;
  }

   /**
   * 
   * @return promotionsPrivative
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordBatchGetV30ResponseDataPromotionsPrivativeInner> getPromotionsPrivative() {
    return promotionsPrivative;
  }


  public void setPromotionsPrivative(List<ToolsPrivativeWordBatchGetV30ResponseDataPromotionsPrivativeInner> promotionsPrivative) {
    this.promotionsPrivative = promotionsPrivative;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordBatchGetV30ResponseData toolsPrivativeWordBatchGetV30ResponseData = (ToolsPrivativeWordBatchGetV30ResponseData) o;
    return Objects.equals(this.projectsPrivative, toolsPrivativeWordBatchGetV30ResponseData.projectsPrivative) &&
        Objects.equals(this.promotionsPrivative, toolsPrivativeWordBatchGetV30ResponseData.promotionsPrivative);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectsPrivative, promotionsPrivative);
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
    sb.append("class ToolsPrivativeWordBatchGetV30ResponseData {\n");
    sb.append("    projectsPrivative: ").append(toIndentedString(projectsPrivative)).append("\n");
    sb.append("    promotionsPrivative: ").append(toIndentedString(promotionsPrivative)).append("\n");
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
    openapiFields.add("projects_privative");
    openapiFields.add("promotions_privative");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordBatchGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordBatchGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordBatchGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordBatchGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordBatchGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordBatchGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordBatchGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordBatchGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordBatchGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordBatchGetV30ResponseData
  */
  public static ToolsPrivativeWordBatchGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordBatchGetV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordBatchGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

