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
 * SharedWalletWalletRelationGetV30ResponseDataResultsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class SharedWalletWalletRelationGetV30ResponseDataResultsInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_SHARED_WALLET_ID = "shared_wallet_id";
  @SerializedName(SERIALIZED_NAME_SHARED_WALLET_ID)
  private Long sharedWalletId = null;

  public SharedWalletWalletRelationGetV30ResponseDataResultsInner() {
  }

  public SharedWalletWalletRelationGetV30ResponseDataResultsInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public SharedWalletWalletRelationGetV30ResponseDataResultsInner sharedWalletId(Long sharedWalletId) {
    
    this.sharedWalletId = sharedWalletId;
    return this;
  }

   /**
   * 共享钱包ID
   * @return sharedWalletId
  **/
  @javax.annotation.Nullable
  public Long getSharedWalletId() {
    return sharedWalletId;
  }


  public void setSharedWalletId(Long sharedWalletId) {
    this.sharedWalletId = sharedWalletId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletRelationGetV30ResponseDataResultsInner sharedWalletWalletRelationGetV30ResponseDataResultsInner = (SharedWalletWalletRelationGetV30ResponseDataResultsInner) o;
    return Objects.equals(this.advertiserId, sharedWalletWalletRelationGetV30ResponseDataResultsInner.advertiserId) &&
        Objects.equals(this.sharedWalletId, sharedWalletWalletRelationGetV30ResponseDataResultsInner.sharedWalletId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, sharedWalletId);
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
    sb.append("class SharedWalletWalletRelationGetV30ResponseDataResultsInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    sharedWalletId: ").append(toIndentedString(sharedWalletId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("shared_wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletRelationGetV30ResponseDataResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletRelationGetV30ResponseDataResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletRelationGetV30ResponseDataResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletRelationGetV30ResponseDataResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletRelationGetV30ResponseDataResultsInner>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletRelationGetV30ResponseDataResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletRelationGetV30ResponseDataResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletRelationGetV30ResponseDataResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletRelationGetV30ResponseDataResultsInner
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletRelationGetV30ResponseDataResultsInner
  */
  public static SharedWalletWalletRelationGetV30ResponseDataResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletRelationGetV30ResponseDataResultsInner.class);
  }

 /**
  * Convert an instance of SharedWalletWalletRelationGetV30ResponseDataResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

