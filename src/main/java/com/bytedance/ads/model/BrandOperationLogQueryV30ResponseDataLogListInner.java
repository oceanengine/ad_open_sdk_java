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
 * BrandOperationLogQueryV30ResponseDataLogListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class BrandOperationLogQueryV30ResponseDataLogListInner {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<String> content = null;

  public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private Long objectId = null;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType = null;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator = null;

  public static final String SERIALIZED_NAME_OPT_IP = "opt_ip";
  @SerializedName(SERIALIZED_NAME_OPT_IP)
  private String optIp = null;

  public static final String SERIALIZED_NAME_OPT_TIME = "opt_time";
  @SerializedName(SERIALIZED_NAME_OPT_TIME)
  private String optTime = null;

  public static final String SERIALIZED_NAME_OPT_TYPE = "opt_type";
  @SerializedName(SERIALIZED_NAME_OPT_TYPE)
  private String optType = null;

  public BrandOperationLogQueryV30ResponseDataLogListInner() {
  }

  public BrandOperationLogQueryV30ResponseDataLogListInner content(List<String> content) {
    
    this.content = content;
    return this;
  }

  public BrandOperationLogQueryV30ResponseDataLogListInner addContentItem(String contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * 操作内容
   * @return content
  **/
  @javax.annotation.Nullable
  public List<String> getContent() {
    return content;
  }


  public void setContent(List<String> content) {
    this.content = content;
  }


  public BrandOperationLogQueryV30ResponseDataLogListInner objectId(Long objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * 操作对象ID
   * @return objectId
  **/
  @javax.annotation.Nullable
  public Long getObjectId() {
    return objectId;
  }


  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }


  public BrandOperationLogQueryV30ResponseDataLogListInner objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * 操作对象类型
   * @return objectType
  **/
  @javax.annotation.Nullable
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public BrandOperationLogQueryV30ResponseDataLogListInner operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 操作人
   * @return operator
  **/
  @javax.annotation.Nullable
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public BrandOperationLogQueryV30ResponseDataLogListInner optIp(String optIp) {
    
    this.optIp = optIp;
    return this;
  }

   /**
   * 操作人IP
   * @return optIp
  **/
  @javax.annotation.Nullable
  public String getOptIp() {
    return optIp;
  }


  public void setOptIp(String optIp) {
    this.optIp = optIp;
  }


  public BrandOperationLogQueryV30ResponseDataLogListInner optTime(String optTime) {
    
    this.optTime = optTime;
    return this;
  }

   /**
   * 操作时间
   * @return optTime
  **/
  @javax.annotation.Nullable
  public String getOptTime() {
    return optTime;
  }


  public void setOptTime(String optTime) {
    this.optTime = optTime;
  }


  public BrandOperationLogQueryV30ResponseDataLogListInner optType(String optType) {
    
    this.optType = optType;
    return this;
  }

   /**
   * 操作类型
   * @return optType
  **/
  @javax.annotation.Nullable
  public String getOptType() {
    return optType;
  }


  public void setOptType(String optType) {
    this.optType = optType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandOperationLogQueryV30ResponseDataLogListInner brandOperationLogQueryV30ResponseDataLogListInner = (BrandOperationLogQueryV30ResponseDataLogListInner) o;
    return Objects.equals(this.content, brandOperationLogQueryV30ResponseDataLogListInner.content) &&
        Objects.equals(this.objectId, brandOperationLogQueryV30ResponseDataLogListInner.objectId) &&
        Objects.equals(this.objectType, brandOperationLogQueryV30ResponseDataLogListInner.objectType) &&
        Objects.equals(this.operator, brandOperationLogQueryV30ResponseDataLogListInner.operator) &&
        Objects.equals(this.optIp, brandOperationLogQueryV30ResponseDataLogListInner.optIp) &&
        Objects.equals(this.optTime, brandOperationLogQueryV30ResponseDataLogListInner.optTime) &&
        Objects.equals(this.optType, brandOperationLogQueryV30ResponseDataLogListInner.optType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, objectId, objectType, operator, optIp, optTime, optType);
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
    sb.append("class BrandOperationLogQueryV30ResponseDataLogListInner {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    optIp: ").append(toIndentedString(optIp)).append("\n");
    sb.append("    optTime: ").append(toIndentedString(optTime)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("object_id");
    openapiFields.add("object_type");
    openapiFields.add("operator");
    openapiFields.add("opt_ip");
    openapiFields.add("opt_time");
    openapiFields.add("opt_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandOperationLogQueryV30ResponseDataLogListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandOperationLogQueryV30ResponseDataLogListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandOperationLogQueryV30ResponseDataLogListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandOperationLogQueryV30ResponseDataLogListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandOperationLogQueryV30ResponseDataLogListInner>() {
           @Override
           public void write(JsonWriter out, BrandOperationLogQueryV30ResponseDataLogListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandOperationLogQueryV30ResponseDataLogListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandOperationLogQueryV30ResponseDataLogListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandOperationLogQueryV30ResponseDataLogListInner
  * @throws IOException if the JSON string is invalid with respect to BrandOperationLogQueryV30ResponseDataLogListInner
  */
  public static BrandOperationLogQueryV30ResponseDataLogListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandOperationLogQueryV30ResponseDataLogListInner.class);
  }

 /**
  * Convert an instance of BrandOperationLogQueryV30ResponseDataLogListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

