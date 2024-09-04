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
 * ToolsInterestActionId2wordV2ResponseDataCategoriesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ToolsInterestActionId2wordV2ResponseDataCategoriesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_NUM = "num";
  @SerializedName(SERIALIZED_NAME_NUM)
  private String num = null;

  public ToolsInterestActionId2wordV2ResponseDataCategoriesInner() {
  }

  public ToolsInterestActionId2wordV2ResponseDataCategoriesInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ToolsInterestActionId2wordV2ResponseDataCategoriesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsInterestActionId2wordV2ResponseDataCategoriesInner num(String num) {
    
    this.num = num;
    return this;
  }

   /**
   * 
   * @return num
  **/
  @javax.annotation.Nullable
  public String getNum() {
    return num;
  }


  public void setNum(String num) {
    this.num = num;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsInterestActionId2wordV2ResponseDataCategoriesInner toolsInterestActionId2wordV2ResponseDataCategoriesInner = (ToolsInterestActionId2wordV2ResponseDataCategoriesInner) o;
    return Objects.equals(this.id, toolsInterestActionId2wordV2ResponseDataCategoriesInner.id) &&
        Objects.equals(this.name, toolsInterestActionId2wordV2ResponseDataCategoriesInner.name) &&
        Objects.equals(this.num, toolsInterestActionId2wordV2ResponseDataCategoriesInner.num);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, num);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsInterestActionId2wordV2ResponseDataCategoriesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsInterestActionId2wordV2ResponseDataCategoriesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsInterestActionId2wordV2ResponseDataCategoriesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsInterestActionId2wordV2ResponseDataCategoriesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsInterestActionId2wordV2ResponseDataCategoriesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsInterestActionId2wordV2ResponseDataCategoriesInner>() {
           @Override
           public void write(JsonWriter out, ToolsInterestActionId2wordV2ResponseDataCategoriesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsInterestActionId2wordV2ResponseDataCategoriesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsInterestActionId2wordV2ResponseDataCategoriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsInterestActionId2wordV2ResponseDataCategoriesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsInterestActionId2wordV2ResponseDataCategoriesInner
  */
  public static ToolsInterestActionId2wordV2ResponseDataCategoriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsInterestActionId2wordV2ResponseDataCategoriesInner.class);
  }

 /**
  * Convert an instance of ToolsInterestActionId2wordV2ResponseDataCategoriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

