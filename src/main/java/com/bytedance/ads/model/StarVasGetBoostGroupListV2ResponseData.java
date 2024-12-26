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
import com.bytedance.ads.model.StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInner;
import com.bytedance.ads.model.StarVasGetBoostGroupListV2ResponseDataPagination;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class StarVasGetBoostGroupListV2ResponseData {
  public static final String SERIALIZED_NAME_BOOST_GROUP_INFOS = "boost_group_infos";
  @SerializedName(SERIALIZED_NAME_BOOST_GROUP_INFOS)
  private List<StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInner> boostGroupInfos = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private StarVasGetBoostGroupListV2ResponseDataPagination pagination = null;

  public StarVasGetBoostGroupListV2ResponseData() {
  }

  public StarVasGetBoostGroupListV2ResponseData boostGroupInfos(List<StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInner> boostGroupInfos) {
    
    this.boostGroupInfos = boostGroupInfos;
    return this;
  }

  public StarVasGetBoostGroupListV2ResponseData addBoostGroupInfosItem(StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInner boostGroupInfosItem) {
    if (this.boostGroupInfos == null) {
      this.boostGroupInfos = new ArrayList<>();
    }
    this.boostGroupInfos.add(boostGroupInfosItem);
    return this;
  }

   /**
   * 助推组列表
   * @return boostGroupInfos
  **/
  @javax.annotation.Nullable
  public List<StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInner> getBoostGroupInfos() {
    return boostGroupInfos;
  }


  public void setBoostGroupInfos(List<StarVasGetBoostGroupListV2ResponseDataBoostGroupInfosInner> boostGroupInfos) {
    this.boostGroupInfos = boostGroupInfos;
  }


  public StarVasGetBoostGroupListV2ResponseData pagination(StarVasGetBoostGroupListV2ResponseDataPagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostGroupListV2ResponseDataPagination getPagination() {
    return pagination;
  }


  public void setPagination(StarVasGetBoostGroupListV2ResponseDataPagination pagination) {
    this.pagination = pagination;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetBoostGroupListV2ResponseData starVasGetBoostGroupListV2ResponseData = (StarVasGetBoostGroupListV2ResponseData) o;
    return Objects.equals(this.boostGroupInfos, starVasGetBoostGroupListV2ResponseData.boostGroupInfos) &&
        Objects.equals(this.pagination, starVasGetBoostGroupListV2ResponseData.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boostGroupInfos, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasGetBoostGroupListV2ResponseData {\n");
    sb.append("    boostGroupInfos: ").append(toIndentedString(boostGroupInfos)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
    openapiFields.add("boost_group_infos");
    openapiFields.add("pagination");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("boost_group_infos");
    openapiRequiredFields.add("pagination");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetBoostGroupListV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetBoostGroupListV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetBoostGroupListV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetBoostGroupListV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetBoostGroupListV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarVasGetBoostGroupListV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetBoostGroupListV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetBoostGroupListV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetBoostGroupListV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarVasGetBoostGroupListV2ResponseData
  */
  public static StarVasGetBoostGroupListV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetBoostGroupListV2ResponseData.class);
  }

 /**
  * Convert an instance of StarVasGetBoostGroupListV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

