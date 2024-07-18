/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation;
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
 * CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_ORIENTATION = "orientation";
  @SerializedName(SERIALIZED_NAME_ORIENTATION)
  private CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation orientation = null;

  public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner() {
  }

  public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner orientation(CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation orientation) {
    
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @javax.annotation.Nonnull
  public CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation getOrientation() {
    return orientation;
  }


  public void setOrientation(CreativeProceduralCreativeUpdateV2AdDataSupplementsGamesOrientation orientation) {
    this.orientation = orientation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner creativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner = (CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner) o;
    return Objects.equals(this.id, creativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.id) &&
        Objects.equals(this.orientation, creativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.orientation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orientation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("orientation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("orientation");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner
  */
  public static CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestAdDataSupplementsInnerGamesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

