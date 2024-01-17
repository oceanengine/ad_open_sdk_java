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
import com.bytedance.ads.model.ToolsAdConvertQueryV2DataListExternalActionsDeepExternalActionsDeepExternalAction;
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
 * ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-01-17T17:29:42.070953016+08:00[PRC]")
public class ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner {
  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private ToolsAdConvertQueryV2DataListExternalActionsDeepExternalActionsDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_NAME = "deep_external_name";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_NAME)
  private String deepExternalName = null;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = null;

  public ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner() {
  }

  public ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner deepExternalAction(ToolsAdConvertQueryV2DataListExternalActionsDeepExternalActionsDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public ToolsAdConvertQueryV2DataListExternalActionsDeepExternalActionsDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(ToolsAdConvertQueryV2DataListExternalActionsDeepExternalActionsDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner deepExternalName(String deepExternalName) {
    
    this.deepExternalName = deepExternalName;
    return this;
  }

   /**
   * 
   * @return deepExternalName
  **/
  @javax.annotation.Nullable
  public String getDeepExternalName() {
    return deepExternalName;
  }


  public void setDeepExternalName(String deepExternalName) {
    this.deepExternalName = deepExternalName;
  }


  public ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner disabled(Boolean disabled) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner toolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner = (ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner) o;
    return Objects.equals(this.deepExternalAction, toolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner.deepExternalAction) &&
        Objects.equals(this.deepExternalName, toolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner.deepExternalName) &&
        Objects.equals(this.disabled, toolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepExternalAction, deepExternalName, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner {\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    deepExternalName: ").append(toIndentedString(deepExternalName)).append("\n");
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
    openapiFields.add("deep_external_action");
    openapiFields.add("deep_external_name");
    openapiFields.add("disabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner
  */
  public static ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner.class);
  }

 /**
  * Convert an instance of ToolsAdConvertQueryV2ResponseDataListInnerExternalActionsInnerDeepExternalActionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

