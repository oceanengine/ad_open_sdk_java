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
 * 招商单
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-12-26T15:05:57.295569070+08:00[Asia/Shanghai]")
public class BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo {
  public static final String SERIALIZED_NAME_INTENTION_ID = "intention_id";
  @SerializedName(SERIALIZED_NAME_INTENTION_ID)
  private Long intentionId = null;

  public static final String SERIALIZED_NAME_INTENTION_NAME = "intention_name";
  @SerializedName(SERIALIZED_NAME_INTENTION_NAME)
  private String intentionName = null;

  public static final String SERIALIZED_NAME_INTENTION_NO = "intention_no";
  @SerializedName(SERIALIZED_NAME_INTENTION_NO)
  private String intentionNo = null;

  public BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo() {
  }

  public BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo intentionId(Long intentionId) {
    
    this.intentionId = intentionId;
    return this;
  }

   /**
   * 招商意向单ID
   * @return intentionId
  **/
  @javax.annotation.Nullable
  public Long getIntentionId() {
    return intentionId;
  }


  public void setIntentionId(Long intentionId) {
    this.intentionId = intentionId;
  }


  public BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo intentionName(String intentionName) {
    
    this.intentionName = intentionName;
    return this;
  }

   /**
   * 招商意向单名称
   * @return intentionName
  **/
  @javax.annotation.Nullable
  public String getIntentionName() {
    return intentionName;
  }


  public void setIntentionName(String intentionName) {
    this.intentionName = intentionName;
  }


  public BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo intentionNo(String intentionNo) {
    
    this.intentionNo = intentionNo;
    return this;
  }

   /**
   * 招商意向单编号
   * @return intentionNo
  **/
  @javax.annotation.Nullable
  public String getIntentionNo() {
    return intentionNo;
  }


  public void setIntentionNo(String intentionNo) {
    this.intentionNo = intentionNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo brandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo = (BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo) o;
    return Objects.equals(this.intentionId, brandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo.intentionId) &&
        Objects.equals(this.intentionName, brandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo.intentionName) &&
        Objects.equals(this.intentionNo, brandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo.intentionNo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(intentionId, intentionName, intentionNo);
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
    sb.append("class BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo {\n");
    sb.append("    intentionId: ").append(toIndentedString(intentionId)).append("\n");
    sb.append("    intentionName: ").append(toIndentedString(intentionName)).append("\n");
    sb.append("    intentionNo: ").append(toIndentedString(intentionNo)).append("\n");
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
    openapiFields.add("intention_id");
    openapiFields.add("intention_name");
    openapiFields.add("intention_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo>() {
           @Override
           public void write(JsonWriter out, BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo
  * @throws IOException if the JSON string is invalid with respect to BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo
  */
  public static BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo.class);
  }

 /**
  * Convert an instance of BrandOrderListV30ResponseDataOrdersInnerMerchantIntentionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

