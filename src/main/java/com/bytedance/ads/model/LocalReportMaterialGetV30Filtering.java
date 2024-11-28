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
import com.bytedance.ads.model.LocalReportMaterialGetV30FilteringCampaignType;
import com.bytedance.ads.model.LocalReportMaterialGetV30FilteringMaterialType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-28T11:58:36.026519536+08:00[Asia/Shanghai]")
public class LocalReportMaterialGetV30Filtering {
  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private LocalReportMaterialGetV30FilteringCampaignType campaignType = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private LocalReportMaterialGetV30FilteringMaterialType materialType = null;

  public LocalReportMaterialGetV30Filtering() {
  }

  public LocalReportMaterialGetV30Filtering campaignType(LocalReportMaterialGetV30FilteringCampaignType campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public LocalReportMaterialGetV30FilteringCampaignType getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(LocalReportMaterialGetV30FilteringCampaignType campaignType) {
    this.campaignType = campaignType;
  }


  public LocalReportMaterialGetV30Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public LocalReportMaterialGetV30Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 素材ID，查询素材id。 注意：material_id是个维度条件，如果不传，查询的是本地推广告账户ID全部聚合后数据；如果仅传入字符串material_ids，查询的是维度明细是素材维度数据；如果传入数值，查询的是具体素材id数据
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public LocalReportMaterialGetV30Filtering materialType(LocalReportMaterialGetV30FilteringMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public LocalReportMaterialGetV30FilteringMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(LocalReportMaterialGetV30FilteringMaterialType materialType) {
    this.materialType = materialType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalReportMaterialGetV30Filtering localReportMaterialGetV30Filtering = (LocalReportMaterialGetV30Filtering) o;
    return Objects.equals(this.campaignType, localReportMaterialGetV30Filtering.campaignType) &&
        Objects.equals(this.materialIds, localReportMaterialGetV30Filtering.materialIds) &&
        Objects.equals(this.materialType, localReportMaterialGetV30Filtering.materialType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignType, materialIds, materialType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalReportMaterialGetV30Filtering {\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
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
    openapiFields.add("campaign_type");
    openapiFields.add("material_ids");
    openapiFields.add("material_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalReportMaterialGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalReportMaterialGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalReportMaterialGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalReportMaterialGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalReportMaterialGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalReportMaterialGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalReportMaterialGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalReportMaterialGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalReportMaterialGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalReportMaterialGetV30Filtering
  */
  public static LocalReportMaterialGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalReportMaterialGetV30Filtering.class);
  }

 /**
  * Convert an instance of LocalReportMaterialGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

