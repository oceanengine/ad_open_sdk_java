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
import com.bytedance.ads.model.StarChallengeSyncItemToAdV2ResponseDataFailSyncReasonInner;
import com.bytedance.ads.model.StarChallengeSyncItemToAdV2ResponseDataSyncDetailsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class StarChallengeSyncItemToAdV2ResponseData {
  public static final String SERIALIZED_NAME_EXIST_SUCCESS_SYNC = "exist_success_sync";
  @SerializedName(SERIALIZED_NAME_EXIST_SUCCESS_SYNC)
  private Boolean existSuccessSync = null;

  public static final String SERIALIZED_NAME_FAIL_SYNC_REASON = "fail_sync_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_SYNC_REASON)
  private List<StarChallengeSyncItemToAdV2ResponseDataFailSyncReasonInner> failSyncReason = null;

  public static final String SERIALIZED_NAME_SYNC_DETAILS = "sync_details";
  @SerializedName(SERIALIZED_NAME_SYNC_DETAILS)
  private List<StarChallengeSyncItemToAdV2ResponseDataSyncDetailsInner> syncDetails = null;

  public StarChallengeSyncItemToAdV2ResponseData() {
  }

  public StarChallengeSyncItemToAdV2ResponseData existSuccessSync(Boolean existSuccessSync) {
    
    this.existSuccessSync = existSuccessSync;
    return this;
  }

   /**
   * 是否存在成功的推送
   * @return existSuccessSync
  **/
  @javax.annotation.Nullable
  public Boolean getExistSuccessSync() {
    return existSuccessSync;
  }


  public void setExistSuccessSync(Boolean existSuccessSync) {
    this.existSuccessSync = existSuccessSync;
  }


  public StarChallengeSyncItemToAdV2ResponseData failSyncReason(List<StarChallengeSyncItemToAdV2ResponseDataFailSyncReasonInner> failSyncReason) {
    
    this.failSyncReason = failSyncReason;
    return this;
  }

  public StarChallengeSyncItemToAdV2ResponseData addFailSyncReasonItem(StarChallengeSyncItemToAdV2ResponseDataFailSyncReasonInner failSyncReasonItem) {
    if (this.failSyncReason == null) {
      this.failSyncReason = new ArrayList<>();
    }
    this.failSyncReason.add(failSyncReasonItem);
    return this;
  }

   /**
   * 推送失败的原因
   * @return failSyncReason
  **/
  @javax.annotation.Nullable
  public List<StarChallengeSyncItemToAdV2ResponseDataFailSyncReasonInner> getFailSyncReason() {
    return failSyncReason;
  }


  public void setFailSyncReason(List<StarChallengeSyncItemToAdV2ResponseDataFailSyncReasonInner> failSyncReason) {
    this.failSyncReason = failSyncReason;
  }


  public StarChallengeSyncItemToAdV2ResponseData syncDetails(List<StarChallengeSyncItemToAdV2ResponseDataSyncDetailsInner> syncDetails) {
    
    this.syncDetails = syncDetails;
    return this;
  }

  public StarChallengeSyncItemToAdV2ResponseData addSyncDetailsItem(StarChallengeSyncItemToAdV2ResponseDataSyncDetailsInner syncDetailsItem) {
    if (this.syncDetails == null) {
      this.syncDetails = new ArrayList<>();
    }
    this.syncDetails.add(syncDetailsItem);
    return this;
  }

   /**
   * 推送详情，格式等同于素材集市
   * @return syncDetails
  **/
  @javax.annotation.Nullable
  public List<StarChallengeSyncItemToAdV2ResponseDataSyncDetailsInner> getSyncDetails() {
    return syncDetails;
  }


  public void setSyncDetails(List<StarChallengeSyncItemToAdV2ResponseDataSyncDetailsInner> syncDetails) {
    this.syncDetails = syncDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeSyncItemToAdV2ResponseData starChallengeSyncItemToAdV2ResponseData = (StarChallengeSyncItemToAdV2ResponseData) o;
    return Objects.equals(this.existSuccessSync, starChallengeSyncItemToAdV2ResponseData.existSuccessSync) &&
        Objects.equals(this.failSyncReason, starChallengeSyncItemToAdV2ResponseData.failSyncReason) &&
        Objects.equals(this.syncDetails, starChallengeSyncItemToAdV2ResponseData.syncDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(existSuccessSync, failSyncReason, syncDetails);
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
    sb.append("class StarChallengeSyncItemToAdV2ResponseData {\n");
    sb.append("    existSuccessSync: ").append(toIndentedString(existSuccessSync)).append("\n");
    sb.append("    failSyncReason: ").append(toIndentedString(failSyncReason)).append("\n");
    sb.append("    syncDetails: ").append(toIndentedString(syncDetails)).append("\n");
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
    openapiFields.add("exist_success_sync");
    openapiFields.add("fail_sync_reason");
    openapiFields.add("sync_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("exist_success_sync");
    openapiRequiredFields.add("fail_sync_reason");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeSyncItemToAdV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeSyncItemToAdV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeSyncItemToAdV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeSyncItemToAdV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeSyncItemToAdV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarChallengeSyncItemToAdV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeSyncItemToAdV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeSyncItemToAdV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeSyncItemToAdV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarChallengeSyncItemToAdV2ResponseData
  */
  public static StarChallengeSyncItemToAdV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeSyncItemToAdV2ResponseData.class);
  }

 /**
  * Convert an instance of StarChallengeSyncItemToAdV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

