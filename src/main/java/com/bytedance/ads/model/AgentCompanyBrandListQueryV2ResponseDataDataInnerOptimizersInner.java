/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
 * AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner {
  public static final String SERIALIZED_NAME_OPTIMIZER_ID = "optimizer_id";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_ID)
  private Long optimizerId = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_NAME = "optimizer_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_NAME)
  private String optimizerName = null;

  public AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner() {
  }

  public AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner optimizerId(Long optimizerId) {
    
    this.optimizerId = optimizerId;
    return this;
  }

   /**
   * 负责人ID
   * @return optimizerId
  **/
  @javax.annotation.Nullable
  public Long getOptimizerId() {
    return optimizerId;
  }


  public void setOptimizerId(Long optimizerId) {
    this.optimizerId = optimizerId;
  }


  public AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner optimizerName(String optimizerName) {
    
    this.optimizerName = optimizerName;
    return this;
  }

   /**
   * 负责人名称
   * @return optimizerName
  **/
  @javax.annotation.Nullable
  public String getOptimizerName() {
    return optimizerName;
  }


  public void setOptimizerName(String optimizerName) {
    this.optimizerName = optimizerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner agentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner = (AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner) o;
    return Objects.equals(this.optimizerId, agentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner.optimizerId) &&
        Objects.equals(this.optimizerName, agentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner.optimizerName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizerId, optimizerName);
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
    sb.append("class AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner {\n");
    sb.append("    optimizerId: ").append(toIndentedString(optimizerId)).append("\n");
    sb.append("    optimizerName: ").append(toIndentedString(optimizerName)).append("\n");
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
    openapiFields.add("optimizer_id");
    openapiFields.add("optimizer_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner>() {
           @Override
           public void write(JsonWriter out, AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner
  * @throws IOException if the JSON string is invalid with respect to AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner
  */
  public static AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner.class);
  }

 /**
  * Convert an instance of AgentCompanyBrandListQueryV2ResponseDataDataInnerOptimizersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

