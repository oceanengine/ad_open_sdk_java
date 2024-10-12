/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.24
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner;
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
 * CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner {
  public static final String SERIALIZED_NAME_SUB_WALLET_ID = "sub_wallet_id";
  @SerializedName(SERIALIZED_NAME_SUB_WALLET_ID)
  private Long subWalletId = null;

  public static final String SERIALIZED_NAME_TRANSFER_CAPITAL_DETAIL_LIST = "transfer_capital_detail_list";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CAPITAL_DETAIL_LIST)
  private List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner> transferCapitalDetailList = null;

  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner() {
  }

  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner subWalletId(Long subWalletId) {
    
    this.subWalletId = subWalletId;
    return this;
  }

   /**
   * 申请转账的小钱包id
   * @return subWalletId
  **/
  @javax.annotation.Nonnull
  public Long getSubWalletId() {
    return subWalletId;
  }


  public void setSubWalletId(Long subWalletId) {
    this.subWalletId = subWalletId;
  }


  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner transferCapitalDetailList(List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner> transferCapitalDetailList) {
    
    this.transferCapitalDetailList = transferCapitalDetailList;
    return this;
  }

  public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner addTransferCapitalDetailListItem(CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner transferCapitalDetailListItem) {
    if (this.transferCapitalDetailList == null) {
      this.transferCapitalDetailList = new ArrayList<>();
    }
    this.transferCapitalDetailList.add(transferCapitalDetailListItem);
    return this;
  }

   /**
   * 申请转账资金列表
   * @return transferCapitalDetailList
  **/
  @javax.annotation.Nonnull
  public List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner> getTransferCapitalDetailList() {
    return transferCapitalDetailList;
  }


  public void setTransferCapitalDetailList(List<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInnerTransferCapitalDetailListInner> transferCapitalDetailList) {
    this.transferCapitalDetailList = transferCapitalDetailList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner cgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner = (CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner) o;
    return Objects.equals(this.subWalletId, cgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner.subWalletId) &&
        Objects.equals(this.transferCapitalDetailList, cgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner.transferCapitalDetailList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subWalletId, transferCapitalDetailList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner {\n");
    sb.append("    subWalletId: ").append(toIndentedString(subWalletId)).append("\n");
    sb.append("    transferCapitalDetailList: ").append(toIndentedString(transferCapitalDetailList)).append("\n");
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
    openapiFields.add("sub_wallet_id");
    openapiFields.add("transfer_capital_detail_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sub_wallet_id");
    openapiRequiredFields.add("transfer_capital_detail_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner
  */
  public static CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferCreateV30RequestTargetWalletDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

