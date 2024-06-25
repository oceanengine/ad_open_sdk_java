/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:43:06.795378168+08:00[PRC]")
public class BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner {
  public static final String SERIALIZED_NAME_ACCESSORY_TYPE = "accessory_type";
  @SerializedName(SERIALIZED_NAME_ACCESSORY_TYPE)
  private Long accessoryType = null;

  public static final String SERIALIZED_NAME_CREATE_USER_NAME = "create_user_name";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_NAME)
  private String createUserName = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OBJECT_KEY = "object_key";
  @SerializedName(SERIALIZED_NAME_OBJECT_KEY)
  private String objectKey = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner() {
  }

  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner accessoryType(Long accessoryType) {
    
    this.accessoryType = accessoryType;
    return this;
  }

   /**
   * 附件类型
   * @return accessoryType
  **/
  @javax.annotation.Nullable
  public Long getAccessoryType() {
    return accessoryType;
  }


  public void setAccessoryType(Long accessoryType) {
    this.accessoryType = accessoryType;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner createUserName(String createUserName) {
    
    this.createUserName = createUserName;
    return this;
  }

   /**
   * 创建人的账号名称
   * @return createUserName
  **/
  @javax.annotation.Nullable
  public String getCreateUserName() {
    return createUserName;
  }


  public void setCreateUserName(String createUserName) {
    this.createUserName = createUserName;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 文件的下载链接供外网使用
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 附件名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner objectKey(String objectKey) {
    
    this.objectKey = objectKey;
    return this;
  }

   /**
   * 附件key
   * @return objectKey
  **/
  @javax.annotation.Nullable
  public String getObjectKey() {
    return objectKey;
  }


  public void setObjectKey(String objectKey) {
    this.objectKey = objectKey;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 附件备注
   * @return remark
  **/
  @javax.annotation.Nullable
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 附件地址
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner = (BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner) o;
    return Objects.equals(this.accessoryType, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.accessoryType) &&
        Objects.equals(this.createUserName, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.createUserName) &&
        Objects.equals(this.downloadUrl, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.downloadUrl) &&
        Objects.equals(this.name, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.name) &&
        Objects.equals(this.objectKey, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.objectKey) &&
        Objects.equals(this.remark, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.remark) &&
        Objects.equals(this.url, brandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessoryType, createUserName, downloadUrl, name, objectKey, remark, url);
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
    sb.append("class BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner {\n");
    sb.append("    accessoryType: ").append(toIndentedString(accessoryType)).append("\n");
    sb.append("    createUserName: ").append(toIndentedString(createUserName)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("accessory_type");
    openapiFields.add("create_user_name");
    openapiFields.add("download_url");
    openapiFields.add("name");
    openapiFields.add("object_key");
    openapiFields.add("remark");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accessory_type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("object_key");
    openapiRequiredFields.add("url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner>() {
           @Override
           public void write(JsonWriter out, BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner
  * @throws IOException if the JSON string is invalid with respect to BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner
  */
  public static BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner.class);
  }

 /**
  * Convert an instance of BrandCampaignGetV30ResponseDataCampaignsInnerAuthenticationInfoAccessoryInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

