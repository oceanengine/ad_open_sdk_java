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
import com.bytedance.ads.model.AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType;
import com.bytedance.ads.model.AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner;
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
 * AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_QUAL_TYPES = "qual_types";
  @SerializedName(SERIALIZED_NAME_QUAL_TYPES)
  private List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner> qualTypes = null;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private Long ruleId = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType type = null;

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner() {
  }

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 原子规则描述，用于引导用户提交
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner qualTypes(List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner> qualTypes) {
    
    this.qualTypes = qualTypes;
    return this;
  }

  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner addQualTypesItem(AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner qualTypesItem) {
    if (this.qualTypes == null) {
      this.qualTypes = new ArrayList<>();
    }
    this.qualTypes.add(qualTypesItem);
    return this;
  }

   /**
   * 资质类型
   * @return qualTypes
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner> getQualTypes() {
    return qualTypes;
  }


  public void setQualTypes(List<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInnerQualTypesInner> qualTypes) {
    this.qualTypes = qualTypes;
  }


  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner ruleId(Long ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * 原子规则id
   * @return ruleId
  **/
  @javax.annotation.Nullable
  public Long getRuleId() {
    return ruleId;
  }


  public void setRuleId(Long ruleId) {
    this.ruleId = ruleId;
  }


  public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner type(AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType getType() {
    return type;
  }


  public void setType(AdvertiserDeliveryPkgConfigV30DataIndustryConfigUnnecessariesRulesType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner = (AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner) o;
    return Objects.equals(this.description, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner.description) &&
        Objects.equals(this.qualTypes, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner.qualTypes) &&
        Objects.equals(this.ruleId, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner.ruleId) &&
        Objects.equals(this.type, advertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, qualTypes, ruleId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    qualTypes: ").append(toIndentedString(qualTypes)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("qual_types");
    openapiFields.add("rule_id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("qual_types");
    openapiRequiredFields.add("rule_id");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner
  */
  public static AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryPkgConfigV30ResponseDataIndustryConfigUnnecessariesInnerRulesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

