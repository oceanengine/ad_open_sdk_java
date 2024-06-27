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
import com.bytedance.ads.model.AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner;
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
 * AdConvertOptimizedTargetGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:35:04.257236161+08:00[PRC]")
public class AdConvertOptimizedTargetGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_CONVERTS = "converts";
  @SerializedName(SERIALIZED_NAME_CONVERTS)
  private List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner> converts = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = null;

  public AdConvertOptimizedTargetGetV30ResponseDataListInner() {
  }

  public AdConvertOptimizedTargetGetV30ResponseDataListInner converts(List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner> converts) {
    
    this.converts = converts;
    return this;
  }

  public AdConvertOptimizedTargetGetV30ResponseDataListInner addConvertsItem(AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner convertsItem) {
    if (this.converts == null) {
      this.converts = new ArrayList<>();
    }
    this.converts.add(convertsItem);
    return this;
  }

   /**
   * 优化来源下的转化目标列表
   * @return converts
  **/
  @javax.annotation.Nullable
  public List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner> getConverts() {
    return converts;
  }


  public void setConverts(List<AdConvertOptimizedTargetGetV30ResponseDataListInnerConvertsInner> converts) {
    this.converts = converts;
  }


  public AdConvertOptimizedTargetGetV30ResponseDataListInner disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * 是否禁用, true 表示已经禁用，false 表示可用
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdConvertOptimizedTargetGetV30ResponseDataListInner adConvertOptimizedTargetGetV30ResponseDataListInner = (AdConvertOptimizedTargetGetV30ResponseDataListInner) o;
    return Objects.equals(this.converts, adConvertOptimizedTargetGetV30ResponseDataListInner.converts) &&
        Objects.equals(this.disabled, adConvertOptimizedTargetGetV30ResponseDataListInner.disabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(converts, disabled);
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
    sb.append("class AdConvertOptimizedTargetGetV30ResponseDataListInner {\n");
    sb.append("    converts: ").append(toIndentedString(converts)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
    openapiFields.add("converts");
    openapiFields.add("disabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdConvertOptimizedTargetGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdConvertOptimizedTargetGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdConvertOptimizedTargetGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdConvertOptimizedTargetGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdConvertOptimizedTargetGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdConvertOptimizedTargetGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdConvertOptimizedTargetGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdConvertOptimizedTargetGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdConvertOptimizedTargetGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdConvertOptimizedTargetGetV30ResponseDataListInner
  */
  public static AdConvertOptimizedTargetGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdConvertOptimizedTargetGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdConvertOptimizedTargetGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

