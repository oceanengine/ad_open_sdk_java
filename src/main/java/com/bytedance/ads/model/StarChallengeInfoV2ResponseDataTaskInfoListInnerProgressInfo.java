/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo {
  public static final String SERIALIZED_NAME_ACTIVATE_COUNT = "activate_count";
  @SerializedName(SERIALIZED_NAME_ACTIVATE_COUNT)
  private Long activateCount = null;

  public static final String SERIALIZED_NAME_CURRENT_BUDGET_COST = "current_budget_cost";
  @SerializedName(SERIALIZED_NAME_CURRENT_BUDGET_COST)
  private Long currentBudgetCost = null;

  public static final String SERIALIZED_NAME_TOTAL_PARTICIPATES = "total_participates";
  @SerializedName(SERIALIZED_NAME_TOTAL_PARTICIPATES)
  private Long totalParticipates = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo activateCount(Long activateCount) {
    
    this.activateCount = activateCount;
    return this;
  }

   /**
   * 
   * @return activateCount
  **/
  @javax.annotation.Nullable
  public Long getActivateCount() {
    return activateCount;
  }


  public void setActivateCount(Long activateCount) {
    this.activateCount = activateCount;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo currentBudgetCost(Long currentBudgetCost) {
    
    this.currentBudgetCost = currentBudgetCost;
    return this;
  }

   /**
   * 
   * @return currentBudgetCost
  **/
  @javax.annotation.Nullable
  public Long getCurrentBudgetCost() {
    return currentBudgetCost;
  }


  public void setCurrentBudgetCost(Long currentBudgetCost) {
    this.currentBudgetCost = currentBudgetCost;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo totalParticipates(Long totalParticipates) {
    
    this.totalParticipates = totalParticipates;
    return this;
  }

   /**
   * 
   * @return totalParticipates
  **/
  @javax.annotation.Nullable
  public Long getTotalParticipates() {
    return totalParticipates;
  }


  public void setTotalParticipates(Long totalParticipates) {
    this.totalParticipates = totalParticipates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo starChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo = (StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo) o;
    return Objects.equals(this.activateCount, starChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo.activateCount) &&
        Objects.equals(this.currentBudgetCost, starChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo.currentBudgetCost) &&
        Objects.equals(this.totalParticipates, starChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo.totalParticipates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activateCount, currentBudgetCost, totalParticipates);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo {\n");
    sb.append("    activateCount: ").append(toIndentedString(activateCount)).append("\n");
    sb.append("    currentBudgetCost: ").append(toIndentedString(currentBudgetCost)).append("\n");
    sb.append("    totalParticipates: ").append(toIndentedString(totalParticipates)).append("\n");
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
    openapiFields.add("activate_count");
    openapiFields.add("current_budget_cost");
    openapiFields.add("total_participates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

