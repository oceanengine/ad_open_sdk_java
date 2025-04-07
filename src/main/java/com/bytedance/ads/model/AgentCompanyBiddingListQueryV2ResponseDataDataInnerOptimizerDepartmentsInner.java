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
 * AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner {
  public static final String SERIALIZED_NAME_OPTIMIZER_DEPARTMENT_ID = "optimizer_department_id";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_DEPARTMENT_ID)
  private Long optimizerDepartmentId = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_DEPARTMENT_NAME = "optimizer_department_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_DEPARTMENT_NAME)
  private String optimizerDepartmentName = null;

  public AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner() {
  }

  public AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner optimizerDepartmentId(Long optimizerDepartmentId) {
    
    this.optimizerDepartmentId = optimizerDepartmentId;
    return this;
  }

   /**
   * 负责人部门ID
   * @return optimizerDepartmentId
  **/
  @javax.annotation.Nullable
  public Long getOptimizerDepartmentId() {
    return optimizerDepartmentId;
  }


  public void setOptimizerDepartmentId(Long optimizerDepartmentId) {
    this.optimizerDepartmentId = optimizerDepartmentId;
  }


  public AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner optimizerDepartmentName(String optimizerDepartmentName) {
    
    this.optimizerDepartmentName = optimizerDepartmentName;
    return this;
  }

   /**
   * 负责人部门名称
   * @return optimizerDepartmentName
  **/
  @javax.annotation.Nullable
  public String getOptimizerDepartmentName() {
    return optimizerDepartmentName;
  }


  public void setOptimizerDepartmentName(String optimizerDepartmentName) {
    this.optimizerDepartmentName = optimizerDepartmentName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner agentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner = (AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner) o;
    return Objects.equals(this.optimizerDepartmentId, agentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner.optimizerDepartmentId) &&
        Objects.equals(this.optimizerDepartmentName, agentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner.optimizerDepartmentName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizerDepartmentId, optimizerDepartmentName);
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
    sb.append("class AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner {\n");
    sb.append("    optimizerDepartmentId: ").append(toIndentedString(optimizerDepartmentId)).append("\n");
    sb.append("    optimizerDepartmentName: ").append(toIndentedString(optimizerDepartmentName)).append("\n");
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
    openapiFields.add("optimizer_department_id");
    openapiFields.add("optimizer_department_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner>() {
           @Override
           public void write(JsonWriter out, AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner
  * @throws IOException if the JSON string is invalid with respect to AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner
  */
  public static AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner.class);
  }

 /**
  * Convert an instance of AgentCompanyBiddingListQueryV2ResponseDataDataInnerOptimizerDepartmentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

