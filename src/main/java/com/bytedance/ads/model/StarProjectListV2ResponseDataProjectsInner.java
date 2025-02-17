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
 * StarProjectListV2ResponseDataProjectsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class StarProjectListV2ResponseDataProjectsInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_REST_BUDGET = "rest_budget";
  @SerializedName(SERIALIZED_NAME_REST_BUDGET)
  private Long restBudget = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime = null;

  public static final String SERIALIZED_NAME_TOTAL_BUDGET = "total_budget";
  @SerializedName(SERIALIZED_NAME_TOTAL_BUDGET)
  private Long totalBudget = null;

  public StarProjectListV2ResponseDataProjectsInner() {
  }

  public StarProjectListV2ResponseDataProjectsInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarProjectListV2ResponseDataProjectsInner endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public StarProjectListV2ResponseDataProjectsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public StarProjectListV2ResponseDataProjectsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StarProjectListV2ResponseDataProjectsInner restBudget(Long restBudget) {
    
    this.restBudget = restBudget;
    return this;
  }

   /**
   * 
   * @return restBudget
  **/
  @javax.annotation.Nullable
  public Long getRestBudget() {
    return restBudget;
  }


  public void setRestBudget(Long restBudget) {
    this.restBudget = restBudget;
  }


  public StarProjectListV2ResponseDataProjectsInner startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public Long getStartTime() {
    return startTime;
  }


  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }


  public StarProjectListV2ResponseDataProjectsInner totalBudget(Long totalBudget) {
    
    this.totalBudget = totalBudget;
    return this;
  }

   /**
   * 
   * @return totalBudget
  **/
  @javax.annotation.Nullable
  public Long getTotalBudget() {
    return totalBudget;
  }


  public void setTotalBudget(Long totalBudget) {
    this.totalBudget = totalBudget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarProjectListV2ResponseDataProjectsInner starProjectListV2ResponseDataProjectsInner = (StarProjectListV2ResponseDataProjectsInner) o;
    return Objects.equals(this.createTime, starProjectListV2ResponseDataProjectsInner.createTime) &&
        Objects.equals(this.endTime, starProjectListV2ResponseDataProjectsInner.endTime) &&
        Objects.equals(this.id, starProjectListV2ResponseDataProjectsInner.id) &&
        Objects.equals(this.name, starProjectListV2ResponseDataProjectsInner.name) &&
        Objects.equals(this.restBudget, starProjectListV2ResponseDataProjectsInner.restBudget) &&
        Objects.equals(this.startTime, starProjectListV2ResponseDataProjectsInner.startTime) &&
        Objects.equals(this.totalBudget, starProjectListV2ResponseDataProjectsInner.totalBudget);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, endTime, id, name, restBudget, startTime, totalBudget);
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
    sb.append("class StarProjectListV2ResponseDataProjectsInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restBudget: ").append(toIndentedString(restBudget)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalBudget: ").append(toIndentedString(totalBudget)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("end_time");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("rest_budget");
    openapiFields.add("start_time");
    openapiFields.add("total_budget");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarProjectListV2ResponseDataProjectsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarProjectListV2ResponseDataProjectsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarProjectListV2ResponseDataProjectsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarProjectListV2ResponseDataProjectsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarProjectListV2ResponseDataProjectsInner>() {
           @Override
           public void write(JsonWriter out, StarProjectListV2ResponseDataProjectsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarProjectListV2ResponseDataProjectsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarProjectListV2ResponseDataProjectsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarProjectListV2ResponseDataProjectsInner
  * @throws IOException if the JSON string is invalid with respect to StarProjectListV2ResponseDataProjectsInner
  */
  public static StarProjectListV2ResponseDataProjectsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarProjectListV2ResponseDataProjectsInner.class);
  }

 /**
  * Convert an instance of StarProjectListV2ResponseDataProjectsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

