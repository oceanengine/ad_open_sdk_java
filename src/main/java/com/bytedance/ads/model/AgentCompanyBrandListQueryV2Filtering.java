/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class AgentCompanyBrandListQueryV2Filtering {
  public static final String SERIALIZED_NAME_COMPANY_IDS = "company_ids";
  @SerializedName(SERIALIZED_NAME_COMPANY_IDS)
  private List<Long> companyIds = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public AgentCompanyBrandListQueryV2Filtering() {
  }

  public AgentCompanyBrandListQueryV2Filtering companyIds(List<Long> companyIds) {
    
    this.companyIds = companyIds;
    return this;
  }

  public AgentCompanyBrandListQueryV2Filtering addCompanyIdsItem(Long companyIdsItem) {
    if (this.companyIds == null) {
      this.companyIds = new ArrayList<>();
    }
    this.companyIds.add(companyIdsItem);
    return this;
  }

   /**
   * 广告公司 id 列表，若选填该字段，则最少应上传1个广告主公司id，最多支持同时查询100个广告主公司。
   * @return companyIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCompanyIds() {
    return companyIds;
  }


  public void setCompanyIds(List<Long> companyIds) {
    this.companyIds = companyIds;
  }


  public AgentCompanyBrandListQueryV2Filtering companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 广告主所属公司名称，若选填该字段，限制最小长度为1，最大长度为223。支持模糊查询。
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentCompanyBrandListQueryV2Filtering agentCompanyBrandListQueryV2Filtering = (AgentCompanyBrandListQueryV2Filtering) o;
    return Objects.equals(this.companyIds, agentCompanyBrandListQueryV2Filtering.companyIds) &&
        Objects.equals(this.companyName, agentCompanyBrandListQueryV2Filtering.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyIds, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentCompanyBrandListQueryV2Filtering {\n");
    sb.append("    companyIds: ").append(toIndentedString(companyIds)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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
    openapiFields.add("company_ids");
    openapiFields.add("company_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentCompanyBrandListQueryV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentCompanyBrandListQueryV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentCompanyBrandListQueryV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentCompanyBrandListQueryV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentCompanyBrandListQueryV2Filtering>() {
           @Override
           public void write(JsonWriter out, AgentCompanyBrandListQueryV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentCompanyBrandListQueryV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentCompanyBrandListQueryV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentCompanyBrandListQueryV2Filtering
  * @throws IOException if the JSON string is invalid with respect to AgentCompanyBrandListQueryV2Filtering
  */
  public static AgentCompanyBrandListQueryV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentCompanyBrandListQueryV2Filtering.class);
  }

 /**
  * Convert an instance of AgentCompanyBrandListQueryV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

