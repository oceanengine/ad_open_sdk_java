/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.31
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
 * 小游戏结算相关字段
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle {
  public static final String SERIALIZED_NAME_AUTHOR_CPS_REWARD = "author_cps_reward";
  @SerializedName(SERIALIZED_NAME_AUTHOR_CPS_REWARD)
  private Long authorCpsReward = null;

  public static final String SERIALIZED_NAME_AUTHOR_NATURAL_VV = "author_natural_vv";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NATURAL_VV)
  private Long authorNaturalVv = null;

  public static final String SERIALIZED_NAME_DEMANDER_CPS_TURNOVER = "demander_cps_turnover";
  @SerializedName(SERIALIZED_NAME_DEMANDER_CPS_TURNOVER)
  private Long demanderCpsTurnover = null;

  public static final String SERIALIZED_NAME_DEMANDER_EST_COST = "demander_est_cost";
  @SerializedName(SERIALIZED_NAME_DEMANDER_EST_COST)
  private Long demanderEstCost = null;

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle() {
  }

  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle authorCpsReward(Long authorCpsReward) {
    
    this.authorCpsReward = authorCpsReward;
    return this;
  }

   /**
   * 达人预估cps收入（付费分佣金额）
   * @return authorCpsReward
  **/
  @javax.annotation.Nullable
  public Long getAuthorCpsReward() {
    return authorCpsReward;
  }


  public void setAuthorCpsReward(Long authorCpsReward) {
    this.authorCpsReward = authorCpsReward;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle authorNaturalVv(Long authorNaturalVv) {
    
    this.authorNaturalVv = authorNaturalVv;
    return this;
  }

   /**
   * 达人计费自然播放量
   * @return authorNaturalVv
  **/
  @javax.annotation.Nullable
  public Long getAuthorNaturalVv() {
    return authorNaturalVv;
  }


  public void setAuthorNaturalVv(Long authorNaturalVv) {
    this.authorNaturalVv = authorNaturalVv;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle demanderCpsTurnover(Long demanderCpsTurnover) {
    
    this.demanderCpsTurnover = demanderCpsTurnover;
    return this;
  }

   /**
   * 客户cps流水 （付费流水金额）
   * @return demanderCpsTurnover
  **/
  @javax.annotation.Nullable
  public Long getDemanderCpsTurnover() {
    return demanderCpsTurnover;
  }


  public void setDemanderCpsTurnover(Long demanderCpsTurnover) {
    this.demanderCpsTurnover = demanderCpsTurnover;
  }


  public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle demanderEstCost(Long demanderEstCost) {
    
    this.demanderEstCost = demanderEstCost;
    return this;
  }

   /**
   * 客户预估消耗（视频消耗）
   * @return demanderEstCost
  **/
  @javax.annotation.Nullable
  public Long getDemanderEstCost() {
    return demanderEstCost;
  }


  public void setDemanderEstCost(Long demanderEstCost) {
    this.demanderEstCost = demanderEstCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle = (StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle) o;
    return Objects.equals(this.authorCpsReward, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle.authorCpsReward) &&
        Objects.equals(this.authorNaturalVv, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle.authorNaturalVv) &&
        Objects.equals(this.demanderCpsTurnover, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle.demanderCpsTurnover) &&
        Objects.equals(this.demanderEstCost, starMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle.demanderEstCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorCpsReward, authorNaturalVv, demanderCpsTurnover, demanderEstCost);
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
    sb.append("class StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle {\n");
    sb.append("    authorCpsReward: ").append(toIndentedString(authorCpsReward)).append("\n");
    sb.append("    authorNaturalVv: ").append(toIndentedString(authorNaturalVv)).append("\n");
    sb.append("    demanderCpsTurnover: ").append(toIndentedString(demanderCpsTurnover)).append("\n");
    sb.append("    demanderEstCost: ").append(toIndentedString(demanderEstCost)).append("\n");
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
    openapiFields.add("author_cps_reward");
    openapiFields.add("author_natural_vv");
    openapiFields.add("demander_cps_turnover");
    openapiFields.add("demander_est_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle.class));

       return (TypeAdapter<T>) new TypeAdapter<StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle>() {
           @Override
           public void write(JsonWriter out, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle
  * @throws IOException if the JSON string is invalid with respect to StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle
  */
  public static StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle.class);
  }

 /**
  * Convert an instance of StarMcnGetContractChallengeAuthorItemListV2V2ResponseDataDataInnerSmallGameSettle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

