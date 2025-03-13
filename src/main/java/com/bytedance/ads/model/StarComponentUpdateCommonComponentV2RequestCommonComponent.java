/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarComponentUpdateCommonComponentV2RequestCommonComponentAnchorComponent;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class StarComponentUpdateCommonComponentV2RequestCommonComponent {
  public static final String SERIALIZED_NAME_ANCHOR_COMPONENT = "anchor_component";
  @SerializedName(SERIALIZED_NAME_ANCHOR_COMPONENT)
  private StarComponentUpdateCommonComponentV2RequestCommonComponentAnchorComponent anchorComponent = null;

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private Long componentType = null;

  public StarComponentUpdateCommonComponentV2RequestCommonComponent() {
  }

  public StarComponentUpdateCommonComponentV2RequestCommonComponent anchorComponent(StarComponentUpdateCommonComponentV2RequestCommonComponentAnchorComponent anchorComponent) {
    
    this.anchorComponent = anchorComponent;
    return this;
  }

   /**
   * Get anchorComponent
   * @return anchorComponent
  **/
  @javax.annotation.Nullable
  public StarComponentUpdateCommonComponentV2RequestCommonComponentAnchorComponent getAnchorComponent() {
    return anchorComponent;
  }


  public void setAnchorComponent(StarComponentUpdateCommonComponentV2RequestCommonComponentAnchorComponent anchorComponent) {
    this.anchorComponent = anchorComponent;
  }


  public StarComponentUpdateCommonComponentV2RequestCommonComponent componentType(Long componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * 
   * @return componentType
  **/
  @javax.annotation.Nonnull
  public Long getComponentType() {
    return componentType;
  }


  public void setComponentType(Long componentType) {
    this.componentType = componentType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarComponentUpdateCommonComponentV2RequestCommonComponent starComponentUpdateCommonComponentV2RequestCommonComponent = (StarComponentUpdateCommonComponentV2RequestCommonComponent) o;
    return Objects.equals(this.anchorComponent, starComponentUpdateCommonComponentV2RequestCommonComponent.anchorComponent) &&
        Objects.equals(this.componentType, starComponentUpdateCommonComponentV2RequestCommonComponent.componentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorComponent, componentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarComponentUpdateCommonComponentV2RequestCommonComponent {\n");
    sb.append("    anchorComponent: ").append(toIndentedString(anchorComponent)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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
    openapiFields.add("anchor_component");
    openapiFields.add("component_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("component_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentUpdateCommonComponentV2RequestCommonComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentUpdateCommonComponentV2RequestCommonComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentUpdateCommonComponentV2RequestCommonComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentUpdateCommonComponentV2RequestCommonComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentUpdateCommonComponentV2RequestCommonComponent>() {
           @Override
           public void write(JsonWriter out, StarComponentUpdateCommonComponentV2RequestCommonComponent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentUpdateCommonComponentV2RequestCommonComponent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentUpdateCommonComponentV2RequestCommonComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentUpdateCommonComponentV2RequestCommonComponent
  * @throws IOException if the JSON string is invalid with respect to StarComponentUpdateCommonComponentV2RequestCommonComponent
  */
  public static StarComponentUpdateCommonComponentV2RequestCommonComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentUpdateCommonComponentV2RequestCommonComponent.class);
  }

 /**
  * Convert an instance of StarComponentUpdateCommonComponentV2RequestCommonComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

