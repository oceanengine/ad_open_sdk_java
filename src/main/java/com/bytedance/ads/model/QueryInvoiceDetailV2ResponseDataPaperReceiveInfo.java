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
 * 纸票接收信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class QueryInvoiceDetailV2ResponseDataPaperReceiveInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone = null;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient = null;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region = null;

  public QueryInvoiceDetailV2ResponseDataPaperReceiveInfo() {
  }

  public QueryInvoiceDetailV2ResponseDataPaperReceiveInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 收件地址
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public QueryInvoiceDetailV2ResponseDataPaperReceiveInfo phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 联系电话
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public QueryInvoiceDetailV2ResponseDataPaperReceiveInfo recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * 收件人
   * @return recipient
  **/
  @javax.annotation.Nullable
  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public QueryInvoiceDetailV2ResponseDataPaperReceiveInfo region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * 省市区
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInvoiceDetailV2ResponseDataPaperReceiveInfo queryInvoiceDetailV2ResponseDataPaperReceiveInfo = (QueryInvoiceDetailV2ResponseDataPaperReceiveInfo) o;
    return Objects.equals(this.address, queryInvoiceDetailV2ResponseDataPaperReceiveInfo.address) &&
        Objects.equals(this.phone, queryInvoiceDetailV2ResponseDataPaperReceiveInfo.phone) &&
        Objects.equals(this.recipient, queryInvoiceDetailV2ResponseDataPaperReceiveInfo.recipient) &&
        Objects.equals(this.region, queryInvoiceDetailV2ResponseDataPaperReceiveInfo.region);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, phone, recipient, region);
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
    sb.append("class QueryInvoiceDetailV2ResponseDataPaperReceiveInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("phone");
    openapiFields.add("recipient");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryInvoiceDetailV2ResponseDataPaperReceiveInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryInvoiceDetailV2ResponseDataPaperReceiveInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryInvoiceDetailV2ResponseDataPaperReceiveInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryInvoiceDetailV2ResponseDataPaperReceiveInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryInvoiceDetailV2ResponseDataPaperReceiveInfo>() {
           @Override
           public void write(JsonWriter out, QueryInvoiceDetailV2ResponseDataPaperReceiveInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryInvoiceDetailV2ResponseDataPaperReceiveInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryInvoiceDetailV2ResponseDataPaperReceiveInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryInvoiceDetailV2ResponseDataPaperReceiveInfo
  * @throws IOException if the JSON string is invalid with respect to QueryInvoiceDetailV2ResponseDataPaperReceiveInfo
  */
  public static QueryInvoiceDetailV2ResponseDataPaperReceiveInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryInvoiceDetailV2ResponseDataPaperReceiveInfo.class);
  }

 /**
  * Convert an instance of QueryInvoiceDetailV2ResponseDataPaperReceiveInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

