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
import com.bytedance.ads.model.AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner;
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
 * AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner {
  public static final String SERIALIZED_NAME_COMBINE_ID = "combine_id";
  @SerializedName(SERIALIZED_NAME_COMBINE_ID)
  private Long combineId = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner> rules = null;

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner() {
  }

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner combineId(Long combineId) {
    
    this.combineId = combineId;
    return this;
  }

   /**
   * 规则组合id
   * @return combineId
  **/
  @javax.annotation.Nullable
  public Long getCombineId() {
    return combineId;
  }


  public void setCombineId(Long combineId) {
    this.combineId = combineId;
  }


  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 选填资质场景描述，用于引导用户提交
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner rules(List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner> rules) {
    
    this.rules = rules;
    return this;
  }

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner addRulesItem(AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * 具体的资质规则
   * @return rules
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner> getRules() {
    return rules;
  }


  public void setRules(List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner> rules) {
    this.rules = rules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner = (AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner) o;
    return Objects.equals(this.combineId, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner.combineId) &&
        Objects.equals(this.description, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner.description) &&
        Objects.equals(this.rules, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner.rules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(combineId, description, rules);
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
    sb.append("class AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner {\n");
    sb.append("    combineId: ").append(toIndentedString(combineId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
    openapiFields.add("combine_id");
    openapiFields.add("description");
    openapiFields.add("rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("combine_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner
  */
  public static AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

