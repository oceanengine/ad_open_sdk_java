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
 * ToolsVideoCheckAvailableAnchorV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ToolsVideoCheckAvailableAnchorV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid = null;

  public ToolsVideoCheckAvailableAnchorV2ResponseDataListInner() {
  }

  public ToolsVideoCheckAvailableAnchorV2ResponseDataListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 抖音视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public ToolsVideoCheckAvailableAnchorV2ResponseDataListInner valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * 是否支持双库存
   * @return valid
  **/
  @javax.annotation.Nullable
  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsVideoCheckAvailableAnchorV2ResponseDataListInner toolsVideoCheckAvailableAnchorV2ResponseDataListInner = (ToolsVideoCheckAvailableAnchorV2ResponseDataListInner) o;
    return Objects.equals(this.itemId, toolsVideoCheckAvailableAnchorV2ResponseDataListInner.itemId) &&
        Objects.equals(this.valid, toolsVideoCheckAvailableAnchorV2ResponseDataListInner.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsVideoCheckAvailableAnchorV2ResponseDataListInner {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
    openapiFields.add("item_id");
    openapiFields.add("valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("item_id");
    openapiRequiredFields.add("valid");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsVideoCheckAvailableAnchorV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsVideoCheckAvailableAnchorV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsVideoCheckAvailableAnchorV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsVideoCheckAvailableAnchorV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsVideoCheckAvailableAnchorV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsVideoCheckAvailableAnchorV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsVideoCheckAvailableAnchorV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsVideoCheckAvailableAnchorV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsVideoCheckAvailableAnchorV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsVideoCheckAvailableAnchorV2ResponseDataListInner
  */
  public static ToolsVideoCheckAvailableAnchorV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsVideoCheckAvailableAnchorV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsVideoCheckAvailableAnchorV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

