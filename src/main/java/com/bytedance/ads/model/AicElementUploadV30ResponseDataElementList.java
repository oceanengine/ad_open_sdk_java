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
import com.bytedance.ads.model.AicElementUploadV30DataElementListElementType;
import com.bytedance.ads.model.AicElementUploadV30DataElementListUseAs;
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
 * 成功返回
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-03-13T17:29:36.612655208+08:00[Asia/Shanghai]")
public class AicElementUploadV30ResponseDataElementList {
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
  private AicElementUploadV30DataElementListElementType elementType = null;

  public static final String SERIALIZED_NAME_ELEMENT_URL = "element_url";
  @SerializedName(SERIALIZED_NAME_ELEMENT_URL)
  private String elementUrl = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_USE_AS = "use_as";
  @SerializedName(SERIALIZED_NAME_USE_AS)
  private AicElementUploadV30DataElementListUseAs useAs = null;

  public AicElementUploadV30ResponseDataElementList() {
  }

  public AicElementUploadV30ResponseDataElementList createTime(String createTime) {
    
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


  public AicElementUploadV30ResponseDataElementList elementId(Long elementId) {
    
    this.elementId = elementId;
    return this;
  }

   /**
   * 即创原料库的元素ID
   * @return elementId
  **/
  @javax.annotation.Nullable
  public Long getElementId() {
    return elementId;
  }


  public void setElementId(Long elementId) {
    this.elementId = elementId;
  }


  public AicElementUploadV30ResponseDataElementList elementName(String elementName) {
    
    this.elementName = elementName;
    return this;
  }

   /**
   * 元素名称
   * @return elementName
  **/
  @javax.annotation.Nullable
  public String getElementName() {
    return elementName;
  }


  public void setElementName(String elementName) {
    this.elementName = elementName;
  }


  public AicElementUploadV30ResponseDataElementList elementType(AicElementUploadV30DataElementListElementType elementType) {
    
    this.elementType = elementType;
    return this;
  }

   /**
   * Get elementType
   * @return elementType
  **/
  @javax.annotation.Nullable
  public AicElementUploadV30DataElementListElementType getElementType() {
    return elementType;
  }


  public void setElementType(AicElementUploadV30DataElementListElementType elementType) {
    this.elementType = elementType;
  }


  public AicElementUploadV30ResponseDataElementList elementUrl(String elementUrl) {
    
    this.elementUrl = elementUrl;
    return this;
  }

   /**
   * 元素url (视频或者图片的地址)
   * @return elementUrl
  **/
  @javax.annotation.Nullable
  public String getElementUrl() {
    return elementUrl;
  }


  public void setElementUrl(String elementUrl) {
    this.elementUrl = elementUrl;
  }


  public AicElementUploadV30ResponseDataElementList signature(String signature) {
    
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


  public AicElementUploadV30ResponseDataElementList useAs(AicElementUploadV30DataElementListUseAs useAs) {
    
    this.useAs = useAs;
    return this;
  }

   /**
   * Get useAs
   * @return useAs
  **/
  @javax.annotation.Nullable
  public AicElementUploadV30DataElementListUseAs getUseAs() {
    return useAs;
  }


  public void setUseAs(AicElementUploadV30DataElementListUseAs useAs) {
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
    AicElementUploadV30ResponseDataElementList aicElementUploadV30ResponseDataElementList = (AicElementUploadV30ResponseDataElementList) o;
    return Objects.equals(this.createTime, aicElementUploadV30ResponseDataElementList.createTime) &&
        Objects.equals(this.elementId, aicElementUploadV30ResponseDataElementList.elementId) &&
        Objects.equals(this.elementName, aicElementUploadV30ResponseDataElementList.elementName) &&
        Objects.equals(this.elementType, aicElementUploadV30ResponseDataElementList.elementType) &&
        Objects.equals(this.elementUrl, aicElementUploadV30ResponseDataElementList.elementUrl) &&
        Objects.equals(this.signature, aicElementUploadV30ResponseDataElementList.signature) &&
        Objects.equals(this.useAs, aicElementUploadV30ResponseDataElementList.useAs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, elementId, elementName, elementType, elementUrl, signature, useAs);
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
    sb.append("class AicElementUploadV30ResponseDataElementList {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    elementName: ").append(toIndentedString(elementName)).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    elementUrl: ").append(toIndentedString(elementUrl)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
       if (!AicElementUploadV30ResponseDataElementList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicElementUploadV30ResponseDataElementList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicElementUploadV30ResponseDataElementList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicElementUploadV30ResponseDataElementList.class));

       return (TypeAdapter<T>) new TypeAdapter<AicElementUploadV30ResponseDataElementList>() {
           @Override
           public void write(JsonWriter out, AicElementUploadV30ResponseDataElementList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicElementUploadV30ResponseDataElementList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicElementUploadV30ResponseDataElementList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicElementUploadV30ResponseDataElementList
  * @throws IOException if the JSON string is invalid with respect to AicElementUploadV30ResponseDataElementList
  */
  public static AicElementUploadV30ResponseDataElementList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicElementUploadV30ResponseDataElementList.class);
  }

 /**
  * Convert an instance of AicElementUploadV30ResponseDataElementList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

