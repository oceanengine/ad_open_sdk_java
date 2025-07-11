/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
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
 * StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner {
  public static final String SERIALIZED_NAME_SHARING_ADVERTISER_ID = "sharing_advertiser_id";
  @SerializedName(SERIALIZED_NAME_SHARING_ADVERTISER_ID)
  private Long sharingAdvertiserId = null;

  public static final String SERIALIZED_NAME_SHARING_ADVERTISER_NAME = "sharing_advertiser_name";
  @SerializedName(SERIALIZED_NAME_SHARING_ADVERTISER_NAME)
  private String sharingAdvertiserName = null;

  public StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner() {
  }

  public StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner sharingAdvertiserId(Long sharingAdvertiserId) {
    
    this.sharingAdvertiserId = sharingAdvertiserId;
    return this;
  }

   /**
   * 
   * @return sharingAdvertiserId
  **/
  @javax.annotation.Nullable
  public Long getSharingAdvertiserId() {
    return sharingAdvertiserId;
  }


  public void setSharingAdvertiserId(Long sharingAdvertiserId) {
    this.sharingAdvertiserId = sharingAdvertiserId;
  }


  public StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner sharingAdvertiserName(String sharingAdvertiserName) {
    
    this.sharingAdvertiserName = sharingAdvertiserName;
    return this;
  }

   /**
   * 
   * @return sharingAdvertiserName
  **/
  @javax.annotation.Nullable
  public String getSharingAdvertiserName() {
    return sharingAdvertiserName;
  }


  public void setSharingAdvertiserName(String sharingAdvertiserName) {
    this.sharingAdvertiserName = sharingAdvertiserName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner stardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner = (StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner) o;
    return Objects.equals(this.sharingAdvertiserId, stardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner.sharingAdvertiserId) &&
        Objects.equals(this.sharingAdvertiserName, stardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner.sharingAdvertiserName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharingAdvertiserId, sharingAdvertiserName);
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
    sb.append("class StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner {\n");
    sb.append("    sharingAdvertiserId: ").append(toIndentedString(sharingAdvertiserId)).append("\n");
    sb.append("    sharingAdvertiserName: ").append(toIndentedString(sharingAdvertiserName)).append("\n");
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
    openapiFields.add("sharing_advertiser_id");
    openapiFields.add("sharing_advertiser_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner
  */
  public static StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner.class);
  }

 /**
  * Convert an instance of StardeliveryTaskSharingListV30ResponseDataSharingAdvertiserInfoInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

