/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerStructAbstractInfo;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo;
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
 * CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner {
  public static final String SERIALIZED_NAME_STRUCT_ABSTRACT_INFO = "struct_abstract_info";
  @SerializedName(SERIALIZED_NAME_STRUCT_ABSTRACT_INFO)
  private CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerStructAbstractInfo structAbstractInfo = null;

  public static final String SERIALIZED_NAME_TEXT_ABSTRACT_INFO = "text_abstract_info";
  @SerializedName(SERIALIZED_NAME_TEXT_ABSTRACT_INFO)
  private CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo textAbstractInfo = null;

  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner() {
  }

  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner structAbstractInfo(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    
    this.structAbstractInfo = structAbstractInfo;
    return this;
  }

   /**
   * Get structAbstractInfo
   * @return structAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerStructAbstractInfo getStructAbstractInfo() {
    return structAbstractInfo;
  }


  public void setStructAbstractInfo(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    this.structAbstractInfo = structAbstractInfo;
  }


  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner textAbstractInfo(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
    
    this.textAbstractInfo = textAbstractInfo;
    return this;
  }

   /**
   * Get textAbstractInfo
   * @return textAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo getTextAbstractInfo() {
    return textAbstractInfo;
  }


  public void setTextAbstractInfo(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
    this.textAbstractInfo = textAbstractInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner creativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner = (CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner) o;
    return Objects.equals(this.structAbstractInfo, creativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner.structAbstractInfo) &&
        Objects.equals(this.textAbstractInfo, creativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner.textAbstractInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(structAbstractInfo, textAbstractInfo);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner {\n");
    sb.append("    structAbstractInfo: ").append(toIndentedString(structAbstractInfo)).append("\n");
    sb.append("    textAbstractInfo: ").append(toIndentedString(textAbstractInfo)).append("\n");
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
    openapiFields.add("struct_abstract_info");
    openapiFields.add("text_abstract_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner
  */
  public static CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

