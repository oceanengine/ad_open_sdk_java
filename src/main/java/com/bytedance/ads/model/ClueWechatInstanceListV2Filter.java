/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.18
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T14:22:53.478937230+08:00[Asia/Shanghai]")
public class ClueWechatInstanceListV2Filter {
  public static final String SERIALIZED_NAME_CREATE_TIME_END = "create_time_end";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_END)
  private String createTimeEnd = null;

  public static final String SERIALIZED_NAME_CREATE_TIME_START = "create_time_start";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME_START)
  private String createTimeStart = null;

  public static final String SERIALIZED_NAME_INSTANCE_IDS = "instance_ids";
  @SerializedName(SERIALIZED_NAME_INSTANCE_IDS)
  private List<Long> instanceIds = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = null;

  public static final String SERIALIZED_NAME_WECHAT_NUMBER = "wechat_number";
  @SerializedName(SERIALIZED_NAME_WECHAT_NUMBER)
  private String wechatNumber = null;

  public ClueWechatInstanceListV2Filter() {
  }

  public ClueWechatInstanceListV2Filter createTimeEnd(String createTimeEnd) {
    
    this.createTimeEnd = createTimeEnd;
    return this;
  }

   /**
   * 创建时间截止日期，格式：2022-07-29
   * @return createTimeEnd
  **/
  @javax.annotation.Nullable
  public String getCreateTimeEnd() {
    return createTimeEnd;
  }


  public void setCreateTimeEnd(String createTimeEnd) {
    this.createTimeEnd = createTimeEnd;
  }


  public ClueWechatInstanceListV2Filter createTimeStart(String createTimeStart) {
    
    this.createTimeStart = createTimeStart;
    return this;
  }

   /**
   * 创建时间起始日期，格式：2022-07-19
   * @return createTimeStart
  **/
  @javax.annotation.Nullable
  public String getCreateTimeStart() {
    return createTimeStart;
  }


  public void setCreateTimeStart(String createTimeStart) {
    this.createTimeStart = createTimeStart;
  }


  public ClueWechatInstanceListV2Filter instanceIds(List<Long> instanceIds) {
    
    this.instanceIds = instanceIds;
    return this;
  }

  public ClueWechatInstanceListV2Filter addInstanceIdsItem(Long instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new ArrayList<>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * 微信号码包IDs，超过100个时报参数错误
   * @return instanceIds
  **/
  @javax.annotation.Nullable
  public List<Long> getInstanceIds() {
    return instanceIds;
  }


  public void setInstanceIds(List<Long> instanceIds) {
    this.instanceIds = instanceIds;
  }


  public ClueWechatInstanceListV2Filter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 微信号码包名称，模糊匹配
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueWechatInstanceListV2Filter page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * 分页，&gt;&#x3D;1，默认值1
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public ClueWechatInstanceListV2Filter pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页大小，1-100，默认值20
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public ClueWechatInstanceListV2Filter wechatNumber(String wechatNumber) {
    
    this.wechatNumber = wechatNumber;
    return this;
  }

   /**
   * 微信号，精确匹配
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
    ClueWechatInstanceListV2Filter clueWechatInstanceListV2Filter = (ClueWechatInstanceListV2Filter) o;
    return Objects.equals(this.createTimeEnd, clueWechatInstanceListV2Filter.createTimeEnd) &&
        Objects.equals(this.createTimeStart, clueWechatInstanceListV2Filter.createTimeStart) &&
        Objects.equals(this.instanceIds, clueWechatInstanceListV2Filter.instanceIds) &&
        Objects.equals(this.name, clueWechatInstanceListV2Filter.name) &&
        Objects.equals(this.page, clueWechatInstanceListV2Filter.page) &&
        Objects.equals(this.pageSize, clueWechatInstanceListV2Filter.pageSize) &&
        Objects.equals(this.wechatNumber, clueWechatInstanceListV2Filter.wechatNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTimeEnd, createTimeStart, instanceIds, name, page, pageSize, wechatNumber);
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
    sb.append("class ClueWechatInstanceListV2Filter {\n");
    sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
    sb.append("    createTimeStart: ").append(toIndentedString(createTimeStart)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("create_time_end");
    openapiFields.add("create_time_start");
    openapiFields.add("instance_ids");
    openapiFields.add("name");
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
       if (!ClueWechatInstanceListV2Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatInstanceListV2Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatInstanceListV2Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatInstanceListV2Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatInstanceListV2Filter>() {
           @Override
           public void write(JsonWriter out, ClueWechatInstanceListV2Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatInstanceListV2Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatInstanceListV2Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatInstanceListV2Filter
  * @throws IOException if the JSON string is invalid with respect to ClueWechatInstanceListV2Filter
  */
  public static ClueWechatInstanceListV2Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatInstanceListV2Filter.class);
  }

 /**
  * Convert an instance of ClueWechatInstanceListV2Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

