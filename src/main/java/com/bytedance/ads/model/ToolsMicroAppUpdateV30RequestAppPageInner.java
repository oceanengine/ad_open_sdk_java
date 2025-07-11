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
import com.bytedance.ads.model.ToolsMicroAppUpdateV30AppPageOperateType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ToolsMicroAppUpdateV30RequestAppPageInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsMicroAppUpdateV30RequestAppPageInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_OPERATE_TYPE = "operate_type";
  @SerializedName(SERIALIZED_NAME_OPERATE_TYPE)
  private ToolsMicroAppUpdateV30AppPageOperateType operateType = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_START_PAGE = "start_page";
  @SerializedName(SERIALIZED_NAME_START_PAGE)
  private String startPage = null;

  public static final String SERIALIZED_NAME_START_PARAM = "start_param";
  @SerializedName(SERIALIZED_NAME_START_PARAM)
  private String startParam = null;

  public ToolsMicroAppUpdateV30RequestAppPageInner() {
  }

  public ToolsMicroAppUpdateV30RequestAppPageInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsMicroAppUpdateV30RequestAppPageInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 
   * @return link
  **/
  @javax.annotation.Nonnull
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public ToolsMicroAppUpdateV30RequestAppPageInner operateType(ToolsMicroAppUpdateV30AppPageOperateType operateType) {
    
    this.operateType = operateType;
    return this;
  }

   /**
   * Get operateType
   * @return operateType
  **/
  @javax.annotation.Nonnull
  public ToolsMicroAppUpdateV30AppPageOperateType getOperateType() {
    return operateType;
  }


  public void setOperateType(ToolsMicroAppUpdateV30AppPageOperateType operateType) {
    this.operateType = operateType;
  }


  public ToolsMicroAppUpdateV30RequestAppPageInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 
   * @return remark
  **/
  @javax.annotation.Nonnull
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsMicroAppUpdateV30RequestAppPageInner startPage(String startPage) {
    
    this.startPage = startPage;
    return this;
  }

   /**
   * 
   * @return startPage
  **/
  @javax.annotation.Nullable
  public String getStartPage() {
    return startPage;
  }


  public void setStartPage(String startPage) {
    this.startPage = startPage;
  }


  public ToolsMicroAppUpdateV30RequestAppPageInner startParam(String startParam) {
    
    this.startParam = startParam;
    return this;
  }

   /**
   * 
   * @return startParam
  **/
  @javax.annotation.Nullable
  public String getStartParam() {
    return startParam;
  }


  public void setStartParam(String startParam) {
    this.startParam = startParam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroAppUpdateV30RequestAppPageInner toolsMicroAppUpdateV30RequestAppPageInner = (ToolsMicroAppUpdateV30RequestAppPageInner) o;
    return Objects.equals(this.id, toolsMicroAppUpdateV30RequestAppPageInner.id) &&
        Objects.equals(this.link, toolsMicroAppUpdateV30RequestAppPageInner.link) &&
        Objects.equals(this.operateType, toolsMicroAppUpdateV30RequestAppPageInner.operateType) &&
        Objects.equals(this.remark, toolsMicroAppUpdateV30RequestAppPageInner.remark) &&
        Objects.equals(this.startPage, toolsMicroAppUpdateV30RequestAppPageInner.startPage) &&
        Objects.equals(this.startParam, toolsMicroAppUpdateV30RequestAppPageInner.startParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, operateType, remark, startPage, startParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroAppUpdateV30RequestAppPageInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    startPage: ").append(toIndentedString(startPage)).append("\n");
    sb.append("    startParam: ").append(toIndentedString(startParam)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("link");
    openapiFields.add("operate_type");
    openapiFields.add("remark");
    openapiFields.add("start_page");
    openapiFields.add("start_param");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("operate_type");
    openapiRequiredFields.add("remark");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroAppUpdateV30RequestAppPageInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroAppUpdateV30RequestAppPageInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroAppUpdateV30RequestAppPageInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroAppUpdateV30RequestAppPageInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroAppUpdateV30RequestAppPageInner>() {
           @Override
           public void write(JsonWriter out, ToolsMicroAppUpdateV30RequestAppPageInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroAppUpdateV30RequestAppPageInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroAppUpdateV30RequestAppPageInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroAppUpdateV30RequestAppPageInner
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroAppUpdateV30RequestAppPageInner
  */
  public static ToolsMicroAppUpdateV30RequestAppPageInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroAppUpdateV30RequestAppPageInner.class);
  }

 /**
  * Convert an instance of ToolsMicroAppUpdateV30RequestAppPageInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

