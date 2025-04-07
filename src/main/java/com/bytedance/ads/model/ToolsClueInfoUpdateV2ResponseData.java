/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueInfoUpdateV2ResponseDataErrorsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class ToolsClueInfoUpdateV2ResponseData {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ToolsClueInfoUpdateV2ResponseDataErrorsInner> errors = null;

  public static final String SERIALIZED_NAME_SUCCESSES = "successes";
  @SerializedName(SERIALIZED_NAME_SUCCESSES)
  private List<Long> successes = null;

  public ToolsClueInfoUpdateV2ResponseData() {
  }

  public ToolsClueInfoUpdateV2ResponseData errors(List<ToolsClueInfoUpdateV2ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public ToolsClueInfoUpdateV2ResponseData addErrorsItem(ToolsClueInfoUpdateV2ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 更新失败的线索id列表
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<ToolsClueInfoUpdateV2ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<ToolsClueInfoUpdateV2ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }


  public ToolsClueInfoUpdateV2ResponseData successes(List<Long> successes) {
    
    this.successes = successes;
    return this;
  }

  public ToolsClueInfoUpdateV2ResponseData addSuccessesItem(Long successesItem) {
    if (this.successes == null) {
      this.successes = new ArrayList<>();
    }
    this.successes.add(successesItem);
    return this;
  }

   /**
   * 更新成功的线索id列表
   * @return successes
  **/
  @javax.annotation.Nullable
  public List<Long> getSuccesses() {
    return successes;
  }


  public void setSuccesses(List<Long> successes) {
    this.successes = successes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueInfoUpdateV2ResponseData toolsClueInfoUpdateV2ResponseData = (ToolsClueInfoUpdateV2ResponseData) o;
    return Objects.equals(this.errors, toolsClueInfoUpdateV2ResponseData.errors) &&
        Objects.equals(this.successes, toolsClueInfoUpdateV2ResponseData.successes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, successes);
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
    sb.append("class ToolsClueInfoUpdateV2ResponseData {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    successes: ").append(toIndentedString(successes)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("successes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueInfoUpdateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueInfoUpdateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueInfoUpdateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueInfoUpdateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueInfoUpdateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsClueInfoUpdateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueInfoUpdateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueInfoUpdateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueInfoUpdateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsClueInfoUpdateV2ResponseData
  */
  public static ToolsClueInfoUpdateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueInfoUpdateV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsClueInfoUpdateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

