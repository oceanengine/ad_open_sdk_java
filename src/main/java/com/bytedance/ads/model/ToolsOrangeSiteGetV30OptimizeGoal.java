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
import com.bytedance.ads.model.ToolsOrangeSiteGetV30OptimizeGoalDeepExternalAction;
import com.bytedance.ads.model.ToolsOrangeSiteGetV30OptimizeGoalExternalAction;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsOrangeSiteGetV30OptimizeGoal {
  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private ToolsOrangeSiteGetV30OptimizeGoalDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private ToolsOrangeSiteGetV30OptimizeGoalExternalAction externalAction = null;

  public ToolsOrangeSiteGetV30OptimizeGoal() {
  }

  public ToolsOrangeSiteGetV30OptimizeGoal deepExternalAction(ToolsOrangeSiteGetV30OptimizeGoalDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public ToolsOrangeSiteGetV30OptimizeGoalDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(ToolsOrangeSiteGetV30OptimizeGoalDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public ToolsOrangeSiteGetV30OptimizeGoal externalAction(ToolsOrangeSiteGetV30OptimizeGoalExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nonnull
  public ToolsOrangeSiteGetV30OptimizeGoalExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(ToolsOrangeSiteGetV30OptimizeGoalExternalAction externalAction) {
    this.externalAction = externalAction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsOrangeSiteGetV30OptimizeGoal toolsOrangeSiteGetV30OptimizeGoal = (ToolsOrangeSiteGetV30OptimizeGoal) o;
    return Objects.equals(this.deepExternalAction, toolsOrangeSiteGetV30OptimizeGoal.deepExternalAction) &&
        Objects.equals(this.externalAction, toolsOrangeSiteGetV30OptimizeGoal.externalAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepExternalAction, externalAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsOrangeSiteGetV30OptimizeGoal {\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
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
    openapiFields.add("external_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_action");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsOrangeSiteGetV30OptimizeGoal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsOrangeSiteGetV30OptimizeGoal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsOrangeSiteGetV30OptimizeGoal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsOrangeSiteGetV30OptimizeGoal.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsOrangeSiteGetV30OptimizeGoal>() {
           @Override
           public void write(JsonWriter out, ToolsOrangeSiteGetV30OptimizeGoal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsOrangeSiteGetV30OptimizeGoal read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsOrangeSiteGetV30OptimizeGoal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsOrangeSiteGetV30OptimizeGoal
  * @throws IOException if the JSON string is invalid with respect to ToolsOrangeSiteGetV30OptimizeGoal
  */
  public static ToolsOrangeSiteGetV30OptimizeGoal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsOrangeSiteGetV30OptimizeGoal.class);
  }

 /**
  * Convert an instance of ToolsOrangeSiteGetV30OptimizeGoal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

