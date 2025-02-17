/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner() {
  }

  public BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 二级兴趣ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 二级兴趣名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner brandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner = (BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner) o;
    return Objects.equals(this.id, brandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner.id) &&
        Objects.equals(this.name, brandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
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
    sb.append("class BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner>() {
           @Override
           public void write(JsonWriter out, BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner
  * @throws IOException if the JSON string is invalid with respect to BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner
  */
  public static BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner.class);
  }

 /**
  * Convert an instance of BrandActionCategoryV30ResponseDataActionCategoryListInnerChildrenInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

