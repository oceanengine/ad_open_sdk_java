/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.18
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2DataListMarketingPurpose;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner;
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
 * ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CONVERTS = "converts";
  @SerializedName(SERIALIZED_NAME_CONVERTS)
  private List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner> converts = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = null;

  public static final String SERIALIZED_NAME_MARKETING_PURPOSE = "marketing_purpose";
  @SerializedName(SERIALIZED_NAME_MARKETING_PURPOSE)
  private ToolsAdConvertOptimizedTargetGetV2DataListMarketingPurpose marketingPurpose = null;

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner() {
  }

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner converts(List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner> converts) {
    
    this.converts = converts;
    return this;
  }

  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner addConvertsItem(ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner convertsItem) {
    if (this.converts == null) {
      this.converts = new ArrayList<>();
    }
    this.converts.add(convertsItem);
    return this;
  }

   /**
   * 
   * @return converts
  **/
  @javax.annotation.Nullable
  public List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner> getConverts() {
    return converts;
  }


  public void setConverts(List<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInnerConvertsInner> converts) {
    this.converts = converts;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * 
   * @return disabled
  **/
  @javax.annotation.Nullable
  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner marketingPurpose(ToolsAdConvertOptimizedTargetGetV2DataListMarketingPurpose marketingPurpose) {
    
    this.marketingPurpose = marketingPurpose;
    return this;
  }

   /**
   * Get marketingPurpose
   * @return marketingPurpose
  **/
  @javax.annotation.Nullable
  public ToolsAdConvertOptimizedTargetGetV2DataListMarketingPurpose getMarketingPurpose() {
    return marketingPurpose;
  }


  public void setMarketingPurpose(ToolsAdConvertOptimizedTargetGetV2DataListMarketingPurpose marketingPurpose) {
    this.marketingPurpose = marketingPurpose;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner toolsAdConvertOptimizedTargetGetV2ResponseDataListInner = (ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner) o;
    return Objects.equals(this.converts, toolsAdConvertOptimizedTargetGetV2ResponseDataListInner.converts) &&
        Objects.equals(this.disabled, toolsAdConvertOptimizedTargetGetV2ResponseDataListInner.disabled) &&
        Objects.equals(this.marketingPurpose, toolsAdConvertOptimizedTargetGetV2ResponseDataListInner.marketingPurpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(converts, disabled, marketingPurpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner {\n");
    sb.append("    converts: ").append(toIndentedString(converts)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    marketingPurpose: ").append(toIndentedString(marketingPurpose)).append("\n");
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
    openapiFields.add("marketing_purpose");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner
  */
  public static ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAdConvertOptimizedTargetGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

