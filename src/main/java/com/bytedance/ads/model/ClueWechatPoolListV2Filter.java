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
import com.bytedance.ads.model.ClueWechatPoolListV2FilterAuditStatus;
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
public class ClueWechatPoolListV2Filter {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private List<ClueWechatPoolListV2FilterAuditStatus> auditStatus = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = null;

  public static final String SERIALIZED_NAME_WECHAT_NUMBER = "wechat_number";
  @SerializedName(SERIALIZED_NAME_WECHAT_NUMBER)
  private String wechatNumber = null;

  public ClueWechatPoolListV2Filter() {
  }

  public ClueWechatPoolListV2Filter auditStatus(List<ClueWechatPoolListV2FilterAuditStatus> auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

  public ClueWechatPoolListV2Filter addAuditStatusItem(ClueWechatPoolListV2FilterAuditStatus auditStatusItem) {
    if (this.auditStatus == null) {
      this.auditStatus = new ArrayList<>();
    }
    this.auditStatus.add(auditStatusItem);
    return this;
  }

   /**
   * 审核状态，0审核中、1审核拒绝、2审核通过
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public List<ClueWechatPoolListV2FilterAuditStatus> getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(List<ClueWechatPoolListV2FilterAuditStatus> auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ClueWechatPoolListV2Filter instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 微信号码包ID
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueWechatPoolListV2Filter nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 微信昵称，模糊匹配
   * @return nickName
  **/
  @javax.annotation.Nullable
  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public ClueWechatPoolListV2Filter page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * 分页，&gt;&#x3D;1，默认值1
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public ClueWechatPoolListV2Filter pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页大小，1-100，默认值20
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ClueWechatPoolListV2Filter wechatNumber(String wechatNumber) {
    
    this.wechatNumber = wechatNumber;
    return this;
  }

   /**
   * 微信号，模糊匹配
   * @return wechatNumber
  **/
  @javax.annotation.Nullable
  public String getWechatNumber() {
    return wechatNumber;
  }


  public void setWechatNumber(String wechatNumber) {
    this.wechatNumber = wechatNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatPoolListV2Filter clueWechatPoolListV2Filter = (ClueWechatPoolListV2Filter) o;
    return Objects.equals(this.auditStatus, clueWechatPoolListV2Filter.auditStatus) &&
        Objects.equals(this.instanceId, clueWechatPoolListV2Filter.instanceId) &&
        Objects.equals(this.nickName, clueWechatPoolListV2Filter.nickName) &&
        Objects.equals(this.page, clueWechatPoolListV2Filter.page) &&
        Objects.equals(this.pageSize, clueWechatPoolListV2Filter.pageSize) &&
        Objects.equals(this.wechatNumber, clueWechatPoolListV2Filter.wechatNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, instanceId, nickName, page, pageSize, wechatNumber);
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
    sb.append("class ClueWechatPoolListV2Filter {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    wechatNumber: ").append(toIndentedString(wechatNumber)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("instance_id");
    openapiFields.add("nick_name");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("wechat_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatPoolListV2Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatPoolListV2Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatPoolListV2Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatPoolListV2Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatPoolListV2Filter>() {
           @Override
           public void write(JsonWriter out, ClueWechatPoolListV2Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatPoolListV2Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatPoolListV2Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatPoolListV2Filter
  * @throws IOException if the JSON string is invalid with respect to ClueWechatPoolListV2Filter
  */
  public static ClueWechatPoolListV2Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatPoolListV2Filter.class);
  }

 /**
  * Convert an instance of ClueWechatPoolListV2Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

