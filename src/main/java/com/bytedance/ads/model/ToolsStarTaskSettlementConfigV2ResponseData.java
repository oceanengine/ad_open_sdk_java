/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsStarTaskSettlementConfigV2ResponseData {
  public static final String SERIALIZED_NAME_MIN_STAR_MATERIAL_BID = "min_star_material_bid";
  @SerializedName(SERIALIZED_NAME_MIN_STAR_MATERIAL_BID)
  private Double minStarMaterialBid = null;

  public static final String SERIALIZED_NAME_MIN_STAR_TASK_BUDGET = "min_star_task_budget";
  @SerializedName(SERIALIZED_NAME_MIN_STAR_TASK_BUDGET)
  private Double minStarTaskBudget = null;

  public static final String SERIALIZED_NAME_STAR_AD_COST_DIVIDE_RATIO = "star_ad_cost_divide_ratio";
  @SerializedName(SERIALIZED_NAME_STAR_AD_COST_DIVIDE_RATIO)
  private Long starAdCostDivideRatio = null;

  public static final String SERIALIZED_NAME_SUGGESTION_STAR_TASK_BID = "suggestion_star_task_bid";
  @SerializedName(SERIALIZED_NAME_SUGGESTION_STAR_TASK_BID)
  private Double suggestionStarTaskBid = null;

  public ToolsStarTaskSettlementConfigV2ResponseData() {
  }

  public ToolsStarTaskSettlementConfigV2ResponseData minStarMaterialBid(Double minStarMaterialBid) {
    
    this.minStarMaterialBid = minStarMaterialBid;
    return this;
  }

   /**
   * 任务最小可设置基础素材费单价（元），每条视频最低需要支付的价格,影响达人接单积极性 - 不同行业+素材类目组合，最小可设置素材费单价不同
   * @return minStarMaterialBid
  **/
  @javax.annotation.Nullable
  public Double getMinStarMaterialBid() {
    return minStarMaterialBid;
  }


  public void setMinStarMaterialBid(Double minStarMaterialBid) {
    this.minStarMaterialBid = minStarMaterialBid;
  }


  public ToolsStarTaskSettlementConfigV2ResponseData minStarTaskBudget(Double minStarTaskBudget) {
    
    this.minStarTaskBudget = minStarTaskBudget;
    return this;
  }

   /**
   * 任务最小可设置预算（元） - 最小可设置预算为固定值
   * @return minStarTaskBudget
  **/
  @javax.annotation.Nullable
  public Double getMinStarTaskBudget() {
    return minStarTaskBudget;
  }


  public void setMinStarTaskBudget(Double minStarTaskBudget) {
    this.minStarTaskBudget = minStarTaskBudget;
  }


  public ToolsStarTaskSettlementConfigV2ResponseData starAdCostDivideRatio(Long starAdCostDivideRatio) {
    
    this.starAdCostDivideRatio = starAdCostDivideRatio;
    return this;
  }

   /**
   * 素材分成费比例（单位是千分之一分，比如接口返回是20&#x3D; 千分之20，实际是2%） - 不同的行业+素材类目组合，分成比例可能不同 - 限时免费期间，分成比例为0，后续变更请关注巨量运营/销售同学的通知
   * @return starAdCostDivideRatio
  **/
  @javax.annotation.Nullable
  public Long getStarAdCostDivideRatio() {
    return starAdCostDivideRatio;
  }


  public void setStarAdCostDivideRatio(Long starAdCostDivideRatio) {
    this.starAdCostDivideRatio = starAdCostDivideRatio;
  }


  public ToolsStarTaskSettlementConfigV2ResponseData suggestionStarTaskBid(Double suggestionStarTaskBid) {
    
    this.suggestionStarTaskBid = suggestionStarTaskBid;
    return this;
  }

   /**
   * 任务建议出价金额（元） - 不同行业和优化目标组合下，建议出价金额不同
   * @return suggestionStarTaskBid
  **/
  @javax.annotation.Nullable
  public Double getSuggestionStarTaskBid() {
    return suggestionStarTaskBid;
  }


  public void setSuggestionStarTaskBid(Double suggestionStarTaskBid) {
    this.suggestionStarTaskBid = suggestionStarTaskBid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsStarTaskSettlementConfigV2ResponseData toolsStarTaskSettlementConfigV2ResponseData = (ToolsStarTaskSettlementConfigV2ResponseData) o;
    return Objects.equals(this.minStarMaterialBid, toolsStarTaskSettlementConfigV2ResponseData.minStarMaterialBid) &&
        Objects.equals(this.minStarTaskBudget, toolsStarTaskSettlementConfigV2ResponseData.minStarTaskBudget) &&
        Objects.equals(this.starAdCostDivideRatio, toolsStarTaskSettlementConfigV2ResponseData.starAdCostDivideRatio) &&
        Objects.equals(this.suggestionStarTaskBid, toolsStarTaskSettlementConfigV2ResponseData.suggestionStarTaskBid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(minStarMaterialBid, minStarTaskBudget, starAdCostDivideRatio, suggestionStarTaskBid);
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
    sb.append("class ToolsStarTaskSettlementConfigV2ResponseData {\n");
    sb.append("    minStarMaterialBid: ").append(toIndentedString(minStarMaterialBid)).append("\n");
    sb.append("    minStarTaskBudget: ").append(toIndentedString(minStarTaskBudget)).append("\n");
    sb.append("    starAdCostDivideRatio: ").append(toIndentedString(starAdCostDivideRatio)).append("\n");
    sb.append("    suggestionStarTaskBid: ").append(toIndentedString(suggestionStarTaskBid)).append("\n");
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
    openapiFields.add("min_star_material_bid");
    openapiFields.add("min_star_task_budget");
    openapiFields.add("star_ad_cost_divide_ratio");
    openapiFields.add("suggestion_star_task_bid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsStarTaskSettlementConfigV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsStarTaskSettlementConfigV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsStarTaskSettlementConfigV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsStarTaskSettlementConfigV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsStarTaskSettlementConfigV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsStarTaskSettlementConfigV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsStarTaskSettlementConfigV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsStarTaskSettlementConfigV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsStarTaskSettlementConfigV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsStarTaskSettlementConfigV2ResponseData
  */
  public static ToolsStarTaskSettlementConfigV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsStarTaskSettlementConfigV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsStarTaskSettlementConfigV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

