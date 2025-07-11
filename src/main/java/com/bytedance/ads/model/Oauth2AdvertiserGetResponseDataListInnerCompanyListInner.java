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
 * Oauth2AdvertiserGetResponseDataListInnerCompanyListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class Oauth2AdvertiserGetResponseDataListInnerCompanyListInner {
  public static final String SERIALIZED_NAME_CUSTOMER_COMPANY_ID = "customer_company_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_COMPANY_ID)
  private Long customerCompanyId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_COMPANY_NAME = "customer_company_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_COMPANY_NAME)
  private String customerCompanyName = null;

  public Oauth2AdvertiserGetResponseDataListInnerCompanyListInner() {
  }

  public Oauth2AdvertiserGetResponseDataListInnerCompanyListInner customerCompanyId(Long customerCompanyId) {
    
    this.customerCompanyId = customerCompanyId;
    return this;
  }

   /**
   * 
   * @return customerCompanyId
  **/
  @javax.annotation.Nullable
  public Long getCustomerCompanyId() {
    return customerCompanyId;
  }


  public void setCustomerCompanyId(Long customerCompanyId) {
    this.customerCompanyId = customerCompanyId;
  }


  public Oauth2AdvertiserGetResponseDataListInnerCompanyListInner customerCompanyName(String customerCompanyName) {
    
    this.customerCompanyName = customerCompanyName;
    return this;
  }

   /**
   * 
   * @return customerCompanyName
  **/
  @javax.annotation.Nullable
  public String getCustomerCompanyName() {
    return customerCompanyName;
  }


  public void setCustomerCompanyName(String customerCompanyName) {
    this.customerCompanyName = customerCompanyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Oauth2AdvertiserGetResponseDataListInnerCompanyListInner oauth2AdvertiserGetResponseDataListInnerCompanyListInner = (Oauth2AdvertiserGetResponseDataListInnerCompanyListInner) o;
    return Objects.equals(this.customerCompanyId, oauth2AdvertiserGetResponseDataListInnerCompanyListInner.customerCompanyId) &&
        Objects.equals(this.customerCompanyName, oauth2AdvertiserGetResponseDataListInnerCompanyListInner.customerCompanyName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCompanyId, customerCompanyName);
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
    sb.append("class Oauth2AdvertiserGetResponseDataListInnerCompanyListInner {\n");
    sb.append("    customerCompanyId: ").append(toIndentedString(customerCompanyId)).append("\n");
    sb.append("    customerCompanyName: ").append(toIndentedString(customerCompanyName)).append("\n");
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
    openapiFields.add("customer_company_id");
    openapiFields.add("customer_company_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Oauth2AdvertiserGetResponseDataListInnerCompanyListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Oauth2AdvertiserGetResponseDataListInnerCompanyListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Oauth2AdvertiserGetResponseDataListInnerCompanyListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Oauth2AdvertiserGetResponseDataListInnerCompanyListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<Oauth2AdvertiserGetResponseDataListInnerCompanyListInner>() {
           @Override
           public void write(JsonWriter out, Oauth2AdvertiserGetResponseDataListInnerCompanyListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Oauth2AdvertiserGetResponseDataListInnerCompanyListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Oauth2AdvertiserGetResponseDataListInnerCompanyListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Oauth2AdvertiserGetResponseDataListInnerCompanyListInner
  * @throws IOException if the JSON string is invalid with respect to Oauth2AdvertiserGetResponseDataListInnerCompanyListInner
  */
  public static Oauth2AdvertiserGetResponseDataListInnerCompanyListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Oauth2AdvertiserGetResponseDataListInnerCompanyListInner.class);
  }

 /**
  * Convert an instance of Oauth2AdvertiserGetResponseDataListInnerCompanyListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

