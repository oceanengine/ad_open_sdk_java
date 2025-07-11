/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.61
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EbpAdvertiserTaskCreateV2AccountSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * EbpAdvertiserTaskCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class EbpAdvertiserTaskCreateV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_SOURCE = "account_source";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SOURCE)
  private EbpAdvertiserTaskCreateV2AccountSource accountSource = null;

  public static final String SERIALIZED_NAME_ENTERPRISE_ORGANIZATION_ID = "enterprise_organization_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ORGANIZATION_ID)
  private Long enterpriseOrganizationId = null;

  public EbpAdvertiserTaskCreateV2Request() {
  }

  public EbpAdvertiserTaskCreateV2Request accountSource(EbpAdvertiserTaskCreateV2AccountSource accountSource) {
    
    this.accountSource = accountSource;
    return this;
  }

   /**
   * Get accountSource
   * @return accountSource
  **/
  @javax.annotation.Nonnull
  public EbpAdvertiserTaskCreateV2AccountSource getAccountSource() {
    return accountSource;
  }


  public void setAccountSource(EbpAdvertiserTaskCreateV2AccountSource accountSource) {
    this.accountSource = accountSource;
  }


  public EbpAdvertiserTaskCreateV2Request enterpriseOrganizationId(Long enterpriseOrganizationId) {
    
    this.enterpriseOrganizationId = enterpriseOrganizationId;
    return this;
  }

   /**
   * 
   * @return enterpriseOrganizationId
  **/
  @javax.annotation.Nonnull
  public Long getEnterpriseOrganizationId() {
    return enterpriseOrganizationId;
  }


  public void setEnterpriseOrganizationId(Long enterpriseOrganizationId) {
    this.enterpriseOrganizationId = enterpriseOrganizationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EbpAdvertiserTaskCreateV2Request ebpAdvertiserTaskCreateV2Request = (EbpAdvertiserTaskCreateV2Request) o;
    return Objects.equals(this.accountSource, ebpAdvertiserTaskCreateV2Request.accountSource) &&
        Objects.equals(this.enterpriseOrganizationId, ebpAdvertiserTaskCreateV2Request.enterpriseOrganizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSource, enterpriseOrganizationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EbpAdvertiserTaskCreateV2Request {\n");
    sb.append("    accountSource: ").append(toIndentedString(accountSource)).append("\n");
    sb.append("    enterpriseOrganizationId: ").append(toIndentedString(enterpriseOrganizationId)).append("\n");
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
    openapiFields.add("account_source");
    openapiFields.add("enterprise_organization_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_source");
    openapiRequiredFields.add("enterprise_organization_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EbpAdvertiserTaskCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EbpAdvertiserTaskCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EbpAdvertiserTaskCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EbpAdvertiserTaskCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EbpAdvertiserTaskCreateV2Request>() {
           @Override
           public void write(JsonWriter out, EbpAdvertiserTaskCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EbpAdvertiserTaskCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EbpAdvertiserTaskCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EbpAdvertiserTaskCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to EbpAdvertiserTaskCreateV2Request
  */
  public static EbpAdvertiserTaskCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EbpAdvertiserTaskCreateV2Request.class);
  }

 /**
  * Convert an instance of EbpAdvertiserTaskCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

