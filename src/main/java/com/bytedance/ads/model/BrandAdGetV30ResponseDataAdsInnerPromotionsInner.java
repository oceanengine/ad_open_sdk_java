/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
 * BrandAdGetV30ResponseDataAdsInnerPromotionsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInnerPromotionsInner {
  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private Long policyId = null;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName = null;

  public static final String SERIALIZED_NAME_POLICY_NO = "policy_no";
  @SerializedName(SERIALIZED_NAME_POLICY_NO)
  private String policyNo = null;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType = null;

  public BrandAdGetV30ResponseDataAdsInnerPromotionsInner() {
  }

  public BrandAdGetV30ResponseDataAdsInnerPromotionsInner policyId(Long policyId) {
    
    this.policyId = policyId;
    return this;
  }

   /**
   * 政策ID
   * @return policyId
  **/
  @javax.annotation.Nullable
  public Long getPolicyId() {
    return policyId;
  }


  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }


  public BrandAdGetV30ResponseDataAdsInnerPromotionsInner policyName(String policyName) {
    
    this.policyName = policyName;
    return this;
  }

   /**
   * 政策名称
   * @return policyName
  **/
  @javax.annotation.Nullable
  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public BrandAdGetV30ResponseDataAdsInnerPromotionsInner policyNo(String policyNo) {
    
    this.policyNo = policyNo;
    return this;
  }

   /**
   * 政策编号
   * @return policyNo
  **/
  @javax.annotation.Nullable
  public String getPolicyNo() {
    return policyNo;
  }


  public void setPolicyNo(String policyNo) {
    this.policyNo = policyNo;
  }


  public BrandAdGetV30ResponseDataAdsInnerPromotionsInner policyType(String policyType) {
    
    this.policyType = policyType;
    return this;
  }

   /**
   * 政策类型
   * @return policyType
  **/
  @javax.annotation.Nullable
  public String getPolicyType() {
    return policyType;
  }


  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerPromotionsInner brandAdGetV30ResponseDataAdsInnerPromotionsInner = (BrandAdGetV30ResponseDataAdsInnerPromotionsInner) o;
    return Objects.equals(this.policyId, brandAdGetV30ResponseDataAdsInnerPromotionsInner.policyId) &&
        Objects.equals(this.policyName, brandAdGetV30ResponseDataAdsInnerPromotionsInner.policyName) &&
        Objects.equals(this.policyNo, brandAdGetV30ResponseDataAdsInnerPromotionsInner.policyNo) &&
        Objects.equals(this.policyType, brandAdGetV30ResponseDataAdsInnerPromotionsInner.policyType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyName, policyNo, policyType);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerPromotionsInner {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyNo: ").append(toIndentedString(policyNo)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
    openapiFields.add("policy_id");
    openapiFields.add("policy_name");
    openapiFields.add("policy_no");
    openapiFields.add("policy_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerPromotionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerPromotionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerPromotionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerPromotionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerPromotionsInner>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerPromotionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerPromotionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerPromotionsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerPromotionsInner
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerPromotionsInner
  */
  public static BrandAdGetV30ResponseDataAdsInnerPromotionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerPromotionsInner.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerPromotionsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

