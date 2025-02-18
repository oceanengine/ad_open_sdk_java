/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOptionalTargetsListV30DataLiveRecommendEasExternalActions;
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
 * DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner {
  public static final String SERIALIZED_NAME_EXTERNAL_ACTIONS = "external_actions";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTIONS)
  private List<DouplusOptionalTargetsListV30DataLiveRecommendEasExternalActions> externalActions = null;

  public static final String SERIALIZED_NAME_LIVE_AWEME_ID = "live_aweme_id";
  @SerializedName(SERIALIZED_NAME_LIVE_AWEME_ID)
  private String liveAwemeId = null;

  public DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner() {
  }

  public DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner externalActions(List<DouplusOptionalTargetsListV30DataLiveRecommendEasExternalActions> externalActions) {
    
    this.externalActions = externalActions;
    return this;
  }

  public DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner addExternalActionsItem(DouplusOptionalTargetsListV30DataLiveRecommendEasExternalActions externalActionsItem) {
    if (this.externalActions == null) {
      this.externalActions = new ArrayList<>();
    }
    this.externalActions.add(externalActionsItem);
    return this;
  }

   /**
   * 
   * @return externalActions
  **/
  @javax.annotation.Nullable
  public List<DouplusOptionalTargetsListV30DataLiveRecommendEasExternalActions> getExternalActions() {
    return externalActions;
  }


  public void setExternalActions(List<DouplusOptionalTargetsListV30DataLiveRecommendEasExternalActions> externalActions) {
    this.externalActions = externalActions;
  }


  public DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner liveAwemeId(String liveAwemeId) {
    
    this.liveAwemeId = liveAwemeId;
    return this;
  }

   /**
   * 
   * @return liveAwemeId
  **/
  @javax.annotation.Nullable
  public String getLiveAwemeId() {
    return liveAwemeId;
  }


  public void setLiveAwemeId(String liveAwemeId) {
    this.liveAwemeId = liveAwemeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner douplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner = (DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner) o;
    return Objects.equals(this.externalActions, douplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner.externalActions) &&
        Objects.equals(this.liveAwemeId, douplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner.liveAwemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalActions, liveAwemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner {\n");
    sb.append("    externalActions: ").append(toIndentedString(externalActions)).append("\n");
    sb.append("    liveAwemeId: ").append(toIndentedString(liveAwemeId)).append("\n");
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
    openapiFields.add("external_actions");
    openapiFields.add("live_aweme_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_actions");
    openapiRequiredFields.add("live_aweme_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner>() {
           @Override
           public void write(JsonWriter out, DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner
  * @throws IOException if the JSON string is invalid with respect to DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner
  */
  public static DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner.class);
  }

 /**
  * Convert an instance of DouplusOptionalTargetsListV30ResponseDataLiveRecommendEasInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

