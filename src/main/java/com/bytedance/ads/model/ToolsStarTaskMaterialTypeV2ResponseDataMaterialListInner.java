/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner;
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
 * ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner> children = null;

  public static final String SERIALIZED_NAME_FIRST_MATERIAL_NAME = "first_material_name";
  @SerializedName(SERIALIZED_NAME_FIRST_MATERIAL_NAME)
  private String firstMaterialName = null;

  public static final String SERIALIZED_NAME_FIRST_MATERIAL_TYPE = "first_material_type";
  @SerializedName(SERIALIZED_NAME_FIRST_MATERIAL_TYPE)
  private Long firstMaterialType = null;

  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner() {
  }

  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner children(List<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner addChildrenItem(ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * 
   * @return children
  **/
  @javax.annotation.Nullable
  public List<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner> getChildren() {
    return children;
  }


  public void setChildren(List<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner> children) {
    this.children = children;
  }


  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner firstMaterialName(String firstMaterialName) {
    
    this.firstMaterialName = firstMaterialName;
    return this;
  }

   /**
   * 
   * @return firstMaterialName
  **/
  @javax.annotation.Nullable
  public String getFirstMaterialName() {
    return firstMaterialName;
  }


  public void setFirstMaterialName(String firstMaterialName) {
    this.firstMaterialName = firstMaterialName;
  }


  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner firstMaterialType(Long firstMaterialType) {
    
    this.firstMaterialType = firstMaterialType;
    return this;
  }

   /**
   * 
   * @return firstMaterialType
  **/
  @javax.annotation.Nullable
  public Long getFirstMaterialType() {
    return firstMaterialType;
  }


  public void setFirstMaterialType(Long firstMaterialType) {
    this.firstMaterialType = firstMaterialType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner toolsStarTaskMaterialTypeV2ResponseDataMaterialListInner = (ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner) o;
    return Objects.equals(this.children, toolsStarTaskMaterialTypeV2ResponseDataMaterialListInner.children) &&
        Objects.equals(this.firstMaterialName, toolsStarTaskMaterialTypeV2ResponseDataMaterialListInner.firstMaterialName) &&
        Objects.equals(this.firstMaterialType, toolsStarTaskMaterialTypeV2ResponseDataMaterialListInner.firstMaterialType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, firstMaterialName, firstMaterialType);
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
    sb.append("class ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    firstMaterialName: ").append(toIndentedString(firstMaterialName)).append("\n");
    sb.append("    firstMaterialType: ").append(toIndentedString(firstMaterialType)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("first_material_name");
    openapiFields.add("first_material_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("first_material_name");
    openapiRequiredFields.add("first_material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner>() {
           @Override
           public void write(JsonWriter out, ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner
  */
  public static ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner.class);
  }

 /**
  * Convert an instance of ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

