/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions;
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
 * DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner {
  public static final String SERIALIZED_NAME_EXTERNAL_ACTIONS = "external_actions";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTIONS)
  private List<DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions> externalActions = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner() {
  }

  public DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner externalActions(List<DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions> externalActions) {
    
    this.externalActions = externalActions;
    return this;
  }

  public DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner addExternalActionsItem(DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions externalActionsItem) {
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
  public List<DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions> getExternalActions() {
    return externalActions;
  }


  public void setExternalActions(List<DouplusOptionalTargetsListV30DataItemRecommendEasExternalActions> externalActions) {
    this.externalActions = externalActions;
  }


  public DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner douplusOptionalTargetsListV30ResponseDataItemRecommendEasInner = (DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner) o;
    return Objects.equals(this.externalActions, douplusOptionalTargetsListV30ResponseDataItemRecommendEasInner.externalActions) &&
        Objects.equals(this.itemId, douplusOptionalTargetsListV30ResponseDataItemRecommendEasInner.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalActions, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner {\n");
    sb.append("    externalActions: ").append(toIndentedString(externalActions)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
    openapiFields.add("item_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_actions");
    openapiRequiredFields.add("item_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner>() {
           @Override
           public void write(JsonWriter out, DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner
  * @throws IOException if the JSON string is invalid with respect to DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner
  */
  public static DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner.class);
  }

 /**
  * Convert an instance of DouplusOptionalTargetsListV30ResponseDataItemRecommendEasInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

