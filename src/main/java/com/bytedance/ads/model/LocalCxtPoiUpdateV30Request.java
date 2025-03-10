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
 * LocalCxtPoiUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class LocalCxtPoiUpdateV30Request {
  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_POI_IDS = "poi_ids";
  @SerializedName(SERIALIZED_NAME_POI_IDS)
  private List<Long> poiIds = null;

  public LocalCxtPoiUpdateV30Request() {
  }

  public LocalCxtPoiUpdateV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalCxtPoiUpdateV30Request poiIds(List<Long> poiIds) {
    
    this.poiIds = poiIds;
    return this;
  }

  public LocalCxtPoiUpdateV30Request addPoiIdsItem(Long poiIdsItem) {
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
  @javax.annotation.Nonnull
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
    LocalCxtPoiUpdateV30Request localCxtPoiUpdateV30Request = (LocalCxtPoiUpdateV30Request) o;
    return Objects.equals(this.localAccountId, localCxtPoiUpdateV30Request.localAccountId) &&
        Objects.equals(this.poiIds, localCxtPoiUpdateV30Request.poiIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localAccountId, poiIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalCxtPoiUpdateV30Request {\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
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
    openapiFields.add("local_account_id");
    openapiFields.add("poi_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("local_account_id");
    openapiRequiredFields.add("poi_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalCxtPoiUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalCxtPoiUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalCxtPoiUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalCxtPoiUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalCxtPoiUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalCxtPoiUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalCxtPoiUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalCxtPoiUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalCxtPoiUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalCxtPoiUpdateV30Request
  */
  public static LocalCxtPoiUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalCxtPoiUpdateV30Request.class);
  }

 /**
  * Convert an instance of LocalCxtPoiUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

