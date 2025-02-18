/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.39
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueFormListV2DataListEnableLayer;
import com.bytedance.ads.model.ClueFormListV2DataListFormType;
import com.bytedance.ads.model.ClueFormListV2DataListIsDel;
import com.bytedance.ads.model.ClueFormListV2DataListValidateType;
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
 * ClueFormListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2025-02-18T19:20:11.723417109+08:00[Asia/Shanghai]")
public class ClueFormListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ENABLE_LAYER = "enable_layer";
  @SerializedName(SERIALIZED_NAME_ENABLE_LAYER)
  private ClueFormListV2DataListEnableLayer enableLayer = null;

  public static final String SERIALIZED_NAME_FORM_TYPE = "form_type";
  @SerializedName(SERIALIZED_NAME_FORM_TYPE)
  private ClueFormListV2DataListFormType formType = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_IS_DEL = "is_del";
  @SerializedName(SERIALIZED_NAME_IS_DEL)
  private ClueFormListV2DataListIsDel isDel = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private ClueFormListV2DataListValidateType validateType = null;

  public ClueFormListV2ResponseDataListInner() {
  }

  
  public ClueFormListV2ResponseDataListInner(
     String createTime, 
     String updateTime
  ) {
    this();
    this.createTime = createTime;
    this.updateTime = updateTime;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }




  public ClueFormListV2ResponseDataListInner enableLayer(ClueFormListV2DataListEnableLayer enableLayer) {
    
    this.enableLayer = enableLayer;
    return this;
  }

   /**
   * Get enableLayer
   * @return enableLayer
  **/
  @javax.annotation.Nullable
  public ClueFormListV2DataListEnableLayer getEnableLayer() {
    return enableLayer;
  }


  public void setEnableLayer(ClueFormListV2DataListEnableLayer enableLayer) {
    this.enableLayer = enableLayer;
  }


  public ClueFormListV2ResponseDataListInner formType(ClueFormListV2DataListFormType formType) {
    
    this.formType = formType;
    return this;
  }

   /**
   * Get formType
   * @return formType
  **/
  @javax.annotation.Nullable
  public ClueFormListV2DataListFormType getFormType() {
    return formType;
  }


  public void setFormType(ClueFormListV2DataListFormType formType) {
    this.formType = formType;
  }


  public ClueFormListV2ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueFormListV2ResponseDataListInner isDel(ClueFormListV2DataListIsDel isDel) {
    
    this.isDel = isDel;
    return this;
  }

   /**
   * Get isDel
   * @return isDel
  **/
  @javax.annotation.Nullable
  public ClueFormListV2DataListIsDel getIsDel() {
    return isDel;
  }


  public void setIsDel(ClueFormListV2DataListIsDel isDel) {
    this.isDel = isDel;
  }


  public ClueFormListV2ResponseDataListInner name(String name) {
    
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


   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }




  public ClueFormListV2ResponseDataListInner validateType(ClueFormListV2DataListValidateType validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * Get validateType
   * @return validateType
  **/
  @javax.annotation.Nullable
  public ClueFormListV2DataListValidateType getValidateType() {
    return validateType;
  }


  public void setValidateType(ClueFormListV2DataListValidateType validateType) {
    this.validateType = validateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueFormListV2ResponseDataListInner clueFormListV2ResponseDataListInner = (ClueFormListV2ResponseDataListInner) o;
    return Objects.equals(this.createTime, clueFormListV2ResponseDataListInner.createTime) &&
        Objects.equals(this.enableLayer, clueFormListV2ResponseDataListInner.enableLayer) &&
        Objects.equals(this.formType, clueFormListV2ResponseDataListInner.formType) &&
        Objects.equals(this.instanceId, clueFormListV2ResponseDataListInner.instanceId) &&
        Objects.equals(this.isDel, clueFormListV2ResponseDataListInner.isDel) &&
        Objects.equals(this.name, clueFormListV2ResponseDataListInner.name) &&
        Objects.equals(this.updateTime, clueFormListV2ResponseDataListInner.updateTime) &&
        Objects.equals(this.validateType, clueFormListV2ResponseDataListInner.validateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, enableLayer, formType, instanceId, isDel, name, updateTime, validateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueFormListV2ResponseDataListInner {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    enableLayer: ").append(toIndentedString(enableLayer)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    isDel: ").append(toIndentedString(isDel)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    validateType: ").append(toIndentedString(validateType)).append("\n");
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
    openapiFields.add("enable_layer");
    openapiFields.add("form_type");
    openapiFields.add("instance_id");
    openapiFields.add("is_del");
    openapiFields.add("name");
    openapiFields.add("update_time");
    openapiFields.add("validate_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueFormListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueFormListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueFormListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueFormListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueFormListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ClueFormListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueFormListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueFormListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueFormListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ClueFormListV2ResponseDataListInner
  */
  public static ClueFormListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueFormListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ClueFormListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

