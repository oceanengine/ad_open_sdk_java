/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.41
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageUpdateV2V2AccountType;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageUpdateV2V2Mode;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner;
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
 * ToolsAppManagementExtendPackageUpdateV2V2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class ToolsAppManagementExtendPackageUpdateV2V2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementExtendPackageUpdateV2V2AccountType accountType = null;

  public static final String SERIALIZED_NAME_CHANNEL_INFO_LIST = "channel_info_list";
  @SerializedName(SERIALIZED_NAME_CHANNEL_INFO_LIST)
  private List<ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner> channelInfoList = null;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ToolsAppManagementExtendPackageUpdateV2V2Mode mode = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public ToolsAppManagementExtendPackageUpdateV2V2Request() {
  }

  public ToolsAppManagementExtendPackageUpdateV2V2Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户ID，account_type对应的账户ID
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsAppManagementExtendPackageUpdateV2V2Request accountType(ToolsAppManagementExtendPackageUpdateV2V2AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementExtendPackageUpdateV2V2AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementExtendPackageUpdateV2V2AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsAppManagementExtendPackageUpdateV2V2Request channelInfoList(List<ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner> channelInfoList) {
    
    this.channelInfoList = channelInfoList;
    return this;
  }

  public ToolsAppManagementExtendPackageUpdateV2V2Request addChannelInfoListItem(ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner channelInfoListItem) {
    if (this.channelInfoList == null) {
      this.channelInfoList = new ArrayList<>();
    }
    this.channelInfoList.add(channelInfoListItem);
    return this;
  }

   /**
   * 渠道号信息，（mode&#x3D;List时需指定），一次调用，list的size取值范围1～100
   * @return channelInfoList
  **/
  @javax.annotation.Nullable
  public List<ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner> getChannelInfoList() {
    return channelInfoList;
  }


  public void setChannelInfoList(List<ToolsAppManagementExtendPackageUpdateV2V2RequestChannelInfoListInner> channelInfoList) {
    this.channelInfoList = channelInfoList;
  }


  public ToolsAppManagementExtendPackageUpdateV2V2Request mode(ToolsAppManagementExtendPackageUpdateV2V2Mode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementExtendPackageUpdateV2V2Mode getMode() {
    return mode;
  }


  public void setMode(ToolsAppManagementExtendPackageUpdateV2V2Mode mode) {
    this.mode = mode;
  }


  public ToolsAppManagementExtendPackageUpdateV2V2Request packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 应用包ID，可通过「查询应用信息」接口查询获取
   * @return packageId
  **/
  @javax.annotation.Nonnull
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementExtendPackageUpdateV2V2Request toolsAppManagementExtendPackageUpdateV2V2Request = (ToolsAppManagementExtendPackageUpdateV2V2Request) o;
    return Objects.equals(this.accountId, toolsAppManagementExtendPackageUpdateV2V2Request.accountId) &&
        Objects.equals(this.accountType, toolsAppManagementExtendPackageUpdateV2V2Request.accountType) &&
        Objects.equals(this.channelInfoList, toolsAppManagementExtendPackageUpdateV2V2Request.channelInfoList) &&
        Objects.equals(this.mode, toolsAppManagementExtendPackageUpdateV2V2Request.mode) &&
        Objects.equals(this.packageId, toolsAppManagementExtendPackageUpdateV2V2Request.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, channelInfoList, mode, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementExtendPackageUpdateV2V2Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    channelInfoList: ").append(toIndentedString(channelInfoList)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("channel_info_list");
    openapiFields.add("mode");
    openapiFields.add("package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("package_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementExtendPackageUpdateV2V2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementExtendPackageUpdateV2V2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementExtendPackageUpdateV2V2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementExtendPackageUpdateV2V2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementExtendPackageUpdateV2V2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementExtendPackageUpdateV2V2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementExtendPackageUpdateV2V2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementExtendPackageUpdateV2V2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementExtendPackageUpdateV2V2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementExtendPackageUpdateV2V2Request
  */
  public static ToolsAppManagementExtendPackageUpdateV2V2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementExtendPackageUpdateV2V2Request.class);
  }

 /**
  * Convert an instance of ToolsAppManagementExtendPackageUpdateV2V2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

