/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalProjectCreateV30RequestAudienceCustomAreaGeolocationInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * 自定义区域设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class LocalProjectCreateV30RequestAudienceCustomArea {
  public static final String SERIALIZED_NAME_GEOLOCATION = "geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private List<LocalProjectCreateV30RequestAudienceCustomAreaGeolocationInner> geolocation = null;

  public LocalProjectCreateV30RequestAudienceCustomArea() {
  }

  public LocalProjectCreateV30RequestAudienceCustomArea geolocation(List<LocalProjectCreateV30RequestAudienceCustomAreaGeolocationInner> geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

  public LocalProjectCreateV30RequestAudienceCustomArea addGeolocationItem(LocalProjectCreateV30RequestAudienceCustomAreaGeolocationInner geolocationItem) {
    if (this.geolocation == null) {
      this.geolocation = new ArrayList<>();
    }
    this.geolocation.add(geolocationItem);
    return this;
  }

   /**
   * 地理位置设置
   * @return geolocation
  **/
  @javax.annotation.Nullable
  public List<LocalProjectCreateV30RequestAudienceCustomAreaGeolocationInner> getGeolocation() {
    return geolocation;
  }


  public void setGeolocation(List<LocalProjectCreateV30RequestAudienceCustomAreaGeolocationInner> geolocation) {
    this.geolocation = geolocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectCreateV30RequestAudienceCustomArea localProjectCreateV30RequestAudienceCustomArea = (LocalProjectCreateV30RequestAudienceCustomArea) o;
    return Objects.equals(this.geolocation, localProjectCreateV30RequestAudienceCustomArea.geolocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geolocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectCreateV30RequestAudienceCustomArea {\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
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
    openapiFields.add("geolocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectCreateV30RequestAudienceCustomArea.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectCreateV30RequestAudienceCustomArea' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectCreateV30RequestAudienceCustomArea> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectCreateV30RequestAudienceCustomArea.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectCreateV30RequestAudienceCustomArea>() {
           @Override
           public void write(JsonWriter out, LocalProjectCreateV30RequestAudienceCustomArea value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectCreateV30RequestAudienceCustomArea read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectCreateV30RequestAudienceCustomArea given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectCreateV30RequestAudienceCustomArea
  * @throws IOException if the JSON string is invalid with respect to LocalProjectCreateV30RequestAudienceCustomArea
  */
  public static LocalProjectCreateV30RequestAudienceCustomArea fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectCreateV30RequestAudienceCustomArea.class);
  }

 /**
  * Convert an instance of LocalProjectCreateV30RequestAudienceCustomArea to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

