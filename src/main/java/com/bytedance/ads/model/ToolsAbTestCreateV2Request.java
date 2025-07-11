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
import com.bytedance.ads.model.ToolsAbTestCreateV2RequestObjectListInner;
import com.bytedance.ads.model.ToolsAbTestCreateV2TestType;
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
 * ToolsAbTestCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ToolsAbTestCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_OBJECT_LIST = "object_list";
  @SerializedName(SERIALIZED_NAME_OBJECT_LIST)
  private List<ToolsAbTestCreateV2RequestObjectListInner> objectList = null;

  public static final String SERIALIZED_NAME_TEST_END_TIME = "test_end_time";
  @SerializedName(SERIALIZED_NAME_TEST_END_TIME)
  private String testEndTime = null;

  public static final String SERIALIZED_NAME_TEST_NAME = "test_name";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName = null;

  public static final String SERIALIZED_NAME_TEST_START_TIME = "test_start_time";
  @SerializedName(SERIALIZED_NAME_TEST_START_TIME)
  private String testStartTime = null;

  public static final String SERIALIZED_NAME_TEST_TYPE = "test_type";
  @SerializedName(SERIALIZED_NAME_TEST_TYPE)
  private ToolsAbTestCreateV2TestType testType = null;

  public ToolsAbTestCreateV2Request() {
  }

  public ToolsAbTestCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAbTestCreateV2Request objectList(List<ToolsAbTestCreateV2RequestObjectListInner> objectList) {
    
    this.objectList = objectList;
    return this;
  }

  public ToolsAbTestCreateV2Request addObjectListItem(ToolsAbTestCreateV2RequestObjectListInner objectListItem) {
    if (this.objectList == null) {
      this.objectList = new ArrayList<>();
    }
    this.objectList.add(objectListItem);
    return this;
  }

   /**
   * 实验对象列表
   * @return objectList
  **/
  @javax.annotation.Nonnull
  public List<ToolsAbTestCreateV2RequestObjectListInner> getObjectList() {
    return objectList;
  }


  public void setObjectList(List<ToolsAbTestCreateV2RequestObjectListInner> objectList) {
    this.objectList = objectList;
  }


  public ToolsAbTestCreateV2Request testEndTime(String testEndTime) {
    
    this.testEndTime = testEndTime;
    return this;
  }

   /**
   * 实验结束时间，格式为：\&quot;2020-12-25 07:12:08\&quot;，
   * @return testEndTime
  **/
  @javax.annotation.Nonnull
  public String getTestEndTime() {
    return testEndTime;
  }


  public void setTestEndTime(String testEndTime) {
    this.testEndTime = testEndTime;
  }


  public ToolsAbTestCreateV2Request testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * 实验名称，最多100个字符，中文算两个字符，不支持emoji，不支持与现有实验重名。
   * @return testName
  **/
  @javax.annotation.Nonnull
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public ToolsAbTestCreateV2Request testStartTime(String testStartTime) {
    
    this.testStartTime = testStartTime;
    return this;
  }

   /**
   * 实验开始时间，格式为：\&quot;2020-12-25 07:12:08\&quot;，开始时间不能早于当前时间。
   * @return testStartTime
  **/
  @javax.annotation.Nonnull
  public String getTestStartTime() {
    return testStartTime;
  }


  public void setTestStartTime(String testStartTime) {
    this.testStartTime = testStartTime;
  }


  public ToolsAbTestCreateV2Request testType(ToolsAbTestCreateV2TestType testType) {
    
    this.testType = testType;
    return this;
  }

   /**
   * Get testType
   * @return testType
  **/
  @javax.annotation.Nonnull
  public ToolsAbTestCreateV2TestType getTestType() {
    return testType;
  }


  public void setTestType(ToolsAbTestCreateV2TestType testType) {
    this.testType = testType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestCreateV2Request toolsAbTestCreateV2Request = (ToolsAbTestCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsAbTestCreateV2Request.advertiserId) &&
        Objects.equals(this.objectList, toolsAbTestCreateV2Request.objectList) &&
        Objects.equals(this.testEndTime, toolsAbTestCreateV2Request.testEndTime) &&
        Objects.equals(this.testName, toolsAbTestCreateV2Request.testName) &&
        Objects.equals(this.testStartTime, toolsAbTestCreateV2Request.testStartTime) &&
        Objects.equals(this.testType, toolsAbTestCreateV2Request.testType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, objectList, testEndTime, testName, testStartTime, testType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAbTestCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    objectList: ").append(toIndentedString(objectList)).append("\n");
    sb.append("    testEndTime: ").append(toIndentedString(testEndTime)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    testStartTime: ").append(toIndentedString(testStartTime)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("object_list");
    openapiFields.add("test_end_time");
    openapiFields.add("test_name");
    openapiFields.add("test_start_time");
    openapiFields.add("test_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("object_list");
    openapiRequiredFields.add("test_end_time");
    openapiRequiredFields.add("test_name");
    openapiRequiredFields.add("test_start_time");
    openapiRequiredFields.add("test_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestCreateV2Request
  */
  public static ToolsAbTestCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsAbTestCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

