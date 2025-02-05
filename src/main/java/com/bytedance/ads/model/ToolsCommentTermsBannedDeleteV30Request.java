/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.35
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
 * ToolsCommentTermsBannedDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-05T14:42:27.872471551+08:00[Asia/Shanghai]")
public class ToolsCommentTermsBannedDeleteV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_IS_APPLY_TO_ADV = "is_apply_to_adv";
  @SerializedName(SERIALIZED_NAME_IS_APPLY_TO_ADV)
  private Boolean isApplyToAdv = null;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private List<String> terms = null;

  public ToolsCommentTermsBannedDeleteV30Request() {
  }

  public ToolsCommentTermsBannedDeleteV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsCommentTermsBannedDeleteV30Request awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号，当is_apply_to_adv不传或为false时，aweme_id生效
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsCommentTermsBannedDeleteV30Request isApplyToAdv(Boolean isApplyToAdv) {
    
    this.isApplyToAdv = isApplyToAdv;
    return this;
  }

   /**
   * 是否应用于当前账户，当is_apply_to_adv不传或为false时，aweme_id生效
   * @return isApplyToAdv
  **/
  @javax.annotation.Nullable
  public Boolean getIsApplyToAdv() {
    return isApplyToAdv;
  }


  public void setIsApplyToAdv(Boolean isApplyToAdv) {
    this.isApplyToAdv = isApplyToAdv;
  }


  public ToolsCommentTermsBannedDeleteV30Request terms(List<String> terms) {
    
    this.terms = terms;
    return this;
  }

  public ToolsCommentTermsBannedDeleteV30Request addTermsItem(String termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<>();
    }
    this.terms.add(termsItem);
    return this;
  }

   /**
   * 屏蔽词列表，一次最多操作100个词，屏蔽词最大20字
   * @return terms
  **/
  @javax.annotation.Nonnull
  public List<String> getTerms() {
    return terms;
  }


  public void setTerms(List<String> terms) {
    this.terms = terms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentTermsBannedDeleteV30Request toolsCommentTermsBannedDeleteV30Request = (ToolsCommentTermsBannedDeleteV30Request) o;
    return Objects.equals(this.advertiserId, toolsCommentTermsBannedDeleteV30Request.advertiserId) &&
        Objects.equals(this.awemeId, toolsCommentTermsBannedDeleteV30Request.awemeId) &&
        Objects.equals(this.isApplyToAdv, toolsCommentTermsBannedDeleteV30Request.isApplyToAdv) &&
        Objects.equals(this.terms, toolsCommentTermsBannedDeleteV30Request.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, awemeId, isApplyToAdv, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentTermsBannedDeleteV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    isApplyToAdv: ").append(toIndentedString(isApplyToAdv)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("aweme_id");
    openapiFields.add("is_apply_to_adv");
    openapiFields.add("terms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("terms");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentTermsBannedDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentTermsBannedDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentTermsBannedDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentTermsBannedDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentTermsBannedDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsCommentTermsBannedDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentTermsBannedDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentTermsBannedDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentTermsBannedDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentTermsBannedDeleteV30Request
  */
  public static ToolsCommentTermsBannedDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentTermsBannedDeleteV30Request.class);
  }

 /**
  * Convert an instance of ToolsCommentTermsBannedDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

