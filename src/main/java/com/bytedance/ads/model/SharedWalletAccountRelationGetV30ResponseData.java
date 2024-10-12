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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-12T16:34:28.931856415+08:00[Asia/Shanghai]")
public class SharedWalletAccountRelationGetV30ResponseData {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_MAIN_WALLET_ID = "main_wallet_id";
  @SerializedName(SERIALIZED_NAME_MAIN_WALLET_ID)
  private Long mainWalletId = null;

  public static final String SERIALIZED_NAME_SUB_WALLET_IDS = "sub_wallet_ids";
  @SerializedName(SERIALIZED_NAME_SUB_WALLET_IDS)
  private List<Long> subWalletIds = null;

  public SharedWalletAccountRelationGetV30ResponseData() {
  }

  public SharedWalletAccountRelationGetV30ResponseData companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 客户公司ID
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public SharedWalletAccountRelationGetV30ResponseData mainWalletId(Long mainWalletId) {
    
    this.mainWalletId = mainWalletId;
    return this;
  }

   /**
   * 共享钱包ID
   * @return mainWalletId
  **/
  @javax.annotation.Nullable
  public Long getMainWalletId() {
    return mainWalletId;
  }


  public void setMainWalletId(Long mainWalletId) {
    this.mainWalletId = mainWalletId;
  }


  public SharedWalletAccountRelationGetV30ResponseData subWalletIds(List<Long> subWalletIds) {
    
    this.subWalletIds = subWalletIds;
    return this;
  }

  public SharedWalletAccountRelationGetV30ResponseData addSubWalletIdsItem(Long subWalletIdsItem) {
    if (this.subWalletIds == null) {
      this.subWalletIds = new ArrayList<>();
    }
    this.subWalletIds.add(subWalletIdsItem);
    return this;
  }

   /**
   * 子钱包ID列表
   * @return subWalletIds
  **/
  @javax.annotation.Nullable
  public List<Long> getSubWalletIds() {
    return subWalletIds;
  }


  public void setSubWalletIds(List<Long> subWalletIds) {
    this.subWalletIds = subWalletIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletAccountRelationGetV30ResponseData sharedWalletAccountRelationGetV30ResponseData = (SharedWalletAccountRelationGetV30ResponseData) o;
    return Objects.equals(this.companyId, sharedWalletAccountRelationGetV30ResponseData.companyId) &&
        Objects.equals(this.mainWalletId, sharedWalletAccountRelationGetV30ResponseData.mainWalletId) &&
        Objects.equals(this.subWalletIds, sharedWalletAccountRelationGetV30ResponseData.subWalletIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, mainWalletId, subWalletIds);
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
    sb.append("class SharedWalletAccountRelationGetV30ResponseData {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    mainWalletId: ").append(toIndentedString(mainWalletId)).append("\n");
    sb.append("    subWalletIds: ").append(toIndentedString(subWalletIds)).append("\n");
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
    openapiFields.add("company_id");
    openapiFields.add("main_wallet_id");
    openapiFields.add("sub_wallet_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletAccountRelationGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletAccountRelationGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletAccountRelationGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletAccountRelationGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletAccountRelationGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, SharedWalletAccountRelationGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletAccountRelationGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletAccountRelationGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletAccountRelationGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to SharedWalletAccountRelationGetV30ResponseData
  */
  public static SharedWalletAccountRelationGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletAccountRelationGetV30ResponseData.class);
  }

 /**
  * Convert an instance of SharedWalletAccountRelationGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

