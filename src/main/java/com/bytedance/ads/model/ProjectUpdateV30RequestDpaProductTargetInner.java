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
 * ProjectUpdateV30RequestDpaProductTargetInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ProjectUpdateV30RequestDpaProductTargetInner {
  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public ProjectUpdateV30RequestDpaProductTargetInner() {
  }

  public ProjectUpdateV30RequestDpaProductTargetInner rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * 
   * @return rule
  **/
  @javax.annotation.Nullable
  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  public ProjectUpdateV30RequestDpaProductTargetInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ProjectUpdateV30RequestDpaProductTargetInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ProjectUpdateV30RequestDpaProductTargetInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUpdateV30RequestDpaProductTargetInner projectUpdateV30RequestDpaProductTargetInner = (ProjectUpdateV30RequestDpaProductTargetInner) o;
    return Objects.equals(this.rule, projectUpdateV30RequestDpaProductTargetInner.rule) &&
        Objects.equals(this.title, projectUpdateV30RequestDpaProductTargetInner.title) &&
        Objects.equals(this.type, projectUpdateV30RequestDpaProductTargetInner.type) &&
        Objects.equals(this.value, projectUpdateV30RequestDpaProductTargetInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rule, title, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUpdateV30RequestDpaProductTargetInner {\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("rule");
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectUpdateV30RequestDpaProductTargetInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectUpdateV30RequestDpaProductTargetInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectUpdateV30RequestDpaProductTargetInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectUpdateV30RequestDpaProductTargetInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectUpdateV30RequestDpaProductTargetInner>() {
           @Override
           public void write(JsonWriter out, ProjectUpdateV30RequestDpaProductTargetInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectUpdateV30RequestDpaProductTargetInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectUpdateV30RequestDpaProductTargetInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectUpdateV30RequestDpaProductTargetInner
  * @throws IOException if the JSON string is invalid with respect to ProjectUpdateV30RequestDpaProductTargetInner
  */
  public static ProjectUpdateV30RequestDpaProductTargetInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectUpdateV30RequestDpaProductTargetInner.class);
  }

 /**
  * Convert an instance of ProjectUpdateV30RequestDpaProductTargetInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

