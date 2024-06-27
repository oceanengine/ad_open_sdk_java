/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class ToolsAwemeMultiLevelCategoryGetV2ResponseData {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner> categories = null;

  public ToolsAwemeMultiLevelCategoryGetV2ResponseData() {
  }

  public ToolsAwemeMultiLevelCategoryGetV2ResponseData categories(List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner> categories) {
    
    this.categories = categories;
    return this;
  }

  public ToolsAwemeMultiLevelCategoryGetV2ResponseData addCategoriesItem(ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * 
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner> getCategories() {
    return categories;
  }


  public void setCategories(List<ToolsAwemeMultiLevelCategoryGetV2ResponseDataCategoriesInner> categories) {
    this.categories = categories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeMultiLevelCategoryGetV2ResponseData toolsAwemeMultiLevelCategoryGetV2ResponseData = (ToolsAwemeMultiLevelCategoryGetV2ResponseData) o;
    return Objects.equals(this.categories, toolsAwemeMultiLevelCategoryGetV2ResponseData.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeMultiLevelCategoryGetV2ResponseData {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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
    openapiFields.add("categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeMultiLevelCategoryGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeMultiLevelCategoryGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeMultiLevelCategoryGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeMultiLevelCategoryGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeMultiLevelCategoryGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeMultiLevelCategoryGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeMultiLevelCategoryGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeMultiLevelCategoryGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeMultiLevelCategoryGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeMultiLevelCategoryGetV2ResponseData
  */
  public static ToolsAwemeMultiLevelCategoryGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeMultiLevelCategoryGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAwemeMultiLevelCategoryGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

