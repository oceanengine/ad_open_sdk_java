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
import com.bytedance.ads.model.AdvertiserBudgetGetV2DataListBudgetMode;
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
 * AdvertiserBudgetGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class AdvertiserBudgetGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private AdvertiserBudgetGetV2DataListBudgetMode budgetMode = null;

  public AdvertiserBudgetGetV2ResponseDataListInner() {
  }

  public AdvertiserBudgetGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserBudgetGetV2ResponseDataListInner budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public AdvertiserBudgetGetV2ResponseDataListInner budgetMode(AdvertiserBudgetGetV2DataListBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public AdvertiserBudgetGetV2DataListBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(AdvertiserBudgetGetV2DataListBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserBudgetGetV2ResponseDataListInner advertiserBudgetGetV2ResponseDataListInner = (AdvertiserBudgetGetV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, advertiserBudgetGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.budget, advertiserBudgetGetV2ResponseDataListInner.budget) &&
        Objects.equals(this.budgetMode, advertiserBudgetGetV2ResponseDataListInner.budgetMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, budgetMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserBudgetGetV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("budget_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserBudgetGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserBudgetGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserBudgetGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserBudgetGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserBudgetGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserBudgetGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserBudgetGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserBudgetGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserBudgetGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserBudgetGetV2ResponseDataListInner
  */
  public static AdvertiserBudgetGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserBudgetGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdvertiserBudgetGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

