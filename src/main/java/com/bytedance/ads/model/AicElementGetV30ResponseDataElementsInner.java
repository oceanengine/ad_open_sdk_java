/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: test58
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AicElementGetV30DataElementsElementType;
import com.bytedance.ads.model.AicElementGetV30DataElementsUseAs;
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
 * AicElementGetV30ResponseDataElementsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-10T16:36:40.967417384+08:00[Asia/Shanghai]")
public class AicElementGetV30ResponseDataElementsInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ELEMENT_ID = "element_id";
  @SerializedName(SERIALIZED_NAME_ELEMENT_ID)
  private Long elementId = null;

  public static final String SERIALIZED_NAME_ELEMENT_NAME = "element_name";
  @SerializedName(SERIALIZED_NAME_ELEMENT_NAME)
  private String elementName = null;

  public static final String SERIALIZED_NAME_ELEMENT_TYPE = "element_type";
  @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
  private AicElementGetV30DataElementsElementType elementType = null;

  public static final String SERIALIZED_NAME_ELEMENT_URL = "element_url";
  @SerializedName(SERIALIZED_NAME_ELEMENT_URL)
  private String elementUrl = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_USE_AS = "use_as";
  @SerializedName(SERIALIZED_NAME_USE_AS)
  private AicElementGetV30DataElementsUseAs useAs = null;

  public AicElementGetV30ResponseDataElementsInner() {
  }

  public AicElementGetV30ResponseDataElementsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间，格式\&quot;yyyy-mm-dd HH:MM:SS\&quot; 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AicElementGetV30ResponseDataElementsInner elementId(Long elementId) {
    
    this.elementId = elementId;
    return this;
  }

   /**
   * 元素ID
   * @return elementId
  **/
  @javax.annotation.Nullable
  public Long getElementId() {
    return elementId;
  }


  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }


  public AicElementGetV30ResponseDataElementsInner elementName(String elementName) {
    
    this.elementName = elementName;
    return this;
  }

   /**
   * 文件名
   * @return elementName
  **/
  @javax.annotation.Nullable
  public String getElementName() {
    return elementName;
  }


  public void setElementName(String elementName) {
    this.elementName = elementName;
  }


  public AicElementGetV30ResponseDataElementsInner elementType(AicElementGetV30DataElementsElementType elementType) {
    
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @javax.annotation.Nullable
  public AicElementGetV30DataElementsElementType getElementType() {
    return elementType;
  }


  public void setElementType(AicElementGetV30DataElementsElementType elementType) {
    this.elementType = elementType;
  }


  public AicElementGetV30ResponseDataElementsInner elementUrl(String elementUrl) {
    
    this.elementUrl = elementUrl;
    return this;
  }

   /**
   * 文件url
   * @return elementUrl
  **/
  @javax.annotation.Nullable
  public String getElementUrl() {
    return elementUrl;
  }


  public void setElementUrl(String elementUrl) {
    this.elementUrl = elementUrl;
  }


  public AicElementGetV30ResponseDataElementsInner signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * 元素md5
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public AicElementGetV30ResponseDataElementsInner updateTime(String updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 更新时间，格式\&quot;yyyy-mm-dd HH:MM:SS\&quot;
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public AicElementGetV30ResponseDataElementsInner useAs(AicElementGetV30DataElementsUseAs useAs) {
    
    this.useAs = useAs;
    return this;
  }

   /**
   * Get useAs
   * @return useAs
  **/
  @javax.annotation.Nullable
  public AicElementGetV30DataElementsUseAs getUseAs() {
    return useAs;
  }


  public void setUseAs(AicElementGetV30DataElementsUseAs useAs) {
    this.useAs = useAs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicElementGetV30ResponseDataElementsInner aicElementGetV30ResponseDataElementsInner = (AicElementGetV30ResponseDataElementsInner) o;
    return Objects.equals(this.createTime, aicElementGetV30ResponseDataElementsInner.createTime) &&
        Objects.equals(this.elementId, aicElementGetV30ResponseDataElementsInner.elementId) &&
        Objects.equals(this.elementName, aicElementGetV30ResponseDataElementsInner.elementName) &&
        Objects.equals(this.elementType, aicElementGetV30ResponseDataElementsInner.elementType) &&
        Objects.equals(this.elementUrl, aicElementGetV30ResponseDataElementsInner.elementUrl) &&
        Objects.equals(this.signature, aicElementGetV30ResponseDataElementsInner.signature) &&
        Objects.equals(this.updateTime, aicElementGetV30ResponseDataElementsInner.updateTime) &&
        Objects.equals(this.useAs, aicElementGetV30ResponseDataElementsInner.useAs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, elementId, elementName, elementType, elementUrl, signature, updateTime, useAs);
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
    sb.append("class AicElementGetV30ResponseDataElementsInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    elementName: ").append(toIndentedString(elementName)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    elementUrl: ").append(toIndentedString(elementUrl)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    useAs: ").append(toIndentedString(useAs)).append("\n");
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
    openapiFields.add("element_id");
    openapiFields.add("element_name");
    openapiFields.add("element_type");
    openapiFields.add("element_url");
    openapiFields.add("signature");
    openapiFields.add("update_time");
    openapiFields.add("use_as");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("element_id");
    openapiRequiredFields.add("element_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicElementGetV30ResponseDataElementsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicElementGetV30ResponseDataElementsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicElementGetV30ResponseDataElementsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicElementGetV30ResponseDataElementsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AicElementGetV30ResponseDataElementsInner>() {
           @Override
           public void write(JsonWriter out, AicElementGetV30ResponseDataElementsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicElementGetV30ResponseDataElementsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicElementGetV30ResponseDataElementsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicElementGetV30ResponseDataElementsInner
  * @throws IOException if the JSON string is invalid with respect to AicElementGetV30ResponseDataElementsInner
  */
  public static AicElementGetV30ResponseDataElementsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicElementGetV30ResponseDataElementsInner.class);
  }

 /**
  * Convert an instance of AicElementGetV30ResponseDataElementsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

