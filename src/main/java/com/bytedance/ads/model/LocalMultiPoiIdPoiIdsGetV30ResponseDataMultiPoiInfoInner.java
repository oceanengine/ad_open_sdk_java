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
import java.util.ArrayList;
import java.util.List;
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
 * LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner {
  public static final String SERIALIZED_NAME_MULTI_POI_ID = "multi_poi_id";
  @SerializedName(SERIALIZED_NAME_MULTI_POI_ID)
  private Long multiPoiId = null;

  public static final String SERIALIZED_NAME_POI_IDS = "poi_ids";
  @SerializedName(SERIALIZED_NAME_POI_IDS)
  private List<Long> poiIds = null;

  public LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner() {
  }

  public LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner multiPoiId(Long multiPoiId) {
    
    this.multiPoiId = multiPoiId;
    return this;
  }

   /**
   * 
   * @return multiPoiId
  **/
  @javax.annotation.Nullable
  public Long getMultiPoiId() {
    return multiPoiId;
  }


  public void setMultiPoiId(Long multiPoiId) {
    this.multiPoiId = multiPoiId;
  }


  public LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner poiIds(List<Long> poiIds) {
    
    this.poiIds = poiIds;
    return this;
  }

  public LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner addPoiIdsItem(Long poiIdsItem) {
    if (this.poiIds == null) {
      this.poiIds = new ArrayList<>();
    }
    this.poiIds.add(poiIdsItem);
    return this;
  }

   /**
   * 
   * @return poiIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPoiIds() {
    return poiIds;
  }


  public void setPoiIds(List<Long> poiIds) {
    this.poiIds = poiIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner localMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner = (LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner) o;
    return Objects.equals(this.multiPoiId, localMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner.multiPoiId) &&
        Objects.equals(this.poiIds, localMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner.poiIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiPoiId, poiIds);
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
    sb.append("class LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner {\n");
    sb.append("    multiPoiId: ").append(toIndentedString(multiPoiId)).append("\n");
    sb.append("    poiIds: ").append(toIndentedString(poiIds)).append("\n");
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
    openapiFields.add("multi_poi_id");
    openapiFields.add("poi_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner>() {
           @Override
           public void write(JsonWriter out, LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner
  * @throws IOException if the JSON string is invalid with respect to LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner
  */
  public static LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner.class);
  }

 /**
  * Convert an instance of LocalMultiPoiIdPoiIdsGetV30ResponseDataMultiPoiInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

