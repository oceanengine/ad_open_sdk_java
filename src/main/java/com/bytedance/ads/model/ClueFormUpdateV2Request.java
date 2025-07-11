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
import com.bytedance.ads.model.ClueFormUpdateV2RequestExtendInfo;
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
 * ClueFormUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-07-08T15:34:47.140915476+08:00[Asia/Shanghai]")
public class ClueFormUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_EXTEND_INFO = "extend_info";
  @SerializedName(SERIALIZED_NAME_EXTEND_INFO)
  private ClueFormUpdateV2RequestExtendInfo extendInfo = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_LAYER_SUBMIT_TEXT = "layer_submit_text";
  @SerializedName(SERIALIZED_NAME_LAYER_SUBMIT_TEXT)
  private String layerSubmitText = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUBMIT_TEXT = "submit_text";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TEXT)
  private String submitText = null;

  public ClueFormUpdateV2Request() {
  }

  public ClueFormUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueFormUpdateV2Request extendInfo(ClueFormUpdateV2RequestExtendInfo extendInfo) {
    
    this.extendInfo = extendInfo;
    return this;
  }

   /**
   * Get extendInfo
   * @return extendInfo
  **/
  @javax.annotation.Nullable
  public ClueFormUpdateV2RequestExtendInfo getExtendInfo() {
    return extendInfo;
  }


  public void setExtendInfo(ClueFormUpdateV2RequestExtendInfo extendInfo) {
    this.extendInfo = extendInfo;
  }


  public ClueFormUpdateV2Request instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueFormUpdateV2Request layerSubmitText(String layerSubmitText) {
    
    this.layerSubmitText = layerSubmitText;
    return this;
  }

   /**
   * 
   * @return layerSubmitText
  **/
  @javax.annotation.Nullable
  public String getLayerSubmitText() {
    return layerSubmitText;
  }


  public void setLayerSubmitText(String layerSubmitText) {
    this.layerSubmitText = layerSubmitText;
  }


  public ClueFormUpdateV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueFormUpdateV2Request submitText(String submitText) {
    
    this.submitText = submitText;
    return this;
  }

   /**
   * 
   * @return submitText
  **/
  @javax.annotation.Nullable
  public String getSubmitText() {
    return submitText;
  }


  public void setSubmitText(String submitText) {
    this.submitText = submitText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueFormUpdateV2Request clueFormUpdateV2Request = (ClueFormUpdateV2Request) o;
    return Objects.equals(this.advertiserId, clueFormUpdateV2Request.advertiserId) &&
        Objects.equals(this.extendInfo, clueFormUpdateV2Request.extendInfo) &&
        Objects.equals(this.instanceId, clueFormUpdateV2Request.instanceId) &&
        Objects.equals(this.layerSubmitText, clueFormUpdateV2Request.layerSubmitText) &&
        Objects.equals(this.name, clueFormUpdateV2Request.name) &&
        Objects.equals(this.submitText, clueFormUpdateV2Request.submitText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, extendInfo, instanceId, layerSubmitText, name, submitText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueFormUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    layerSubmitText: ").append(toIndentedString(layerSubmitText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    submitText: ").append(toIndentedString(submitText)).append("\n");
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
    openapiFields.add("extend_info");
    openapiFields.add("instance_id");
    openapiFields.add("layer_submit_text");
    openapiFields.add("name");
    openapiFields.add("submit_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("instance_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueFormUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueFormUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueFormUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueFormUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueFormUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ClueFormUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueFormUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueFormUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueFormUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueFormUpdateV2Request
  */
  public static ClueFormUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueFormUpdateV2Request.class);
  }

 /**
  * Convert an instance of ClueFormUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

