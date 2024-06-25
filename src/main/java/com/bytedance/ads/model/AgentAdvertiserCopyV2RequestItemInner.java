/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * AgentAdvertiserCopyV2RequestItemInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class AgentAdvertiserCopyV2RequestItemInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public AgentAdvertiserCopyV2RequestItemInner() {
  }

  public AgentAdvertiserCopyV2RequestItemInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 新广告主账户名称。不可重复
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserCopyV2RequestItemInner agentAdvertiserCopyV2RequestItemInner = (AgentAdvertiserCopyV2RequestItemInner) o;
    return Objects.equals(this.name, agentAdvertiserCopyV2RequestItemInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvertiserCopyV2RequestItemInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserCopyV2RequestItemInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserCopyV2RequestItemInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserCopyV2RequestItemInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserCopyV2RequestItemInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserCopyV2RequestItemInner>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserCopyV2RequestItemInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserCopyV2RequestItemInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserCopyV2RequestItemInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserCopyV2RequestItemInner
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserCopyV2RequestItemInner
  */
  public static AgentAdvertiserCopyV2RequestItemInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserCopyV2RequestItemInner.class);
  }

 /**
  * Convert an instance of AgentAdvertiserCopyV2RequestItemInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

