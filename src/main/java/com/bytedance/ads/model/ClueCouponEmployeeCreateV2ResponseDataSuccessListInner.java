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
import com.bytedance.ads.model.ClueCouponEmployeeCreateV2DataSuccessListUserType;
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
 * ClueCouponEmployeeCreateV2ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-17T20:51:14.409674522+08:00[Asia/Shanghai]")
public class ClueCouponEmployeeCreateV2ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private Long storeId = null;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId = null;

  public static final String SERIALIZED_NAME_USER_TYPE = "user_type";
  @SerializedName(SERIALIZED_NAME_USER_TYPE)
  private ClueCouponEmployeeCreateV2DataSuccessListUserType userType = null;

  public ClueCouponEmployeeCreateV2ResponseDataSuccessListInner() {
  }

  public ClueCouponEmployeeCreateV2ResponseDataSuccessListInner storeId(Long storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 
   * @return storeId
  **/
  @javax.annotation.Nullable
  public Long getStoreId() {
    return storeId;
  }


  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }


  public ClueCouponEmployeeCreateV2ResponseDataSuccessListInner userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @javax.annotation.Nullable
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public ClueCouponEmployeeCreateV2ResponseDataSuccessListInner userType(ClueCouponEmployeeCreateV2DataSuccessListUserType userType) {
    
    this.userType = userType;
    return this;
  }

   /**
   * Get userType
   * @return userType
  **/
  @javax.annotation.Nullable
  public ClueCouponEmployeeCreateV2DataSuccessListUserType getUserType() {
    return userType;
  }


  public void setUserType(ClueCouponEmployeeCreateV2DataSuccessListUserType userType) {
    this.userType = userType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponEmployeeCreateV2ResponseDataSuccessListInner clueCouponEmployeeCreateV2ResponseDataSuccessListInner = (ClueCouponEmployeeCreateV2ResponseDataSuccessListInner) o;
    return Objects.equals(this.storeId, clueCouponEmployeeCreateV2ResponseDataSuccessListInner.storeId) &&
        Objects.equals(this.userId, clueCouponEmployeeCreateV2ResponseDataSuccessListInner.userId) &&
        Objects.equals(this.userType, clueCouponEmployeeCreateV2ResponseDataSuccessListInner.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, userId, userType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponEmployeeCreateV2ResponseDataSuccessListInner {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
    openapiFields.add("store_id");
    openapiFields.add("user_id");
    openapiFields.add("user_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponEmployeeCreateV2ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponEmployeeCreateV2ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponEmployeeCreateV2ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponEmployeeCreateV2ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponEmployeeCreateV2ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponEmployeeCreateV2ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponEmployeeCreateV2ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponEmployeeCreateV2ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponEmployeeCreateV2ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponEmployeeCreateV2ResponseDataSuccessListInner
  */
  public static ClueCouponEmployeeCreateV2ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponEmployeeCreateV2ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of ClueCouponEmployeeCreateV2ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

