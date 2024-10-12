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
 * ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner {
  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason = null;

  public static final String SERIALIZED_NAME_TOOL_TYPE = "tool_type";
  @SerializedName(SERIALIZED_NAME_TOOL_TYPE)
  private String toolType = null;

  public ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner() {
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 
   * @return failReason
  **/
  @javax.annotation.Nullable
  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner toolType(String toolType) {
    
    this.toolType = toolType;
    return this;
  }

   /**
   * 
   * @return toolType
  **/
  @javax.annotation.Nullable
  public String getToolType() {
    return toolType;
  }


  public void setToolType(String toolType) {
    this.toolType = toolType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner toolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner = (ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner) o;
    return Objects.equals(this.failReason, toolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner.failReason) &&
        Objects.equals(this.toolType, toolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner.toolType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failReason, toolType);
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
    sb.append("class ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner {\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
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
    openapiFields.add("fail_reason");
    openapiFields.add("tool_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner
  */
  public static ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionAcceptV30ResponseDataSuggestionAcceptFailedInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

