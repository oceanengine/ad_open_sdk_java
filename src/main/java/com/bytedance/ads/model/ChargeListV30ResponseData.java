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
import com.bytedance.ads.model.ChargeListV30ResponseDataChargeListInner;
import com.bytedance.ads.model.ChargeListV30ResponseDataPageInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ChargeListV30ResponseData {
  public static final String SERIALIZED_NAME_CHARGE_LIST = "charge_list";
  @SerializedName(SERIALIZED_NAME_CHARGE_LIST)
  private List<ChargeListV30ResponseDataChargeListInner> chargeList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ChargeListV30ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Long totalAmount = null;

  public static final String SERIALIZED_NAME_TOTAL_CANCEL_AMOUNT = "total_cancel_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_CANCEL_AMOUNT)
  private Long totalCancelAmount = null;

  public static final String SERIALIZED_NAME_TOTAL_CHARGE_AMOUNT = "total_charge_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_CHARGE_AMOUNT)
  private Long totalChargeAmount = null;

  public ChargeListV30ResponseData() {
  }

  public ChargeListV30ResponseData chargeList(List<ChargeListV30ResponseDataChargeListInner> chargeList) {
    
    this.chargeList = chargeList;
    return this;
  }

  public ChargeListV30ResponseData addChargeListItem(ChargeListV30ResponseDataChargeListInner chargeListItem) {
    if (this.chargeList == null) {
      this.chargeList = new ArrayList<>();
    }
    this.chargeList.add(chargeListItem);
    return this;
  }

   /**
   * 充值信息列表
   * @return chargeList
  **/
  @javax.annotation.Nullable
  public List<ChargeListV30ResponseDataChargeListInner> getChargeList() {
    return chargeList;
  }


  public void setChargeList(List<ChargeListV30ResponseDataChargeListInner> chargeList) {
    this.chargeList = chargeList;
  }


  public ChargeListV30ResponseData pageInfo(ChargeListV30ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ChargeListV30ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ChargeListV30ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ChargeListV30ResponseData totalAmount(Long totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 充值行总充值金额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public Long getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }


  public ChargeListV30ResponseData totalCancelAmount(Long totalCancelAmount) {
    
    this.totalCancelAmount = totalCancelAmount;
    return this;
  }

   /**
   * 充值行已撤销金额
   * @return totalCancelAmount
  **/
  @javax.annotation.Nullable
  public Long getTotalCancelAmount() {
    return totalCancelAmount;
  }


  public void setTotalCancelAmount(Long totalCancelAmount) {
    this.totalCancelAmount = totalCancelAmount;
  }


  public ChargeListV30ResponseData totalChargeAmount(Long totalChargeAmount) {
    
    this.totalChargeAmount = totalChargeAmount;
    return this;
  }

   /**
   * 总的充值金额，充值行总充值金额-充值行已撤销金额，单位元
   * @return totalChargeAmount
  **/
  @javax.annotation.Nullable
  public Long getTotalChargeAmount() {
    return totalChargeAmount;
  }


  public void setTotalChargeAmount(Long totalChargeAmount) {
    this.totalChargeAmount = totalChargeAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeListV30ResponseData chargeListV30ResponseData = (ChargeListV30ResponseData) o;
    return Objects.equals(this.chargeList, chargeListV30ResponseData.chargeList) &&
        Objects.equals(this.pageInfo, chargeListV30ResponseData.pageInfo) &&
        Objects.equals(this.totalAmount, chargeListV30ResponseData.totalAmount) &&
        Objects.equals(this.totalCancelAmount, chargeListV30ResponseData.totalCancelAmount) &&
        Objects.equals(this.totalChargeAmount, chargeListV30ResponseData.totalChargeAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeList, pageInfo, totalAmount, totalCancelAmount, totalChargeAmount);
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
    sb.append("class ChargeListV30ResponseData {\n");
    sb.append("    chargeList: ").append(toIndentedString(chargeList)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalCancelAmount: ").append(toIndentedString(totalCancelAmount)).append("\n");
    sb.append("    totalChargeAmount: ").append(toIndentedString(totalChargeAmount)).append("\n");
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
    openapiFields.add("charge_list");
    openapiFields.add("page_info");
    openapiFields.add("total_amount");
    openapiFields.add("total_cancel_amount");
    openapiFields.add("total_charge_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargeListV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargeListV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargeListV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargeListV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargeListV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ChargeListV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargeListV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChargeListV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChargeListV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ChargeListV30ResponseData
  */
  public static ChargeListV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargeListV30ResponseData.class);
  }

 /**
  * Convert an instance of ChargeListV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

