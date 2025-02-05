/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
import java.util.HashMap;
import java.util.Map;

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
 * ToolsClueInfoUpdateV2RequestUpdateInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ToolsClueInfoUpdateV2RequestUpdateInfoInner {
  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private Long clueId = null;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Map<String, String> fields = null;

  public ToolsClueInfoUpdateV2RequestUpdateInfoInner() {
  }

  public ToolsClueInfoUpdateV2RequestUpdateInfoInner clueId(Long clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 线索id
   * minimum: 1
   * @return clueId
  **/
  @javax.annotation.Nonnull
  public Long getClueId() {
    return clueId;
  }


  public void setClueId(Long clueId) {
    this.clueId = clueId;
  }


  public ToolsClueInfoUpdateV2RequestUpdateInfoInner fields(Map<String, String> fields) {
    
    this.fields = fields;
    return this;
  }

  public ToolsClueInfoUpdateV2RequestUpdateInfoInner putFieldsItem(String key, String fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * 具体更新的 key, value。更新name时，不能修改为空
   * @return fields
  **/
  @javax.annotation.Nullable
  public Map<String, String> getFields() {
    return fields;
  }


  public void setFields(Map<String, String> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueInfoUpdateV2RequestUpdateInfoInner toolsClueInfoUpdateV2RequestUpdateInfoInner = (ToolsClueInfoUpdateV2RequestUpdateInfoInner) o;
    return Objects.equals(this.clueId, toolsClueInfoUpdateV2RequestUpdateInfoInner.clueId) &&
        Objects.equals(this.fields, toolsClueInfoUpdateV2RequestUpdateInfoInner.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clueId, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueInfoUpdateV2RequestUpdateInfoInner {\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("clue_id");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clue_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueInfoUpdateV2RequestUpdateInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueInfoUpdateV2RequestUpdateInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueInfoUpdateV2RequestUpdateInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueInfoUpdateV2RequestUpdateInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueInfoUpdateV2RequestUpdateInfoInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueInfoUpdateV2RequestUpdateInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueInfoUpdateV2RequestUpdateInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueInfoUpdateV2RequestUpdateInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueInfoUpdateV2RequestUpdateInfoInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueInfoUpdateV2RequestUpdateInfoInner
  */
  public static ToolsClueInfoUpdateV2RequestUpdateInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueInfoUpdateV2RequestUpdateInfoInner.class);
  }

 /**
  * Convert an instance of ToolsClueInfoUpdateV2RequestUpdateInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

