/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-18T14:56:34.999232895+08:00[PRC]")
public class CgTransferQueryTransferBalanceV30ResponseData {
  public static final String SERIALIZED_NAME_ACCONT_AMOUNT_DETAIL_LIST = "accont_amount_detail_list";
  @SerializedName(SERIALIZED_NAME_ACCONT_AMOUNT_DETAIL_LIST)
  private List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner> accontAmountDetailList = null;

  public CgTransferQueryTransferBalanceV30ResponseData() {
  }

  public CgTransferQueryTransferBalanceV30ResponseData accontAmountDetailList(List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner> accontAmountDetailList) {
    
    this.accontAmountDetailList = accontAmountDetailList;
    return this;
  }

  public CgTransferQueryTransferBalanceV30ResponseData addAccontAmountDetailListItem(CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner accontAmountDetailListItem) {
    if (this.accontAmountDetailList == null) {
      this.accontAmountDetailList = new ArrayList<>();
    }
    this.accontAmountDetailList.add(accontAmountDetailListItem);
    return this;
  }

   /**
   * 账户金额列表
   * @return accontAmountDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner> getAccontAmountDetailList() {
    return accontAmountDetailList;
  }


  public void setAccontAmountDetailList(List<CgTransferQueryTransferBalanceV30ResponseDataAccontAmountDetailListInner> accontAmountDetailList) {
    this.accontAmountDetailList = accontAmountDetailList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferQueryTransferBalanceV30ResponseData cgTransferQueryTransferBalanceV30ResponseData = (CgTransferQueryTransferBalanceV30ResponseData) o;
    return Objects.equals(this.accontAmountDetailList, cgTransferQueryTransferBalanceV30ResponseData.accontAmountDetailList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accontAmountDetailList);
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
    sb.append("class CgTransferQueryTransferBalanceV30ResponseData {\n");
    sb.append("    accontAmountDetailList: ").append(toIndentedString(accontAmountDetailList)).append("\n");
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
    openapiFields.add("accont_amount_detail_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferQueryTransferBalanceV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferQueryTransferBalanceV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferQueryTransferBalanceV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferQueryTransferBalanceV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferQueryTransferBalanceV30ResponseData>() {
           @Override
           public void write(JsonWriter out, CgTransferQueryTransferBalanceV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferQueryTransferBalanceV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferQueryTransferBalanceV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferQueryTransferBalanceV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to CgTransferQueryTransferBalanceV30ResponseData
  */
  public static CgTransferQueryTransferBalanceV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferQueryTransferBalanceV30ResponseData.class);
  }

 /**
  * Convert an instance of CgTransferQueryTransferBalanceV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

