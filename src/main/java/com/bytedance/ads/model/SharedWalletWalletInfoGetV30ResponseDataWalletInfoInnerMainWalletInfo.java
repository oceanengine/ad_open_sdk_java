/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.42
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRange;
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
 * 共享钱包(大钱包)信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_MAIN_SHARED_RANGE = "main_shared_range";
  @SerializedName(SERIALIZED_NAME_MAIN_SHARED_RANGE)
  private SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRange mainSharedRange = null;

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo() {
  }

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 公司ID
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo mainSharedRange(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRange mainSharedRange) {
    
    this.mainSharedRange = mainSharedRange;
    return this;
  }

   /**
   * Get mainSharedRange
   * @return mainSharedRange
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRange getMainSharedRange() {
    return mainSharedRange;
  }


  public void setMainSharedRange(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRange mainSharedRange) {
    this.mainSharedRange = mainSharedRange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo = (SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo) o;
    return Objects.equals(this.companyId, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo.companyId) &&
        Objects.equals(this.mainSharedRange, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo.mainSharedRange);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, mainSharedRange);
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
    sb.append("class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    mainSharedRange: ").append(toIndentedString(mainSharedRange)).append("\n");
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
    openapiFields.add("main_shared_range");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo
  */
  public static SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo.class);
  }

 /**
  * Convert an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

