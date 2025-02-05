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
import com.bytedance.ads.model.LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius;
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
 * 门店附近定向设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class LocalProjectCreateV30RequestAudiencePoiAround {
  public static final String SERIALIZED_NAME_POI_AROUND_IDS = "poi_around_ids";
  @SerializedName(SERIALIZED_NAME_POI_AROUND_IDS)
  private List<Long> poiAroundIds = null;

  public static final String SERIALIZED_NAME_POI_AROUND_RADIUS = "poi_around_radius";
  @SerializedName(SERIALIZED_NAME_POI_AROUND_RADIUS)
  private LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius poiAroundRadius = null;

  public LocalProjectCreateV30RequestAudiencePoiAround() {
  }

  public LocalProjectCreateV30RequestAudiencePoiAround poiAroundIds(List<Long> poiAroundIds) {
    
    this.poiAroundIds = poiAroundIds;
    return this;
  }

  public LocalProjectCreateV30RequestAudiencePoiAround addPoiAroundIdsItem(Long poiAroundIdsItem) {
    if (this.poiAroundIds == null) {
      this.poiAroundIds = new ArrayList<>();
    }
    this.poiAroundIds.add(poiAroundIdsItem);
    return this;
  }

   /**
   * 门店附近定向设置里的门店ID
   * @return poiAroundIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPoiAroundIds() {
    return poiAroundIds;
  }


  public void setPoiAroundIds(List<Long> poiAroundIds) {
    this.poiAroundIds = poiAroundIds;
  }


  public LocalProjectCreateV30RequestAudiencePoiAround poiAroundRadius(LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius poiAroundRadius) {
    
    this.poiAroundRadius = poiAroundRadius;
    return this;
  }

   /**
   * Get poiAroundRadius
   * @return poiAroundRadius
  **/
  @javax.annotation.Nullable
  public LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius getPoiAroundRadius() {
    return poiAroundRadius;
  }


  public void setPoiAroundRadius(LocalProjectCreateV30AudiencePoiAroundPoiAroundRadius poiAroundRadius) {
    this.poiAroundRadius = poiAroundRadius;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectCreateV30RequestAudiencePoiAround localProjectCreateV30RequestAudiencePoiAround = (LocalProjectCreateV30RequestAudiencePoiAround) o;
    return Objects.equals(this.poiAroundIds, localProjectCreateV30RequestAudiencePoiAround.poiAroundIds) &&
        Objects.equals(this.poiAroundRadius, localProjectCreateV30RequestAudiencePoiAround.poiAroundRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiAroundIds, poiAroundRadius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectCreateV30RequestAudiencePoiAround {\n");
    sb.append("    poiAroundIds: ").append(toIndentedString(poiAroundIds)).append("\n");
    sb.append("    poiAroundRadius: ").append(toIndentedString(poiAroundRadius)).append("\n");
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
    openapiFields.add("poi_around_ids");
    openapiFields.add("poi_around_radius");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectCreateV30RequestAudiencePoiAround.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectCreateV30RequestAudiencePoiAround' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectCreateV30RequestAudiencePoiAround> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectCreateV30RequestAudiencePoiAround.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectCreateV30RequestAudiencePoiAround>() {
           @Override
           public void write(JsonWriter out, LocalProjectCreateV30RequestAudiencePoiAround value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectCreateV30RequestAudiencePoiAround read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectCreateV30RequestAudiencePoiAround given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectCreateV30RequestAudiencePoiAround
  * @throws IOException if the JSON string is invalid with respect to LocalProjectCreateV30RequestAudiencePoiAround
  */
  public static LocalProjectCreateV30RequestAudiencePoiAround fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectCreateV30RequestAudiencePoiAround.class);
  }

 /**
  * Convert an instance of LocalProjectCreateV30RequestAudiencePoiAround to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

