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
 * 结论详情
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ToolsAbTestInfoGetV2ResponseDataConclusionDetail {
  public static final String SERIALIZED_NAME_COMMON = "common";
  @SerializedName(SERIALIZED_NAME_COMMON)
  private List<Long> common = null;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private List<Long> failed = null;

  public static final String SERIALIZED_NAME_WINNER = "winner";
  @SerializedName(SERIALIZED_NAME_WINNER)
  private List<Long> winner = null;

  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail() {
  }

  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail common(List<Long> common) {
    
    this.common = common;
    return this;
  }

  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail addCommonItem(Long commonItem) {
    if (this.common == null) {
      this.common = new ArrayList<>();
    }
    this.common.add(commonItem);
    return this;
  }

   /**
   * 普通对象ID列表
   * @return common
  **/
  @javax.annotation.Nullable
  public List<Long> getCommon() {
    return common;
  }


  public void setCommon(List<Long> common) {
    this.common = common;
  }


  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail failed(List<Long> failed) {
    
    this.failed = failed;
    return this;
  }

  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail addFailedItem(Long failedItem) {
    if (this.failed == null) {
      this.failed = new ArrayList<>();
    }
    this.failed.add(failedItem);
    return this;
  }

   /**
   * 失败对象ID列表
   * @return failed
  **/
  @javax.annotation.Nullable
  public List<Long> getFailed() {
    return failed;
  }


  public void setFailed(List<Long> failed) {
    this.failed = failed;
  }


  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail winner(List<Long> winner) {
    
    this.winner = winner;
    return this;
  }

  public ToolsAbTestInfoGetV2ResponseDataConclusionDetail addWinnerItem(Long winnerItem) {
    if (this.winner == null) {
      this.winner = new ArrayList<>();
    }
    this.winner.add(winnerItem);
    return this;
  }

   /**
   * 获胜对象ID列表
   * @return winner
  **/
  @javax.annotation.Nullable
  public List<Long> getWinner() {
    return winner;
  }


  public void setWinner(List<Long> winner) {
    this.winner = winner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestInfoGetV2ResponseDataConclusionDetail toolsAbTestInfoGetV2ResponseDataConclusionDetail = (ToolsAbTestInfoGetV2ResponseDataConclusionDetail) o;
    return Objects.equals(this.common, toolsAbTestInfoGetV2ResponseDataConclusionDetail.common) &&
        Objects.equals(this.failed, toolsAbTestInfoGetV2ResponseDataConclusionDetail.failed) &&
        Objects.equals(this.winner, toolsAbTestInfoGetV2ResponseDataConclusionDetail.winner);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(common, failed, winner);
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
    sb.append("class ToolsAbTestInfoGetV2ResponseDataConclusionDetail {\n");
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
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
    openapiFields.add("common");
    openapiFields.add("failed");
    openapiFields.add("winner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestInfoGetV2ResponseDataConclusionDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestInfoGetV2ResponseDataConclusionDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestInfoGetV2ResponseDataConclusionDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestInfoGetV2ResponseDataConclusionDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestInfoGetV2ResponseDataConclusionDetail>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestInfoGetV2ResponseDataConclusionDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestInfoGetV2ResponseDataConclusionDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestInfoGetV2ResponseDataConclusionDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestInfoGetV2ResponseDataConclusionDetail
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestInfoGetV2ResponseDataConclusionDetail
  */
  public static ToolsAbTestInfoGetV2ResponseDataConclusionDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestInfoGetV2ResponseDataConclusionDetail.class);
  }

 /**
  * Convert an instance of ToolsAbTestInfoGetV2ResponseDataConclusionDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

