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
 * ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner {
  public static final String SERIALIZED_NAME_TOPIC_ID = "topic_id";
  @SerializedName(SERIALIZED_NAME_TOPIC_ID)
  private Long topicId = null;

  public static final String SERIALIZED_NAME_TOPIC_NAME = "topic_name";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  private String topicName = null;

  public ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner() {
  }

  public ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner topicId(Long topicId) {
    
    this.topicId = topicId;
    return this;
  }

   /**
   * 
   * @return topicId
  **/
  @javax.annotation.Nullable
  public Long getTopicId() {
    return topicId;
  }


  public void setTopicId(Long topicId) {
    this.topicId = topicId;
  }


  public ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner topicName(String topicName) {
    
    this.topicName = topicName;
    return this;
  }

   /**
   * 
   * @return topicName
  **/
  @javax.annotation.Nullable
  public String getTopicName() {
    return topicName;
  }


  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner toolsStarTaskTitleTopicGetV2ResponseDataTopicsInner = (ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner) o;
    return Objects.equals(this.topicId, toolsStarTaskTitleTopicGetV2ResponseDataTopicsInner.topicId) &&
        Objects.equals(this.topicName, toolsStarTaskTitleTopicGetV2ResponseDataTopicsInner.topicName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicId, topicName);
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
    sb.append("class ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner {\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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
    openapiFields.add("topic_id");
    openapiFields.add("topic_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("topic_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner>() {
           @Override
           public void write(JsonWriter out, ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner
  */
  public static ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner.class);
  }

 /**
  * Convert an instance of ToolsStarTaskTitleTopicGetV2ResponseDataTopicsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

