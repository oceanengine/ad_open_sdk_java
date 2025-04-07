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
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30DataWalletInfoCommonWalletInfoSharedWalletStatus;
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
 * 通用钱包信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-04-07T17:34:19.910300326+08:00[Asia/Shanghai]")
public class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_SHARED_WALLET_STATUS = "shared_wallet_status";
  @SerializedName(SERIALIZED_NAME_SHARED_WALLET_STATUS)
  private SharedWalletWalletInfoGetV30DataWalletInfoCommonWalletInfoSharedWalletStatus sharedWalletStatus = null;

  public static final String SERIALIZED_NAME_WALLET_DESCRIPTION = "wallet_description";
  @SerializedName(SERIALIZED_NAME_WALLET_DESCRIPTION)
  private String walletDescription = null;

  public static final String SERIALIZED_NAME_WALLET_LABEL = "wallet_label";
  @SerializedName(SERIALIZED_NAME_WALLET_LABEL)
  private List<String> walletLabel = null;

  public static final String SERIALIZED_NAME_WALLET_NAME = "wallet_name";
  @SerializedName(SERIALIZED_NAME_WALLET_NAME)
  private String walletName = null;

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo() {
  }

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 钱包创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo sharedWalletStatus(SharedWalletWalletInfoGetV30DataWalletInfoCommonWalletInfoSharedWalletStatus sharedWalletStatus) {
    
    this.sharedWalletStatus = sharedWalletStatus;
    return this;
  }

   /**
   * Get sharedWalletStatus
   * @return sharedWalletStatus
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30DataWalletInfoCommonWalletInfoSharedWalletStatus getSharedWalletStatus() {
    return sharedWalletStatus;
  }


  public void setSharedWalletStatus(SharedWalletWalletInfoGetV30DataWalletInfoCommonWalletInfoSharedWalletStatus sharedWalletStatus) {
    this.sharedWalletStatus = sharedWalletStatus;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo walletDescription(String walletDescription) {
    
    this.walletDescription = walletDescription;
    return this;
  }

   /**
   * 钱包描述
   * @return walletDescription
  **/
  @javax.annotation.Nullable
  public String getWalletDescription() {
    return walletDescription;
  }


  public void setWalletDescription(String walletDescription) {
    this.walletDescription = walletDescription;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo walletLabel(List<String> walletLabel) {
    
    this.walletLabel = walletLabel;
    return this;
  }

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo addWalletLabelItem(String walletLabelItem) {
    if (this.walletLabel == null) {
      this.walletLabel = new ArrayList<>();
    }
    this.walletLabel.add(walletLabelItem);
    return this;
  }

   /**
   * 钱包标签
   * @return walletLabel
  **/
  @javax.annotation.Nullable
  public List<String> getWalletLabel() {
    return walletLabel;
  }


  public void setWalletLabel(List<String> walletLabel) {
    this.walletLabel = walletLabel;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo walletName(String walletName) {
    
    this.walletName = walletName;
    return this;
  }

   /**
   * 钱包名称
   * @return walletName
  **/
  @javax.annotation.Nullable
  public String getWalletName() {
    return walletName;
  }


  public void setWalletName(String walletName) {
    this.walletName = walletName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo = (SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo) o;
    return Objects.equals(this.createTime, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.createTime) &&
        Objects.equals(this.sharedWalletStatus, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.sharedWalletStatus) &&
        Objects.equals(this.walletDescription, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.walletDescription) &&
        Objects.equals(this.walletLabel, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.walletLabel) &&
        Objects.equals(this.walletName, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.walletName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, sharedWalletStatus, walletDescription, walletLabel, walletName);
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
    sb.append("class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    sharedWalletStatus: ").append(toIndentedString(sharedWalletStatus)).append("\n");
    sb.append("    walletDescription: ").append(toIndentedString(walletDescription)).append("\n");
    sb.append("    walletLabel: ").append(toIndentedString(walletLabel)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("shared_wallet_status");
    openapiFields.add("wallet_description");
    openapiFields.add("wallet_label");
    openapiFields.add("wallet_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo
  */
  public static SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo.class);
  }

 /**
  * Convert an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerCommonWalletInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

