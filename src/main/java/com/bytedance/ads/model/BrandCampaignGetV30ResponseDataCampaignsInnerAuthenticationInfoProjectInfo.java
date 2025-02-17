/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.38
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
 * 关联合同的信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId = null;

  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo() {
  }

  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 合同名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 关联合同ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo = (BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo) o;
    return Objects.equals(this.name, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo.name) &&
        Objects.equals(this.projectId, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo.projectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, projectId);
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
    sb.append("class BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("project_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo>() {
           @Override
           public void write(JsonWriter out, BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo
  */
  public static BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo.class);
  }

 /**
  * Convert an instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoProjectInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

