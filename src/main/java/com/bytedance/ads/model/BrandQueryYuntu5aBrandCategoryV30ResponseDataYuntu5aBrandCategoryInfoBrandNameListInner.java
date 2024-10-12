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
 * BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner {
  public static final String SERIALIZED_NAME_FIRST_CATEGORY_IDS = "first_category_ids";
  @SerializedName(SERIALIZED_NAME_FIRST_CATEGORY_IDS)
  private List<Long> firstCategoryIds = null;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Long value = null;

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner() {
  }

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner firstCategoryIds(List<Long> firstCategoryIds) {
    
    this.firstCategoryIds = firstCategoryIds;
    return this;
  }

  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner addFirstCategoryIdsItem(Long firstCategoryIdsItem) {
    if (this.firstCategoryIds == null) {
      this.firstCategoryIds = new ArrayList<>();
    }
    this.firstCategoryIds.add(firstCategoryIdsItem);
    return this;
  }

   /**
   * 所属一级行业ID
   * @return firstCategoryIds
  **/
  @javax.annotation.Nullable
  public List<Long> getFirstCategoryIds() {
    return firstCategoryIds;
  }


  public void setFirstCategoryIds(List<Long> firstCategoryIds) {
    this.firstCategoryIds = firstCategoryIds;
  }


  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 品牌名称
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner value(Long value) {
    
    this.value = value;
    return this;
  }

   /**
   * 品牌ID
   * @return value
  **/
  @javax.annotation.Nullable
  public Long getValue() {
    return value;
  }


  public void setValue(Long value) {
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
    BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner = (BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner) o;
    return Objects.equals(this.firstCategoryIds, brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner.firstCategoryIds) &&
        Objects.equals(this.label, brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner.label) &&
        Objects.equals(this.value, brandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstCategoryIds, label, value);
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
    sb.append("class BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner {\n");
    sb.append("    firstCategoryIds: ").append(toIndentedString(firstCategoryIds)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("first_category_ids");
    openapiFields.add("label");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner>() {
           @Override
           public void write(JsonWriter out, BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner
  * @throws IOException if the JSON string is invalid with respect to BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner
  */
  public static BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner.class);
  }

 /**
  * Convert an instance of BrandQueryYuntu5aBrandCategoryV30ResponseDataYuntu5aBrandCategoryInfoBrandNameListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

